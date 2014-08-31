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

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.code.Sort;

/**
 * 漏斗图
 *
 * @author liuzh
 */
public class Funnel extends Series<Funnel> {
    /**
     * 左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
	private Object x;

	public Object x(){
		return this.x;
	}

	public Funnel x(Object x){
		this.x = x;
		return this;
	}

    /**
     * 左上角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
	private Object y;

	public Object y(){
		return this.y;
	}

	public Funnel y(Object y){
		this.y = y;
		return this;
	}

    /**
     * 右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
	private Object x2;

	public Object x2(){
		return this.x2;
	}

	public Funnel x2(Object x2){
		this.x2 = x2;
		return this;
	}

    /**
     * 右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
	private Object y2;

	public Object y2(){
		return this.y2;
	}

	public Funnel y2(Object y2){
		this.y2 = y2;
		return this;
	}

    /**
     * 总宽度，默认为绘图区总宽度 - x - x2，数值单位px，指定width后将忽略x2，支持百分比（字符串），如'50%'(显示区域一半的宽度)
     */
	private Object width;

	public Object width(){
		return this.width;
	}

	public Funnel width(Object width){
		this.width = width;
		return this;
	}

    /**
     * 总宽度，默认为绘图区总高度 - y - y2，数值单位px，指定width后将忽略x2，支持百分比（字符串），如'50%'(显示区域一半的高度)
     */
	private Object height;

	public Object height(){
		return this.height;
	}

	public Funnel height(Object height){
		this.height = height;
		return this;
	}

    /**
     * 指定的最小值
     */
	private Integer min;

	public Integer min(){
		return this.min;
	}

	public Funnel min(Integer min){
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

	public Funnel max(Integer max){
		this.max = max;
		return this;
	}

    /**
     * 最小值min映射到总宽度的比例，如果需要最小值的图形并不是尖端三角，可设置minSize实现
     */
	private String minSize;

	public String minSize(){
		return this.minSize;
	}

	public Funnel minSize(String minSize){
		this.minSize = minSize;
		return this;
	}

    /**
     * 最大值max映射到总宽度的比例
     */
	private String maxSize;

	public String maxSize(){
		return this.maxSize;
	}

	public Funnel maxSize(String maxSize){
		this.maxSize = maxSize;
		return this;
	}

    /**
     * 数据排序， 可以取ascending, descending
     *
     * @see com.github.abel533.echarts.code.Sort
     */
	private Sort sort;

	public Sort sort(){
		return this.sort;
	}

	public Funnel sort(Sort sort){
		this.sort = sort;
		return this;
	}

    /**
     * 数据图形间距
     */
	private Integer gap;

	public Integer gap(){
		return this.gap;
	}

	public Funnel gap(Integer gap){
		this.gap = gap;
		return this;
	}

    public Funnel() {
        this.type(SeriesType.funnel);
    }

    public Funnel(String name) {
        super(name);
        this.type(SeriesType.funnel);
    }
}
