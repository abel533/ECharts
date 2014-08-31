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

import com.github.abel533.echarts.style.TextStyle;

/**
 * Description : LegendData
 *
 * @author liuzh
 */
public class LegendData {
    /**
     * 名称
     */
	private String name;

	public String name(){
		return this.name;
	}

	public LegendData name(String name){
		this.name = name;
		return this;
	}

    /**
     * 文字样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
	private TextStyle textStyle;

	public TextStyle textStyle(){
		return this.textStyle;
	}

	public LegendData textStyle(TextStyle textStyle){
		this.textStyle = textStyle;
		return this;
	}

    /**
     * 图标
     */
	private String icon;

	public String icon(){
		return this.icon;
	}

	public LegendData icon(String icon){
		this.icon = icon;
		return this;
	}

    public LegendData(String name) {
        this.name = name;
    }

    public LegendData(String name, TextStyle textStyle) {
        this.name = name;
        this.textStyle = textStyle;
    }

    public LegendData(String name, TextStyle textStyle, String icon) {
        this.name = name;
        this.textStyle = textStyle;
        this.icon = icon;
    }
}
