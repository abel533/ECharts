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

package com.github.abel533.echarts;

/**
 * 直角坐标系内绘图网格
 *
 * @author liuzh
 *         Created by liuzh on 14-8-26.
 */
public class Grid extends Basic {
    /**
     * 直角坐标系内绘图网格左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    public Object x2;

    /**
     * 直角坐标系内绘图网格左上角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    public Object y2;

    /**
     * 直角坐标系内绘图网格（不含坐标轴）宽度，默认为总宽度 - x - x2，数值单位px，指定width后将忽略x2，见下图。
     * 支持百分比（字符串），如'50%'(显示区域一半的宽度)
     */
    public Object width;

    /**
     * 直角坐标系内绘图网格（不含坐标轴）高度，默认为总宽度 - y - y2，数值单位px，指定height后将忽略y2，见下图。
     * 支持百分比（字符串），如'50%'(显示区域一半的高度)
     */
    public Object height;
}
