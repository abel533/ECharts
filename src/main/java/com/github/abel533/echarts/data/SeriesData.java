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

package com.github.abel533.echarts.data;

import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;

/**
 * Description: Series.Data
 *
 * @author liuzh
 */
public class SeriesData implements Serializable {

    private static final long serialVersionUID = -3295595963653443202L;

    private Object value;
    private Tooltip tooltip;
    private ItemStyle itemStyle;

    /**
     * 构造函数,参数:value
     *
     * @param value
     */
    public SeriesData(Object value) {
        this.value = value;
    }

    /**
     * 构造函数,参数:value,tooltip
     *
     * @param value
     * @param tooltip
     */
    public SeriesData(Object value, Tooltip tooltip) {
        this.value = value;
        this.tooltip = tooltip;
    }

    /**
     * 构造函数,参数:value,itemStyle
     *
     * @param value
     * @param itemStyle
     */
    public SeriesData(Object value, ItemStyle itemStyle) {
        this.value = value;
        this.itemStyle = itemStyle;
    }

    /**
     * 构造函数,参数:value,tooltip,itemStyle
     *
     * @param value
     * @param tooltip
     * @param itemStyle
     */
    public SeriesData(Object value, Tooltip tooltip, ItemStyle itemStyle) {
        this.value = value;
        this.tooltip = tooltip;
        this.itemStyle = itemStyle;
    }

    /**
     * 获取value值
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public SeriesData value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 获取tooltip值
     */
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public SeriesData tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    /**
     * 获取itemStyle值
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public SeriesData itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 获取value值
     */
    public Object getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * 获取tooltip值
     */
    public Tooltip getTooltip() {
        return tooltip;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * 获取itemStyle值
     */
    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
