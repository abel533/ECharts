package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Align;
import com.github.abel533.echarts.code.XPosition;
import com.github.abel533.echarts.code.YPosition;
import com.github.abel533.echarts.style.TextStyle;

/**
 * Created by Administrator on 14-8-25.
 */
public class DataRange extends Basic {
    public Align orient;

    public Integer itemWidth;
    public Integer itemHeight;

    public Integer min;
    public Integer max;

    public Integer precision;
    public Integer splitNumber;
    public Boolean calculable;
    public Boolean realtime;

    public String[] color;

    public String formatter;

    public String[] text;

    public TextStyle textStyle;

    public DataRange() {
        super();
        this.orient = Align.vertical;
        this.x = XPosition.left;
        this.y = YPosition.bottom;
        this.itemWidth = 20;
        this.itemHeight = 14;
        this.precision = 0;
        this.splitNumber = 5;
        this.calculable = false;
        this.realtime = true;
        this.color = new String[]{"#006edd", "#e0ffff"};
        this.textStyle = new TextStyle();
        this.textStyle.color = "#333";
    }
}
