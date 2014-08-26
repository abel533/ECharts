package com.github.abel533.echarts.style;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.Symbol;

/**
 * Description: 该类只在Timeline中使用
 * Author: liuzh
 * Update: liuzh(2014-08-26 13:52)
 */
public class CheckpointStyle {
    public Object symbol;
    public Object symbolSize;
    public String color;
    public String borderColor;
    public Object borderWidth;
    public Label label;

    public CheckpointStyle() {
        this.symbol = Symbol.auto;
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
