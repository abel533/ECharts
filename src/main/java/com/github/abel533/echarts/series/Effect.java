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

/**
 * 图形炫光特效
 *
 * @author liuzh
 */
public class Effect {
    /**
     * 是否开启，默认关闭
     */
    public Boolean show;

    /**
     * 循环动画，默认开启
     */
    public Boolean loop;

    /**
     * 运动周期，无单位，值越大越慢，默认为15
     */
    public Integer period;

    /**
     * 放大倍数，以markPoint symbolSize为基准
     */
    public Integer scaleSize;

    /**
     * 炫光颜色，默认跟随markPoint itemStyle定义颜色
     */
    public String color;

    /**
     * 光影颜色，默认跟随color
     */
    public String shadowColor;

    /**
     * 光影模糊度，默认为0
     */
    public Integer shadowBlur;
}
