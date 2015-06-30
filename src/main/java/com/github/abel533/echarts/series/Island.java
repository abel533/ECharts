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
 * @author liuzh
 */
public class Island extends Series<Island> {
    private Object r;
    /**
     * 滚轮可计算步长 0.1 = 10%
     */
    private Object calculateStep;

    /**
     * 构造函数
     */
    public Island() {
        this.type(SeriesType.island);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Island(String name) {
        super(name);
        this.type(SeriesType.island);
    }

    /**
     * 获取r值
     */
    public Object r() {
        return this.r;
    }

    /**
     * 设置r值
     *
     * @param r
     */
    public Island r(Object r) {
        this.r = r;
        return this;
    }

    /**
     * 获取calculateStep值
     */
    public Object calculateStep() {
        return this.calculateStep;
    }

    /**
     * 设置calculateStep值
     *
     * @param calculateStep
     */
    public Island calculateStep(Object calculateStep) {
        this.calculateStep = calculateStep;
        return this;
    }

    /**
     * 获取r值
     */
    public Object getR() {
        return r;
    }

    /**
     * 设置r值
     *
     * @param r
     */
    public void setR(Object r) {
        this.r = r;
    }

    /**
     * 获取calculateStep值
     */
    public Object getCalculateStep() {
        return calculateStep;
    }

    /**
     * 设置calculateStep值
     *
     * @param calculateStep
     */
    public void setCalculateStep(Object calculateStep) {
        this.calculateStep = calculateStep;
    }
}
