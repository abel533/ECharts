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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.series.force.Category;
import com.github.abel533.echarts.series.force.Link;
import com.github.abel533.echarts.series.force.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: Force
 *
 * @author liuzh
 */
public class Force extends Series<Force> {
    /**
     * 力导向图中节点的分类
     */
    private List<Category> categories;
    /**
     * 力导向图的顶点数据
     */
    private List<Node> nodes;
    /**
     * 力导向图的边数据
     */
    private List<Link> links;
    /**
     * 布局中心，可以是绝对值或者相对百分比
     */
    private Object center;
    /**
     * 布局大小，可以是绝对值或者相对百分比
     */
    private Object size;
    /**
     * 顶点数据映射成圆半径后的最小半径
     */
    private Integer minRadius;
    /**
     * 顶点数据映射成圆半径后的最大半径
     */
    private Integer maxRadius;
    /**
     * 力导向图的边两端图形样式，可指定为'arrow', 详见symbolList
     */
    private String linkSymbol;
    /**
     * 力导向图的边两端图形大小
     */
    private Integer linkSymbolSize;
    /**
     * 布局缩放系数，并不完全精确, 效果跟布局大小类似
     */
    private Integer scaling;
    /**
     * 向心力系数，系数越大则节点越往中心靠拢
     */
    private Integer gravity;
    /**
     * 节点是否能被拖拽
     */
    private Boolean draggable;
    /**
     * 在 500+ 顶点的图上建议设置 large 为 true, 会使用 Barnes-Hut simulation, 同时开启 useWorker 并且把 steps 值调大
     */
    private Boolean large;
    /**
     * 是否在浏览器支持 web worker 的时候把布局计算放入 web worker 中
     */
    private Boolean useWorker;
    /**
     * 每一帧布局计算的迭代次数，因为每一帧绘制的时间经常会比布局时间长很多，所以在使用 web worker 的时候可以把 steps 调大来平衡两者的时间从而达到效率最优化
     */
    private Integer steps;

    public Force() {
        this.type(SeriesType.force);
    }

    public Force(String name) {
        super(name);
        this.type(SeriesType.force);
    }

    public Force categories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    public Force nodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    public Force links(List<Link> links) {
        this.links = links;
        return this;
    }

    /**
     * 力导向图中节点的分类
     */
    public List<Category> categories() {
        if (this.categories == null) {
            this.categories = new ArrayList<Category>();
        }
        return this.categories;
    }

    /**
     * 添加节点分类
     *
     * @param values
     * @return
     */
    public Force categories(Category... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.categories().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 力导向图的顶点数据
     */
    public List<Node> nodes() {
        if (this.nodes == null) {
            this.nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }

    /**
     * 添加力导向图的顶点数据
     *
     * @param values
     * @return
     */
    public Force nodes(Node... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.nodes().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 力导向图的边数据
     */
    public List<Link> links() {
        if (this.links == null) {
            this.links = new ArrayList<Link>();
        }
        return this.links;
    }

    /**
     * 添加力导向图的边数据
     *
     * @param values
     * @return
     */
    public Force links(Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.links().addAll(Arrays.asList(values));
        return this;
    }

    public Object center() {
        return this.center;
    }

    public Force center(Object center) {
        this.center = center;
        return this;
    }

    public Object size() {
        return this.size;
    }

    public Force size(Object size) {
        this.size = size;
        return this;
    }

    public Integer minRadius() {
        return this.minRadius;
    }

    public Force minRadius(Integer minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    public Integer maxRadius() {
        return this.maxRadius;
    }

    public Force maxRadius(Integer maxRadius) {
        this.maxRadius = maxRadius;
        return this;
    }

    public String linkSymbol() {
        return this.linkSymbol;
    }

    public Force linkSymbol(String linkSymbol) {
        this.linkSymbol = linkSymbol;
        return this;
    }

    public Integer linkSymbolSize() {
        return this.linkSymbolSize;
    }

    public Force linkSymbolSize(Integer linkSymbolSize) {
        this.linkSymbolSize = linkSymbolSize;
        return this;
    }

    public Integer scaling() {
        return this.scaling;
    }

    public Force scaling(Integer scaling) {
        this.scaling = scaling;
        return this;
    }

    public Integer gravity() {
        return this.gravity;
    }

    public Force gravity(Integer gravity) {
        this.gravity = gravity;
        return this;
    }

    public Boolean draggable() {
        return this.draggable;
    }

    public Force draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public Boolean large() {
        return this.large;
    }

    public Force large(Boolean large) {
        this.large = large;
        return this;
    }

    public Boolean useWorker() {
        return this.useWorker;
    }

    public Force useWorker(Boolean useWorker) {
        this.useWorker = useWorker;
        return this;
    }

    public Integer steps() {
        return this.steps;
    }

    public Force steps(Integer steps) {
        this.steps = steps;
        return this;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public Object getCenter() {
        return center;
    }

    public void setCenter(Object center) {
        this.center = center;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public Integer getMinRadius() {
        return minRadius;
    }

    public void setMinRadius(Integer minRadius) {
        this.minRadius = minRadius;
    }

    public Integer getMaxRadius() {
        return maxRadius;
    }

    public void setMaxRadius(Integer maxRadius) {
        this.maxRadius = maxRadius;
    }

    public String getLinkSymbol() {
        return linkSymbol;
    }

    public void setLinkSymbol(String linkSymbol) {
        this.linkSymbol = linkSymbol;
    }

    public Integer getLinkSymbolSize() {
        return linkSymbolSize;
    }

    public void setLinkSymbolSize(Integer linkSymbolSize) {
        this.linkSymbolSize = linkSymbolSize;
    }

    public Integer getScaling() {
        return scaling;
    }

    public void setScaling(Integer scaling) {
        this.scaling = scaling;
    }

    public Integer getGravity() {
        return gravity;
    }

    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    public Boolean getDraggable() {
        return draggable;
    }

    public void setDraggable(Boolean draggable) {
        this.draggable = draggable;
    }

    public Boolean getLarge() {
        return large;
    }

    public void setLarge(Boolean large) {
        this.large = large;
    }

    public Boolean getUseWorker() {
        return useWorker;
    }

    public void setUseWorker(Boolean useWorker) {
        this.useWorker = useWorker;
    }

    public Integer getSteps() {
        return steps;
    }

    public void setSteps(Integer steps) {
        this.steps = steps;
    }
}
