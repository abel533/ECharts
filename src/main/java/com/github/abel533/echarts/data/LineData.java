package com.github.abel533.echarts.data;

import com.github.abel533.echarts.code.MarkType;

/**
 * Description: LineData
 * Author: liuzh
 * Update: liuzh(2014-08-26 13:25)
 */
public class LineData extends PointData {
    public Integer valueIndex;

    public LineData(String name, Object value, Integer x, Integer y) {
        super(name, value, x, y);
    }

    public LineData(Integer xAxis, Integer yAxis, String name, Object value) {
        super(xAxis, yAxis, name, value);
    }

    public LineData(MarkType type, String name) {
        super(type, name);
    }
}
