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

import com.github.abel533.echarts.AbstractData;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.List;

/**
 * Description: Series
 *
 * @author liuzh
 * @since liuzh(2014-08-26 09:26)
 */
public abstract class Series extends AbstractData<Series> {
    /**
     * xAxis坐标轴数组的索引，指定该系列数据所用的横坐标轴
     */
    public Integer xAxisIndex;

    /**
     * yAxis坐标轴数组的索引，指定该系列数据所用的纵坐标轴
     */
    public Integer yAxisIndex;

    /**
     * 系列名称，如启用legend，该值将被legend.data索引相关
     */
    public String name;

    /**
     * 图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示
     *
     * @see com.github.abel533.echarts.code.SeriesType
     */
    public SeriesType type;

    /**
     * 组合名称，多组数据的堆积图时使用，eg：stack:'group1'，则series数组中stack值等于'group1'的数据做堆积计算
     */
    public String stack;

    /**
     * 提示框样式，仅对本系列有效，如不设则用option.tooltip（详见tooltip）,鼠标悬浮交互时的信息提示
     *
     * @see com.github.abel533.echarts.Tooltip
     */
    public Tooltip tooltip;

    /**
     * 图形样式
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    public ItemStyle itemStyle;

    /**
     * 数据
     */
    public List<Object> data;

    /**
     * 标注
     *
     * @see com.github.abel533.echarts.series.MarkPoint
     */
    public MarkPoint markPoint;

    /**
     * 标线
     *
     * @see com.github.abel533.echarts.series.MarkLine
     */
    public MarkLine markLine;

    /**
     * 标志图形类型，默认自动选择（8种类型循环使用，不显示标志图形可设为'none'）
     *
     * @see com.github.abel533.echarts.code.Symbol
     */
    public Object symbol;

    /**
     * 标志图形大小，可计算特性启用情况建议增大以提高交互体验。实现气泡图时symbolSize需为Function，气泡大小取决于该方法返回值，传入参数为当前数据项（value数组）
     */
    public Object symbolSize;

    /**
     * 标志图形旋转角度[-180,180]
     */
    public Object symbolRoate;

    /**
     * 标志图形默认只有主轴显示（随主轴标签间隔隐藏策略），如需全部显示可把showAllSymbol设为true
     */
    public Boolean showAllSymbol;
}
