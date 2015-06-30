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

import com.github.abel533.echarts.code.BrushType;

/**
 * Description: NodeStyle
 *
 * @author liuzh
 */
public class NodeStyle extends LinkStyle {
    /**
     * 可选 'both', 'stroke', 'fill'
     */
    private BrushType brushType;
    /**
     * 填充颜色
     */
    private String color;

    /**
     * 获取brushType值
     */
    public BrushType brushType() {
        return this.brushType;
    }

    /**
     * 设置brushType值
     *
     * @param brushType
     */
    public NodeStyle brushType(BrushType brushType) {
        this.brushType = brushType;
        return this;
    }

    /**
     * 获取color值
     */
    public String color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public NodeStyle color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取brushType值
     */
    public BrushType getBrushType() {
        return brushType;
    }

    /**
     * 设置brushType值
     *
     * @param brushType
     */
    public void setBrushType(BrushType brushType) {
        this.brushType = brushType;
    }

    /**
     * 获取color值
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
