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

package com.github.abel533.echarts.style;

import com.github.abel533.echarts.code.LineType;

import java.io.Serializable;

/**
 * @author liuzh
 */
public class LineStyle implements Serializable {

    private static final long serialVersionUID = 4765717693423256102L;

    /**
     * 阳线颜色
     */
    private Object color;
    /**
     * 阴线颜色
     */
    private Object color0;
    /**
     * 线条样式，可选为：'solid' | 'dotted' | 'dashed'
     *
     * @see com.github.abel533.echarts.code.LineType
     */
    private LineType type;
    /**
     * 线宽
     */
    private Integer width;
    /**
     * 折线主线(IE8+)有效，阴影色彩，支持rgba
     */
    private String shadowColor;
    /**
     * 默认值5，折线主线(IE8+)有效，阴影模糊度，大于0有效
     */
    private Integer shadowBlur;
    /**
     * 默认值3，折线主线(IE8+)有效，阴影横向偏移，正值往右，负值往左
     */
    private Integer shadowOffsetX;
    /**
     * 默认值3，折线主线(IE8+)有效，阴影纵向偏移，正值往下，负值往上
     */
    private Integer shadowOffsetY;

    /**
     * 获取color值
     */
    public Object color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public LineStyle color(Object color) {
        this.color = color;
        return this;
    }

    /**
     * 获取color0值
     */
    public Object color0() {
        return this.color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public LineStyle color0(Object color0) {
        this.color0 = color0;
        return this;
    }

    /**
     * 获取type值
     */
    public LineType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public LineStyle type(LineType type) {
        this.type = type;
        return this;
    }

    /**
     * 获取width值
     */
    public Integer width() {
        return this.width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public LineStyle width(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 获取shadowColor值
     */
    public String shadowColor() {
        return this.shadowColor;
    }

    /**
     * 设置shadowColor值
     *
     * @param shadowColor
     */
    public LineStyle shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    /**
     * 获取shadowBlur值
     */
    public Integer shadowBlur() {
        return this.shadowBlur;
    }

    /**
     * 设置shadowBlur值
     *
     * @param shadowBlur
     */
    public LineStyle shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    /**
     * 获取shadowOffsetX值
     */
    public Integer shadowOffsetX() {
        return this.shadowOffsetX;
    }

    /**
     * 设置shadowOffsetX值
     *
     * @param shadowOffsetX
     */
    public LineStyle shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    /**
     * 获取shadowOffsetY值
     */
    public Integer shadowOffsetY() {
        return this.shadowOffsetY;
    }

    /**
     * 设置shadowOffsetY值
     *
     * @param shadowOffsetY
     */
    public LineStyle shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    /**
     * 获取color值
     */
    public Object getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(Object color) {
        this.color = color;
    }

    /**
     * 获取color0值
     */
    public Object getColor0() {
        return color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public void setColor0(Object color0) {
        this.color0 = color0;
    }

    /**
     * 获取type值
     */
    public LineType getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(LineType type) {
        this.type = type;
    }

    /**
     * 获取width值
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * 获取shadowColor值
     */
    public String getShadowColor() {
        return shadowColor;
    }

    /**
     * 设置shadowColor值
     *
     * @param shadowColor
     */
    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    /**
     * 获取shadowBlur值
     */
    public Integer getShadowBlur() {
        return shadowBlur;
    }

    /**
     * 设置shadowBlur值
     *
     * @param shadowBlur
     */
    public void setShadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
    }

    /**
     * 获取shadowOffsetX值
     */
    public Integer getShadowOffsetX() {
        return shadowOffsetX;
    }

    /**
     * 设置shadowOffsetX值
     *
     * @param shadowOffsetX
     */
    public void setShadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
    }

    /**
     * 获取shadowOffsetY值
     */
    public Integer getShadowOffsetY() {
        return shadowOffsetY;
    }

    /**
     * 设置shadowOffsetY值
     *
     * @param shadowOffsetY
     */
    public void setShadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
    }
}
