package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

/**
 * 事件河流图
 */
public class EventRiver extends Series<EventRiver>  {

    /**
     * 构造函数
     */
    public EventRiver() {
        this.type(SeriesType.eventRiver);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public EventRiver(String name) {
        super(name);
        this.type(SeriesType.eventRiver);
    }
}
