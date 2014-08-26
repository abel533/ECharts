package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.LabelLine;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.SeriesType;

/**
 * Description: Pie
 * Author: liuzh
 * Update: liuzh(2014-08-26 11:27)
 */
public class Pie extends Series {
    public final Object[] center = new Object[2];
    public final Object[] radius = new Object[2];
    public Boolean clockWise;
    public Integer startAngle;
    public Integer minAngle;
    public Integer selectedOffset;

    public Pie() {
        super();
        this.type = SeriesType.pie;
        this.center[0] = "50%";
        this.center[1] = "50%";
        this.radius[0] = 0;
        this.radius[1] = "75%";
        this.clockWise = true;
        this.startAngle = 90;
        this.minAngle = 0;
        this.selectedOffset = 10;

        this.itemStyle.normal.borderColor = "rgba(0,0,0,0)";
        this.itemStyle.normal.borderWidth = 1;
        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = true;
        this.itemStyle.normal.label.position = Position.outer;

        this.itemStyle.normal.labelLine = new LabelLine();
        this.itemStyle.normal.labelLine.show = true;


        this.itemStyle.emphasis.borderColor = "rgba(0,0,0,0)";
        this.itemStyle.emphasis.borderWidth = 1;
        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;

        this.itemStyle.emphasis.labelLine = new LabelLine();
        this.itemStyle.emphasis.labelLine.show = false;

    }
}
