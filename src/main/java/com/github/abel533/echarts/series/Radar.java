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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

/**
 * 雷达图
 *
 * @author liuzh
 */
public class Radar extends Series<Radar> {
    /**
     * 极坐标索引
     */
    private Integer polarIndex;

    /**
     * 构造函数
     */
    public Radar() {
        this.type(SeriesType.radar);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Radar(String name) {
        super(name);
        this.type(SeriesType.radar);
    }

    /**
     * 获取polarIndex值
     */
    public Integer polarIndex() {
        return this.polarIndex;
    }

    /**
     * 设置polarIndex值
     *
     * @param polarIndex
     */
    public Radar polarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
        return this;
    }

    /**
     * 获取polarIndex值
     */
    public Integer getPolarIndex() {
        return polarIndex;
    }

    /**
     * 设置polarIndex值
     *
     * @param polarIndex
     */
    public void setPolarIndex(Integer polarIndex) {
        this.polarIndex = polarIndex;
    }
}
