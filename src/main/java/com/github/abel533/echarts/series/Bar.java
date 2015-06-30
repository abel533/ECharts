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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

/**
 * 柱形图
 *
 * @author liuzh
 */
public class Bar extends Series<Bar> {
    /**
     * 柱条最小高度，可用于防止某item的值过小而影响交互
     */
    private Integer barMinHeight;
    /**
     * 柱条（K线蜡烛）宽度，不设时自适应
     */
    private Integer barWidth;
    /**
     * 柱条（K线蜡烛）最大宽度，不设时自适应
     */
    private Integer barMaxWidth;
    /**
     * 柱间距离，默认为柱形宽度的30%，可设固定值
     */
    private String barGap;
    /**
     * 类目间柱形距离，默认为类目间距的20%，可设固定值
     */
    private String barCategoryGap;

    /**
     * 构造函数
     */
    public Bar() {
        this.type(SeriesType.bar);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Bar(String name) {
        super(name);
        this.type(SeriesType.bar);
    }

    /**
     * 获取barMinHeight值
     */
    public Integer barMinHeight() {
        return this.barMinHeight;
    }

    /**
     * 设置barMinHeight值
     *
     * @param barMinHeight
     */
    public Bar barMinHeight(Integer barMinHeight) {
        this.barMinHeight = barMinHeight;
        return this;
    }

    /**
     * 获取barWidth值
     */
    public Integer barWidth() {
        return this.barWidth;
    }

    /**
     * 设置barWidth值
     *
     * @param barWidth
     */
    public Bar barWidth(Integer barWidth) {
        this.barWidth = barWidth;
        return this;
    }

    /**
     * 获取barMaxWidth值
     */
    public Integer barMaxWidth() {
        return this.barMaxWidth;
    }

    /**
     * 设置barMaxWidth值
     *
     * @param barMaxWidth
     */
    public Bar barMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    /**
     * 获取barGap值
     */
    public String barGap() {
        return this.barGap;
    }

    /**
     * 设置barGap值
     *
     * @param barGap
     */
    public Bar barGap(String barGap) {
        this.barGap = barGap;
        return this;
    }

    /**
     * 获取barCategoryGap值
     */
    public String barCategoryGap() {
        return this.barCategoryGap;
    }

    /**
     * 设置barCategoryGap值
     *
     * @param barCategoryGap
     */
    public Bar barCategoryGap(String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
        return this;
    }

    /**
     * 获取barMinHeight值
     */
    public Integer getBarMinHeight() {
        return barMinHeight;
    }

    /**
     * 设置barMinHeight值
     *
     * @param barMinHeight
     */
    public void setBarMinHeight(Integer barMinHeight) {
        this.barMinHeight = barMinHeight;
    }

    /**
     * 获取barGap值
     */
    public String getBarGap() {
        return barGap;
    }

    /**
     * 设置barGap值
     *
     * @param barGap
     */
    public void setBarGap(String barGap) {
        this.barGap = barGap;
    }

    /**
     * 获取barCategoryGap值
     */
    public String getBarCategoryGap() {
        return barCategoryGap;
    }

    /**
     * 设置barCategoryGap值
     *
     * @param barCategoryGap
     */
    public void setBarCategoryGap(String barCategoryGap) {
        this.barCategoryGap = barCategoryGap;
    }

    /**
     * 获取barWidth
     */
    public Integer getBarWidth() {
        return barWidth;
    }

    /**
     * 设置barWidth
     *
     * @param barWidth
     */
    public void setBarWidth(Integer barWidth) {
        this.barWidth = barWidth;
    }

    /**
     * 获取barMaxWidth
     */
    public Integer getBarMaxWidth() {
        return barMaxWidth;
    }

    /**
     * 设置barMaxWidth
     *
     * @param barMaxWidth
     */
    public void setBarMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
    }
}
