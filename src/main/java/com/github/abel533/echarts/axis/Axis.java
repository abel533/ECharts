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

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.AbstractData;
import com.github.abel533.echarts.Component;
import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.style.LineStyle;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 坐标轴
 *
 * @author liuzh
 */
public abstract class Axis<T> extends AbstractData<T> implements Component {

    /**
     * 坐标轴类型，横轴默认为类目型'category'，纵轴默认为数值型'value'
     *
     * @see com.github.abel533.echarts.code.AxisType
     */
    private AxisType type;
    /**
     * 坐标轴类型，横轴默认为类目型'bottom'，纵轴默认为数值型'left'，可选为：'bottom' | 'top' | 'left' | 'right'
     *
     * @see com.github.abel533.echarts.code.X
     * @see com.github.abel533.echarts.code.Y
     */
    private Object position;
    /**
     * 坐标轴名称，默认为空
     */
    private String name;
    /**
     * 坐标轴名称位置，默认为'end'，可选为：'start' | 'end'
     *
     * @see com.github.abel533.echarts.code.NameLocation
     */
    private NameLocation nameLocation;
    /**
     * 坐标轴名称文字样式，默认取全局配置，颜色跟随axisLine主色，可设
     */
    private LineStyle nameTextStyle;
    /**
     * [类目型]类目起始和结束两端空白策略，见下图，默认为true留空，false则顶头
     * <p/>
     * [数值型]数值轴两端空白策略，数组内数值代表百分比，
     * [原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]
     */
    private Object boundaryGap;
    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private AxisLine axisLine;
    /**
     * 坐标轴小标记，默认不显示，属性show控制显示与否，属性length控制线长，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisTick
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private AxisTick axisTick;
    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.Label
     */
    private Label axisLabel;
    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    private SplitLine splitLine;
    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     */
    private SplitArea splitArea;

    public AxisType type() {
        return this.type;
    }

    public AxisType getType() {
        return type;
    }

    public void setType(AxisType type) {
        this.type = type;
    }

    public Object getPosition() {
        return position;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NameLocation getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
    }

    public Object getBoundaryGap() {
        return boundaryGap;
    }

    public void setBoundaryGap(Object boundaryGap) {
        this.boundaryGap = boundaryGap;
    }

    public T type(AxisType type) {
        this.type = type;
        return (T) this;

    }

    public Object position() {
        return this.position;
    }

    public T position(Object position) {
        this.position = position;
        return (T) this;
    }

    public String name() {
        return this.name;
    }

    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    public NameLocation nameLocation() {
        return this.nameLocation;
    }

    public T nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return (T) this;
    }

    /**
     * 坐标轴名称文字样式，默认取全局配置，颜色跟随axisLine主色，可设
     */
    public LineStyle nameTextStyle() {
        if (this.nameTextStyle == null) {
            this.nameTextStyle = new LineStyle();
        }
        return this.nameTextStyle;
    }

    public T nameTextStyle(LineStyle style) {
        this.nameTextStyle = style;
        return (T) this;
    }

    public Object boundaryGap() {
        return this.boundaryGap;
    }

    public T boundaryGap(Object boundaryGap) {
        this.boundaryGap = boundaryGap;
        return (T) this;
    }

    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public AxisLine axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new AxisLine();
        }
        return this.axisLine;
    }

    public T axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return (T) this;
    }

    /**
     * 坐标轴小标记，默认不显示，属性show控制显示与否，属性length控制线长，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisTick
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public AxisTick axisTick() {
        if (this.axisTick == null) {
            this.axisTick = new AxisTick();
        }
        return this.axisTick;
    }

    public T axisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
        return (T) this;
    }

    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.Label
     */
    public Label axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new Label();
        }
        return this.axisLabel;
    }

    public T axisLabel(Label label) {
        this.axisLabel = label;
        return (T) this;
    }


    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    public SplitLine splitLine() {
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }

    public T splitLine(SplitLine splitLine) {
        if (this.splitLine == null) {
            this.splitLine = splitLine;
        }
        return (T) this;
    }

    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     */
    public SplitArea splitArea() {
        if (this.splitArea == null) {
            this.splitArea = new SplitArea();
        }
        return this.splitArea;
    }

    public T splitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
        return (T) this;
    }

    /**
     * 添加坐标轴的类目属性
     *
     * @param values
     * @return
     */
    @Override
    public T data(Object... values) {
        if (values == null || values.length == 0) {
            return (T) this;
        }
        if (this.data == null) {
            if (this.type == AxisType.category) {
                data = new ArrayList<Object>();
            } else {
                throw new RuntimeException("数据轴不能添加类目信息!");
            }
        }
        this.data.addAll(Arrays.asList(values));
        return (T) this;
    }

    public LineStyle getNameTextStyle() {
        return nameTextStyle;
    }

    public void setNameTextStyle(LineStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
    }

    public AxisLine getAxisLine() {
        return axisLine;
    }

    public void setAxisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
    }

    public AxisTick getAxisTick() {
        return axisTick;
    }

    public void setAxisTick(AxisTick axisTick) {
        this.axisTick = axisTick;
    }

    public Label getAxisLabel() {
        return axisLabel;
    }

    public void setAxisLabel(Label axisLabel) {
        this.axisLabel = axisLabel;
    }

    public SplitLine getSplitLine() {
        return splitLine;
    }

    public void setSplitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
    }

    public SplitArea getSplitArea() {
        return splitArea;
    }

    public void setSplitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
    }
}
