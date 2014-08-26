package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: MarkLine
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:00)
 */
public class MarkLine {
    public Object symbol;
    public Object symbolSize;
    public Object symbolRoate;
    public Effect effect;
    public ItemStyle itemStyle;
    public Map geoCoord;
    public List<Object> data;

    public MarkLine() {
        this.symbol = new Object[]{Symbol.circle, Symbol.arrow};
        this.symbolSize = new Integer[]{2, 4};
        this.effect = new Effect();
        this.itemStyle = new ItemStyle();
        this.geoCoord = new HashMap();

        this.data = new ArrayList<Object>();
    }
}
