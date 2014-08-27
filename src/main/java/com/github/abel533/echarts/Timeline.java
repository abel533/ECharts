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

import com.github.abel533.echarts.code.ControlPosition;
import com.github.abel533.echarts.code.TimeLineType;
import com.github.abel533.echarts.style.CheckpointStyle;
import com.github.abel533.echarts.style.ControlStyle;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Description: Timeline
 *
 * @author liuzh
 */
public class Timeline extends AbstractData<Timeline> {
    /**
     * 默认值true,显示策略，可选为：true（显示） | false（隐藏）
     */
    public Boolean show;

    /**
     * 默认为time,模式是时间类型，时间轴间隔根据时间跨度计算，可选为：'number'
     *
     * @see com.github.abel533.echarts.code.TimeLineType
     */
    public TimeLineType type;

    /**
     * 默认值false,时间轴上多个option切换时是否进行merge操作，同setOption第二个参数
     */
    public Boolean notMerge;

    /**
     * 默认值true,拖拽或点击改变时间轴是否实时显示
     */
    public Boolean realtime;

    /**
     * 默认值80，时间轴左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    public Object x;

    /**
     * 默认值null,时间轴左上角纵坐标，数值单位px，支持百分比（字符串），
     * 默认无，随y2定位，如'50%'(显示区域纵向中心)
     */
    public Object y;

    /**
     * 默认值80，时间轴右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    public Object x2;

    /**
     * 默认值null,时间轴右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    public Object y2;

    /**
     * 默认值 auto
     * 时间轴宽度，默认为总宽度 - x - x2，数值单位px，指定width后将忽略x2。见下图。
     * 支持百分比（字符串），如'50%'(显示区域一半的宽度)
     */
    public Object width;

    /**
     * 默认值50，时间轴高度，数值单位px，支持百分比（字符串），如'50%'(显示区域一半的高度)
     */
    public Object height;

    /**
     * 背景颜色，默认透明(rgba(0,0,0,0))。
     */
    public String backgroundColor;

    /**
     * 默认值#ccc，边框颜色
     */
    public String borderColor;

    /**
     * 默认值0，边框线宽
     */
    public Integer borderWidth;

    /**
     * 默认值5，内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图
     */
    public Integer padding;

    /**
     * 默认值left,播放控制器位置，可选为：'left' | 'right' | 'none'
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    public ControlPosition controlPosition;

    /**
     * 默认值false,是否自动播放
     */
    public Boolean autoPlay;

    /**
     * 默认值true,是否循环播放
     */
    public Boolean loop;

    /**
     * 默认值2000，播放时间间隔，单位ms
     */
    public Integer playInterval;

    /**
     * 默认值{color: '#666', width: 1, type: 'dashed'}，时间轴轴线样式lineStyle控制线条样式，
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle;

    /**
     * @see com.github.abel533.echarts.Label
     */
    public Label label;

    /**
     * 时间轴当前点
     *
     * @see com.github.abel533.echarts.style.CheckpointStyle
     */
    public CheckpointStyle checkpointStyle;

    /**
     * 时间轴控制器样式，可指定正常和高亮颜色
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    public ControlStyle controlStyle;

    /**
     * 默认值emptyDiamond，轴点symbol，同serie.symbol
     *
     * @see com.github.abel533.echarts.code.Symbol
     * @see com.github.abel533.echarts.series.Series#symbol
     */
    public Object symbol;

    /**
     * 默认值4，轴点symbol，同serie.symbolSize
     */
    public Object symbolSize;

    /**
     * 默认值0，当前索引位置，对应options数组，用于指定显示特定系列
     */
    public Integer currentIndex;
}
