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

import java.io.Serializable;

/**
 * @author liuzh
 */
public class ScaleLimit implements Serializable {

    private static final long serialVersionUID = 6026916937450874614L;

    private Double min;
    private Double max;

    /**
     * 构造函数
     */
    public ScaleLimit() {
    }

    /**
     * 构造函数,参数:min,max
     *
     * @param min
     * @param max
     */
    public ScaleLimit(Double min, Double max) {
        this.min = min;
        this.max = max;
    }

    /**
     * 获取min值
     */
    public Double min() {
        return this.min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public ScaleLimit min(Double min) {
        this.min = min;
        return this;
    }

    /**
     * 获取max值
     */
    public Double max() {
        return this.max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public ScaleLimit max(Double max) {
        this.max = max;
        return this;
    }

    /**
     * 获取min值
     */
    public Double getMin() {
        return min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public void setMin(Double min) {
        this.min = min;
    }

    /**
     * 获取max值
     */
    public Double getMax() {
        return max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public void setMax(Double max) {
        this.max = max;
    }
}
