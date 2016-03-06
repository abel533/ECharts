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

import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.SeriesType;

/**
 * Description: K
 *
 * @author liuzh
 */
public class Candlestick extends Series<Candlestick> {
    /**
     * 柱条（K线蜡烛）宽度，不设时自适应
     */
    private Integer barWidth;
    /**
     * 柱条（K线蜡烛）最大宽度，不设时自适应
     */
    private Integer barMaxWidth;
    /**
     * 布局方式
     */
    private Orient layout;

    /**
     * 构造函数
     */
    public Candlestick() {
        this.type(SeriesType.candlestick);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Candlestick(String name) {
        super(name);
        this.type(SeriesType.candlestick);
    }

    /**
     * 设置open,close,min,max值
     *
     * @param open
     * @param close
     * @param min
     * @param max
     */
    public Candlestick data(Double open, Double close, Double min, Double max) {
        Object[] kData = new Object[]{open, close, min, max};
        super.data(kData);
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
    public Candlestick barWidth(Integer barWidth) {
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
    public Candlestick barMaxWidth(Integer barMaxWidth) {
        this.barMaxWidth = barMaxWidth;
        return this;
    }

    public Orient layout() {
        return this.layout;
    }

    public Candlestick layout(Orient layout) {
        this.layout = layout;
        return this;
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

    public Orient getLayout() {
        return layout;
    }

    public void setLayout(Orient layout) {
        this.layout = layout;
    }
}
