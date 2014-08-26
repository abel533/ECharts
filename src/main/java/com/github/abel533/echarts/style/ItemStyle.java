package com.github.abel533.echarts.style;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.LabelLine;

/**
 * Description: ItemStyle
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:30)
 */
public class ItemStyle {

    private abstract class Style {
        public Label label;
        public LabelLine labelLine;

        public String color;
        public LineStyle lineStyle;
        public AreaStyle areaStyle;
        public ChordStyle chordStyle;
        public NodeStyle nodeStyle;
        public LinkStyle linkStyle;
        public String borderColor;
        public Integer borderRadius;
        public Integer borderWidth;
    }

    public class Normal extends Style {
    }

    public class Emphasis extends Style {
    }

    public Normal normal;
    public Emphasis emphasis;

    public ItemStyle() {
        this.normal = new Normal();
        this.emphasis = new Emphasis();
    }
}
