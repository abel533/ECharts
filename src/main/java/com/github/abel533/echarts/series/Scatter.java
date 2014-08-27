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
 * Description: Scatter
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:37)
 */
public class Scatter extends Series {
    public Boolean large;
    public Long largeThreshold;

    public Scatter() {
        super();
        this.type = SeriesType.scatter;

        this.xAxisIndex = 0;
        this.yAxisIndex = 0;
        this.symbolSize = 4;
        this.large = false;
        this.largeThreshold = 2000L;

        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = false;
        //由于一般无法通过json输出方法，所以这里不设置默认的formatter，这样会自动使用echarts中默认的
        //this.itemStyle.normal.label.formatter = "function (a, b, c) {\nif (typeof c[2] != 'undefined') {\nreturn c[2];\n}\nelse {\nreturn c[0] + ' , ' + c[1];\n}\n}";
        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;

    }
}
