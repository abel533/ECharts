package com.github.abel533.echarts.style;

/**
 * Description: ChordStyle
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:33)
 */
public class ChordStyle {
    public LineStyle lineStyle;

    public ChordStyle() {
        this.lineStyle = new LineStyle();
        this.lineStyle.width = 1;
        this.lineStyle.color = "#999";
    }
}
