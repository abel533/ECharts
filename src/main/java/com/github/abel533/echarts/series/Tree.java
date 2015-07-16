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

import com.github.abel533.echarts.code.Direction;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.Roam;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.series.other.RootLocation;

/**
 * 树图
 *
 * @author liuzh
 */
public class Tree extends Series<Tree> {
    /**
     * 根节点坐标，支持绝对值（px）、字符和百分比
     */
    private RootLocation rootLocation;
    /**
     * 层间距
     */
    private Integer layerPadding;
    /**
     * 节点间距
     */
    private Integer nodePadding;
    /**
     * 树的方向可选：'vertical' | 'horizontal' | 'radial'
     */
    private Orient orient;
    /**
     * 是否开启滚轮缩放和拖拽漫游，默认为false（关闭），其他有效输入为true（开启），'scale'（仅开启滚轮缩放），'move'（仅开启拖拽漫游）
     */
    private Object roam;
    /**
     * 方向反转
     */
    private Direction direction;

    /**
     * 构造函数
     */
    public Tree() {
        this.type(SeriesType.tree);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Tree(String name) {
        super(name);
        this.type(SeriesType.tree);
    }

    /**
     * 获取direction值
     */
    public Direction direction() {
        return this.direction;
    }

    /**
     * 设置direction值
     *
     * @param direction
     */
    public Tree direction(Direction direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 设置rootLocation值
     *
     * @param rootLocation
     */
    public Tree rootLocation(RootLocation rootLocation) {
        this.rootLocation = rootLocation;
        return this;
    }

    /**
     * 获取rootLocation值
     */
    public RootLocation rootLocation() {
        if (this.rootLocation == null) {
            this.rootLocation = new RootLocation();
        }
        return this.rootLocation;
    }

    /**
     * 设置layerPadding值
     *
     * @param layerPadding
     */
    public Tree layerPadding(Integer layerPadding) {
        this.layerPadding = layerPadding;
        return this;
    }

    /**
     * 获取layerPadding值
     */
	public Integer layerPadding() {
        return this.layerPadding;
    }

    /**
     * 设置nodePadding值
     *
     * @param nodePadding
     */
    public Tree nodePadding(Integer nodePadding) {
        this.nodePadding = nodePadding;
        return this;
    }

    /**
     * 获取nodePadding值
     */
	public Integer nodePadding() {
        return this.nodePadding;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
	public Tree orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    /**
     * 获取orient值
     */
    public Orient orient() {
        return this.orient;
    }

    /**
     * 设置roam值
     *
     * @param roam
     */
	public Tree roam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    /**
     * 设置roam值
     *
     * @param roam
     */
	public Tree roam(Roam roam) {
        this.roam = roam;
        return this;
    }

	/**
     * 获取roam值
	 */
	public Object roam() {
        return this.roam;
    }

    /**
     * 获取layerPadding值
     */
	public Integer getLayerPadding() {
        return layerPadding;
    }

    /**
     * 设置layerPadding值
     *
     * @param layerPadding
     */
    public void setLayerPadding(Integer layerPadding) {
        this.layerPadding = layerPadding;
    }

    /**
     * 获取nodePadding值
	 */
	public Integer getNodePadding() {
        return nodePadding;
    }

    /**
     * 设置nodePadding值
     *
     * @param nodePadding
     */
	public void setNodePadding(Integer nodePadding) {
        this.nodePadding = nodePadding;
    }

	/**
     * 获取orient值
	 */
    public Orient getOrient() {
        return orient;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
	public void setOrient(Orient orient) {
        this.orient = orient;
    }

	/**
     * 获取roam值
     */
    public Object getRoam() {
        return roam;
    }

    /**
     * 设置roam值
     *
     * @param roam
	 */
	public void setRoam(Object roam) {
        this.roam = roam;
    }

    /**
     * 获取rootLocation值
     */
	public RootLocation getRootLocation() {
        return rootLocation;
    }

    /**
     * 设置rootLocation值
     *
     * @param rootLocation
     */
    public void setRootLocation(RootLocation rootLocation) {
        this.rootLocation = rootLocation;
    }

    /**
     * 获取direction值
	 */
	public Direction getDirection() {
        return direction;
    }

    /**
     * 设置direction值
     *
     * @param direction
     */
	public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
