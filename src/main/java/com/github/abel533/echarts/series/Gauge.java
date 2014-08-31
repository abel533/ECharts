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
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.series.gauge.Detail;
import com.github.abel533.echarts.series.gauge.Pointer;

/**
 * 仪表盘
 *
 * @author liuzh
 */
public class Gauge extends Series<Gauge> {
    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     */
    private Object[] center;

    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     */
    public Gauge center(Object width, Object height) {
        this.center = new Object[]{width, height};
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     */
    private Object radius;

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param value
     * @return
     */
    public Gauge radius(Object value) {
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
    public Gauge radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }

    /**
     * 开始角度, 饼图（90）、仪表盘（225），有效输入范围：[-360,360]
     */
	private Integer startAngle;

	public Integer startAngle(){
		return this.startAngle;
	}

	public Gauge startAngle(Integer startAngle){
		this.startAngle = startAngle;
		return this;
	}

    /**
     * 结束角度,有效输入范围：[-360,360]，保证startAngle - endAngle为正值
     */
	private Integer endAngle;

	public Integer endAngle(){
		return this.endAngle;
	}

	public Gauge endAngle(Integer endAngle){
		this.endAngle = endAngle;
		return this;
	}

    /**
     * 指定的最小值
     */
	private Integer min;

	public Integer min(){
		return this.min;
	}

	public Gauge min(Integer min){
		this.min = min;
		return this;
	}

    /**
     * 指定的最大值
     */
	private Integer max;

	public Integer max(){
		return this.max;
	}

	public Gauge max(Integer max){
		this.max = max;
		return this;
	}

    /**
     * 小数精度，默认为0，无小数点
     */
	private Integer precision;

	public Integer precision(){
		return this.precision;
	}

	public Gauge precision(Integer precision){
		this.precision = precision;
		return this;
	}

    /**
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份
     */
	private Integer splitNumber;

	public Integer splitNumber(){
		return this.splitNumber;
	}

	public Gauge splitNumber(Integer splitNumber){
		this.splitNumber = splitNumber;
		return this;
	}

    /**
     * 坐标轴线，默认显示
     *
     * @see com.github.abel533.echarts.series.Line
     */
    private Line axisLine;

    /**
     * 坐标轴线，默认显示
     *
     * @see com.github.abel533.echarts.series.Line
     */
    public Line axisLine() {
        if (this.axisLine == null) {
            this.axisLine = new Line();
        }
        return this.axisLine;
    }

    /**
     * 坐标轴小标记，默认显示
     *
     * @see com.github.abel533.echarts.axis.AxisTick
     */
    private AxisTick axisTick;

    /**
     * 坐标轴小标记，默认显示
     *
     * @see com.github.abel533.echarts.axis.AxisTick
     */
    public AxisTick axisTick() {
        if (this.axisTick == null) {
            this.axisTick = new AxisTick();
        }
        return this.axisTick;
    }

    /**
     * 坐标轴文本标签
     *
     * @see com.github.abel533.echarts.Label
     */
    private Label axisLabel;

    /**
     * 坐标轴文本标签
     *
     * @see com.github.abel533.echarts.Label
     */
    public Label axisLabel() {
        if (this.axisLabel == null) {
            this.axisLabel = new Label();
        }
        return this.axisLabel;
    }

    /**
     * 主分隔线，默认显示
     *
     * @see com.github.abel533.echarts.axis.SplitLine
     */
    private SplitLine splitLine;

    /**
     * 主分隔线，默认显示
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
     * 指针样式
     *
     * @see com.github.abel533.echarts.series.gauge.Pointer
     */
    private Pointer pointer;

    /**
     * 指针样式
     *
     * @see com.github.abel533.echarts.series.gauge.Pointer
     */
    public Pointer pointer() {
        if (this.pointer == null) {
            this.pointer = new Pointer();
        }
        return this.pointer;
    }

    /**
     * 仪表盘标题
     *
     * @see com.github.abel533.echarts.Title
     */
    private Title title;

    /**
     * 仪表盘标题
     *
     * @see com.github.abel533.echarts.Title
     */
    public Title title() {
        if (this.title == null) {
            this.title = new Title();
        }
        return this.title;
    }

    /**
     * 仪表盘详情
     *
     * @see com.github.abel533.echarts.series.gauge.Detail
     */
    private Detail detail;

    /**
     * 仪表盘详情
     *
     * @see com.github.abel533.echarts.series.gauge.Detail
     */
    public Detail detail() {
        if (this.detail == null) {
            this.detail = new Detail();
        }
        return this.detail;
    }

    public Gauge() {
        this.type(SeriesType.gauge);
    }

    public Gauge(String name) {
        super(name);
        this.type(SeriesType.gauge);
    }

    public Object[] getCenter() {
        return center;
    }

    public void setCenter(Object[] center) {
        this.center = center;
    }

    public Object getRadius() {
        return radius;
    }

    public void setRadius(Object radius) {
        this.radius = radius;
    }

    public Line getAxisLine() {
        return axisLine;
    }

    public void setAxisLine(Line axisLine) {
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

    public Pointer getPointer() {
        return pointer;
    }

    public void setPointer(Pointer pointer) {
        this.pointer = pointer;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }
}
