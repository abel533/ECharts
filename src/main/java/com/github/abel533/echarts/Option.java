package com.github.abel533.echarts;

import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.series.Series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: Option
 * Author: liuzh
 * Update: liuzh(2014-08-26 11:57)
 */
public class Option {
    public Object backgroundColor;
    public Object[] color;
    public Object renderAsImage;
    public Boolean calculable;
    public Boolean animation;
    public Timeline timeline;
    public Title title;
    public Toolbox toolbox;
    public Tooltip tooltip;
    public Legend legend;
    public DataRange dataRange;
    public DataZoom dataZoom;
    public Grid grid;
    public List<Axis> xAxis;
    public List<Axis> yAxis;
    public List<Series> series;

    public Option() {
        //数据必须有
        this.series = new ArrayList<Series>();
    }

    /**
     * 添加图例属性
     *
     * @param values
     * @return
     */
    public Option addLegend(Object... values) {
        if (legend == null) {
            legend = new Legend();
        }
        legend.data.addAll(Arrays.asList(values));
        return this;
    }
}
