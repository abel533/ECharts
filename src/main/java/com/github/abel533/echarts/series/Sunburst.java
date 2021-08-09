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

import com.github.abel533.echarts.code.RoseType;
import com.github.abel533.echarts.code.SelectedMode;
import com.github.abel533.echarts.code.SeriesType;
import lombok.Getter;
import lombok.Setter;

/**
 * 旭日图
 *
 * @author miguanxiong
 */
@Getter
@Setter
public class Sunburst extends Series<Sunburst> {
    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     */
    private Object[] center;
    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     */
    private Object radius;

    /**
     * 构造函数
     */
    public Sunburst() {
        this.type(SeriesType.Sunburst);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Sunburst(String name) {
        super(name);
        this.type(SeriesType.pie);
    }

    /**
     * 获取center值
     */
    public Object[] center() {
        return this.center;
    }

    /**
     * 设置center值
     *
     * @param center
     */
    public Sunburst center(Object[] center) {
        this.center = center;
        return this;
    }

    /**
     * 获取radius值
     */
    public Object radius() {
        return this.radius;
    }

    /**
     * 圆心坐标，支持绝对值（px）和百分比，百分比计算min(width, height) * 50%
     *
     * @param width
     * @param height
     * @return
     */
    public Sunburst center(Object width, Object height) {
        this.center = new Object[]{width, height};
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param radius
     * @return
     */
    public Sunburst radius(Object radius) {
        this.radius = radius;
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param width  内半径
     * @param height 外半径
     * @return
     */
    public Sunburst radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }
}
