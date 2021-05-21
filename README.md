# MingSingleClick
- Do not duplicate click the view
- MingSingleClick prevents duplicate clicks depending on how long the user presses consecutively.
- You can set up an interval for duplicate clicks

## Setting
**gradle: project**
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
**gradle: app**
```
dependencies {
	implementation 'com.github.kangmin1012:MingSingleClick:1.0.0'
}
```

## Usage

### Default (interval = 500 ms)
```kotlin
View.setOnSingleClickListener {
    //do Something
}
```

### Set up and use interval
```kotlin
View.setOnSingleClickListener(1000) {
    //do Something
}
```