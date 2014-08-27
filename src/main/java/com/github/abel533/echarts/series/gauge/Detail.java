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

import com.github.abel533.echarts.style.TextStyle;

/**
 * 仪表盘详情
 *
 * @author liuzh
 */
public class Detail {
    /**
     * 属性show控制显示与否
     */
    public Boolean show;

    /**
     * 标题背景颜色，默认透明
     */
    public String backgroundColor;

    /**
     * 标题边框颜色
     */
    public String borderColor;

    /**
     * borderWidth
     */
    public Integer borderWidth;

    /**
     * 属性width控制详情宽度
     */
    public Object width;

    /**
     * 属性height控制详情高度
     */
    public Object height;

    /**
     * 属性offsetCenter用于详情定位，数组为横纵相对仪表盘圆心坐标偏移，支持百分比（相对外半径）
     */
    public Object offsetCenter;

    /**
     * 属性formatter可以格式化文本
     */
    public String formatter;

    /**
     * 属性textStyle（详见textStyle）控制文本样式
     */
    private TextStyle textStyle;

    /**
     * 属性textStyle（详见textStyle）控制文本样式
     */
    public TextStyle textStyle(){
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
