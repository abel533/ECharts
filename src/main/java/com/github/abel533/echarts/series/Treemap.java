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

import com.github.abel533.echarts.code.ColorMappingBy;
import com.github.abel533.echarts.code.NodeClick;
import com.github.abel533.echarts.code.Roam;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.series.other.Level;
import com.github.abel533.echarts.style.Breadcrumb;

/**
 * 矩形树图
 *
 * @author liuzh
 */
public class Treemap extends Series<Treemap> {
    /**
     * 中心坐标，支持绝对值（px）和百分比
     */
    private Object[] center;
    /**
     * 大小，支持绝对值（px）和百分比
     */
    private Object[] size;
    /**
     * 当前显示的根节点的名字
     */
    private String root;

    /**
     * 期望矩形长宽比率。布局计算时会尽量向这个比率靠近
     */
    private Double squareRatio;
    /**
     * 是否开启拖拽漫游（移动和缩放）
     */
    private Object roam;
    /**
     * 点击节点
     */
    private Object nodeClick;
    /**
     * 点击某个节点，会自动放大那个节点到合适的比例（节点占可视区域的面积比例），这个配置项就是这个比例
     */
    private Double zoomToNodeRatio;
    /**
     * 多层配置
     */
    private Level[] levels;

    /**
     * treemap 中支持对数据其他维度进行视觉映射
     */
    private Integer visualDimension;
    /**
     * 表示同一层级的节点的 颜色 选取列表。默认为空时，选取系统color列表
     */
    private Object[] color;
    /**
     * 表示同一层级的节点的 颜色透明度 选取范围。数值范围 0 ~ 1
     */
    private Object[] colorAlpha;
    /**
     * 表示同一层级的节点的 颜色饱和度 选取范围。数值范围 0 ~ 1
     */
    private Double colorSaturation;
    /**
     * 表示同一层级节点，在颜色列表中（参见 color 属性）选择时，按照什么来选择
     */
    private Object colorMappingBy;
    /**
     * 如果某个节点的矩形的面积，小于这个数值（单位：px平方），这个节点就不显示
     */
    private Double visibleMin;
    /**
     * 如果某个节点的矩形面积，小于这个数值（单位：px平方），则不显示这个节点的子节点
     */
    private Double childrenVisibleMin;
    /**
     * 面包屑，能够显示当前节点的路径
     */
    private Breadcrumb breadcrumb;


    /**
     * 构造函数
     */
    public Treemap() {
        this.type(SeriesType.treemap);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Treemap(String name) {
        super(name);
        this.type(SeriesType.treemap);
    }

    public Level[] getLevels() {
        return levels;
    }

    public void setLevels(Level[] levels) {
        this.levels = levels;
    }

    public Breadcrumb getBreadcrumb() {
        return breadcrumb;
    }

    public void setBreadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    public Breadcrumb breadcrumb() {
        if (this.breadcrumb == null) {
            this.breadcrumb = new Breadcrumb();
        }
        return this.breadcrumb;
    }

    public Treemap breadcrumb(Breadcrumb breadcrumb) {
        this.breadcrumb = breadcrumb;
        return this;
    }

    public Integer visualDimension() {
        return this.visualDimension;
    }

    public Treemap visualDimension(Integer visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public Object[] color() {
        return this.color;
    }

    public Treemap color(Object[] color) {
        this.color = color;
        return this;
    }

    public Object[] colorAlpha() {
        return this.colorAlpha;
    }

    public Treemap colorAlpha(Object[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public Double colorSaturation() {
        return this.colorSaturation;
    }

    public Treemap colorSaturation(Double colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public Object colorMappingBy() {
        return this.colorMappingBy;
    }

    public Treemap colorMappingBy(Object colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Treemap colorMappingBy(ColorMappingBy colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Double visibleMin() {
        return this.visibleMin;
    }

    public Treemap visibleMin(Double visibleMin) {
        this.visibleMin = visibleMin;
        return this;
    }

    public Double childrenVisibleMin() {
        return this.childrenVisibleMin;
    }

    public Treemap childrenVisibleMin(Double childrenVisibleMin) {
        this.childrenVisibleMin = childrenVisibleMin;
        return this;
    }

    public Integer getVisualDimension() {
        return visualDimension;
    }

    public void setVisualDimension(Integer visualDimension) {
        this.visualDimension = visualDimension;
    }

    public Object[] getColor() {
        return color;
    }

    public void setColor(Object[] color) {
        this.color = color;
    }

    public Object[] getColorAlpha() {
        return colorAlpha;
    }

    public void setColorAlpha(Object[] colorAlpha) {
        this.colorAlpha = colorAlpha;
    }

    public Double getColorSaturation() {
        return colorSaturation;
    }

    public void setColorSaturation(Double colorSaturation) {
        this.colorSaturation = colorSaturation;
    }

    public Object getColorMappingBy() {
        return colorMappingBy;
    }

    public void setColorMappingBy(Object colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
    }

    public Double getVisibleMin() {
        return visibleMin;
    }

    public void setVisibleMin(Double visibleMin) {
        this.visibleMin = visibleMin;
    }

    public Double getChildrenVisibleMin() {
        return childrenVisibleMin;
    }

    public void setChildrenVisibleMin(Double childrenVisibleMin) {
        this.childrenVisibleMin = childrenVisibleMin;
    }

    public Double zoomToNodeRatio() {
        return this.zoomToNodeRatio;
    }

    public Treemap zoomToNodeRatio(Double zoomToNodeRatio) {
        this.zoomToNodeRatio = zoomToNodeRatio;
        return this;
    }

    public Double getZoomToNodeRatio() {
        return zoomToNodeRatio;
    }

    public void setZoomToNodeRatio(Double zoomToNodeRatio) {
        this.zoomToNodeRatio = zoomToNodeRatio;
    }

    public Object nodeClick() {
        return this.nodeClick;
    }

    public Treemap nodeClick(Object nodeClick) {
        this.nodeClick = nodeClick;
        return this;
    }

    public Treemap nodeClick(Boolean nodeClick) {
        this.nodeClick = nodeClick;
        return this;
    }

    public Treemap nodeClick(NodeClick nodeClick) {
        this.nodeClick = nodeClick;
        return this;
    }

    public Object getNodeClick() {
        return nodeClick;
    }

    public void setNodeClick(Object nodeClick) {
        this.nodeClick = nodeClick;
    }

    public Object roam() {
        return this.roam;
    }

    public Treemap roam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public Treemap roam(Roam roam) {
        this.roam = roam;
        return this;
    }

    public Treemap roam(Object roam) {
        this.roam = roam;
        return this;
    }

    public Object getRoam() {
        return roam;
    }

    public void setRoam(Object roam) {
        this.roam = roam;
    }


    public Double squareRatio() {
        return this.squareRatio;
    }

    public Treemap squareRatio(Double squareRatio) {
        this.squareRatio = squareRatio;
        return this;
    }

    public Double getSquareRatio() {
        return squareRatio;
    }

    public void setSquareRatio(Double squareRatio) {
        this.squareRatio = squareRatio;
    }

    /**
     * 设置val1,val2值
     *
     * @param val1
     * @param val2
     */
    public Treemap center(Object val1, Object val2) {
        this.center = new Object[2];
        this.center[0] = val1;
        this.center[1] = val2;
        return this;
    }

    /**
     * 获取center值
     */
    public Object[] center() {
        if (this.center == null) {
            this.center = new Object[2];
        }
        return this.center;
    }

    /**
     * 设置val1,val2值
     *
     * @param val1
     * @param val2
     */
    public Treemap size(Object val1, Object val2) {
        this.size = new Object[2];
        this.size[0] = val1;
        this.size[1] = val2;
        return this;
    }

    /**
     * 获取size值
     */
    public Object[] size() {
        if (this.size == null) {
            this.size = new Object[2];
        }
        return this.size;
    }

    /**
     * 设置root值
     *
     * @param root
     */
    public Treemap root(String root) {
        this.root = root;
        return this;
    }

    /**
     * 获取root值
     */
    public String root() {
        return this.root;
    }

    /**
     * 获取center值
     */
    public Object[] getCenter() {
        return center;
    }

    /**
     * 设置center值
     *
     * @param center
     */
    public void setCenter(Object[] center) {
        this.center = center;
    }

    /**
     * 获取size值
     */
    public Object[] getSize() {
        return size;
    }

    /**
     * 设置size值
     *
     * @param size
     */
    public void setSize(Object[] size) {
        this.size = size;
    }

    /**
     * 获取root值
     */
    public String getRoot() {
        return root;
    }

    /**
     * 设置root值
     *
     * @param root
     */
    public void setRoot(String root) {
        this.root = root;
    }
}
