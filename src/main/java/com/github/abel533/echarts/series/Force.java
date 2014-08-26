package com.github.abel533.echarts.series;

import com.github.abel533.echarts.series.force.Category;
import com.github.abel533.echarts.series.force.Link;
import com.github.abel533.echarts.series.force.Node;

import java.util.List;

/**
 * Description: Force
 * Author: liuzh
 * Update: liuzh(2014-08-26 11:35)
 */
public class Force extends Series {
    public List<Category> categories;
    public List<Node> nodes;
    public List<Link> links;

    public Object center;
    public Object size;
    public Integer minRadius;
    public Integer maxRadius;
    public Object symbol;
    public Integer symbolSize;
    public String linkSymbol;
    public Integer linkSymbolSize;
    public Integer scaling;
    public Integer gravity;
    public Boolean draggable;
    public Boolean large;
    public Boolean useWorker;
    public Integer steps;

}
