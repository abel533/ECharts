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
 * 平行坐标系
 *
 * @author liuzh
 */
public class Parallel extends Series<Parallel> {
    /**
     * 使用的平行坐标系的 index，在单个图表实例中存在多个平行坐标系的时候有用
     */
    private Integer parallelIndex;
    /**
     * 框选时，未被选中的条线会设置成这个『透明度』（从而可以达到变暗的效果）
     */
    private Double inactiveOpacity;
    /**
     * 框选时，选中的条线会设置成这个『透明度』（从而可以达到高亮的效果）
     */
    private Double activeOpacity;

    /**
     * 构造函数
     */
    public Parallel() {
        this.type(SeriesType.parallel);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Parallel(String name) {
        super(name);
        this.type(SeriesType.parallel);
    }

    public Integer parallelIndex() {
        return this.parallelIndex;
    }

    public Parallel parallelIndex(Integer parallelIndex) {
        this.parallelIndex = parallelIndex;
        return this;
    }

    public Double inactiveOpacity() {
        return this.inactiveOpacity;
    }

    public Parallel inactiveOpacity(Double inactiveOpacity) {
        this.inactiveOpacity = inactiveOpacity;
        return this;
    }

    public Double activeOpacity() {
        return this.activeOpacity;
    }

    public Parallel activeOpacity(Double activeOpacity) {
        this.activeOpacity = activeOpacity;
        return this;
    }

    public Integer getParallelIndex() {
        return parallelIndex;
    }

    public void setParallelIndex(Integer parallelIndex) {
        this.parallelIndex = parallelIndex;
    }

    public Double getInactiveOpacity() {
        return inactiveOpacity;
    }

    public void setInactiveOpacity(Double inactiveOpacity) {
        this.inactiveOpacity = inactiveOpacity;
    }

    public Double getActiveOpacity() {
        return activeOpacity;
    }

    public void setActiveOpacity(Double activeOpacity) {
        this.activeOpacity = activeOpacity;
    }
}
