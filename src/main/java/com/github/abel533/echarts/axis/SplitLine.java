package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Created by Administrator on 14-8-26.
 */
public class SplitLine {
    public Boolean show;
    public LineStyle lineStyle;

    public SplitLine() {
        this.show = true;
        this.lineStyle = new LineStyle();
        this.lineStyle.color = new String[]{"#ccc"};
        this.lineStyle.width = 1;
        this.lineStyle.type = LineType.solid;
    }
}
