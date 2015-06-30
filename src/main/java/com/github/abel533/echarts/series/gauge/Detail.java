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

package com.github.abel533.echarts.series.gauge;

import com.github.abel533.echarts.style.TextStyle;

import java.io.Serializable;

/**
 * 仪表盘详情
 *
 * @author liuzh
 */
public class Detail implements Serializable {

    private static final long serialVersionUID = 4155443904476463247L;

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
    public Detail show(Boolean show) {
        this.show = show;
        return this;
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
    public Detail backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
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
    public Detail borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
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
    public Detail borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * 获取width值
     */
    public Object width() {
        return this.width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public Detail width(Object width) {
        this.width = width;
        return this;
    }

    /**
     * 获取height值
     */
    public Object height() {
        return this.height;
    }

    /**
     * 设置height值
     *
     * @param height
     */
    public Detail height(Object height) {
        this.height = height;
        return this;
    }

    /**
     * 获取offsetCenter值
     */
    public Object offsetCenter() {
        return this.offsetCenter;
    }

    /**
     * 设置offsetCenter值
     *
     * @param offsetCenter
     */
    public Detail offsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
    }

    /**
     * 获取formatter值
     */
    public String formatter() {
        return this.formatter;
    }

    /**
     * 设置formatter值
     *
     * @param formatter
     */
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

    /**
     * 获取textStyle值
     */
    public TextStyle getTextStyle() {
        return textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
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
     * 获取backgroundColor值
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置backgroundColor值
     *
     * @param backgroundColor
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * 获取borderColor值
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * 获取borderWidth值
     */
    public Integer getBorderWidth() {
        return borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * 获取width值
     */
    public Object getWidth() {
        return width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public void setWidth(Object width) {
        this.width = width;
    }

    /**
     * 获取height值
     */
    public Object getHeight() {
        return height;
    }

    /**
     * 设置height值
     *
     * @param height
     */
    public void setHeight(Object height) {
        this.height = height;
    }

    /**
     * 获取offsetCenter值
     */
    public Object getOffsetCenter() {
        return offsetCenter;
    }

    /**
     * 设置offsetCenter值
     *
     * @param offsetCenter
     */
    public void setOffsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
    }

    /**
     * 获取formatter值
     */
    public String getFormatter() {
        return formatter;
    }

    /**
     * 设置formatter值
     *
     * @param formatter
     */
    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }
}
