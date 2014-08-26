package com.github.abel533.echarts;

import com.github.abel533.echarts.axis.AxisLabel;
import com.github.abel533.echarts.axis.AxisLine;
import com.github.abel533.echarts.axis.SplitArea;
import com.github.abel533.echarts.axis.SplitLine;
import com.github.abel533.echarts.style.TextStyle;

/**
 * Created by Administrator on 14-8-26.
 */
public class Polar {
    public final String[] center = new String[2];
    public Object radius;
    public Integer startAngle;
    public Integer splitNumber;

    public static class Name {
        public Boolean show;
        public TextStyle textStyle;

        public Name() {
            this.show = true;
            this.textStyle = new TextStyle();
            this.textStyle.color = "#333";
        }
    }

    public Name name;

    public AxisLine axisLine;
    public AxisLabel axisLabel;
    public SplitArea splitArea;
    public SplitLine splitLine;

    public static enum Type {
        polygon, circle
    }

    public Type type;

    public Polar() {
        this.center[0] = "50%";
        this.center[1] = "50%";
        this.radius = "75%";
        this.startAngle = 90;
        this.splitNumber = 5;
        this.name = new Name();
        this.axisLine = new AxisLine();
        this.axisLine.lineStyle.color = "#ccc";
        this.axisLine.lineStyle.width = 1;

        this.axisLabel = new AxisLabel();
        this.axisLabel.rotate = null;
        this.axisLabel.margin = null;

        this.splitArea = new SplitArea();
        this.splitArea.show = true;

        this.splitLine = new SplitLine();
        this.splitLine.lineStyle.type = null;

        this.type = Type.polygon;
    }
}
