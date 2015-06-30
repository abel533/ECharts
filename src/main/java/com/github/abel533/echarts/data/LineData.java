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
 * LineData
 *
 * @author liuzh
 */
public class LineData extends BasicData<LineData> {
    /**
     * 可以通过valueIndex:0指定为横轴特殊点
     */
    private Integer valueIndex;

    /**
     * 构造函数
     */
    public LineData() {
    }

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public LineData(String name, Object value) {
        super(name, value);
    }

    /**
     * 构造函数,参数:name,symbol,symbolSize
     *
     * @param name
     * @param symbol
     * @param symbolSize
     */
    public LineData(String name, Object symbol, Object symbolSize) {
        super(name, symbol, symbolSize);
    }

    /**
     * 构造函数,参数:value,symbol
     *
     * @param value
     * @param symbol
     */
    public LineData(Object value, Object symbol) {
        super(value, symbol);
    }

    /**
     * 构造函数,参数:value,symbol,symbolSize
     *
     * @param value
     * @param symbol
     * @param symbolSize
     */
    public LineData(Object value, Object symbol, Object symbolSize) {
        super(value, symbol, symbolSize);
    }

    /**
     * 获取valueIndex值
     */
    public Integer valueIndex() {
        return this.valueIndex;
    }

    /**
     * 设置valueIndex值
     *
     * @param valueIndex
     */
    public LineData valueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }

    /**
     * 获取valueIndex值
     */
    public Integer getValueIndex() {
        return valueIndex;
    }

    /**
     * 设置valueIndex值
     *
     * @param valueIndex
     */
    public LineData setValueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }
}
