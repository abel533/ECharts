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

package com.github.abel533.echarts.series.force;

import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;
import java.util.HashMap;

/**
 * 力导向图的顶点数据
 *
 * @author liuzh
 */
public class Node extends HashMap<String, Object> implements Serializable {

    private static final long serialVersionUID = 4254895945303983318L;

    /**
     * 构造函数
     */
    public Node() {
        super();
    }

    /**
     * 构造函数,参数:category,name,value
     *
     * @param category
     * @param name
     * @param value
     */
    public Node(Integer category, String name, Integer value) {
        super();
        put("category", category);
        put("name", name);
        put("value", value);
    }

    /**
     * 获取name值
     */
    public String name() {
        return (String) get("name");
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public Node name(String name) {
        put("name", name);
        return this;
    }

    /**
     * 获取label值
     *
     * @since 2.1.9
     */
    public String label() {
        return (String) get("label");
    }

    /**
     * 设置label值
     *
     * @param label
     * @since 2.1.9
     */
    public Node label(String label) {
        put("label", label);
        return this;
    }

    /**
     * 获取value值
     */
    public Integer value() {
        return (Integer) get("value");
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public Node value(Integer value) {
        put("value", value);
        return this;
    }

    /**
     * 获取initial值
     */
    public Object initial() {
        return get("initial");
    }

    /**
     * 设置initial值
     *
     * @param initial
     */
    public Node initial(Object initial) {
        put("initial", initial);
        return this;
    }

    /**
     * 获取fixX值
     */
    public Boolean fixX() {
        return (Boolean) get("fixX");
    }

    /**
     * 设置fixX值
     *
     * @param fixX
     */
    public Node fixX(Boolean fixX) {
        put("fixX", fixX);
        return this;
    }

    /**
     * 获取fixY值
     */
    public Boolean fixY() {
        return (Boolean) get("fixY");
    }

    /**
     * 设置fixY值
     *
     * @param fixY
     */
    public Node fixY(Boolean fixY) {
        put("fixY", fixY);
        return this;
    }

    /**
     * 获取ignore值
     */
    public Boolean ignore() {
        return (Boolean) get("ignore");
    }

    /**
     * 设置ignore值
     *
     * @param ignore
     */
    public Node ignore(Boolean ignore) {
        put("ignore", ignore);
        return this;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return get("symbol");
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public Node symbol(Object symbol) {
        put("symbol", symbol);
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return get("symbolSize");
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public Node symbolSize(Object symbolSize) {
        put("symbolSize", symbolSize);
        return this;
    }

    /**
     * 获取draggable值
     */
    public Boolean draggable() {
        return (Boolean) get("draggable");
    }

    /**
     * 设置draggable值
     *
     * @param draggable
     */
    public Node draggable(Boolean draggable) {
        put("draggable", draggable);
        return this;
    }

    /**
     * 获取category值
     */
    public Integer category() {
        return (Integer) get("category");
    }

    /**
     * 设置category值
     *
     * @param category
     */
    public Node category(Integer category) {
        put("category", category);
        return this;
    }

    /**
     * 详见 itemStyle
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    public ItemStyle itemStyle() {
        if (get("itemStyle") == null) {
            put("itemStyle", new ItemStyle());
        }
        return (ItemStyle) get("itemStyle");
    }

    /**
     * 获取itemStyle值
     */
    public ItemStyle getItemStyle() {
        return (ItemStyle) get("itemStyle");
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public void setItemStyle(ItemStyle itemStyle) {
        put("itemStyle", itemStyle);
    }

    /**
     * 获取name值
     */
    public String getName() {
        return (String) get("name");
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public void setName(String name) {
        put("name", name);
    }

    /**
     * 获取value值
     */
    public Integer getValue() {
        return (Integer) get("value");
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(Integer value) {
        put("value", value);
    }

    /**
     * 获取initial值
     */
    public Object getInitial() {
        return get("initial");
    }

    /**
     * 设置initial值
     *
     * @param initial
     */
    public void setInitial(Object initial) {
        put("initial", initial);
    }

    /**
     * 获取fixX值
     */
    public Boolean getFixX() {
        return (Boolean) get("fixX");
    }

    /**
     * 设置fixX值
     *
     * @param fixX
     */
    public void setFixX(Boolean fixX) {
        put("fixX", fixX);
    }

    /**
     * 获取fixY值
     */
    public Boolean getFixY() {
        return (Boolean) get("fixY");
    }

    /**
     * 设置fixY值
     *
     * @param fixY
     */
    public void setFixY(Boolean fixY) {
        put("fixY", fixY);
    }

    /**
     * 获取ignore值
     */
    public Boolean getIgnore() {
        return (Boolean) get("ignore");
    }

    /**
     * 设置ignore值
     *
     * @param ignore
     */
    public void setIgnore(Boolean ignore) {
        put("ignore", ignore);
    }

    /**
     * 获取symbol值
     */
    public Object getSymbol() {
        return get("symbol");
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public void setSymbol(Object symbol) {
        put("symbol", symbol);
    }

    /**
     * 获取symbolSize值
     */
    public Object getSymbolSize() {
        return get("symbolSize");
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public void setSymbolSize(Object symbolSize) {
        put("symbolSize", symbolSize);
    }

    /**
     * 获取draggable值
     */
    public Boolean getDraggable() {
        return (Boolean) get("draggable");
    }

    /**
     * 设置draggable值
     *
     * @param draggable
     */
    public void setDraggable(Boolean draggable) {
        put("draggable", draggable);
    }

    /**
     * 获取category值
     */
    public Integer getCategory() {
        return (Integer) get("category");
    }

    /**
     * 设置category值
     *
     * @param category
     */
    public void setCategory(Integer category) {
        put("category", category);
    }

    /**
     * 获取label值
     */
    public String getLabel() {
        return (String) get("label");
    }

    /**
     * 设置label值
     *
     * @param label
     */
    public void setLabel(String label) {
        put("label", label);
    }
}
