/*
 * Copyright (C) 2015 Jorge Castillo Pérez
 * Modifications Copyright(C) 2016 Fred Grott(GrottWorkShop)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.shareme.bluebutterfly.fillableloaders.svg;

/**
 * @author jorge
 * @since 7/08/15
 */
@SuppressWarnings("unused")
public class ConstrainedSvgPathParser extends SvgPathParser {

  private int originalWidth, originalHeight;
  private int viewWidth, viewHeight;

  private ConstrainedSvgPathParser(int originalWidth, int originalHeight, int viewWidth,
      int viewHeight) {
    this.originalWidth = originalWidth;
    this.originalHeight = originalHeight;
    this.viewWidth = viewWidth;
    this.viewHeight = viewHeight;
  }

  @Override protected float transformX(float x) {
    return x * viewWidth / originalWidth;
  }

  @Override protected float transformY(float y) {
    return y * viewHeight / originalHeight;
  }

  public static class Builder {

    private int originalWidth, originalHeight;
    private int viewWidth, viewHeight;

    public Builder originalWidth(int originalWidth) {
      this.originalWidth = originalWidth;
      return this;
    }

    public Builder originalHeight(int originalHeight) {
      this.originalHeight = originalHeight;
      return this;
    }

    public Builder viewWidth(int width) {
      this.viewWidth = width;
      return this;
    }

    public Builder viewHeight(int height) {
      this.viewHeight = height;
      return this;
    }

    public ConstrainedSvgPathParser build() {
      return new ConstrainedSvgPathParser(originalWidth, originalHeight, viewWidth, viewHeight);
    }
  }
}
