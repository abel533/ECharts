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

import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liuzh
 */
public class Legend extends Basic<Legend> implements Data<Legend>, Component {
    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     *
     * @see com.github.abel533.echarts.code.Orient
     */
    private Orient orient;
    /**
     * 图例图形宽度
     */
    private Integer itemWidth;
    /**
     * 图例图形高度
     */
    private Integer itemHeight;
    /**
     * 文字样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;
    /**
     * 选择模式，默认开启图例开关
     *
     * @see com.github.abel533.echarts.code.SelectedMode
     */
    private Object selectedMode;
    /**
     * 图例内容数组，数组项通常为{string}，每一项代表一个系列的name。
     *
     * @see com.github.abel533.echarts.data.LegendData
     */
    private List<Object> data;

    public Legend() {
    }

    public Legend(Object... values) {
        this.data(values);
    }

    public Legend textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Legend data(List<Object> data) {
        this.data = data;
        return this;
    }

    public Orient orient() {
        return this.orient;
    }

    public Legend orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public Integer itemWidth() {
        return this.itemWidth;
    }

    public Legend itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Integer itemHeight() {
        return this.itemHeight;
    }

    public Legend itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    /**
     * 文字样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public Object selectedMode() {
        return this.selectedMode;
    }

    public Legend selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public List<Object> data() {
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        return this.data;
    }

    /**
     * 添加图例属性
     *
     * @param values
     * @return
     */
    public Legend data(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.data().addAll(Arrays.asList(values));
        return this;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public Orient getOrient() {
        return orient;
    }

    public void setOrient(Orient orient) {
        this.orient = orient;
    }

    public Integer getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
    }

    public Integer getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
    }

    public Object getSelectedMode() {
        return selectedMode;
    }

    public void setSelectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
    }
}
