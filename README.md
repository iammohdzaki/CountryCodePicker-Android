[![](https://jitpack.io/v/iammohdzaki/CountryCodePicker-Android.svg)](https://jitpack.io/#iammohdzaki/CountryCodePicker-Android)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-Knot%20File%20Chooser-green.svg?style=flat )]( https://android-arsenal.com/details/1/8056 )

# CountryCodePicker-Android

<img src="https://github.com/iammohdzaki/CountryCodePicker-Android/blob/master/Screenshot_2021-03-21-22-36-42-267_com.bequest.jpg" alt="KnotDialog" width="250" height="550"/>

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```
dependencies {
	        implementation 'com.github.iammohdzaki:CountryCodePicker-Android:$latest_version'
	}
```
How To Use
```
CCPicker.showPicker(context,object : CountryPickerAdapter.OnCountrySelectedListener{
                override fun onCountrySelected(country: Country?) {
                    //Write your code
                })
```

License
```
The MIT License (MIT)

Copyright (c) 2021 Mohammad Zaki

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
