package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Description: Line
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:14)
 */
public class Line extends Series {
    public Line() {
        this.xAxisIndex = 0;
        this.yAxisIndex = 0;
        this.itemStyle = new ItemStyle();
        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = false;
        this.itemStyle.normal.lineStyle = new LineStyle();
        this.itemStyle.normal.lineStyle.width = 2;
        this.itemStyle.normal.lineStyle.type = LineType.solid;
        this.itemStyle.normal.lineStyle.shadowColor = "rgba(0,0,0,0)";
        this.itemStyle.normal.lineStyle.shadowBlur = 0;
        this.itemStyle.normal.lineStyle.shadowOffsetX = 0;
        this.itemStyle.normal.lineStyle.shadowOffsetY = 0;

        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;

        this.symbolSize = 2;
        this.showAllSymbol = false;
    }
}
