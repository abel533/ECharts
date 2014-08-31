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

/**
 * 柱形图
 *
 * @author liuzh
 */
public class Bar extends Series<Bar> {
    /**
     * 柱条最小高度，可用于防止某item的值过小而影响交互
     */
	private Integer barMinHeight;

	public Integer barMinHeight(){
		return this.barMinHeight;
	}

	public Bar barMinHeight(Integer barMinHeight){
		this.barMinHeight = barMinHeight;
		return this;
	}

    /**
     * 柱间距离，默认为柱形宽度的30%，可设固定值
     */
	private String barGap;

	public String barGap(){
		return this.barGap;
	}

	public Bar barGap(String barGap){
		this.barGap = barGap;
		return this;
	}

    /**
     * 类目间柱形距离，默认为类目间距的20%，可设固定值
     */
	private String barCategoryGap;

	public String barCategoryGap(){
		return this.barCategoryGap;
	}

	public Bar barCategoryGap(String barCategoryGap){
		this.barCategoryGap = barCategoryGap;
		return this;
	}

    public Bar() {
        this.type(SeriesType.bar);
    }

    public Bar(String name) {
        super(name);
        this.type(SeriesType.bar);
    }
}
