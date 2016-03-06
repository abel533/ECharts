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

package com.github.abel533.echarts;

/**
 * 直角坐标系内绘图网格
 *
 * @author liuzh
 */
public class Grid extends Basic<Grid> implements Component {
    /**
     * 直角坐标系内绘图网格左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    private Object x2;
    /**
     * 直角坐标系内绘图网格左上角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    private Object y2;
    /**
     * grid 区域是否包含坐标轴的刻度标签，在无法确定坐标轴标签的宽度，容器有比较小无法预留较多空间的时候，可以设为 true 防止标签溢出容器
     */
    private Boolean containLabel;

    public Boolean containLabel() {
        return this.containLabel;
    }

    public Grid containLabel(Boolean containLabel) {
        this.containLabel = containLabel;
        return this;
    }

    public Boolean getContainLabel() {
        return containLabel;
    }

    public void setContainLabel(Boolean containLabel) {
        this.containLabel = containLabel;
    }

    /**
     * 获取x2值
     */
    public Object x2() {
        return this.x2;
    }

    /**
     * 设置x2值
     *
     * @param x2
     */
    public Grid x2(Object x2) {
        this.x2 = x2;
        return this;
    }

    /**
     * 获取y2值
     */
    public Object y2() {
        return this.y2;
    }

    /**
     * 设置y2值
     *
     * @param y2
     */
    public Grid y2(Object y2) {
        this.y2 = y2;
        return this;
    }

    /**
     * 获取x2值
     */
    public Object getX2() {
        return x2;
    }

    /**
     * 设置x2值
     *
     * @param x2
     */
    public void setX2(Object x2) {
        this.x2 = x2;
    }

    /**
     * 获取y2值
     */
    public Object getY2() {
        return y2;
    }

    /**
     * 设置y2值
     *
     * @param y2
     */
    public void setY2(Object y2) {
        this.y2 = y2;
    }

}
