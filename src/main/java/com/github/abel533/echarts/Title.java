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
import com.github.abel533.echarts.style.TextStyle;

/**
 * Created by liuzh on 14-8-25.
 */
public class Title extends Basic {
    /**
     * 主标题文本，'\n'指定换行
     */
    public String text;

    /**
     * 主标题文本超链接
     */
    public String link;

    /**
     * 指定窗口打开主标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    public String target;

    /**
     * 副标题文本，'\n'指定换行
     */
    public String subtext;

    /**
     * 副标题文本超链接
     */
    public String sublink;

    /**
     * 指定窗口打开副标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    public String subtarget;

    /**
     * 水平对齐方式，默认根据x设置自动调整，可选为： left' | 'right' | 'center
     *
     * @see com.github.abel533.echarts.code.XPosition
     */
    public XPosition textAlign;

    /**
     * 主标题文本样式（详见textStyle）
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle textStyle;

    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle subtextStyle;

    public Title() {
        super();
        this.text = "";
        this.x = XPosition.left;
        this.y = YPosition.top;
        this.textStyle = new TextStyle();
        this.textStyle.fontSize = 18;
        this.textStyle.fontWeight = "bolder";
        this.textStyle.color = "#333";
    }
}
