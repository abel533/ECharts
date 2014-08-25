package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.style.TextStyle;

/**
 * Created by Administrator on 14-8-26.
 */
public class AxisLabel {
    public Boolean show;
    //auto,0,number
    public Object interval;
    public Integer rotate;
    public Integer margin;
    public Boolean clickable;
    public String formatter;
    public TextStyle textStyle;

    public AxisLabel() {
        this.show = true;
        this.rotate = 0;
        this.margin = 8;
        this.textStyle = new TextStyle();
        this.textStyle.color = "#333";
    }
}
