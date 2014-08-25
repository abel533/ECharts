package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.style.AreaStyle;

/**
 * Created by Administrator on 14-8-26.
 */
public class SplitArea {
    public Boolean show;
    public AreaStyle areaStyle;

    public SplitArea() {
        this.show = false;
        this.areaStyle = new AreaStyle();
        this.areaStyle.color = new String[]{"rgba(250,250,250,0.3)", "rgba(200,200,200,0.3)"};
    }
}
