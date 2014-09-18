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

/**
 * Description: LinkStyle
 *
 * @author liuzh
 */
public class LinkStyle {
    /**
     * 线条颜色
     */
    private String strokeColor;
    /**
     * 线宽
     */
    private Integer lineWidth;

    /**
     * 获取strokeColor值
     */
    public String strokeColor() {
        return this.strokeColor;
    }

    /**
     * 设置strokeColor值
     *
     * @param strokeColor
     */
    public LinkStyle strokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
        return this;
    }

    /**
     * 获取lineWidth值
     */
    public Integer lineWidth() {
        return this.lineWidth;
    }

    /**
     * 设置lineWidth值
     *
     * @param lineWidth
     */
    public LinkStyle lineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    /**
     * 获取strokeColor值
     */
    public String getStrokeColor() {
        return strokeColor;
    }

    /**
     * 设置strokeColor值
     *
     * @param strokeColor
     */
    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    /**
     * 获取lineWidth值
     */
    public Integer getLineWidth() {
        return lineWidth;
    }

    /**
     * 设置lineWidth值
     *
     * @param lineWidth
     */
    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }
}
