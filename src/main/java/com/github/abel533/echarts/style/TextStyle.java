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

import com.github.abel533.echarts.code.FontStyle;
import com.github.abel533.echarts.code.X;

/**
 * 文字样式
 *
 * @author liuzh
 *         Created by liuzh on 14-8-25.
 */
public class TextStyle {
    /**
     * 颜色
     */
    private String color;
    /**
     * 修饰，仅对tooltip.textStyle生效
     */
    private String decoration;
    /**
     * 水平对齐方式，可选为：'left' | 'right' | 'center'
     *
     * @see com.github.abel533.echarts.code.X
     */
    private X align;
    /**
     * 字号 ，单位px
     */
    private Integer fontSize;
    /**
     * 字体系列
     */
    private String fontFamily;
    /**
     * 字体系列
     * IE8- 字体模糊并且，不支持不同字体混排，额外指定一份
     */
    private String fontFamily2;
    /**
     * 样式，可选为：'normal' | 'italic' | 'oblique'
     */
    private FontStyle fontStyle;
    /**
     * 粗细，可选为：'normal' | 'bold' | 'bolder' | 'lighter' | 100 | 200 |... | 900
     *
     * @see com.github.abel533.echarts.code.FontWeight
     */
    private Object fontWeight;

    public String color() {
        return this.color;
    }

    public TextStyle color(String color) {
        this.color = color;
        return this;
    }

    public String decoration() {
        return this.decoration;
    }

    public TextStyle decoration(String decoration) {
        this.decoration = decoration;
        return this;
    }

    public X align() {
        return this.align;
    }

    public TextStyle align(X align) {
        this.align = align;
        return this;
    }

    public Integer fontSize() {
        return this.fontSize;
    }

    public TextStyle fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public String fontFamily() {
        return this.fontFamily;
    }

    public TextStyle fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public String fontFamily2() {
        return this.fontFamily2;
    }

    public TextStyle fontFamily2(String fontFamily2) {
        this.fontFamily2 = fontFamily2;
        return this;
    }

    public FontStyle fontStyle() {
        return this.fontStyle;
    }

    public TextStyle fontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    public Object fontWeight() {
        return this.fontWeight;
    }

    public TextStyle fontWeight(Object fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public X getAlign() {
        return align;
    }

    public void setAlign(X align) {
        this.align = align;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontFamily2() {
        return fontFamily2;
    }

    public void setFontFamily2(String fontFamily2) {
        this.fontFamily2 = fontFamily2;
    }

    public FontStyle getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    public Object getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(Object fontWeight) {
        this.fontWeight = fontWeight;
    }
}
