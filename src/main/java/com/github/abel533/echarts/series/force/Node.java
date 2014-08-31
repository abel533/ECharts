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

	public String name(){
		return this.name;
	}

	public Node name(String name){
		this.name = name;
		return this;
	}

    /**
     * 节点值，在不指定 symbolSize 的时候会被映射成 minRadius - maxRadius 作为节点大小
     */
	private Integer value;

	public Integer value(){
		return this.value;
	}

	public Node value(Integer value){
		this.value = value;
		return this;
	}

    /**
     * 强制指定节点的初始值，在不指定的时候会在某个范围内随机生成
     */
	private Object initial;

	public Object initial(){
		return this.initial;
	}

	public Node initial(Object initial){
		this.initial = initial;
		return this;
	}

    /**
     * 是否固定节点在 X 轴上的值，配合 initial 使用
     */
	private Boolean fixX;

	public Boolean fixX(){
		return this.fixX;
	}

	public Node fixX(Boolean fixX){
		this.fixX = fixX;
		return this;
	}

    /**
     * 是否固定节点在 Y 轴上的值，配合 initial 使用
     */
	private Boolean fixY;

	public Boolean fixY(){
		return this.fixY;
	}

	public Node fixY(Boolean fixY){
		this.fixY = fixY;
		return this;
	}

    /**
     * 是否忽略该节点
     */
	private Boolean ignore;

	public Boolean ignore(){
		return this.ignore;
	}

	public Node ignore(Boolean ignore){
		this.ignore = ignore;
		return this;
	}

    /**
     * 节点的形状, 详见 symbolList
     *
     * @see com.github.abel533.echarts.code.Symbol
     */
	private Object symbol;

	public Object symbol(){
		return this.symbol;
	}

	public Node symbol(Object symbol){
		this.symbol = symbol;
		return this;
	}

    /**
     * 强制指定节点的大小
     */
	private Object symbolSize;

	public Object symbolSize(){
		return this.symbolSize;
	}

	public Node symbolSize(Object symbolSize){
		this.symbolSize = symbolSize;
		return this;
	}

    /**
     * 节点是否能被拖拽
     */
	private Boolean draggable;

	public Boolean draggable(){
		return this.draggable;
	}

	public Node draggable(Boolean draggable){
		this.draggable = draggable;
		return this;
	}

    /**
     * 节点的 category index
     */
	private Integer category;

	public Integer category(){
		return this.category;
	}

	public Node category(Integer category){
		this.category = category;
		return this;
	}

    /**
     * 详见 itemStyle
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    private ItemStyle itemStyle;

    /**
     * 详见 itemStyle
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    public ItemStyle itemStyle(){
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
}
