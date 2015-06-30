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
 * 阴影指示器样式设置
 *
 * @author liuzh
 */
public class ShadowStyle implements Serializable {

    private static final long serialVersionUID = -1996366699438984171L;

    /**
     * 阴影颜色
     */
    private String color;
    /**
     * 默认auto，阴影大小
     */
    private Object width;
    /**
     * 填充方式，默认只有default
     */
    private String type;

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
    public ShadowStyle color(String color) {
        this.color = color;
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
    public ShadowStyle width(Object width) {
        this.width = width;
        return this;
    }

    /**
     * 获取type值
     */
    public String type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public ShadowStyle type(String type) {
        this.type = type;
        return this;
    }

    /**
     * 获取typeDefault值
     */
    public ShadowStyle typeDefault() {
        this.type = "default";
        return this;
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
     * 获取type值
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
