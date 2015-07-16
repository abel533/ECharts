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

package com.github.abel533.echarts.style;

import java.io.Serializable;

/**
 * 面包屑
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class Breadcrumb implements Serializable {
    private static final long serialVersionUID = 1L;
    private Boolean show;
    private TextStyle textStyle;

    /**
     * 构造函数
     */
    public Breadcrumb() {
    }

    /**
     * 构造函数,参数:show
     *
     * @param show
     */
    public Breadcrumb(Boolean show) {
        this.show = show;
    }

    /**
     * 构造函数,参数:show,textStyle
     *
     * @param show
     * @param textStyle
     */
    public Breadcrumb(Boolean show, TextStyle textStyle) {
        this.show = show;
        this.textStyle = textStyle;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public Breadcrumb show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取show值
     */
	public Boolean show() {
        return this.show;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public Breadcrumb textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
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
}
