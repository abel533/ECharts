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

import com.github.abel533.echarts.axis.AxisLine;
import com.github.abel533.echarts.axis.SplitArea;
import com.github.abel533.echarts.axis.SplitLine;
import com.github.abel533.echarts.code.PolarType;
import com.github.abel533.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * 极坐标
 *
 * @author liuzh
 */
public class Polar extends AbstractData<Polar> implements Component {
    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     */
    public String[] center;

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算min(width, height) / 2 * 75%,
     */
    public Object radius;

    /**
     * 开始角度, 有效输入范围：[-180,180]
     */
    public Integer startAngle;

    /**
     * 分割段数，默认为5
     */
    public Integer splitNumber;

    public static class Name {
        public Boolean show;
        public TextStyle textStyle;

        public Name() {
            this.show = true;
            this.textStyle = new TextStyle();
            this.textStyle.color = "#333";
        }
    }

    /**
     * 坐标轴名称
     */
    private Name name;

    /**
     * 坐标轴名称
     */
    public Name name(){
        if (this.name == null) {
            this.name = new Name();
        }
        return this.name;
    }

    /**
     * 数值轴两端空白策略，数组内数值代表百分比，[原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]
     */
    private Object[] boundaryGap;

    /**
     * 数值轴两端空白策略，数组内数值代表百分比，[原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]
     */
    public Polar boundaryGap(Object min,Object max) {
        this.boundaryGap = new Object[]{min,max};
        return this;
    }
    /**
     * 脱离0值比例，放大聚焦到最终_min，_max区间
     */
    public Boolean scale;

    /**
     * 小数精度，默认为0，无小数点
     */
    public Integer precision;

    /**
     * 整数精度，默认为100，个位和百位为0
     */
    public Integer power;

    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     */
    private AxisLine axisLine;

    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     */
    public AxisLine axisLine(){
        if (this.axisLine == null) {
            this.axisLine = new AxisLine();
        }
        return this.axisLine;
    }

    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.Label
     */
    private Label axisLabel;

    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.Label
     */
    public Label axisLabel(){
        if (this.axisLabel == null) {
            this.axisLabel = new Label();
        }
        return this.axisLabel;
    }

    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     *
     * @see com.github.abel533.echarts.axis.SplitArea
     */
    private SplitArea splitArea;

    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     *
     * @see com.github.abel533.echarts.axis.SplitArea
     */
    public SplitArea splitArea(){
        if (this.splitArea == null) {
            this.splitArea = new SplitArea();
        }
        return this.splitArea;
    }

    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    private SplitLine splitLine;

    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    public SplitLine splitLine(){
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }

    /**
     * 极坐标的形状，'polygon'|'circle' 多边形|圆形
     */
    public PolarType type;

    /**
     * 雷达指标列表，同时也是label内容
     */
    private List<Object> indicator;

    /**
     * 雷达指标列表，同时也是label内容
     */
    public List<Object> indicator(){
        if (this.indicator == null) {
            this.indicator = new ArrayList<Object>();
        }
        return this.indicator;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Object[] getBoundaryGap() {
        return boundaryGap;
    }

    public void setBoundaryGap(Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
    }

    public AxisLine getAxisLine() {
        return axisLine;
    }

    public void setAxisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
    }

    public Label getAxisLabel() {
        return axisLabel;
    }

    public void setAxisLabel(Label axisLabel) {
        this.axisLabel = axisLabel;
    }

    public SplitArea getSplitArea() {
        return splitArea;
    }

    public void setSplitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
    }

    public SplitLine getSplitLine() {
        return splitLine;
    }

    public void setSplitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
    }

    public List<Object> getIndicator() {
        return indicator;
    }

    public void setIndicator(List<Object> indicator) {
        this.indicator = indicator;
    }
}
