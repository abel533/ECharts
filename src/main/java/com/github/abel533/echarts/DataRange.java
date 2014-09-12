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
 * 值域选择，每个图表最多仅有一个值域控件
 *
 * @author liuzh
 */
public class DataRange extends Basic<DataRange> implements Component {
    /**
     * 布局方式，默认为垂直布局，可选为：'horizontal' | 'vertical'
     *
     * @see com.github.abel533.echarts.code.Align
     */
    private Align orient;
    /**
     * 默认值20，值域控件图形宽度
     */
    private Integer itemWidth;
    /**
     * 默认值14，值域控件图形高度
     */
    private Integer itemHeight;
    /**
     * 指定的最小值，eg: 0，默认无，必须参数
     */
    private Integer min;
    /**
     * 指定的最大值，eg: 100，默认无，必须参数
     */
    private Integer max;
    /**
     * 小数精度，默认为0，无小数点，当 min ~ max 间在当前精度下无法整除splitNumber份时，精度会自动提高以满足均分，不支持不等划分
     */
    private Integer precision;
    /**
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份
     */
    private Integer splitNumber;
    /**
     * 是否启用值域漫游，启用后无视splitNumber，值域显示为线性渐变
     */
    private Boolean calculable;
    /**
     * 值域漫游是否实时显示
     */
    private Boolean realtime;
    /**
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识
     */
    private List<String> color;
    /**
     * 内容格式器：{string}（Template） | {Function}，模板变量为'{value}'和'{value2}'，代表数值起始值和结束值，函数参数两个，含义同模板变量
     */
    private Object formatter;
    /**
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高', '低']，'\n'指定换行
     */
    private List<String> text;
    /**
     * 默认只设定了值域控件文字颜色
     */
    private TextStyle textStyle;

    public DataRange color(List<String> color) {
        this.color = color;
        return this;
    }

    public DataRange text(List<String> text) {
        this.text = text;
        return this;
    }

    public Align getOrient() {
        return orient;
    }

    public void setOrient(Align orient) {
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

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getSplitNumber() {
        return splitNumber;
    }

    public void setSplitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
    }

    public Boolean getCalculable() {
        return calculable;
    }

    public void setCalculable(Boolean calculable) {
        this.calculable = calculable;
    }

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public Object getFormatter() {
        return formatter;
    }

    public void setFormatter(Object formatter) {
        if (formatter instanceof Function) {
            this.formatter = ((Function) formatter).getScript();
        } else {
            this.formatter = "\"" + formatter + "\"";
        }
    }

    public DataRange textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Align orient() {
        return this.orient;
    }

    public DataRange orient(Align orient) {
        this.orient = orient;
        return this;
    }

    public Integer itemWidth() {
        return this.itemWidth;
    }

    public DataRange itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Integer itemHeight() {
        return this.itemHeight;
    }

    public DataRange itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public Integer min() {
        return this.min;
    }

    public DataRange min(Integer min) {
        this.min = min;
        return this;
    }

    public Integer max() {
        return this.max;
    }

    public DataRange max(Integer max) {
        this.max = max;
        return this;
    }

    public Integer precision() {
        return this.precision;
    }

    public DataRange precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer splitNumber() {
        return this.splitNumber;
    }

    public DataRange splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public Boolean calculable() {
        return this.calculable;
    }

    public DataRange calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    public Boolean realtime() {
        return this.realtime;
    }

    public DataRange realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    /**
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识
     */
    public List<String> color() {
        if (this.color == null) {
            this.color = new ArrayList<String>();
        }
        return this.color;
    }

    /**
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识
     *
     * @param colors
     * @return
     */
    public DataRange color(String... colors) {
        if (colors == null || colors.length == 0) {
            return this;
        }
        this.color().addAll(Arrays.asList(colors));
        return this;
    }

    public Object formatter() {
        return this.formatter;
    }

    public DataRange formatter(Object formatter) {
        if (formatter instanceof Function) {
            this.formatter = ((Function) formatter).getScript();
        } else {
            this.formatter = "\"" + formatter + "\"";
        }
        return this;
    }

    /**
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高', '低']，'\n'指定换行
     */
    public List<String> text() {
        if (this.color == null) {
            this.color = new ArrayList<String>();
        }
        return this.color;
    }

    /**
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高', '低']，'\n'指定换行
     *
     * @param texts
     * @return
     */
    public DataRange text(String... texts) {
        if (texts == null || texts.length == 0) {
            return this;
        }
        this.text().addAll(Arrays.asList(texts));
        return this;
    }

    /**
     * 默认只设定了值域控件文字颜色
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
