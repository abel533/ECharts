package com.github.abel533.echarts;

import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.code.PointerType;
import com.github.abel533.echarts.style.CrossStyle;
import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.style.ShadowStyle;

/**
 * Created by Administrator on 14-8-25.
 */
public class AxisPointer {
    public PointerType type;
    public LineStyle lineStyle;
    public CrossStyle crossStyle;
    public ShadowStyle shadowStyle;

    public AxisPointer() {
        this.type = PointerType.line;
        this.lineStyle = new LineStyle();
        this.lineStyle.color = "#48b";
        this.lineStyle.width = 2;
        this.lineStyle.type = LineType.dashed;

        this.crossStyle = new CrossStyle();
        this.crossStyle.color = "#1e90ff";
        this.crossStyle.width = 1;
        this.crossStyle.type = LineType.dashed;

        this.shadowStyle = new ShadowStyle();
        this.shadowStyle.color = "rgba(150,150,150,0.3)";
        this.shadowStyle.width = "auto";
    }
}
