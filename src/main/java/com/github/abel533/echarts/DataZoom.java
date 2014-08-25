package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Align;

/**
 * Created by Administrator on 14-8-26.
 */
public class DataZoom extends Basic {
    public Boolean show;
    public Align orient;
    public String dataBackgroundColor;
    public String fillerColor;
    public String handleColor;
    public Object[] xAxisIndex;
    public Object[] yAxisIndex;

    public Integer start;
    public Integer end;

    public Boolean realtime;
    public Boolean zoomLook;

    public DataZoom() {
        super();
        this.show = false;
        this.orient = Align.horizontal;
        this.dataBackgroundColor = "#eee";
        this.fillerColor = "rgba(144,197,237,0.2)";
        this.handleColor = "rgba(70,130,180,0.8)";
        this.realtime = true;
    }
}
