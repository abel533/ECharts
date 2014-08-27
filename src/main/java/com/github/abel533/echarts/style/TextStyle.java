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

package com.github.abel533.echarts.style;

import com.github.abel533.echarts.code.FontStyle;
import com.github.abel533.echarts.code.XPosition;

/**
 * 文字样式
 *
 * @author liuzh
 *         Created by liuzh on 14-8-25.
 */
public class TextStyle {
    /**
     * 颜色
     */
    public String color;

    /**
     * 修饰，仅对tooltip.textStyle生效
     */
    public String decoration;

    /**
     * 水平对齐方式，可选为：'left' | 'right' | 'center'
     *
     * @see com.github.abel533.echarts.code.XPosition
     */
    public XPosition align;

    /**
     * 字号 ，单位px
     */
    public Integer fontSize;

    /**
     * 字体系列
     */
    public String fontFamily;

    /**
     * 字体系列
     * IE8- 字体模糊并且，不支持不同字体混排，额外指定一份
     */
    public String fontFamily2;

    /**
     * 样式，可选为：'normal' | 'italic' | 'oblique'
     */
    public FontStyle fontStyle;

    /**
     * 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 |... | 900
     *
     * @see com.github.abel533.echarts.code.FontWeight
     */
    public Object fontWeight;
}
