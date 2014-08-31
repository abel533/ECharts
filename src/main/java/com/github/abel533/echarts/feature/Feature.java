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

package com.github.abel533.echarts.feature;

import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.style.TextStyle;

/**
 * @author liuzh
 */
public class Feature {
    public static final DataView dataView = new DataView();
    public static final DataZoom dataZoom = new DataZoom();
    public static final Mark mark = new Mark();
    public static final SaveAsImage saveAsImage = new SaveAsImage();
    public static final MagicType magicType = new MagicType();
    public static final Restore restore = new Restore();

    /**
     * 是否显示
     */
	private Boolean show;

	public Boolean show(){
		return this.show;
	}

	public Feature show(Boolean show){
		this.show = show;
		return this;
	}

    /**
     * 标题
     */
	private Object title;

	public Object title(){
		return this.title;
	}

	public Feature title(Object title){
		this.title = title;
		return this;
	}

    /**
     * 类型
     *
     * @see com.github.abel533.echarts.code.Magic
     * @see com.github.abel533.echarts.code.LineType
     */
	private Object type;

	public Object type(){
		return this.type;
	}

	public Feature type(Object type){
		this.type = type;
		return this;
	}

    /**
     * 只读
     */
	private Boolean readOnly;

	public Boolean readOnly(){
		return this.readOnly;
	}

	public Feature readOnly(Boolean readOnly){
		this.readOnly = readOnly;
		return this;
	}

    /**
     * lang 非IE浏览器支持点击下载，有保存话术，默认是“点击保存”，可修改
     */
	private Object lang;

	public Object lang(){
		return this.lang;
	}

	public Feature lang(Object lang){
		this.lang = lang;
		return this;
	}

    /**
     * 线条颜色
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
	private LineStyle lineStyle;

	public LineStyle lineStyle(){
		return this.lineStyle;
	}

	public Feature lineStyle(LineStyle lineStyle){
		this.lineStyle = lineStyle;
		return this;
	}

    /**
     * 文字颜色
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
	private TextStyle textStyle;

	public TextStyle textStyle(){
		return this.textStyle;
	}

	public Feature textStyle(TextStyle textStyle){
		this.textStyle = textStyle;
		return this;
	}

    /**
     * 图标，image://开头
     */
	private String icon;

	public String icon(){
		return this.icon;
	}

	public Feature icon(String icon){
		this.icon = icon;
		return this;
	}

}
