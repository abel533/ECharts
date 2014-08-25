package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.style.LineStyle;

/**
 * Created by Administrator on 14-8-26.
 */
public class AxisTick {
    public Boolean show;
    //auto,0,number
    public Object interval;
    public Boolean inside;
    public Integer length;
    public LineStyle lineStyle;

    public AxisTick() {
        //this.show = false;
        this.inside = false;
        this.length = 5;
        this.lineStyle = new LineStyle();
        this.lineStyle.color = "#333";
        this.lineStyle.width = 1;
    }
}
