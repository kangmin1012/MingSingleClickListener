# MingSingleClick
[![](https://jitpack.io/v/kangmin1012/MingSingleClick.svg)](https://jitpack.io/#kangmin1012/MingSingleClick) <img src="https://img.shields.io/badge/language-kotlin-blue"> <img src = "https://img.shields.io/badge/version-1.0.0-red">
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
	implementation 'com.github.kangmin1012:MingSingleClick:1.0.1'
}
```

## Usage

### Default (interval : 500 ms)
```kotlin
View.mingSingleClickListener {
    //do Something
}
```

### Set up and use interval
```kotlin
View.mingSingleClickListener(1000) {
    //do Something
}
```

## LICENSE
```
Copyright 2021 kangmin1012

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
