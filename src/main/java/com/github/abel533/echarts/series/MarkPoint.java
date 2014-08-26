package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: MarkPoint
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:51)
 */
public class MarkPoint {
    public Object symbol;
    public Object symbolSize;
    public Boolean large;
    public Effect effect;
    public ItemStyle itemStyle;
    public Map geoCoord;
    public List<Object> data;

    public MarkPoint() {
        this.symbol = Symbol.pin;
        this.symbolSize = 10;
        this.large = false;
        this.effect = new Effect();
        this.itemStyle = new ItemStyle();
        this.itemStyle.normal.borderWidth = 2;
        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = true;
        this.itemStyle.normal.label.position = Position.inside;

        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = true;


        this.geoCoord = new HashMap();

        this.data = new ArrayList<Object>();
    }
}
