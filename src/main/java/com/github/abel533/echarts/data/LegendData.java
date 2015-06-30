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

package com.github.abel533.echarts.data;

import com.github.abel533.echarts.style.TextStyle;

import java.io.Serializable;

/**
 * Description : LegendData
 *
 * @author liuzh
 */
public class LegendData implements Serializable {

    private static final long serialVersionUID = 7218201600361155091L;

    /**
     * 名称
     */
    private String name;
    /**
     * 文字样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;
    /**
     * 图标
     */
    private String icon;

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public LegendData(String name) {
        this.name = name;
    }

    /**
     * 构造函数,参数:name,textStyle
     *
     * @param name
     * @param textStyle
     */
    public LegendData(String name, TextStyle textStyle) {
        this.name = name;
        this.textStyle = textStyle;
    }

    /**
     * 构造函数,参数:name,textStyle,icon
     *
     * @param name
     * @param textStyle
     * @param icon
     */
    public LegendData(String name, TextStyle textStyle, String icon) {
        this.name = name;
        this.textStyle = textStyle;
        this.icon = icon;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public LegendData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取textStyle值
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public LegendData textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取icon值
     */
    public String icon() {
        return this.icon;
    }

    /**
     * 设置icon值
     *
     * @param icon
     */
    public LegendData icon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 获取name值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取textStyle值
     */
    public TextStyle getTextStyle() {
        return textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    /**
     * 获取icon值
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置icon值
     *
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
