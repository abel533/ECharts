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

package com.github.abel533.echarts.data;

import java.io.Serializable;

/**
 * MapData
 *
 * @author liuzh
 */
public class MapData implements Serializable {

    private static final long serialVersionUID = 7814199168511760158L;

    private String name;
    private Object value;
    private Boolean selected;

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public MapData(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 构造函数,参数:name,value,selected
     *
     * @param name
     * @param value
     * @param selected
     */
    public MapData(String name, Object value, Boolean selected) {
        this.name = name;
        this.value = value;
        this.selected = selected;
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
    public MapData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取value值
     */
    public Object value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public MapData value(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 获取selected值
     */
    public Boolean selected() {
        return this.selected;
    }

    /**
     * 设置selected值
     *
     * @param selected
     */
    public MapData selected(Boolean selected) {
        this.selected = selected;
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
     * 获取value值
     */
    public Object getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * 获取selected值
     */
    public Boolean getSelected() {
        return selected;
    }

    /**
     * 设置selected值
     *
     * @param selected
     */
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
