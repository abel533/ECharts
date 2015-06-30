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

import java.io.Serializable;

/**
 * KData
 *
 * @author liuzh
 */
public class KData implements Serializable {

    private static final long serialVersionUID = 3593085721806381731L;

    private Double[] value;

    /**
     * 开盘，收盘，最低，最高
     *
     * @param open
     * @param close
     * @param min
     * @param max
     */
    public KData(Double open, Double close, Double min, Double max) {
        this.value = new Double[4];
        this.value[0] = open;
        this.value[1] = close;
        this.value[2] = min;
        this.value[3] = max;
    }

    /**
     * 获取value值
     */
    public Double[] value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public KData value(Double[] value) {
        this.value = value;
        return this;
    }

    /**
     * 获取value值
     */
    public Double[] getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(Double[] value) {
        this.value = value;
    }
}
