/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
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
import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: Series
 *
 * @author liuzh
 */
public abstract class Series<T> extends AbstractData<T> implements Chart {
    /**
     * 是否启用图例（legend）hover时的联动响应（高亮显示）
     */
    private Boolean legendHoverLink;
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
    /**
     * 重新计算
     */
    private Boolean calculable;
    /**
     * 一级层叠控制
     */
    private Integer zlevel;
    /**
     * 二级层叠控制
     */
    private Integer z;

    /**
     * 构造函数
     */
    protected Series() {
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    protected Series(String name) {
        this.name = name;
    }

    /**
     * 设置zlevel值
     *
     * @param zlevel
     */
    public T zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (T) this;
    }

    /**
     * 获取zlevel值
     */
    public Integer zlevel() {
        return this.zlevel;
    }

    /**
     * 设置z值
     *
     * @param z
     */
    public T z(Integer z) {
        this.z = z;
        return (T) this;
    }

    /**
     * 获取z值
     */
    public Integer z() {
        return this.z;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public Series tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public Series itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 设置markPoint值
     *
     * @param markPoint
     */
    public Series markPoint(MarkPoint markPoint) {
        this.markPoint = markPoint;
        return this;
    }

    /**
     * 设置markLine值
     *
     * @param markLine
     */
    public Series markLine(MarkLine markLine) {
        this.markLine = markLine;
        return this;
    }

    /**
     * 获取legendHoverLink值
     *
     * @return
     */
    public Boolean legendHoverLink() {
        return this.legendHoverLink;
    }

    /**
     * 设置legendHoverLink值
     *
     * @param legendHoverLink
     */
    public T legendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
        return (T) this;
    }

    /**
     * 获取xAxisIndex值
     */
    public Integer xAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 设置xAxisIndex值
     *
     * @param xAxisIndex
     */
    public T xAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return (T) this;
    }

    /**
     * 获取yAxisIndex值
     */
    public Integer yAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 设置yAxisIndex值
     *
     * @param yAxisIndex
     */
    public T yAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return (T) this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    /**
     * 获取type值
     */
    public SeriesType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public T type(SeriesType type) {
        this.type = type;
        return (T) this;
    }

    /**
     * 获取stack值
     */
    public String stack() {
        return this.stack;
    }

    /**
     * 设置stack值
     *
     * @param stack
     */
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

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return this.symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public T symbol(Object symbol) {
        this.symbol = symbol;
        return (T) this;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public T symbol(Symbol symbol) {
        this.symbol = symbol;
        return (T) this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return this.symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public T symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return (T) this;
    }

    /**
     * 获取symbolRoate值
     */
    public Object symbolRoate() {
        return this.symbolRoate;
    }

    /**
     * 设置symbolRoate值
     *
     * @param symbolRoate
     */
    public T symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return (T) this;
    }

    /**
     * 获取showAllSymbol值
     */
    public Boolean showAllSymbol() {
        return this.showAllSymbol;
    }

    /**
     * 设置calculable值
     *
     * @param calculable
     * @return
     */
    public T calcuable(Boolean calculable) {
        this.calculable = calculable;
        return (T) this;
    }

    /**
     * 获取calculable值
     */
    public Boolean calculable() {
        return this.calculable;
    }

    /**
     * 设置showAllSymbol值
     *
     * @param showAllSymbol
     */
    public T showAllSymbol(Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
        return (T) this;
    }

    /**
     * 获取legendHoverLink值
     *
     * @return
     */
    public Boolean getLegendHoverLink() {
        return legendHoverLink;
    }

    /**
     * 设置legendHoverLink值
     *
     * @param legendHoverLink
     */
    public void setLegendHoverLink(Boolean legendHoverLink) {
        this.legendHoverLink = legendHoverLink;
    }

    /**
     * 获取tooltip值
     */
    public Tooltip getTooltip() {
        return tooltip;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * 获取itemStyle值
     */
    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    /**
     * 获取markPoint值
     */
    public MarkPoint getMarkPoint() {
        return markPoint;
    }

    /**
     * 设置markPoint值
     *
     * @param markPoint
     */
    public void setMarkPoint(MarkPoint markPoint) {
        this.markPoint = markPoint;
    }

    /**
     * 获取markLine值
     */
    public MarkLine getMarkLine() {
        return markLine;
    }

    /**
     * 设置markLine值
     *
     * @param markLine
     */
    public void setMarkLine(MarkLine markLine) {
        this.markLine = markLine;
    }

    /**
     * 获取xAxisIndex值
     */
    public Integer getxAxisIndex() {
        return xAxisIndex;
    }

    /**
     * 设置xAxisIndex值
     *
     * @param xAxisIndex
     */
    public void setxAxisIndex(Integer xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }

    /**
     * 获取yAxisIndex值
     */
    public Integer getyAxisIndex() {
        return yAxisIndex;
    }

    /**
     * 设置yAxisIndex值
     *
     * @param yAxisIndex
     */
    public void setyAxisIndex(Integer yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    /**
     * 获取name值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取type值
     */
    public SeriesType getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(SeriesType type) {
        this.type = type;
    }

    /**
     * 获取stack值
     */
    public String getStack() {
        return stack;
    }

    /**
     * 设置stack值
     *
     * @param stack
     */
    public void setStack(String stack) {
        this.stack = stack;
    }

    /**
     * 获取symbol值
     */
    public Object getSymbol() {
        return symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    /**
     * 获取symbolSize值
     */
    public Object getSymbolSize() {
        return symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    /**
     * 获取symbolRoate值
     */
    public Object getSymbolRoate() {
        return symbolRoate;
    }

    /**
     * 设置symbolRoate值
     *
     * @param symbolRoate
     */
    public void setSymbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
    }

    /**
     * 获取showAllSymbol值
     */
    public Boolean getShowAllSymbol() {
        return showAllSymbol;
    }

    /**
     * 设置showAllSymbol值
     *
     * @param showAllSymbol
     */
    public void setShowAllSymbol(Boolean showAllSymbol) {
        this.showAllSymbol = showAllSymbol;
    }

    /**
     * 获取calculable值
     */
    public Boolean getCalculable() {
        return calculable;
    }

    /**
     * 设置calculable值
     *
     * @param calculable
     */
    public void setCalculable(Boolean calculable) {
        this.calculable = calculable;
    }

    /**
     * 获取zlevel值
     */
    public Integer getZlevel() {
        return zlevel;
    }

    /**
     * 设置zlevel值
     *
     * @param zlevel
     */
    public void setZlevel(Integer zlevel) {
        this.zlevel = zlevel;
    }

    /**
     * 获取z值
	 */
	public Integer getZ() {
        return z;
    }

    /**
     * 设置z值
     *
     * @param z
     */
	public void setZ(Integer z) {
        this.z = z;
    }
}
