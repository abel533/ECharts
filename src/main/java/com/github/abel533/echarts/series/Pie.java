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
import com.github.abel533.echarts.LabelLine;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.SeriesType;

/**
 * Description: Pie
 * Author: liuzh
 * Update: liuzh(2014-08-26 11:27)
 */
public class Pie extends Series {
    public Object center;
    public Object radius;
    public Boolean clockWise;
    public Integer startAngle;
    public Integer minAngle;
    public Integer selectedOffset;

    public Pie() {
        super();
        this.type = SeriesType.pie;
        this.center = new String[]{"50%", "50%"};
        this.radius = "75%";
        this.clockWise = true;
        this.startAngle = 90;
        this.minAngle = 0;
        this.selectedOffset = 10;

        this.itemStyle.normal.borderColor = "rgba(0,0,0,0)";
        this.itemStyle.normal.borderWidth = 1;
        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = true;
        this.itemStyle.normal.label.position = Position.outer;

        this.itemStyle.normal.labelLine = new LabelLine();
        this.itemStyle.normal.labelLine.show = true;


        this.itemStyle.emphasis.borderColor = "rgba(0,0,0,0)";
        this.itemStyle.emphasis.borderWidth = 1;
        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;

        this.itemStyle.emphasis.labelLine = new LabelLine();
        this.itemStyle.emphasis.labelLine.show = false;

    }
}
