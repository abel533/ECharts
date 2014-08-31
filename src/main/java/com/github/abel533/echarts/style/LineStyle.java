/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
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

/**
 * @author liuzh
 */
public class LineStyle {
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

    public Object color() {
        return this.color;
    }

    public LineStyle color(Object color) {
        this.color = color;
        return this;
    }

    public Object color0() {
        return this.color0;
    }

    public LineStyle color0(Object color0) {
        this.color0 = color0;
        return this;
    }

    public LineType type() {
        return this.type;
    }

    public LineStyle type(LineType type) {
        this.type = type;
        return this;
    }

    public Integer width() {
        return this.width;
    }

    public LineStyle width(Integer width) {
        this.width = width;
        return this;
    }

    public String shadowColor() {
        return this.shadowColor;
    }

    public LineStyle shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Integer shadowBlur() {
        return this.shadowBlur;
    }

    public LineStyle shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Integer shadowOffsetX() {
        return this.shadowOffsetX;
    }

    public LineStyle shadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
        return this;
    }

    public Integer shadowOffsetY() {
        return this.shadowOffsetY;
    }

    public LineStyle shadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
        return this;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public Object getColor0() {
        return color0;
    }

    public void setColor0(Object color0) {
        this.color0 = color0;
    }

    public LineType getType() {
        return type;
    }

    public void setType(LineType type) {
        this.type = type;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    public Integer getShadowBlur() {
        return shadowBlur;
    }

    public void setShadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
    }

    public Integer getShadowOffsetX() {
        return shadowOffsetX;
    }

    public void setShadowOffsetX(Integer shadowOffsetX) {
        this.shadowOffsetX = shadowOffsetX;
    }

    public Integer getShadowOffsetY() {
        return shadowOffsetY;
    }

    public void setShadowOffsetY(Integer shadowOffsetY) {
        this.shadowOffsetY = shadowOffsetY;
    }
}
