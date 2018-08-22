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

import com.github.abel533.echarts.code.DataFilter;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.style.AreaStyle;
import com.github.abel533.echarts.style.LineStyle;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author liuzh
 */
@Getter
@Setter
public class Line extends Series<Line> {
	/**
	 * 平滑曲线
	 */
	private Boolean smooth;
	/**
	 * ECharts 会在折线图的数据数量大于实际显示的像素宽度（高度）的时候会启用优化，对显示在一个像素宽度内的数据做筛选，该选项是指明数据筛选的策略
	 *
	 * @see DataFilter
	 */
	private Object dataFilter;
	/**
	 * 区域填充样式。
	 */
	private AreaStyle areaStyle;

	/**
	 * 区域填充样式。
	 */
	private LineStyle lineStyle;

	/**
	 * 构造函数
	 */
	public Line() {
		this.type(SeriesType.line);
	}

	/**
	 * 构造函数,参数:name
	 *
	 * @param name
	 */
	public Line(String name) {
		super(name);
		this.type(SeriesType.line);
	}

	/**
	 * 获取dataFilter值
	 */
	public Object dataFilter() {
		return this.dataFilter;
	}

	/**
	 * 设置dataFilter值
	 *
	 * @param dataFilter
	 */
	public Line dataFilter(Object dataFilter) {
		this.dataFilter = dataFilter;
		return this;
	}

	/**
	 * 设置dataFilter值
	 *
	 * @param dataFilter
	 */
	public Line dataFilter(DataFilter dataFilter) {
		this.dataFilter = dataFilter;
		return this;
	}

	/**
	 * 获取smooth值
	 */
	public Boolean smooth() {
		return this.smooth;
	}

	/**
	 * 设置smooth值
	 *
	 * @param smooth
	 */
	public Line smooth(Boolean smooth) {
		this.smooth = smooth;
		return this;
	}

	/**
	 * 新建并返回areaStyle
	 *
	 * @return
	 */
	public AreaStyle areaStyle() {
		if (this.areaStyle == null) {
			this.areaStyle = new AreaStyle();
		}
		return this.areaStyle;
	}

	/**
	 * 设置areaStyle
	 *
	 * @param areaStyle
	 * @return
	 */
	public Line areaStyle(AreaStyle areaStyle) {
		this.areaStyle = areaStyle;
		return this;
	}

	/**
	 * 新建并返回lineStyle
	 *
	 * @return
	 */
	public LineStyle lineStyle() {
		if (this.lineStyle == null) {
			this.lineStyle = new LineStyle();
		}
		return this.lineStyle;
	}

	/**
	 * 设置lineStyle
	 *
	 * @param lineStyle
	 * @return
	 */
	public Line lineStyle(LineStyle lineStyle) {
		this.lineStyle = lineStyle;
		return this;
	}
}
