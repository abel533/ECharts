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

/**
 * 可以是一个包含 offset 和 color 的 Object 的数组，如 [{ offset: 0.2, color: 'blue' }, { offset 0.8, color: 'cyan' }]；也可以是一个颜色字符串的数组如 ['blue', 'cyan', 'lime', 'yellow', 'red']，颜色将均匀分布
 *
 * @author liuzh
 * @since 2015-07-16
 */
public class GradientColor {
    private Double offset;
    private Object color;

    /**
     * 构造函数,参数:offset,color
     *
     * @param offset
     * @param color
     */
    public GradientColor(Double offset, Object color) {
        this.offset = offset;
        this.color = color;
    }

    /**
     * 获取offset值
     */
    public Double offset() {
        return this.offset;
    }

    /**
     * 设置offset值
     *
     * @param offset
     */
    public GradientColor offset(Double offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public GradientColor color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取offset值
     */
    public Double getOffset() {
        return offset;
    }

    /**
     * 设置offset值
     *
     * @param offset
     */
    public void setOffset(Double offset) {
        this.offset = offset;
    }

    /**
     * 获取color值
     */
    public Object getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(Object color) {
        this.color = color;
    }
}
