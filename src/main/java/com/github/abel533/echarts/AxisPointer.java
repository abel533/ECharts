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

import com.github.abel533.echarts.code.PointerType;
import com.github.abel533.echarts.style.CrossStyle;
import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.style.ShadowStyle;
import com.github.abel533.echarts.style.TextStyle;

import java.io.Serializable;

/**
 * 坐标轴指示器，坐标轴触发有效
 *
 * @author liuzh
 */
public class AxisPointer implements Serializable {

    private static final long serialVersionUID = 6421899185681683630L;

    /**
     * 是否显示
     */
    private Boolean show;

    /**
     * 默认为直线，可选为：'line' | 'shadow' | 'cross'
     *
     * @see com.github.abel533.echarts.code.PointerType
     */
    private PointerType type;
    /**
     * 设置直线指示器
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;
    /**
     * 设置十字准星指示器
     */
    private CrossStyle crossStyle;
    /**
     * 设置阴影指示器
     */
    private ShadowStyle shadowStyle;
    /**
     * 文本样式
     */
    private TextStyle textStyle;

    /**
     * 获取textStyle值
     */
    public TextStyle textStyle() {
        return this.textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public AxisPointer textStyle(TextStyle textStyle) {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public AxisPointer lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * 设置crossStyle值
     *
     * @param crossStyle
     */
    public AxisPointer crossStyle(CrossStyle crossStyle) {
        this.crossStyle = crossStyle;
        return this;
    }

    /**
     * 设置shadowStyle值
     *
     * @param shadowStyle
     */
    public AxisPointer shadowStyle(ShadowStyle shadowStyle) {
        this.shadowStyle = shadowStyle;
        return this;
    }

    /**
     * 获取type值
     */
    public PointerType type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public AxisPointer type(PointerType type) {
        this.type = type;
        return this;
    }

    /**
     * 是否显示
     */
    public Boolean show(){
        return this.show;
    }

    /**
     * 设置是否显示
     */
    public AxisPointer show(Boolean show){
        this.show = show;
        return this;
    }

    /**
     * 设置直线指示器
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
     * 设置十字准星指示器
     */
    public CrossStyle crossStyle() {
        if (this.crossStyle == null) {
            this.crossStyle = new CrossStyle();
        }
        return this.crossStyle;
    }

    /**
     * 设置阴影指示器
     */
    public ShadowStyle shadowStyle() {
        if (this.shadowStyle == null) {
            this.shadowStyle = new ShadowStyle();
        }
        return this.shadowStyle;
    }

    /**
     * 是否显示
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置是否显示
     */
    public void setShow(Boolean show) {
        this.show = show;
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
     * 获取crossStyle值
     */
    public CrossStyle getCrossStyle() {
        return crossStyle;
    }

    /**
     * 设置crossStyle值
     *
     * @param crossStyle
     */
    public void setCrossStyle(CrossStyle crossStyle) {
        this.crossStyle = crossStyle;
    }

    /**
     * 获取shadowStyle值
     */
    public ShadowStyle getShadowStyle() {
        return shadowStyle;
    }

    /**
     * 设置shadowStyle值
     *
     * @param shadowStyle
     */
    public void setShadowStyle(ShadowStyle shadowStyle) {
        this.shadowStyle = shadowStyle;
    }

    /**
     * 获取type值
     */
    public PointerType getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(PointerType type) {
        this.type = type;
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
}
