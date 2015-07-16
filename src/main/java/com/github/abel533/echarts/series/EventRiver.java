/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

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
    private List<Event> eventList;

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

    /**
     * 构造函数,参数:name,weight
     *
     * @param name
     * @param weight
     */
    public EventRiver(String name, Integer weight) {
        super(name);
        this.type(SeriesType.eventRiver);
        this.weight(weight);
    }

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
