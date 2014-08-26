package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Description: Radar
 * Author: liuzh
 * Update: liuzh(2014-08-26 11:23)
 */
public class Radar extends Series {
    public Integer polarIndex;

    public Radar() {
        this.polarIndex = 0;
        this.itemStyle = new ItemStyle();
        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = false;
        this.itemStyle.normal.lineStyle = new LineStyle();
        this.itemStyle.normal.lineStyle.width = 2;
        this.itemStyle.normal.lineStyle.type = LineType.solid;

        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;

        this.symbolSize = 2;
    }
}
