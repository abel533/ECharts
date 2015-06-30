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

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.style.LineStyle;

import java.io.Serializable;

/**
 * 坐标轴线
 *
 * @author liuzh
 */
public class AxisLine implements Serializable {

    private static final long serialVersionUID = -7486014114670118509L;

    /**
     * 默认显示，属性show控制显示与否
     */
    private Boolean show;
    /**
     * 定位到垂直方向的0值坐标上
     */
    private Boolean onZero;
    /**
     * {color: '#48b', width: 2, type: 'solid'}
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public AxisLine show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取onZero值
     */
    public Boolean onZero() {
        return this.onZero;
    }

    /**
     * 设置onZero值
     *
     * @param onZero
     */
    public AxisLine onZero(Boolean onZero) {
        this.onZero = onZero;
        return this;
    }

    /**
     * {color: '#48b', width: 2, type: 'solid'}
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public AxisLine lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * 获取lineStyle值
     */
    public LineStyle getLineStyle() {
        return lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    /**
     * 获取show值
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * 获取onZero值
     */
    public Boolean getOnZero() {
        return onZero;
    }

    /**
     * 设置onZero值
     *
     * @param onZero
     */
    public void setOnZero(Boolean onZero) {
        this.onZero = onZero;
    }
}
