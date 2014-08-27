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

package com.github.abel533.echarts.data;

import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: PointData
 *
 * @author liuzh
 * @since liuzh(2014-08-26 13:17)
 */
public class PointData {
    public String name;
    public Object value;

    /**
     * 饼图、雷达图、力导、和弦图使用x,y
     */
    public Integer x;
    public Integer y;

    /**
     * 在存在直角坐标系的图表如折线、柱形、K线、散点图中
     * 除了通过直接指定位置外，如果希望标注基于直角系的定位，可以通过xAxis，yAxis
     */
    public Integer xAxis;
    public Integer yAxis;

    public MarkType type;

    public Object symbol;
    public Object symbolSize;

    public ItemStyle itemStyle;

    public PointData() {
    }

    public PointData(Object value, Object symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public PointData(Object value, Object symbol, Object symbolSize) {
        this.value = value;
        this.symbol = symbol;
        this.symbolSize = symbolSize;
    }

    public PointData(String name, Object value, Integer x, Integer y) {
        this.name = name;
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public PointData(Integer xAxis, Integer yAxis, String name, Object value) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.name = name;
        this.value = value;
    }

    public PointData(MarkType type, String name) {
        this.type = type;
        this.name = name;
    }
}
