package com.github.abel533.echarts.series;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.SeriesType;

/**
 * Description: Scatter
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:37)
 */
public class Scatter extends Series {
    public Boolean large;
    public Long largeThreshold;

    public Scatter() {
        super();
        this.type = SeriesType.scatter;

        this.xAxisIndex = 0;
        this.yAxisIndex = 0;
        this.symbolSize = 4;
        this.large = false;
        this.largeThreshold = 2000L;

        this.itemStyle.normal.label = new Label();
        this.itemStyle.normal.label.show = false;
        //由于一般无法通过json输出方法，所以这里不设置默认的formatter，这样会自动使用echarts中默认的
        //this.itemStyle.normal.label.formatter = "function (a, b, c) {\nif (typeof c[2] != 'undefined') {\nreturn c[2];\n}\nelse {\nreturn c[0] + ' , ' + c[1];\n}\n}";
        this.itemStyle.emphasis.label = new Label();
        this.itemStyle.emphasis.label.show = false;

    }
}
