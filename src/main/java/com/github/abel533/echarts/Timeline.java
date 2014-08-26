package com.github.abel533.echarts;

import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.style.TextStyle;

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

    public static enum ControlPosition {
        left, right, none
    }

    public ControlPosition controlPosition;

    public Boolean autoPlay;
    public Boolean loop;
    public Integer playInterval;

    public LineStyle lineStyle;

    public Label label;

    public class CheckpointStyle {
        public Object symbol;
        public Object symbolSize;
        public String color;
        public String borderColor;
        public Object borderWidth;
        public Label label;

        public CheckpointStyle() {
            this.symbol = "auto";
            this.symbolSize = "auto";
            this.color = "auto";
            this.borderColor = "auto";
            this.borderWidth = "auto";
            this.label = new Label();
            this.label.show = true;
            this.label.interval = "auto";
            this.label.rotate = 0;
            this.label.textStyle = new TextStyle();
            this.label.textStyle.color = "#333";
            this.label.show = false;
            this.label.interval = null;
            this.label.rotate = null;
        }
    }

    public CheckpointStyle checkpointStyle;

    public class ControlStyle {
        public class Color {
            public String color;
        }

        public Color normal;
        public Color emphasis;

        public ControlStyle() {
            this.normal = new Color();
            this.normal.color = "#333";
            this.emphasis = new Color();
            this.emphasis.color = "#1e90ff";
        }
    }

    public ControlStyle controlStyle;

    public Symbol symbol;

    public Integer symbolSize;
    public Integer currentIndex;

    public Data[] data;

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
    }
}
