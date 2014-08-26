package com.github.abel533.echarts;

import com.github.abel533.echarts.code.ControlPosition;
import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.style.CheckpointStyle;
import com.github.abel533.echarts.style.ControlStyle;
import com.github.abel533.echarts.style.LineStyle;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Timeline
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:05)
 */
public class Timeline {
    public Boolean show;
    public Object type;
    public Boolean notMerge;
    public Boolean realtime;

    public Integer x;
    public Integer y;
    public Integer x2;
    public Integer y2;

    public Integer width;
    public Integer height;
    public String backgroundColor;
    public String borderColor;
    public Integer borderWidth;
    public Integer padding;

    public ControlPosition controlPosition;

    public Boolean autoPlay;
    public Boolean loop;
    public Integer playInterval;

    public LineStyle lineStyle;

    public Label label;

    public CheckpointStyle checkpointStyle;

    public ControlStyle controlStyle;

    public Symbol symbol;

    public Integer symbolSize;
    public Integer currentIndex;

    public List<Object> data;

    public Timeline() {
        this.show = true;
        this.type = "time";
        this.notMerge = false;
        this.realtime = true;
        this.x = 80;
        this.x2 = 80;
        this.y2 = 0;
        this.height = 50;
        this.backgroundColor = "rgba(0,0,0,0)";
        this.borderColor = "#ccc";
        this.borderWidth = 0;
        this.padding = 5;
        this.controlPosition = ControlPosition.left;
        this.autoPlay = false;
        this.loop = true;
        this.playInterval = 2000;

        this.lineStyle = new LineStyle();
        this.lineStyle.width = 1;
        this.lineStyle.color = "#666";
        this.lineStyle.type = LineType.dashed;

        this.label = new Label();
        this.checkpointStyle = new CheckpointStyle();
        this.controlStyle = new ControlStyle();

        this.symbol = Symbol.emptyDiamond;

        this.symbolSize = 4;
        this.currentIndex = 0;

        this.data = new ArrayList<Object>();
    }
}
