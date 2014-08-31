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

package com.github.abel533.echarts.series.gauge;

/**
 * 仪表盘 - 指针样式
 *
 * @author liuzh
 */
public class Pointer {
    /**
     * 属性length控制线长，百分比相对的是仪表盘的外半径
     */
	private Object length;

	public Object length(){
		return this.length;
	}

	public Pointer length(Object length){
		this.length = length;
		return this;
	}

    /**
     * 属性width控制指针最宽处，
     */
	private Object width;

	public Object width(){
		return this.width;
	}

	public Pointer width(Object width){
		this.width = width;
		return this;
	}

    /**
     * 属性color控制指针颜色
     */
	private String color;

	public String color(){
		return this.color;
	}

	public Pointer color(String color){
		this.color = color;
		return this;
	}
}
