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

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.code.Sort;

/**
 * 漏斗图
 *
 * @author liuzh
 *         Update: liuzh(2014-08-26 11:37)
 */
public class Funnel extends Series {
    /**
     * 左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    public Object x;

    /**
     * 左上角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    public Object y;

    /**
     * 右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    public Object x2;

    /**
     * 右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    public Object y2;

    /**
     * 总宽度，默认为绘图区总宽度 - x - x2，数值单位px，指定width后将忽略x2，支持百分比（字符串），如'50%'(显示区域一半的宽度)
     */
    public Object width;

    /**
     * 总宽度，默认为绘图区总高度 - y - y2，数值单位px，指定width后将忽略x2，支持百分比（字符串），如'50%'(显示区域一半的高度)
     */
    public Object height;

    /**
     * 指定的最小值
     */
    public Integer min;

    /**
     * 指定的最大值
     */
    public Integer max;

    /**
     * 最小值min映射到总宽度的比例，如果需要最小值的图形并不是尖端三角，可设置minSize实现
     */
    public String minSize;

    /**
     * 最大值max映射到总宽度的比例
     */
    public String maxSize;

    /**
     * 数据排序， 可以取ascending, descending
     *
     * @see com.github.abel533.echarts.code.Sort
     */
    public Sort sort;

    /**
     * 数据图形间距
     */
    public Integer gap;

    public Funnel() {
        this.type = SeriesType.funnel;
    }
}
