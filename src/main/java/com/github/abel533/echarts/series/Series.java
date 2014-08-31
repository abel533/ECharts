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
import com.github.abel533.echarts.Chart;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: Series
 *
 * @author liuzh
 */
public abstract class Series<T> extends AbstractData<T> implements Chart {
    /**
     * xAxis坐标轴数组的索引，指定该系列数据所用的横坐标轴
     */
    private Integer xAxisIndex;
    /**
     * yAxis坐标轴数组的索引，指定该系列数据所用的纵坐标轴
     */
    private Integer yAxisIndex;
    /**
     * 系列名称，如启用legend，该值将被legend.data索引相关
     */
    private String name;
    /**
     * 图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示
     *
     * @see com.github.abel533.echarts.code.SeriesType
     */
    private SeriesType type;
    /**
     * 组合名称，多组数据的堆积图时使用，eg：stack:'group1'，则series数组中stack值等于'group1'的数据做堆积计算
     */
    private String stack;
    /**
     * 提示框样式，仅对本系列有效，如不设则用option.tooltip（详见tooltip）,鼠标悬浮交互时的信息提示
     *
     * @see com.github.abel533.echarts.Tooltip
     */
    private Tooltip tooltip;
    /**
     * 图形样式
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    private ItemStyle itemStyle;
    /**
     * 标注
     *
     * @see com.github.abel533.echarts.series.MarkPoint
     */
    private MarkPoint markPoint;
    /**
     * 标线
     *
     * @see com.github.abel533.echarts.series.MarkLine
     */
    private MarkLine markLine;
    /**
     * 标志图形类型，默认自动选择（8种类型循环使用，不显示标志图形可设为'none'）
     *
     * @see com.github.abel533.echarts.code.Symbol
     */
    private Object symbol;
    /**
     * 标志图形大小，可计算特性启用情况建议增大以提高交互体验。实现气泡图时symbolSize需为Function，气泡大小取决于该方法返回值，传入参数为当前数据项（value数组）
     */
    private Object symbolSize;
    /**
     * 标志图形旋转角度[-180,180]
     */
    private Object symbolRoate;
    /**
     * 标志图形默认只有主轴显示（随主轴标签间隔隐藏策略），如需全部显示可把showAllSymbol设为true
     */
    private Boolean showAllSymbol;

    protected Series() {
    }

    protected Series(String name) {
        this.name = name;
    }

    public Series tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Series itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Series markPoint(MarkPoint markPoint) {
        this.markPoint = markPoint;
        return this;
    }

    public Series markLine(MarkLine markLine) {
        this.markLine = markLine;
        return this;
    }

    public Integer xAxisIndex() {
        return this.xAxisIndex;
    }

    public T xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return (T) this;
    }

    public Integer yAxisIndex() {
        return this.yAxisIndex;
    }

    public T yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return (T) this;
    }

    public String name() {
        return this.name;
    }

    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    public SeriesType type() {
        return this.type;
    }

    public T type(SeriesType type) {
        this.type = type;
        return (T) this;
    }

    public String stack() {
        return this.stack;
    }

    public T stack(String stack) {
        this.stack = stack;
        return (T) this;
    }

    /**
     * 提示框样式，仅对本系列有效，如不设则用option.tooltip（详见tooltip）,鼠标悬浮交互时的信息提示
     *
     * @see com.github.abel533.echarts.Tooltip
     */
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }

    /**
     * 图形样式
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    /**
     * 标注
     *
     * @see com.github.abel533.echarts.series.MarkPoint
     */
    public MarkPoint markPoint() {
        if (this.markPoint == null) {
            this.markPoint = new MarkPoint();
        }
        return this.markPoint;
    }

    /**
     * 标线
     *
     * @see com.github.abel533.echarts.series.MarkLine
     */
    public MarkLine markLine() {
        if (this.markLine == null) {
            this.markLine = new MarkLine();
        }
        return this.markLine;
    }

    public Object symbol() {
        return this.symbol;
    }

    public T symbol(Object symbol) {
        this.symbol = symbol;
        return (T) this;
    }

    public Object symbolSize() {
        return this.symbolSize;
    }

    public T symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return (T) this;
    }

    public Object symbolRoate() {
        return this.symbolRoate;
    }

    public T symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return (T) this;
    }

    public Boolean showAllSymbol() {
        return this.showAllSymbol;
    }

    public T showAllSymbol(Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
        return (T) this;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    public MarkPoint getMarkPoint() {
        return markPoint;
    }

    public void setMarkPoint(MarkPoint markPoint) {
        this.markPoint = markPoint;
    }

    public MarkLine getMarkLine() {
        return markLine;
    }

    public void setMarkLine(MarkLine markLine) {
        this.markLine = markLine;
    }

    public Integer getxAxisIndex() {
        return xAxisIndex;
    }

    public void setxAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }

    public Integer getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SeriesType getType() {
        return type;
    }

    public void setType(SeriesType type) {
        this.type = type;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public Object getSymbol() {
        return symbol;
    }

    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    public Object getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Object getSymbolRoate() {
        return symbolRoate;
    }

    public void setSymbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
    }

    public Boolean getShowAllSymbol() {
        return showAllSymbol;
    }

    public void setShowAllSymbol(Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
    }
}
