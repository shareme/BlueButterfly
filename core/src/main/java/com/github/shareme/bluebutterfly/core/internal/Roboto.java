/*
Copyright 2015 Marcin Korniluk 'Zielony'
Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 */
package com.github.shareme.bluebutterfly.core.internal;

import android.graphics.Typeface;

/**
 * Created by Marcin on 2014-11-07.
 */
public enum Roboto {
    Black("carbon/Roboto-Black.ttf", "sans-serif-black", Typeface.NORMAL),
    BlackItalic("carbon/Roboto-BlackItalic.ttf", "sans-serif-black", Typeface.ITALIC),
    Bold("carbon/Roboto-Bold.ttf", "sans-serif", Typeface.BOLD),
    BoldItalic("carbon/Roboto-BoldItalic.ttf", "sans-serif", Typeface.BOLD_ITALIC),
    Italic("carbon/Roboto-Italic.ttf", "sans-serif", Typeface.ITALIC),
    Light("carbon/Roboto-Light.ttf", "sans-serif-light", Typeface.NORMAL),
    LightItalic("carbon/Roboto-LightItalic.ttf", "sans-serif-light", Typeface.ITALIC),
    Medium("carbon/Roboto-Medium.ttf", "sans-serif-medium", Typeface.NORMAL),
    MediumItalic("carbon/Roboto-MediumItalic.ttf", "sans-serif-medium", Typeface.ITALIC),
    Regular("carbon/Roboto-Regular.ttf", "sans-serif", Typeface.NORMAL),
    Thin("carbon/Roboto-Thin.ttf", "sans-serif-thin", Typeface.NORMAL),
    ThinItalic("carbon/Roboto-ThinItalic.ttf", "sans-serif-thin", Typeface.ITALIC),
    CondensedBold("carbon/RobotoCondensed-Bold.ttf", "sans-serif-condensed", Typeface.BOLD),
    CondensedBoldItalic("carbon/RobotoCondensed-BoldItalic.ttf", "sans-serif-condensed", Typeface.BOLD_ITALIC),
    CondensedItalic("carbon/RobotoCondensed-Italic.ttf", "sans-serif-condensed", Typeface.ITALIC),
    CondensedLight("carbon/RobotoCondensed-Light.ttf", "sans-serif-condensed-light", Typeface.NORMAL),
    CondensedLightItalic("carbon/RobotoCondensed-LightItalic.ttf", "sans-serif-condensed-light", Typeface.ITALIC),
    CondensedRegular("carbon/RobotoCondensed-Regular.ttf", "sans-serif-condensed", Typeface.NORMAL);

    private final String path;
    private final String fontFamily;
    private final int textStyle;

    Roboto(String path, String fontFamily, int textStyle) {
        this.path = path;
        this.fontFamily = fontFamily;
        this.textStyle = textStyle;
    }

    public String getPath() {
        return path;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public int getTextStyle() {
        return textStyle;
    }
}
