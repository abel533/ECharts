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

package com.github.abel533.echarts.series.gauge;

import java.io.Serializable;

/**
 * 仪表盘 - 指针样式
 *
 * @author liuzh
 */
public class Pointer implements Serializable {

    private static final long serialVersionUID = 2575834098541231673L;

    /**
     * 属性length控制线长，百分比相对的是仪表盘的外半径
     */
    private Object length;
    /**
     * 属性width控制指针最宽处，
     */
    private Object width;
    /**
     * 属性color控制指针颜色
     */
    private String color;

    /**
     * 获取length值
     */
    public Object length() {
        return this.length;
    }

    /**
     * 设置length值
     *
     * @param length
     */
    public Pointer length(Object length) {
        this.length = length;
        return this;
    }

    /**
     * 获取width值
     */
    public Object width() {
        return this.width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public Pointer width(Object width) {
        this.width = width;
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
    public Pointer color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取length值
     */
    public Object getLength() {
        return length;
    }

    /**
     * 设置length值
     *
     * @param length
     */
    public void setLength(Object length) {
        this.length = length;
    }

    /**
     * 获取width值
     */
    public Object getWidth() {
        return width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public void setWidth(Object width) {
        this.width = width;
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
