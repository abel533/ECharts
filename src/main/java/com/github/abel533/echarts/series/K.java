package com.github.abel533.echarts.series;

import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Description: K
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:33)
 */
public class K extends Series {
    public K() {
        this.xAxisIndex = 0;
        this.yAxisIndex = 0;

        this.itemStyle = new ItemStyle();
        this.itemStyle.normal.color = "#fff";
        this.itemStyle.normal.color0 = "#00aa11";
        this.itemStyle.normal.lineStyle = new LineStyle();
        this.itemStyle.normal.lineStyle.width = 1;
        this.itemStyle.normal.lineStyle.color = "#ff3200";
        this.itemStyle.normal.lineStyle.color0 = "#00aa11";
    }
}
