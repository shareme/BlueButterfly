/*The MIT License (MIT)

  Copyright (c) 2015 sephirot
  Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in
	all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
	THE SOFTWARE.

 */
package com.github.shareme.bluebutterfly.viewrevealanimator;

import android.graphics.Point;
import android.support.annotation.Nullable;

/**
 * Created by alessandro on 01/02/15.
 */
interface RevealAnimator {
    void showOnly(final int previousChild, final int childIndex, @Nullable Point origin);

    void showOnlyNoAnimation(final int previousIndex, final int childIndex);

    boolean isAnimating();

    boolean shouldAnimate();
}
