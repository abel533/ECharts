package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.series.event.Event;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 事件河流图
 */
public class EventRiver extends Series<EventRiver> {

    /**
     * 该事件类别的权重
     */
    private Integer weight;

    /**
     * 获取weight值
     */
    public Integer weight() {
        return this.weight;
    }

    /**
     * 设置weight值
     *
     * @param weight
     */
    public EventRiver weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    private List<Event> eventList;

    /**
     * 获取eventList值
     */
    public List<Event> eventList() {
        if (this.eventList == null) {
            this.eventList = new ArrayList<Event>();
        }
        return this.eventList;
    }

    /**
     * 设置eventList值
     *
     * @param eventList
     */
    public EventRiver eventList(List<Event> eventList) {
        this.eventList = eventList;
        return this;
    }

    /**
     * 添加eventList值
     *
     * @param values
     * @return
     */
    public EventRiver eventList(Event... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.eventList().addAll(Arrays.asList(values));
        return this;
    }

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

    public EventRiver(String name, Integer weight) {
        super(name);
        this.type(SeriesType.eventRiver);
        this.weight(weight);
    }

    /**
     * 获取weight值
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 设置weight值
     *
     * @param weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 获取eventList值
     */
    public List<Event> getEventList() {
        return eventList;
    }

    /**
     * 设置eventList值
     *
     * @param eventList
     */
    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }
}
