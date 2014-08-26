package com.github.abel533.echarts.data;

import com.github.abel533.echarts.code.MarkType;

/**
 * Description: PointData
 * Author: liuzh
 * Update: liuzh(2014-08-26 13:17)
 */
public class PointData {
    public String name;
    public Object value;
    //饼图、雷达图、力导、和弦图使用x,y
    public Integer x;
    public Integer y;
    //在存在直角坐标系的图表如折线、柱形、K线、散点图中
    //除了通过直接指定位置外，如果希望标注基于直角系的定位，可以通过xAxis，yAxis
    public Integer xAxis;
    public Integer yAxis;

    public MarkType type;

    public PointData(String name, Object value, Integer x, Integer y) {
        this.name = name;
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public PointData(Integer xAxis, Integer yAxis, String name, Object value) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.name = name;
        this.value = value;
    }

    public PointData(MarkType type, String name) {
        this.type = type;
        this.name = name;
    }
}
