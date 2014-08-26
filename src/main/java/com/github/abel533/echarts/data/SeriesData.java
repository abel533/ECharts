package com.github.abel533.echarts.data;

import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: Series.Data
 * Author: liuzh
 * Update: liuzh(2014-08-26 12:54)
 */
public class SeriesData {
    public Object value;
    public Tooltip tooltip;
    public ItemStyle itemStyle;

    public SeriesData(Object value) {
        this.value = value;
    }

    public SeriesData(Object value, Tooltip tooltip) {
        this.value = value;
        this.tooltip = tooltip;
    }

    public SeriesData(Object value, ItemStyle itemStyle) {
        this.value = value;
        this.itemStyle = itemStyle;
    }

    public SeriesData(Object value, Tooltip tooltip, ItemStyle itemStyle) {
        this.value = value;
        this.tooltip = tooltip;
        this.itemStyle = itemStyle;
    }
}
