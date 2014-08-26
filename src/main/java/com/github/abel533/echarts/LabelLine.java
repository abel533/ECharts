package com.github.abel533.echarts;

import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Description: LabelLine
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:45)
 */
public class LabelLine {
    public Boolean show;
    public Integer length;
    public LineStyle lineStyle;

    public LabelLine() {
        //this.show
        this.length = 20;
        this.lineStyle = new LineStyle();
        this.lineStyle.width = 1;
        this.lineStyle.type = LineType.solid;
    }
}
