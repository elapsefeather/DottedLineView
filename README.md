# DottedLineView

[![](https://jitpack.io/v/elapsefeather/DottedLineView.svg)](https://jitpack.io/#elapsefeather/DottedLineView)   
自定義多樣式虛線繪製

## sample

| 樣式範例                       | 
| -------------                 |
| <img src="https://github.com/elapsefeather/DottedLineView/blob/06fad656ea3d0fcd8e96083ff0311d5423f5892c/screenshots/560.jpg" height="500">|

## Setup

The easiest way to add the **DottedLineView** library to your project is by adding it as a
dependency to your build.gradle

**Step 1.** Add the JitPack repository to your build file

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency

```gradle
dependencies {
     implementation 'com.github.elapsefeather:DottedLineView:1.0.0'
}
```

## parameter

| parameter             | parameter type    | effect            |
| -------------         |-------------      |-------------      |
| divider_lineColor          | color         | 虚線颜色          |
| dashThickness          | dimension         | 虚線寬度          |
| dashLength          | dimension         | 虚線長度          |
| dashGap          | dimension         | 虚線間隔長度          |
| divider_orientation          | enum         |  可選方向：<br> horizontal <br> vertical          |

## Usage

```
    <com.elapsefeather.dottedlineview.DottedLineView
        android:layout_width="match_parent"
        android:layout_height="20dp"
        android:layout_margin="5dp"
        app:dashGap="10dp"
        app:dashLength="10dp"
        app:dashThickness="2dp"
        app:divider_lineColor="@color/purple_700"
        app:divider_orientation="horizontal"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"/>
```

## Version History

> ### v1.0.0(2022/10/13)
> - new project.

http://www.apache.org/licenses/LICENSE-2.0
