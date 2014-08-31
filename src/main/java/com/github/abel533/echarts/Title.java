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
import com.github.abel533.echarts.style.TextStyle;

/**
 * @author liuzh
 */
public class Title extends Basic implements Component {
    /**
     * 主标题文本，'\n'指定换行
     */
	private String text;

	public String text(){
		return this.text;
	}

	public Title text(String text){
		this.text = text;
		return this;
	}

    /**
     * 主标题文本超链接
     */
	private String link;

	public String link(){
		return this.link;
	}

	public Title link(String link){
		this.link = link;
		return this;
	}

    /**
     * 指定窗口打开主标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
	private String target;

	public String target(){
		return this.target;
	}

	public Title target(String target){
		this.target = target;
		return this;
	}

    /**
     * 副标题文本，'\n'指定换行
     */
	private String subtext;

	public String subtext(){
		return this.subtext;
	}

	public Title subtext(String subtext){
		this.subtext = subtext;
		return this;
	}

    /**
     * 副标题文本超链接
     */
	private String sublink;

	public String sublink(){
		return this.sublink;
	}

	public Title sublink(String sublink){
		this.sublink = sublink;
		return this;
	}

    /**
     * 指定窗口打开副标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
	private String subtarget;

	public String subtarget(){
		return this.subtarget;
	}

	public Title subtarget(String subtarget){
		this.subtarget = subtarget;
		return this;
	}

    /**
     * 水平对齐方式，默认根据x设置自动调整，可选为： left' | 'right' | 'center
     *
     * @see com.github.abel533.echarts.code.XPosition
     */
	private XPosition textAlign;

	public XPosition textAlign(){
		return this.textAlign;
	}

	public Title textAlign(XPosition textAlign){
		this.textAlign = textAlign;
		return this;
	}

    /**
     * 主标题文本样式（详见textStyle）
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;

    /**
     * 主标题文本样式（详见textStyle）
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle textStyle(){
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle subtextStyle;

    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle subtextStyle(){
        if (this.subtextStyle == null) {
            this.subtextStyle = new TextStyle();
        }
        return this.subtextStyle;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public TextStyle getSubtextStyle() {
        return subtextStyle;
    }

    public void setSubtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
    }
}
