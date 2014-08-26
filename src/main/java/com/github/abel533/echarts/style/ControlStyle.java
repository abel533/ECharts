package com.github.abel533.echarts.style;

/**
 * Description: ControlStyle
 * Author: liuzh
 * Update: liuzh(2014-08-26 13:52)
 */
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
