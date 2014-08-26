package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Data;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * Description: Series
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:26)
 */
public abstract class Series {
    public Integer xAxisIndex;
    public Integer yAxisIndex;

    public String name;
    public Tooltip tooltip;
    public SeriesType type;
    public ItemStyle itemStyle;
    public Data[] data;

    public MarkPoint markPoint;
    public MarkLine markLine;

    public Integer symbolSize;
    public Boolean showAllSymbol;
}
