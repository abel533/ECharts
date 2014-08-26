package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Align;
import com.github.abel533.echarts.code.XPosition;
import com.github.abel533.echarts.code.YPosition;
import com.github.abel533.echarts.feature.Feature;

import java.util.Map;

/**
 * Created by Administrator on 14-8-25.
 */
public class Toolbox extends Basic {
    public Boolean show;
    public Align orient;

    public String[] color;
    public String disableColor;
    public String effectiveColor;

    public Integer itemSize;
    public Boolean showTitle;

    public Map<String, Feature> feature;

    public Toolbox() {
        super();
        this.show = false;
        this.orient = Align.horizontal;
        this.x = XPosition.right;
        this.y = YPosition.top;
        this.color = new String[]{"#1e90ff", "#22bb22", "#4b0082", "#d2691e"};
        this.disableColor = "#ddd";
        this.effectiveColor = "red";
        this.itemSize = 16;
        this.showTitle = true;
        //TODO feature
    }
}
