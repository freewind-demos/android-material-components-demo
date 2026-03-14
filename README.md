# android-material-components-demo

## 简介

本 demo 展示 Material Design Components 的基本用法，包括各种按钮样式、FAB 和 Snackbar。

## 基本原理

Material Design Components (MDC) 是 Google 推出的 Material Design 组件库，为 Android 开发者提供符合 Material Design 规范的 UI 组件。

主要组件包括：
- MaterialButton：各种样式的按钮
- FloatingActionButton：悬浮操作按钮
- Snackbar：轻量级消息提示
- TextInputLayout：文本输入布局
- CardView：卡片视图
- BottomNavigationView：底部导航

## 启动和使用

### 环境要求
- Android Studio 3.0+
- JDK 1.8+
- Android SDK 28

### 安装和运行
1. 用 Android Studio 打开此项目
2. 连接 Android 设备或启动模拟器
3. 点击 Run 运行项目

## 教程

### 什么是 Material Design Components？

Material Design Components 是 Google 官方提供的 UI 组件库，实现了 Material Design 设计规范。使用 MDC 可以快速构建符合 Material Design 规范的 Android 应用。

### 按钮样式

Material Design 提供了三种按钮样式：

**1. 扁平按钮 (Text Button)：**
```xml
<com.google.android.material.button.MaterialButton
    style="@style/Widget.MaterialComponents.Button.TextButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="扁平按钮"/>
```

**2. 轮廓按钮 (Outlined Button)：**
```xml
<com.google.android.material.button.MaterialButton
    style="@style/Widget.MaterialComponents.Button.OutlinedButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="轮廓按钮"/>
```

**3. 填充按钮 (Contained Button)：**
```xml
<com.google.android.material.button.MaterialButton
    style="@style/Widget.MaterialComponents.Button"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="填充按钮"/>
```

### FloatingActionButton (FAB)

FAB 是悬浮操作按钮，用于主要操作：

```xml
<com.google.android.material.floatingactionbutton.FloatingActionButton
    android:id="@+id/fab"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@android:drawable/ic_input_add"
    app:backgroundTint="@color/colorPrimary"/>
```

### Snackbar

Snackbar 是轻量级的消息提示，类似于 Toast，但可以添加操作按钮：

```kotlin
Snackbar.make(view, "消息内容", Snackbar.LENGTH_SHORT)
    .setAction("撤销") {
        // 处理撤销操作
    }
    .show()
```

### 主题设置

需要在 AndroidManifest.xml 中设置 Material 主题：

```xml
<application
    android:theme="@style/Theme.MaterialComponents.Light.NoActionBar">
```

或者在 styles.xml 中定义主题：

```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar">
    <item name="colorPrimary">@color/colorPrimary</item>
    <item name="colorPrimaryVariant">@color/colorPrimaryVariant</item>
    <item name="colorOnPrimary">@color/colorOnPrimary</item>
    <item name="colorSecondary">@color/colorSecondary</item>
</style>
```

### 注意事项

1. **依赖添加**：需要在 build.gradle 中添加 `implementation 'com.google.android.material:material:1.1.0'`
2. **AppCompat**：Material Components 依赖 AppCompat 库
3. **主题兼容性**：使用 Material 主题时，确保 parent 主题是 Material Components 主题
4. **组件前缀**：XML 中使用完整包名，如 `com.google.android.material.button.MaterialButton`
