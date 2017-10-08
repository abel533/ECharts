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

import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 组件的基础类
 *
 * @author liuzh
 */
@Getter
@Setter
public abstract class Basic<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 是否显示
     */
    private Boolean show;
    /**
     * 水平安放位置，默认为左侧，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）
     *
     * @see com.github.abel533.echarts.code.X
     */
    private Object x;
    /**
     * 垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）
     *
     * @see com.github.abel533.echarts.code.Y
     */
    private Object y;
    /**
     * 标题背景颜色，默认透明
     */
    private String backgroundColor;
    /**
     * 标题边框颜色
     */
    private String borderColor;
    /**
     * borderWidth
     */
    private Integer borderWidth;
    /**
     * 标题内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图
     */
    private Object padding;
    /**
     * 主副标题纵向间隔，单位px，默认为10
     */
    private Integer itemGap;
    /**
     * 一级层叠控制
     */
    private Integer zlevel;
    /**
     * 二级层叠控制
     */
    private Integer z;

    /**
     * treemap 组件离容器左侧的距离
     */
    private Object left;
    /**
     * treemap 组件离容器上侧的距离
     */
    private Object top;
    /**
     * treemap 组件离容器右侧的距离
     */
    private Object right;
    /**
     * treemap 组件离容器下侧的距离
     */
    private Object bottom;
    /**
     * treemap 组件的宽度
     */
    private Object width;
    /**
     * treemap 组件的高度
     */
    private Object height;
    /**
     * 图形阴影的模糊大小。该属性配合 shadowColor,shadowOffsetX, shadowOffsetY 一起设置图形的阴影效果
     */
    private Integer shadowBlur;
    /**
     * 阴影颜色
     */
    private String shadowColor;
    /**
     * 阴影水平方向上的偏移距离
     */
    private Integer shadowOffsetX;
    /**
     * 阴影垂直方向上的偏移距离
     */
    private Integer shadowOffsetY;

    public Object width() {
        return this.width;
    }

    public T width(Object width) {
        this.width = width;
        return (T) this;
    }

    public T width(Integer width) {
        this.width = width;
        return (T) this;
    }

    public Object height() {
        return this.height;
    }

    public T height(Object height) {
        this.height = height;
        return (T) this;
    }

    public T height(Integer height) {
        this.height = height;
        return (T) this;
    }

    public Integer shadowBlur() {
        return this.shadowBlur;
    }

    public T shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return (T) this;
    }

    public String shadowColor() {
        return this.shadowColor;
    }

    public T shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return (T) this;
    }

    public Integer shadowOffsetX() {
        return this.shadowOffsetX;
    }

    public T shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return (T) this;
    }

    public Integer shadowOffsetY() {
        return this.shadowOffsetY;
    }

    public T shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return (T) this;
    }

    public Object left() {
        return this.left;
    }

    public T left(Object left) {
        this.left = left;
        return (T) this;
    }

    public T left(Integer left) {
        this.left = left;
        return (T) this;
    }

    public T left(X left) {
        this.left = left;
        return (T) this;
    }

    public Object top() {
        return this.top;
    }

    public T top(Object top) {
        this.top = top;
        return (T) this;
    }

    public T top(Integer top) {
        this.top = top;
        return (T) this;
    }

    public T top(Y top) {
        this.top = top;
        return (T) this;
    }

    public Object right() {
        return this.right;
    }

    public T right(Object right) {
        this.right = right;
        return (T) this;
    }

    public T right(Integer right) {
        this.right = right;
        return (T) this;
    }

    public Object bottom() {
        return this.bottom;
    }

    public T bottom(Object bottom) {
        this.bottom = bottom;
        return (T) this;
    }

    public T bottom(Integer bottom) {
        this.bottom = bottom;
        return (T) this;
    }

    /**
     * 设置zlevel值
     *
     * @param zlevel
     */
    public T zlevel(Integer zlevel) {
        this.zlevel = zlevel;
        return (T) this;
    }

    /**
     * 获取zlevel值
     */
    public Integer zlevel() {
        return this.zlevel;
    }

    /**
     * 设置z值
     *
     * @param z
     */
    public T z(Integer z) {
        this.z = z;
        return (T) this;
    }

    /**
     * 获取z值
     */
    public Integer z() {
        return this.z;
    }

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
    public T show(Boolean show) {
        this.show = show;
        return (T) this;
    }

    /**
     * 获取x值
     */
    public Object x() {
        return this.x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public T x(Object x) {
        this.x = x;
        return (T) this;
    }

    /**
     * 获取y值
     */
    public Object y() {
        return this.y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public T y(Object y) {
        this.y = y;
        return (T) this;
    }

    /**
     * 获取backgroundColor值
     */
    public String backgroundColor() {
        return this.backgroundColor;
    }

    /**
     * 设置backgroundColor值
     *
     * @param backgroundColor
     */
    public T backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return (T) this;
    }

    /**
     * 获取borderColor值
     */
    public String borderColor() {
        return this.borderColor;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public T borderColor(String borderColor) {
        this.borderColor = borderColor;
        return (T) this;
    }

    /**
     * 获取borderWidth值
     */
    public Integer borderWidth() {
        return this.borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public T borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (T) this;
    }

    /**
     * 获取padding值
     */
    public Object padding() {
        return this.padding;
    }

    /**
     * 设置padding值
     *
     * @param padding
     */
    public T padding(Integer padding) {
        this.padding = padding;
        return (T) this;
    }

    /**
     * 设置padding值
     *
     * @param padding
     */
    public T padding(Integer... padding) {
        if (padding != null && padding.length > 4) {
            throw new RuntimeException("padding属性最多可以接收4个参数!");
        }
        this.padding = padding;
        return (T) this;
    }

    /**
     * 获取itemGap值
     */
    public Integer itemGap() {
        return this.itemGap;
    }

    /**
     * 设置itemGap值
     *
     * @param itemGap
     */
    public T itemGap(Integer itemGap) {
        this.itemGap = itemGap;
        return (T) this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public T x(X x) {
        this.x = x;
        return (T) this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public T y(Y y) {
        this.y = y;
        return (T) this;
    }
}
