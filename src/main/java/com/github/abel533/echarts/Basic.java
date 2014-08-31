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

import com.github.abel533.echarts.code.XPosition;
import com.github.abel533.echarts.code.YPosition;

/**
 * 组件的基础类
 *
 * @author liuzh
 */
public abstract class Basic {
    /**
     * 水平安放位置，默认为左侧，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）
     *
     * @see com.github.abel533.echarts.code.XPosition
     */
	private Object x;

	public Object x(){
		return this.x;
	}

	public Basic x(Object x){
		this.x = x;
		return this;
	}

    /**
     * 垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）
     *
     * @see com.github.abel533.echarts.code.YPosition
     */
	private Object y;

	public Object y(){
		return this.y;
	}

	public Basic y(Object y){
		this.y = y;
		return this;
	}

    /**
     * 标题背景颜色，默认透明
     */
	private String backgroundColor;

	public String backgroundColor(){
		return this.backgroundColor;
	}

	public Basic backgroundColor(String backgroundColor){
		this.backgroundColor = backgroundColor;
		return this;
	}

    /**
     * 标题边框颜色
     */
	private String borderColor;

	public String borderColor(){
		return this.borderColor;
	}

	public Basic borderColor(String borderColor){
		this.borderColor = borderColor;
		return this;
	}

    /**
     * borderWidth
     */
	private Integer borderWidth;

	public Integer borderWidth(){
		return this.borderWidth;
	}

	public Basic borderWidth(Integer borderWidth){
		this.borderWidth = borderWidth;
		return this;
	}

    /**
     * 标题内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图
     */
	private Integer padding;

	public Integer padding(){
		return this.padding;
	}

	public Basic padding(Integer padding){
		this.padding = padding;
		return this;
	}

    /**
     * 主副标题纵向间隔，单位px，默认为10
     */
	private Integer itemGap;

	public Integer itemGap(){
		return this.itemGap;
	}

	public Basic itemGap(Integer itemGap){
		this.itemGap = itemGap;
		return this;
	}

    public void setX(Integer x) {
        this.x = x;
    }

    public void setX(XPosition x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setY(YPosition y) {
        this.y = y;
    }
}
