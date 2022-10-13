package com.elapsefeather.dottedlineview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;

public class DottedLineView extends View {
    static public int DASH_GAP = 5;//間格
    static public int DASH_LENGHT = 5;//長度
    static public int DASH_IHICKNESS = 30;//寬度
    static public int DIVIDER_LINECOLOR = 0xff000000; //虚线颜色
    private Paint mPaint;
    private int orientation;

    public interface OrientationStyle {
        int HORIZONTAL = 0;
        int VERTICAL = 1;
    }

    public DottedLineView(Context context) {
        this(context, null);
    }

    public DottedLineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        int dashGap, dashLength, dashThickness;
        int color;

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.DottedLineView, 0, 0);

        try {
            dashGap = a.getDimensionPixelSize(R.styleable.DottedLineView_dashGap, DASH_GAP);
            dashLength = a.getDimensionPixelSize(R.styleable.DottedLineView_dashLength, DASH_LENGHT);
            dashThickness = a.getDimensionPixelSize(R.styleable.DottedLineView_dashThickness, DASH_IHICKNESS);
            color = a.getColor(R.styleable.DottedLineView_divider_lineColor, DIVIDER_LINECOLOR);
            orientation = a.getInt(R.styleable.DottedLineView_divider_orientation, OrientationStyle.HORIZONTAL);
        } finally {
            a.recycle();
        }

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(color);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(dashThickness);
        mPaint.setPathEffect(new DashPathEffect(new float[]{dashLength, dashGap,}, 0));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (orientation == OrientationStyle.HORIZONTAL) {
            float center = getHeight() * 0.5f;
            canvas.drawLine(0, center, getWidth(), center, mPaint);
        } else {
            float center = getWidth() * 0.5f;
            canvas.drawLine(center, 0, center, getHeight(), mPaint);
        }
    }
}