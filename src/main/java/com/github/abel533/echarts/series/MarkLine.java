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

import com.github.abel533.echarts.AbstractData;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: MarkLine
 *
 * @author liuzh
 */
public class MarkLine extends AbstractData<MarkLine> {
    /**
     * 标线起始和结束的symbol介绍类型，如果都一样，可以直接传string，同series中的symbol
     *
     * @see com.github.abel533.echarts.code.Symbol
     * @see com.github.abel533.echarts.series.Series#symbol
     */
    private Object symbol;
    /**
     * 标线起始和结束的symbol大小，半宽（半径）参数，如果都一样，可以直接传number或function，同series中的symbolSize
     *
     * @see com.github.abel533.echarts.series.Series#symbolSize
     */
    private Object symbolSize;
    /**
     * 标线起始和结束的symbol旋转控制，同series中的symbolRotate
     *
     * @see com.github.abel533.echarts.series.Series#symbolRoate
     */
    private Object symbolRoate;
    /**
     * 标线图形炫光特效
     *
     * @see com.github.abel533.echarts.series.Effect
     */
    private Effect effect;
    /**
     * 标线图形样式属性
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     * @see com.github.abel533.echarts.series.Series#itemStyle
     */
    private ItemStyle itemStyle;
    /**
     * 地图特有，标线图形定位坐标
     *
     * @see com.github.abel533.echarts.series.Map#geoCoord
     */
    private Object geoCoord;

    public MarkLine effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    public MarkLine itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public Object symbol() {
        return this.symbol;
    }

    public MarkLine symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() {
        return this.symbolSize;
    }

    public MarkLine symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Object symbolRoate() {
        return this.symbolRoate;
    }

    public MarkLine symbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
        return this;
    }

    /**
     * 标线图形炫光特效
     *
     * @see com.github.abel533.echarts.series.Effect
     */
    public Effect effect() {
        if (this.effect == null) {
            this.effect = new Effect();
        }
        return this.effect;
    }

    /**
     * 标线图形样式属性
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     * @see com.github.abel533.echarts.series.Series#itemStyle
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public Object geoCoord() {
        return this.geoCoord;
    }

    public MarkLine geoCoord(Object geoCoord) {
        this.geoCoord = geoCoord;
        return this;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    public Object getSymbol() {
        return symbol;
    }

    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    public Object getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Object getSymbolRoate() {
        return symbolRoate;
    }

    public void setSymbolRoate(Object symbolRoate) {
        this.symbolRoate = symbolRoate;
    }

    public Object getGeoCoord() {
        return geoCoord;
    }

    public void setGeoCoord(Object geoCoord) {
        this.geoCoord = geoCoord;
    }
}
