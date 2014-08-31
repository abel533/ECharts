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

package com.github.abel533.echarts.series.gauge;

import com.github.abel533.echarts.style.TextStyle;

/**
 * 仪表盘详情
 *
 * @author liuzh
 */
public class Detail {
    /**
     * 属性show控制显示与否
     */
    private Boolean show;
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
     * 属性width控制详情宽度
     */
    private Object width;
    /**
     * 属性height控制详情高度
     */
    private Object height;
    /**
     * 属性offsetCenter用于详情定位，数组为横纵相对仪表盘圆心坐标偏移，支持百分比（相对外半径）
     */
    private Object offsetCenter;
    /**
     * 属性formatter可以格式化文本
     */
    private String formatter;
    /**
     * 属性textStyle（详见textStyle）控制文本样式
     */
    private TextStyle textStyle;

    public Boolean show() {
        return this.show;
    }

    public Detail show(Boolean show) {
        this.show = show;
        return this;
    }

    public String backgroundColor() {
        return this.backgroundColor;
    }

    public Detail backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String borderColor() {
        return this.borderColor;
    }

    public Detail borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer borderWidth() {
        return this.borderWidth;
    }

    public Detail borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Object width() {
        return this.width;
    }

    public Detail width(Object width) {
        this.width = width;
        return this;
    }

    public Object height() {
        return this.height;
    }

    public Detail height(Object height) {
        this.height = height;
        return this;
    }

    public Object offsetCenter() {
        return this.offsetCenter;
    }

    public Detail offsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    public String formatter() {
        return this.formatter;
    }

    public Detail formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    /**
     * 属性textStyle（详见textStyle）控制文本样式
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public Object getOffsetCenter() {
        return offsetCenter;
    }

    public void setOffsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }
}
