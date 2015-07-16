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

package com.github.abel533.echarts;

import com.github.abel533.echarts.axis.AxisLabel;
import com.github.abel533.echarts.axis.AxisLine;
import com.github.abel533.echarts.axis.SplitArea;
import com.github.abel533.echarts.axis.SplitLine;
import com.github.abel533.echarts.code.PolarType;
import com.github.abel533.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
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
    private Object[] center;
    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     */
    private Object radius;
    /**
     * 开始角度, 有效输入范围：[-180,180]
     */
    private Integer startAngle;
    /**
     * 分割段数，默认为5
     */
    private Integer splitNumber;
    /**
     * 坐标轴名称
     */
    private Name name;
    /**
     * 数值轴两端空白策略，数组内数值代表百分比，[原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]
     */
    private Object[] boundaryGap;
    /**
     * 脱离0值比例，放大聚焦到最终_min，_max区间
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
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     */
    private AxisLine axisLine;
    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.axis.AxisLabel
     */
    private AxisLabel axisLabel;
    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     *
     * @see com.github.abel533.echarts.axis.SplitArea
     */
    private SplitArea splitArea;
    /**
     * 分隔线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    private SplitLine splitLine;
    /**
     * 极坐标的形状，'polygon'|'circle' 多边形|圆形
     */
    private PolarType type;
    /**
     * 雷达指标列表，同时也是label内容
     */
    private List<Object> indicator;
    /**
     * 一级层叠控制
     */
    private Integer zlevel;
    /**
     * 二级层叠控制
     */
    private Integer z;

    /**
     * 设置zlevel值
     *
     * @param zlevel
     */
    public Polar zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return this;
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
    public Polar z(Integer z) {
        this.z = z;
        return this;
    }

    /**
     * 获取z值
     */
    public Integer z() {
        return this.z;
    }
    /**
     * 获取center值
     */
    public Object[] center() {
        return this.center;
    }

    /**
     * 设置center值
     *
     * @param center
     */
    public Polar center(Object[] center) {
        this.center = center;
        return this;
    }

    /**
     * 设置values值
     *
     * @param values
     */
    public Polar indicator(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.indicator().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 获取radius值
     */
    public Object radius() {
        return this.radius;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public Polar name(Name name) {
        this.name = name;
        return this;
    }

    /**
     * 获取boundaryGap值
     */
    public Object[] boundaryGap() {
        return this.boundaryGap;
    }

    /**
     * 设置boundaryGap值
     *
     * @param boundaryGap
     */
    public Polar boundaryGap(Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
        return this;
    }

    /**
     * 设置axisLine值
     *
     * @param axisLine
     */
    public Polar axisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
        return this;
    }

    /**
     * 设置axisLabel值
     *
     * @param axisLabel
     */
    public Polar axisLabel(AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
        return this;
    }

    /**
     * 设置splitArea值
     *
     * @param splitArea
     */
    public Polar splitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
        return this;
    }

    /**
     * 设置splitLine值
     *
     * @param splitLine
     */
    public Polar splitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
        return this;
    }

    /**
     * 设置indicator值
     *
     * @param indicator
     */
    public Polar indicator(List<Object> indicator) {
        this.indicator = indicator;
        return this;
    }

    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     *
     * @param width
     * @param height
     * @return
     */
    public Polar center(Object width, Object height) {
        this.center = new Object[]{width, height};
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param value
     * @return
     */
    public Polar radius(Object value) {
        this.radius = value;
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param width
     * @param height
     * @return
     */
    public Polar radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }

    /**
     * 获取startAngle值
     */
    public Integer startAngle() {
        return this.startAngle;
    }

    /**
     * 设置startAngle值
     *
     * @param startAngle
     */
    public Polar startAngle(Integer startAngle) {
        this.startAngle = startAngle;
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
    public Polar splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    /**
     * 坐标轴名称
     */
    public Name name() {
        if (this.name == null) {
            this.name = new Name();
        }
        return this.name;
    }

    /**
     * 数值轴两端空白策略，数组内数值代表百分比，[原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]
     */
    public Polar boundaryGap(Object min, Object max) {
        this.boundaryGap = new Object[]{min, max};
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
    public Polar scale(Boolean scale) {
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
    public Polar precision(Integer precision) {
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
    public Polar power(Integer power) {
        this.power = power;
        return this;
    }

    /**
     * 坐标轴线，默认显示，属性show控制显示与否，属性lineStyle（详见lineStyle）控制线条样式
     *
     * @see com.github.abel533.echarts.axis.AxisLine
     */
    public AxisLine axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new AxisLine();
        }
        return this.axisLine;
    }

    /**
     * 坐标轴文本标签，详见axis.axisLabel
     *
     * @see com.github.abel533.echarts.axis.AxisLabel
     */
    public AxisLabel axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new AxisLabel();
        }
        return this.axisLabel;
    }

    /**
     * 分隔区域，默认不显示，属性show控制显示与否，属性areaStyle（详见areaStyle）控制区域样式
     *
     * @see com.github.abel533.echarts.axis.SplitArea
     */
    public SplitArea splitArea() {
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
    public SplitLine splitLine() {
        if (this.splitLine == null) {
            this.splitLine = new SplitLine();
        }
        return this.splitLine;
    }

    /**
     * 获取type值
     */
    public PolarType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public Polar type(PolarType type) {
        this.type = type;
        return this;
    }

    /**
     * 雷达指标列表，同时也是label内容
     */
    public List<Object> indicator() {
        if (this.indicator == null) {
            this.indicator = new ArrayList<Object>();
        }
        return this.indicator;
    }

    /**
     * 获取name值
     */
    public Name getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * 获取boundaryGap值
     */
    public Object[] getBoundaryGap() {
        return boundaryGap;
    }

    /**
     * 设置boundaryGap值
     *
     * @param boundaryGap
     */
    public void setBoundaryGap(Object[] boundaryGap) {
        this.boundaryGap = boundaryGap;
    }

    /**
     * 获取axisLine值
     */
    public AxisLine getAxisLine() {
        return axisLine;
    }

    /**
     * 设置axisLine值
     *
     * @param axisLine
     */
    public void setAxisLine(AxisLine axisLine) {
        this.axisLine = axisLine;
    }

    /**
     * 获取axisLabel值
     */
    public AxisLabel getAxisLabel() {
        return axisLabel;
    }

    /**
     * 设置axisLabel值
     *
     * @param axisLabel
     */
    public void setAxisLabel(AxisLabel axisLabel) {
        this.axisLabel = axisLabel;
    }

    /**
     * 获取splitArea值
     */
    public SplitArea getSplitArea() {
        return splitArea;
    }

    /**
     * 设置splitArea值
     *
     * @param splitArea
     */
    public void setSplitArea(SplitArea splitArea) {
        this.splitArea = splitArea;
    }

    /**
     * 获取splitLine值
     */
    public SplitLine getSplitLine() {
        return splitLine;
    }

    /**
     * 设置splitLine值
     *
     * @param splitLine
     */
    public void setSplitLine(SplitLine splitLine) {
        this.splitLine = splitLine;
    }

    /**
     * 获取indicator值
     */
    public List<Object> getIndicator() {
        return indicator;
    }

    /**
     * 设置indicator值
     *
     * @param indicator
     */
    public void setIndicator(List<Object> indicator) {

        this.indicator = indicator;
    }

    /**
     * 获取center值
     */
    public Object[] getCenter() {
        return center;
    }

    /**
     * 设置center值
     *
     * @param center
     */
    public void setCenter(Object[] center) {
        this.center = center;
    }

    /**
     * 获取radius值
     */
    public Object getRadius() {
        return radius;
    }

    /**
     * 设置radius值
     *
     * @param radius
     */
    public void setRadius(Object radius) {
        this.radius = radius;
    }

    /**
     * 获取startAngle值
     */
    public Integer getStartAngle() {
        return startAngle;
    }

    /**
     * 设置startAngle值
     *
     * @param startAngle
     */
    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
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
     * 获取type值
     */
    public PolarType getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(PolarType type) {
        this.type = type;
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

    public static class Name {
        private Boolean show;
        private TextStyle textStyle;

        /**
         * 构造函数
         */
        public Name() {
            this.show(true);
            this.textStyle(new TextStyle());
            this.textStyle.color("#333");
        }

        /**
         * 获取show值
         */
        public Boolean show() {
            return this.show;
        }

        /**
         * 设置show值
         *
         * @param show
         */
        public Name show(Boolean show) {
            this.show = show;
            return this;
        }

        /**
         * 获取textStyle值
         */
        public TextStyle textStyle() {
            if (this.textStyle == null) {
                this.textStyle = new TextStyle();
            }
            return this.textStyle;
        }

        /**
         * 设置textStyle值
         *
         * @param textStyle
         */
        public Name textStyle(TextStyle textStyle) {
            this.textStyle = textStyle;
            return this;
        }

        /**
         * 获取show值
         */
        public Boolean getShow() {
            return show;
        }

        /**
         * 设置show值
         *
         * @param show
         */
        public void setShow(Boolean show) {
            this.show = show;
        }

        /**
         * 获取textStyle值
         */
        public TextStyle getTextStyle() {
            return textStyle;
        }

        /**
         * 设置textStyle值
         *
         * @param textStyle
         */
        public void setTextStyle(TextStyle textStyle) {
            this.textStyle = textStyle;
        }
    }
}
