/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
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

import java.util.HashMap;

/**
 * 力导向图的顶点数据
 *
 * @author liuzh
 */
public class Node extends HashMap<String, Object> {

    public Node() {
        super();
    }

    public Node(Integer category, String name, Integer value) {
        super();
        put("category", category);
        put("name", name);
        put("value", value);
    }

    public String name() {
        return (String) get("name");
    }

    public Node name(String name) {
        put("name", name);
        return this;
    }

    public Integer value() {
        return (Integer) get("value");
    }

    public Node value(Integer value) {
        put("value", value);
        return this;
    }

    public Object initial() {
        return get("initial");
    }

    public Node initial(Object initial) {
        put("initial", initial);
        return this;
    }

    public Boolean fixX() {
        return (Boolean) get("fixX");
    }

    public Node fixX(Boolean fixX) {
        put("fixX", fixX);
        return this;
    }

    public Boolean fixY() {
        return (Boolean) get("fixY");
    }

    public Node fixY(Boolean fixY) {
        put("fixY", fixY);
        return this;
    }

    public Boolean ignore() {
        return (Boolean) get("ignore");
    }

    public Node ignore(Boolean ignore) {
        put("ignore", ignore);
        return this;
    }

    public Object symbol() {
        return get("symbol");
    }

    public Node symbol(Object symbol) {
        put("symbol", symbol);
        return this;
    }

    public Object symbolSize() {
        return get("symbolSize");
    }

    public Node symbolSize(Object symbolSize) {
        put("symbolSize", symbolSize);
        return this;
    }

    public Boolean draggable() {
        return (Boolean) get("draggable");
    }

    public Node draggable(Boolean draggable) {
        put("draggable", draggable);
        return this;
    }

    public Integer category() {
        return (Integer) get("category");
    }

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

    public ItemStyle getItemStyle() {
        return (ItemStyle) get("itemStyle");
    }

    public void setItemStyle(ItemStyle itemStyle) {
        put("itemStyle", itemStyle);
    }

    public String getName() {
        return (String) get("name");
    }

    public void setName(String name) {
        put("name", name);
    }

    public Integer getValue() {
        return (Integer) get("value");
    }

    public void setValue(Integer value) {
        put("value", value);
    }

    public Object getInitial() {
        return get("initial");
    }

    public void setInitial(Object initial) {
        put("initial", initial);
    }

    public Boolean getFixX() {
        return (Boolean) get("fixX");
    }

    public void setFixX(Boolean fixX) {
        put("fixX", fixX);
    }

    public Boolean getFixY() {
        return (Boolean) get("fixY");
    }

    public void setFixY(Boolean fixY) {
        put("fixY", fixY);
    }

    public Boolean getIgnore() {
        return (Boolean) get("ignore");
    }

    public void setIgnore(Boolean ignore) {
        put("ignore", ignore);
    }

    public Object getSymbol() {
        return get("symbol");
    }

    public void setSymbol(Object symbol) {
        put("symbol", symbol);
    }

    public Object getSymbolSize() {
        return get("symbolSize");
    }

    public void setSymbolSize(Object symbolSize) {
        put("symbolSize", symbolSize);
    }

    public Boolean getDraggable() {
        return (Boolean) get("draggable");
    }

    public void setDraggable(Boolean draggable) {
        put("draggable", draggable);
    }

    public Integer getCategory() {
        return (Integer) get("category");
    }

    public void setCategory(Integer category) {
        put("category", category);
    }
}
