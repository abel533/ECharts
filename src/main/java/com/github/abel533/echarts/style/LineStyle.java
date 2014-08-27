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

import com.github.abel533.echarts.code.LineType;

/**
 * @author liuzh
 */
public class LineStyle {
    /**
     * 阳线颜色
     */
    public Object color;

    /**
     * 阴线颜色
     */
    public Object color0;

    /**
     * 线条样式，可选为：'solid' | 'dotted' | 'dashed'
     *
     * @see com.github.abel533.echarts.code.LineType
     */
    public LineType type;

    /**
     * 线宽
     */
    public Integer width;

    /**
     * 折线主线(IE8+)有效，阴影色彩，支持rgba
     */
    public String shadowColor;

    /**
     * 默认值5，折线主线(IE8+)有效，阴影模糊度，大于0有效
     */
    public Integer shadowBlur;

    /**
     * 默认值3，折线主线(IE8+)有效，阴影横向偏移，正值往右，负值往左
     */
    public Integer shadowOffsetX;

    /**
     * 默认值3，折线主线(IE8+)有效，阴影纵向偏移，正值往下，负值往上
     */
    public Integer shadowOffsetY;
}
