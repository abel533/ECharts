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

import com.github.abel533.echarts.Tooltip;

/**
 * LineData
 *
 * @author liuzh
 */
public class AllData extends BasicData<AllData> {
    /**
     * 可以通过valueIndex:0指定为横轴特殊点
     */
    private Integer valueIndex;

    private Object min;
    private Object max;
    /**
     * 图标
     */
    private String icon;
    private Boolean selected;
    private Tooltip tooltip;

    public AllData() {
    }

    public AllData(String name, Object value) {
        super(name, value);
    }

    public AllData(String name, Object symbol, Object symbolSize) {
        super(name, symbol, symbolSize);
    }

    public AllData(Object value, Object symbol) {
        super(value, symbol);
    }

    public AllData(Object value, Object symbol, Object symbolSize) {
        super(value, symbol, symbolSize);
    }

    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }

    public AllData tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Boolean selected() {
        return this.selected;
    }

    public AllData selected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    public String icon() {
        return this.icon;
    }

    public AllData icon(String icon) {
        this.icon = icon;
        return this;
    }

    public Object min() {
        return this.min;
    }

    public AllData min(Object min) {
        this.min = min;
        return this;
    }

    public Object max() {
        return this.max;
    }

    public AllData max(Object max) {
        this.max = max;
        return this;
    }

    public Integer valueIndex() {
        return this.valueIndex;
    }

    public AllData valueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }

    public Integer getValueIndex() {
        return valueIndex;
    }

    public AllData setValueIndex(Integer valueIndex) {
        this.valueIndex = valueIndex;
        return this;
    }

    public Object getMin() {
        return min;
    }

    public void setMin(Object min) {
        this.min = min;
    }

    public Object getMax() {
        return max;
    }

    public void setMax(Object max) {
        this.max = max;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }
}
