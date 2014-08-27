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
import com.github.abel533.echarts.Title;
import com.github.abel533.echarts.axis.AxisTick;
import com.github.abel533.echarts.axis.SplitLine;
import com.github.abel533.echarts.series.gauge.Detail;
import com.github.abel533.echarts.series.gauge.Pointer;

/**
 * 仪表盘
 *
 * @author liuzh
 *         Update: liuzh(2014-08-26 11:36)
 */
public class Gauge extends Series {
    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     */
    public Object[] center;

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     */
    public Object[] radius;

    /**
     * 开始角度, 饼图（90）、仪表盘（225），有效输入范围：[-360,360]
     */
    public Integer startAngle;

    /**
     * 结束角度,有效输入范围：[-360,360]，保证startAngle - endAngle为正值
     */
    public Integer endAngle;

    /**
     * 指定的最小值
     */
    public Integer min;

    /**
     * 指定的最大值
     */
    public Integer max;

    /**
     * 小数精度，默认为0，无小数点
     */
    public Integer precision;

    /**
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份
     */
    public Integer splitNumber;

    /**
     * 坐标轴线，默认显示
     *
     * @see com.github.abel533.echarts.series.Line
     */
    public Line axisLine;

    /**
     * 坐标轴小标记，默认显示
     *
     * @see com.github.abel533.echarts.axis.AxisTick
     */
    public AxisTick axisTick;

    /**
     * 坐标轴文本标签
     *
     * @see com.github.abel533.echarts.Label
     */
    public Label axisLabel;

    /**
     * 主分隔线，默认显示
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    public SplitLine splitLine;

    /**
     * 指针样式
     *
     * @see com.github.abel533.echarts.series.gauge.Pointer
     */
    public Pointer pointer;

    /**
     * 仪表盘标题
     *
     * @see com.github.abel533.echarts.Title
     */
    public Title title;

    /**
     * 仪表盘详情
     *
     * @see com.github.abel533.echarts.series.gauge.Detail
     */
    public Detail detail;
}
