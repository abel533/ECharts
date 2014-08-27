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
public class DataRange extends Basic implements Component {
    /**
     * 布局方式，默认为垂直布局，可选为：'horizontal' | 'vertical'
     *
     * @see com.github.abel533.echarts.code.Align
     */
    public Align orient;

    /**
     * 默认值20，值域控件图形宽度
     */
    public Integer itemWidth;

    /**
     * 默认值14，值域控件图形高度
     */
    public Integer itemHeight;

    /**
     * 指定的最小值，eg: 0，默认无，必须参数
     */
    public Integer min;

    /**
     * 指定的最大值，eg: 100，默认无，必须参数
     */
    public Integer max;

    /**
     * 小数精度，默认为0，无小数点，当 min ~ max 间在当前精度下无法整除splitNumber份时，精度会自动提高以满足均分，不支持不等划分
     */
    public Integer precision;

    /**
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份
     */
    public Integer splitNumber;

    /**
     * 是否启用值域漫游，启用后无视splitNumber，值域显示为线性渐变
     */
    public Boolean calculable;

    /**
     * 值域漫游是否实时显示
     */
    public Boolean realtime;

    /**
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识
     */
    private List<String> color;

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
    public DataRange addColor(String... colors) {
        if (colors == null || colors.length == 0) {
            return this;
        }
        this.color().addAll(Arrays.asList(colors));
        return this;
    }

    /**
     * 内容格式器：{string}（Template） | {Function}，模板变量为'{value}'和'{value2}'，代表数值起始值和结束值，函数参数两个，含义同模板变量
     */
    public Object formatter;

    /**
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高', '低']，'\n'指定换行
     */
    private List<String> text;

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
    public DataRange addText(String... texts) {
        if (texts == null || texts.length == 0) {
            return this;
        }
        this.text().addAll(Arrays.asList(texts));
        return this;
    }

    /**
     * 默认只设定了值域控件文字颜色
     */
    private TextStyle textStyle;

    /**
     * 默认只设定了值域控件文字颜色
     */
    public TextStyle textStyle(){
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
