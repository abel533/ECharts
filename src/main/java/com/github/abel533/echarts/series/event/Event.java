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

package com.github.abel533.echarts.series.event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 事件列表，每一个数组项为Object {}，内容如下
 *
 * @author liuzh
 */
public class Event implements Serializable {

    private static final long serialVersionUID = 2936961594659788171L;

    private String name;
    private Integer weight;
    private List<Evolution> evolution;

    /**
     * 构造方法
     */
    public Event() {
    }

    /**
     * 构造方法
     *
     * @param name
     */
    public Event(String name) {
        this.name = name;
    }

    /**
     * 构造方法
     *
     * @param name
     * @param weight
     */
    public Event(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public Event name(String name) {
        this.name = name;
        return this;
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
    public Event weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 获取evolution值
     */
    public List<Evolution> evolution() {
        if (this.evolution == null) {
            this.evolution = new ArrayList<Evolution>();
        }
        return this.evolution;
    }

    /**
     * 设置evolution值
     *
     * @param evolution
     */
    public Event evolution(List<Evolution> evolution) {
        this.evolution = evolution;
        return this;
    }

    /**
     * 添加evolution值
     *
     * @param values
     * @return
     */
    public Event evolution(Evolution... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.evolution().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 获取name值
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取evolution值
     */
    public List<Evolution> getEvolution() {
        return evolution;
    }

    /**
     * 设置evolution值
     *
     * @param evolution
     */
    public void setEvolution(List<Evolution> evolution) {
        this.evolution = evolution;
    }
}
