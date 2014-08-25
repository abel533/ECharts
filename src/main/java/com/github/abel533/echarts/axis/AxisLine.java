package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Created by Administrator on 14-8-26.
 */
public class AxisLine {
    public Boolean show;
    public Boolean onZero;
    public LineStyle lineStyle;

    public AxisLine() {
        this.show = true;
        this.onZero = true;
        this.lineStyle = new LineStyle();
        this.lineStyle.color = "#48b";
        this.lineStyle.width = 2;
        this.lineStyle.type = LineType.solid;
    }
}
