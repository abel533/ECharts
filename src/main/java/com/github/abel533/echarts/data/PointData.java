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

package com.github.abel533.echarts.data;

import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: PointData
 *
 * @author liuzh
 */
public class PointData {
	private String name;

	public String name(){
		return this.name;
	}

	public PointData name(String name){
		this.name = name;
		return this;
	}
	private Object value;

	public Object value(){
		return this.value;
	}

	public PointData value(Object value){
		this.value = value;
		return this;
	}

    /**
     * 饼图、雷达图、力导、和弦图使用x,y
     */
	private Integer x;

	public Integer x(){
		return this.x;
	}

	public PointData x(Integer x){
		this.x = x;
		return this;
	}
	private Integer y;

	public Integer y(){
		return this.y;
	}

	public PointData y(Integer y){
		this.y = y;
		return this;
	}

    /**
     * 在存在直角坐标系的图表如折线、柱形、K线、散点图中
     * 除了通过直接指定位置外，如果希望标注基于直角系的定位，可以通过xAxis，yAxis
     */
	private Integer xAxis;

	public Integer xAxis(){
		return this.xAxis;
	}

	public PointData xAxis(Integer xAxis){
		this.xAxis = xAxis;
		return this;
	}
	private Integer yAxis;

	public Integer yAxis(){
		return this.yAxis;
	}

	public PointData yAxis(Integer yAxis){
		this.yAxis = yAxis;
		return this;
	}

	private MarkType type;

	public MarkType type(){
		return this.type;
	}

	public PointData type(MarkType type){
		this.type = type;
		return this;
	}

	private Object symbol;

	public Object symbol(){
		return this.symbol;
	}

	public PointData symbol(Object symbol){
		this.symbol = symbol;
		return this;
	}
	private Object symbolSize;

	public Object symbolSize(){
		return this.symbolSize;
	}

	public PointData symbolSize(Object symbolSize){
		this.symbolSize = symbolSize;
		return this;
	}

	private ItemStyle itemStyle;

	public ItemStyle itemStyle(){
		return this.itemStyle;
	}

	public PointData itemStyle(ItemStyle itemStyle){
		this.itemStyle = itemStyle;
		return this;
	}

    public PointData() {
    }

    public PointData(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public PointData(String name, Object symbol, Object symbolSize) {
        this.name = name;
        this.symbol = symbol;
        this.symbolSize = symbolSize;
    }

    public PointData(Object value, Object symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public PointData(Object value, Object symbol, Object symbolSize) {
        this.value = value;
        this.symbol = symbol;
        this.symbolSize = symbolSize;
    }

    public PointData setName(String name) {
        this.name = name;
        return this;
    }

    public PointData setValue(Object value) {
        this.value = value;
        return this;
    }

    public PointData setX(Integer x) {
        this.x = x;
        return this;
    }

    public PointData setY(Integer y) {
        this.y = y;
        return this;
    }

    public PointData setxAxis(Integer xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public PointData setyAxis(Integer yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public PointData setType(MarkType type) {
        this.type = type;
        return this;
    }

    public PointData setSymbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public PointData setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public PointData setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }
}
