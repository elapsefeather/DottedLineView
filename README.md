# DottedLineView

[![](https://jitpack.io/v/elapsefeather/DottedLineView.svg)](https://jitpack.io/#elapsefeather/DottedLineView)

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


