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

import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 数据列表，每一个数组项为Object {}
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class TreeData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double value;
    private Object symbol;
    private Object symbolSize;
    private List<TreeData> children;
    private ItemStyle itemStyle;

    /**
     * 构造函数
     */
    public TreeData() {
    }

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public TreeData(String name, Double value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public TreeData(String name, Integer value) {
        this.name = name;
        this.value = value.doubleValue();
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public TreeData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public TreeData value(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 获取value值
     */
    public Double value() {
        return this.value;
    }

    /**
     * 获取symbol值
     * @return symbol值
     */
    public Object getSymbol() {
        return symbol;
    }

    /**
     * 设置symbol值
     * @param symbol symbol值
     */
    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    /**
     * 获取symbolSize值
     * @return symbolSize值
     */
    public Object getSymbolSize() {
        return symbolSize;
    }

    /**
     * 设置symbolSize值
     * @param symbolSize symbolSize值
     */
    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    /**
     * 获取symbol值
     */
    public Object symbol() {
        return this.symbol;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public TreeData symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * 设置symbol值
     *
     * @param symbol
     */
    public TreeData symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * 获取symbolSize值
     */
    public Object symbolSize() {
        return this.symbolSize;
    }

    /**
     * 设置symbolSize值
     *
     * @param symbolSize
     */
    public TreeData symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    /**
     * 设置treeDatas值
     *
     * @param treeDatas
     */
    public TreeData children(TreeData... treeDatas) {
        if (treeDatas == null || treeDatas.length == 0) {
            return this;
        }
        this.children().addAll(Arrays.asList(treeDatas));
        return this;
    }

    /**
     * 获取children值
     */
	public List<TreeData> children() {
        if (this.children == null) {
            this.children = new LinkedList<TreeData>();
        }
        return this.children;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public TreeData itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 获取itemStyle值
	 */
	public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
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
    public Double getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * 获取children值
     */
	public List<TreeData> getChildren() {
        return children;
    }

    /**
     * 设置children值
     *
     * @param children
     */
	public void setChildren(List<TreeData> children) {
        this.children = children;
    }

    /**
     * 获取itemStyle值
	 */
	public ItemStyle getItemStyle() {
        return itemStyle;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
	public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
