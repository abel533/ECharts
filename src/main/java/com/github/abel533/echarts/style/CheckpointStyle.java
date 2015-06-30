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

import com.github.abel533.echarts.Label;

import java.io.Serializable;

/**
 * 时间轴当前点，该类只在Timeline中使用
 *
 * @author liuzh
 */
public class CheckpointStyle implements Serializable {

    private static final long serialVersionUID = -5003403667974720869L;

    /**
     * 当前点symbol，默认随轴上的symbol
     */
    private Object symbol;
    /**
     * 当前点symbol大小，默认随轴上symbol大小
     */
    private Object symbolSize;
    /**
     * 当前点symbol颜色，默认为随当前点颜色，可指定具体颜色，如无则为'#1e90ff'
     */
    private String color;
    /**
     * 当前点symbol边线颜色
     */
    private String borderColor;
    /**
     * 当前点symbol边线宽度
     */
    private Object borderWidth;
    /**
     * @see com.github.abel533.echarts.Label
     */
    private Label label;

    /**
     * 设置label值
     *
     * @param label
     */
    public CheckpointStyle label(Label label) {
        this.label = label;
        return this;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return this.symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public CheckpointStyle symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return this.symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public CheckpointStyle symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 获取color值
     */
    public String color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public CheckpointStyle color(String color) {
        this.color = color;
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
    public CheckpointStyle borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    /**
     * 获取borderWidth值
     */
    public Object borderWidth() {
        return this.borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public CheckpointStyle borderWidth(Object borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    /**
     * @see com.github.abel533.echarts.Label
     */
    public Label label() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }

    /**
     * 获取label值
     */
    public Label getLabel() {
        return label;
    }

    /**
     * 设置label值
     *
     * @param label
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * 获取symbol值
     */
    public Object getSymbol() {
        return symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    /**
     * 获取symbolSize值
     */
    public Object getSymbolSize() {
        return symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    /**
     * 获取color值
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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
    public Object getBorderWidth() {
        return borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public void setBorderWidth(Object borderWidth) {
        this.borderWidth = borderWidth;
    }
}
