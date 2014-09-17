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

/**
 * 力导向图的顶点数据
 *
 * @author liuzh
 */
public class Node {
    /**
     * 节点名称
     */
    private String name;
    /**
     * 节点值，在不指定 symbolSize 的时候会被映射成 minRadius - maxRadius 作为节点大小
     */
    private Integer value;
    /**
     * 强制指定节点的初始值，在不指定的时候会在某个范围内随机生成
     */
    private Object initial;
    /**
     * 是否固定节点在 X 轴上的值，配合 initial 使用
     */
    private Boolean fixX;
    /**
     * 是否固定节点在 Y 轴上的值，配合 initial 使用
     */
    private Boolean fixY;
    /**
     * 是否忽略该节点
     */
    private Boolean ignore;
    /**
     * 节点的形状, 详见 symbolList
     *
     * @see com.github.abel533.echarts.code.Symbol
     */
    private Object symbol;
    /**
     * 强制指定节点的大小
     */
    private Object symbolSize;
    /**
     * 节点是否能被拖拽
     */
    private Boolean draggable;
    /**
     * 节点的 category index
     */
    private Integer category;
    /**
     * 详见 itemStyle
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    private ItemStyle itemStyle;

    public Node() {
    }

    public Node(Integer category, String name, Integer value) {
        this.category = category;
        this.name = name;
        this.value = value;
    }

    public String name() {
        return this.name;
    }

    public Node name(String name) {
        this.name = name;
        return this;
    }

    public Integer value() {
        return this.value;
    }

    public Node value(Integer value) {
        this.value = value;
        return this;
    }

    public Object initial() {
        return this.initial;
    }

    public Node initial(Object initial) {
        this.initial = initial;
        return this;
    }

    public Boolean fixX() {
        return this.fixX;
    }

    public Node fixX(Boolean fixX) {
        this.fixX = fixX;
        return this;
    }

    public Boolean fixY() {
        return this.fixY;
    }

    public Node fixY(Boolean fixY) {
        this.fixY = fixY;
        return this;
    }

    public Boolean ignore() {
        return this.ignore;
    }

    public Node ignore(Boolean ignore) {
        this.ignore = ignore;
        return this;
    }

    public Object symbol() {
        return this.symbol;
    }

    public Node symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() {
        return this.symbolSize;
    }

    public Node symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Boolean draggable() {
        return this.draggable;
    }

    public Node draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public Integer category() {
        return this.category;
    }

    public Node category(Integer category) {
        this.category = category;
        return this;
    }

    /**
     * 详见 itemStyle
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Object getInitial() {
        return initial;
    }

    public void setInitial(Object initial) {
        this.initial = initial;
    }

    public Boolean getFixX() {
        return fixX;
    }

    public void setFixX(Boolean fixX) {
        this.fixX = fixX;
    }

    public Boolean getFixY() {
        return fixY;
    }

    public void setFixY(Boolean fixY) {
        this.fixY = fixY;
    }

    public Boolean getIgnore() {
        return ignore;
    }

    public void setIgnore(Boolean ignore) {
        this.ignore = ignore;
    }

    public Object getSymbol() {
        return symbol;
    }

    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    public Object getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Boolean getDraggable() {
        return draggable;
    }

    public void setDraggable(Boolean draggable) {
        this.draggable = draggable;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
