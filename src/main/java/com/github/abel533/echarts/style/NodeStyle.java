package com.github.abel533.echarts.style;

/**
 * Description: NodeStyle
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:34)
 */
public class NodeStyle extends LinkStyle {
    public static enum BrushType {
        both, stroke, fill
    }

    public BrushType brushType;
    public String color;

    public NodeStyle() {
        super();
        this.brushType = BrushType.both;
        this.color = "#f08c2e";
    }
}
