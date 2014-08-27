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
 *         Created by liuzh on 14-8-26.
 */
public class Node {
    /**
     * 节点名称
     */
    public String name;

    /**
     * 节点值，在不指定 symbolSize 的时候会被映射成 minRadius - maxRadius 作为节点大小
     */
    public Integer value;

    /**
     * 强制指定节点的初始值，在不指定的时候会在某个范围内随机生成
     */
    public Object initial;

    /**
     * 是否固定节点在 X 轴上的值，配合 initial 使用
     */
    public Boolean fixX;

    /**
     * 是否固定节点在 Y 轴上的值，配合 initial 使用
     */
    public Boolean fixY;

    /**
     * 是否忽略该节点
     */
    public Boolean ignore;

    /**
     * 节点的形状, 详见 symbolList
     *
     * @see com.github.abel533.echarts.code.Symbol
     */
    public Object symbol;

    /**
     * 强制指定节点的大小
     */
    public Object symbolSize;

    /**
     * 节点是否能被拖拽
     */
    public Boolean draggable;

    /**
     * 节点的 category index
     */
    public Integer category;

    /**
     * 详见 itemStyle
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    public ItemStyle itemStyle;
}
