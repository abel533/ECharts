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

/**
 * 力导向图的边数据
 *
 * @author liuzh
 */
public class Link implements Serializable {

    private static final long serialVersionUID = 7882141565696266870L;

    /**
     * 源节点的index或者源节点的name
     */
    private Object source;
    /**
     * 目标节点的index或者目标节点的name
     */
    private Object target;
    /**
     * 边的权重，权重越大邻接节点越靠拢
     */
    private Integer weight;
    /**
     * 详见 itemStyle, 只能设置 lineWidth, strokeColor, lineType 等描边的属性
     */
    private ItemStyle itemStyle;

    /**
     * 构造函数
     */
    public Link() {
    }

    /**
     * 构造函数,参数:source,target,weight
     *
     * @param source
     * @param target
     * @param weight
     */
    public Link(Object source, Object target, Integer weight) {
        this.source = source;
        this.target = target;
        this.weight = weight;
    }

    /**
     * 获取source值
     */
    public Object source() {
        return this.source;
    }

    /**
     * 设置source值
     *
     * @param source
     */
    public Link source(Object source) {
        this.source = source;
        return this;
    }

    /**
     * 获取target值
     */
    public Object target() {
        return this.target;
    }

    /**
     * 设置target值
     *
     * @param target
     */
    public Link target(Object target) {
        this.target = target;
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
    public Link weight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 详见 itemStyle, 只能设置 lineWidth, strokeColor, lineType 等描边的属性
     */
    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
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

    /**
     * 获取source值
     */
    public Object getSource() {
        return source;
    }

    /**
     * 设置source值
     *
     * @param source
     */
    public void setSource(Object source) {
        this.source = source;
    }

    /**
     * 获取target值
     */
    public Object getTarget() {
        return target;
    }

    /**
     * 设置target值
     *
     * @param target
     */
    public void setTarget(Object target) {
        this.target = target;
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
}
