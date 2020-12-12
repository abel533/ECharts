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

import com.github.abel533.echarts.AbstractData;
import com.github.abel533.echarts.style.ItemStyle;
import lombok.Getter;
import lombok.Setter;

/**
 * Description: MarkPoint
 *
 * @author liuzh
 */
@Getter
@Setter
public class MarkPoint extends AbstractData<MarkPoint> {
    /**
     * 标注类型
     *
     * @see com.github.abel533.echarts.series.Series#symbol
     */
    private Object symbol;
    /**
     * 标注大小
     *
     * @see com.github.abel533.echarts.series.Series#symbolSize
     */
    private Object symbolSize;
    /**
     * 标注图形旋转角度
     *
     * @see com.github.abel533.echarts.series.Series#symbolRotate
     */
    private Object symbolRotate;
    /**
     * 是否启动大规模标注模式
     */
    private Boolean large;
    /**
     * 标注图形炫光特效
     *
     * @see com.github.abel533.echarts.series.Effect
     */
    private Effect effect;
    /**
     * 标注图形样式属性
     *
     * @see com.github.abel533.echarts.series.Series#itemStyle
     */
    private ItemStyle itemStyle;
    /**
     * 地图特有，标注图形定位坐标
     *
     * @see com.github.abel533.echarts.series.Map#geoCoord
     */
    private GeoCoord geoCoord;

    /**
     * 设置effect值
     *
     * @param effect
     */
    public MarkPoint effect(Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public MarkPoint itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return this.symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public MarkPoint symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return this.symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public MarkPoint symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 获取symbolRotate值
     */
    public Object symbolRotate() {
        return this.symbolRotate;
    }

    /**
     * 设置symbolRotate值
     *
     * @param symbolRotate
     */
    public MarkPoint symbolRotate(Object symbolRotate) {
        this.symbolRotate = symbolRotate;
        return this;
    }

    /**
     * 获取large值
     */
    public Boolean large() {
        return this.large;
    }

    /**
     * 设置large值
     *
     * @param large
     */
    public MarkPoint large(Boolean large) {
        this.large = large;
        return this;
    }

    /**
     * 标注图形炫光特效
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

    /**
     * 获取geoCoord值
     */
    public GeoCoord geoCoord() {
        if (this.geoCoord == null) {
            this.geoCoord = new GeoCoord();
        }
        return this.geoCoord;
    }

    /**
     * 设置name,x,y值
     *
     * @param name
     * @param x
     * @param y
     */
    public MarkPoint geoCoord(String name, String x, String y) {
        this.geoCoord().put(name, x, y);
        return this;
    }
}
