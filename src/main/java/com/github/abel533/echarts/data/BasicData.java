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

package com.github.abel533.echarts.data;

import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.TextStyle;

/**
 * Description: BasicData
 *
 * @author liuzh
 */
public abstract class BasicData<T> {
    private String name;
    private String text;
    private Object value;
    /**
     * 饼图、雷达图、力导、和弦图使用x,y
     */
    private Integer x;
    private Integer y;
    /**
     * 在存在直角坐标系的图表如折线、柱形、K线、散点图中
     * 除了通过直接指定位置外，如果希望标注基于直角系的定位，可以通过xAxis，yAxis
     */
    private Integer xAxis;
    private Integer yAxis;
    private MarkType type;
    private Object symbol;
    private Object symbolSize;
    private ItemStyle itemStyle;
    /**
     * 特殊样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;

    public BasicData() {
    }

    protected BasicData(String name) {
        this.name = name;
    }

    public BasicData(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public BasicData(String name, Object symbol, Object symbolSize) {
        this.name = name;
        this.symbol = symbol;
        this.symbolSize = symbolSize;
    }

    public BasicData(Object value, Object symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public BasicData(Object value, Object symbol, Object symbolSize) {
        this.value = value;
        this.symbol = symbol;
        this.symbolSize = symbolSize;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public T textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return (T) this;
    }

    public String text() {
        return this.text;
    }

    public T text(String text) {
        this.text = text;
        return (T) this;
    }

    public String name() {
        return this.name;
    }

    public T name(String name) {
        this.name = name;
        return (T) this;
    }

    public Object value() {
        return this.value;
    }

    public T value(Object value) {
        this.value = value;
        return (T) this;
    }

    public Integer x() {
        return this.x;
    }

    public T x(Integer x) {
        this.x = x;
        return (T) this;
    }

    public Integer y() {
        return this.y;
    }

    public T y(Integer y) {
        this.y = y;
        return (T) this;
    }

    public Integer xAxis() {
        return this.xAxis;
    }

    public T xAxis(Integer xAxis) {
        this.xAxis = xAxis;
        return (T) this;
    }

    public Integer yAxis() {
        return this.yAxis;
    }

    public T yAxis(Integer yAxis) {
        this.yAxis = yAxis;
        return (T) this;
    }

    public MarkType type() {
        return this.type;
    }

    public T type(MarkType type) {
        this.type = type;
        return (T) this;
    }

    public Object symbol() {
        return this.symbol;
    }

    public T symbol(Object symbol) {
        this.symbol = symbol;
        return (T) this;
    }

    public Object symbolSize() {
        return this.symbolSize;
    }

    public T symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return (T) this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public T itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return (T) this;
    }

    public String getName() {
        return name;
    }

    public T setName(String name) {
        this.name = name;
        return (T) this;
    }

    public Object getValue() {
        return value;
    }

    public T setValue(Object value) {
        this.value = value;
        return (T) this;
    }

    public Integer getX() {
        return x;
    }

    public T setX(Integer x) {
        this.x = x;
        return (T) this;
    }

    public Integer getY() {
        return y;
    }

    public T setY(Integer y) {
        this.y = y;
        return (T) this;
    }

    public Integer getxAxis() {
        return xAxis;
    }

    public T setxAxis(Integer xAxis) {
        this.xAxis = xAxis;
        return (T) this;
    }

    public Integer getyAxis() {
        return yAxis;
    }

    public T setyAxis(Integer yAxis) {
        this.yAxis = yAxis;
        return (T) this;
    }

    public MarkType getType() {
        return type;
    }

    public T setType(MarkType type) {
        this.type = type;
        return (T) this;
    }

    public Object getSymbol() {
        return symbol;
    }

    public T setSymbol(Object symbol) {
        this.symbol = symbol;
        return (T) this;
    }

    public Object getSymbolSize() {
        return symbolSize;
    }

    public T setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return (T) this;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public T setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return (T) this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
