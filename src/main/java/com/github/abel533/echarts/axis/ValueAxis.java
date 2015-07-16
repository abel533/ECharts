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

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.style.LineStyle;

/**
 * 值轴
 *
 * @author liuzh.
 */
public class ValueAxis extends Axis<ValueAxis> {
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
     * 指定的最小值，eg: 0，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[0]
     */
    private Integer min;
    /**
     * 指定的最大值，eg: 100，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[1]
     */
    private Integer max;
    /**
     * 默认值false，脱离0值比例，放大聚焦到最终_min，_max区间
     */
    private Boolean scale;
    /**
     * 小数精度，默认为0，无小数点
     */
    private Integer precision;
    /**
     * 整数精度，默认为100，个位和百位为0
     */
    private Integer power;
    /**
     * 分割段数，默认为5
     */
    private Integer splitNumber;

    /**
     * [数值型]数值轴两端空白策略，数组内数值代表百分比，
     * [原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]
     */
    private Double[] boundaryGap;

    /**
     * 构造函数
     */
    public ValueAxis() {
        this.type(AxisType.value);
    }

    /**
     * 获取min值
     */
    public Integer min() {
        return this.min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public ValueAxis min(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 获取max值
     */
    public Integer max() {
        return this.max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public ValueAxis max(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 获取scale值
     */
    public Boolean scale() {
        return this.scale;
    }

    /**
     * 设置scale值
     *
     * @param scale
     */
    public ValueAxis scale(Boolean scale) {
        this.scale = scale;
        return this;
    }

    /**
     * 获取precision值
     */
    public Integer precision() {
        return this.precision;
    }

    /**
     * 设置precision值
     *
     * @param precision
     */
    public ValueAxis precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 获取power值
     */
    public Integer power() {
        return this.power;
    }

    /**
     * 设置power值
     *
     * @param power
     */
    public ValueAxis power(Integer power) {
        this.power = power;
        return this;
    }

    /**
     * 获取splitNumber值
     */
    public Integer splitNumber() {
        return this.splitNumber;
    }

    /**
     * 设置splitNumber值
     *
     * @param splitNumber
     */
    public ValueAxis splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }


    /**
     * 获取boundaryGap值
     */
    public Double[] boundaryGap() {
        if (this.boundaryGap == null) {
            this.boundaryGap = new Double[2];
        }
        return this.boundaryGap;
    }

    /**
     * 设置boundaryGap值
     *
     * @param boundaryGap
     */
    public ValueAxis boundaryGap(Double[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    /**
     * 设置boundaryGap值
     *
     * @param min
     * @param max
     */
    public ValueAxis boundaryGap(Double min, Double max) {
        this.boundaryGap()[0] = min;
        this.boundaryGap()[1] = max;
        return this;
    }

    /**
     * 获取min值
     */
    public Integer getMin() {
        return min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * 获取max值
     */
    public Integer getMax() {
        return max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * 获取scale值
     */
    public Boolean getScale() {
        return scale;
    }

    /**
     * 设置scale值
     *
     * @param scale
     */
    public void setScale(Boolean scale) {
        this.scale = scale;
    }

    /**
     * 获取precision值
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * 设置precision值
     *
     * @param precision
     */
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    /**
     * 获取power值
     */
    public Integer getPower() {
        return power;
    }

    /**
     * 设置power值
     *
     * @param power
     */
    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * 获取splitNumber值
     */
    public Integer getSplitNumber() {
        return splitNumber;
    }

    /**
     * 设置splitNumber值
     *
     * @param splitNumber
     */
    public void setSplitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
    }


    /**
     * 获取boundaryGap值
     */
    public Double[] getBoundaryGap() {
        return boundaryGap;
    }

    /**
     * 设置boundaryGap值
     *
     * @param boundaryGap
     */
    public void setBoundaryGap(Double[] boundaryGap) {
        this.boundaryGap = boundaryGap;
    }

    /**
     * 获取nameLocation值
     */
    public NameLocation getNameLocation() {
        return nameLocation;
    }

    /**
     * 设置nameLocation值
     *
     * @param nameLocation
     */
    public void setNameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
    }


    /**
     * 获取nameTextStyle值
     */
    public LineStyle getNameTextStyle() {
        return nameTextStyle;
    }

    /**
     * 设置nameTextStyle值
     *
     * @param nameTextStyle
     */
    public void setNameTextStyle(LineStyle nameTextStyle) {
        this.nameTextStyle = nameTextStyle;
    }

    /**
     * 获取nameLocation值
     */
    public NameLocation nameLocation() {
        return this.nameLocation;
    }

    /**
     * 设置nameLocation值
     *
     * @param nameLocation
     */
    public ValueAxis nameLocation(NameLocation nameLocation) {
        this.nameLocation = nameLocation;
        return this;
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

    /**
     * 设置style值
     *
     * @param style
     */
    public ValueAxis nameTextStyle(LineStyle style) {
        this.nameTextStyle = style;
        return this;
    }

}
