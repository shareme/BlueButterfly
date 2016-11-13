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

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Marcin on 2015-01-11.
 */
@SuppressWarnings("unused")
public class FastLayout extends com.github.shareme.bluebutterfly.core.widget.FrameLayout {
    public FastLayout(Context context) {
        super(context);
    }

    public FastLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FastLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void requestLayout() {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            View parent = ((View) getParent());
            measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, View.MeasureSpec.EXACTLY), View.MeasureSpec.makeMeasureSpec(layoutParams.height, View.MeasureSpec.EXACTLY));
            layout(layoutParams.leftMargin + parent.getPaddingLeft(),
                    parent.getPaddingTop() + layoutParams.topMargin,
                    parent.getPaddingLeft() + layoutParams.leftMargin + layoutParams.width,
                    parent.getPaddingTop() + layoutParams.topMargin + layoutParams.height);
        } else {
            super.requestLayout();
        }
    }
}
