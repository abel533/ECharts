/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.SeriesType;

/**
 * Description: Bar
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:29)
 */
public class Bar extends Series {
    public Integer barMinHeight;
    public String barGap;
    public String barCategoryGap;

    public Bar() {
        super();
        this.type = SeriesType.bar;
        this.xAxisIndex = 0;
        this.yAxisIndex = 0;
        this.barMinHeight = 0;
        this.barGap = "30%";
        this.barCategoryGap = "20%";

        this.itemStyle.normal.borderColor = "#fff";
        this.itemStyle.normal.borderRadius = 0;
        this.itemStyle.normal.borderWidth = 0;
        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = false;

        this.itemStyle.emphasis.borderColor = "#fff";
        this.itemStyle.emphasis.borderRadius = 0;
        this.itemStyle.emphasis.borderWidth = 0;
        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;
    }
}
