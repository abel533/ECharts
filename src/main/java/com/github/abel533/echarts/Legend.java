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

package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Align;
import com.github.abel533.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liuzh on 14-8-25.
 */
public class Legend extends Basic implements Data<Legend> {
    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     *
     * @see com.github.abel533.echarts.code.Align
     */
    public Align orient;

    /**
     * 图例图形宽度
     */
    public Integer itemWidth;

    /**
     * 图例图形高度
     */
    public Integer itemHeight;

    /**
     * 文字样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle textStyle;

    /**
     * 选择模式，默认开启图例开关
     *
     * @see com.github.abel533.echarts.code.SelectedMode
     */
    public Object selectedMode;

    /**
     * 图例内容数组，数组项通常为{string}，每一项代表一个系列的name。
     *
     * @see com.github.abel533.echarts.data.LegendData
     */
    public List<Object> data;

    /**
     * 添加图例属性
     *
     * @param values
     * @return
     */
    public Legend addData(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        data.addAll(Arrays.asList(values));
        return this;
    }
}
