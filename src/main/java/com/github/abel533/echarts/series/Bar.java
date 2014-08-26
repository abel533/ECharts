package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: Bar
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:29)
 */
public class Bar extends Series {
    public Integer barMinHeight;
    public String barGap;
    public String barCategoryGap;

    public Bar() {
        this.xAxisIndex = 0;
        this.yAxisIndex = 0;
        this.barMinHeight = 0;
        this.barGap = "30%";
        this.barCategoryGap = "20%";

        this.itemStyle = new ItemStyle();
        this.itemStyle.normal.borderColor = "#fff";
        this.itemStyle.normal.borderRadius = 0;
        this.itemStyle.normal.borderWidth = 0;
        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = false;

        this.itemStyle.emphasis.borderColor = "#fff";
        this.itemStyle.emphasis.borderRadius = 0;
        this.itemStyle.emphasis.borderWidth = 0;
        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;
    }
}
