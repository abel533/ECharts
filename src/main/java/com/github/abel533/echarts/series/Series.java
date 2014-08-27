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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Data;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: Series
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:26)
 */
public abstract class Series implements Data<Series> {
    public Integer xAxisIndex;
    public Integer yAxisIndex;

    public String name;
    public SeriesType type;
    public String stack;
    public Tooltip tooltip;
    public ItemStyle itemStyle;
    public List<Object> data;

    public MarkPoint markPoint;
    public MarkLine markLine;

    public Object symbol;
    public Integer symbolSize;
    public Boolean showAllSymbol;

    protected Series() {
        this.data = new ArrayList<Object>();
        this.itemStyle = new ItemStyle();
    }


    /**
     * 添加数据
     *
     * @param values
     * @return
     */
    public Series addData(Object... values) {
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        this.data.addAll(Arrays.asList(values));
        return this;
    }
}
