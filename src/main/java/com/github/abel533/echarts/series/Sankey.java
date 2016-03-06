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

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.series.force.Link;
import com.github.abel533.echarts.series.force.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 桑基图
 * 是一种特殊的流图, 它主要用来表示原材料、能量等如何从初始形式经过中间过程的加工、转化到达最终形式。
 *
 * @author liuzh
 */
public class Sankey extends Series<Sankey> {
    /**
     * 图中每个矩形节点的宽度
     */
    private Integer nodeWidth;
    /**
     * 图中每一列任意两个矩形节点之间的间隔
     */
    private Integer nodeGap;
    /**
     * 布局的迭代次数，用来不断优化图中节点的位置，以减少节点和边之间的相互遮盖
     * 默认布局迭代次数：32
     * 经测试，布局迭代次数不要低于默认值
     */
    private Integer layoutIterations;
    /**
     * 力导向图的顶点数据
     */
    private List nodes;
    /**
     * 力导向图的边数据
     */
    private List<Link> links;
    /**
     * 力导向图的边数据
     */
    private List<Link> edges;

    /**
     * 构造函数
     */
    public Sankey() {
        this.type(SeriesType.sankey);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Sankey(String name) {
        super(name);
        this.type(SeriesType.sankey);
    }

    public Integer nodeWidth() {
        return this.nodeWidth;
    }

    public Sankey nodeWidth(Integer nodeWidth) {
        this.nodeWidth = nodeWidth;
        return this;
    }

    public Integer nodeGap() {
        return this.nodeGap;
    }

    public Sankey nodeGap(Integer nodeGap) {
        this.nodeGap = nodeGap;
        return this;
    }

    public Integer layoutIterations() {
        return this.layoutIterations;
    }

    public Sankey layoutIterations(Integer layoutIterations) {
        this.layoutIterations = layoutIterations;
        return this;
    }

    /**
     * 设置nodes值
     *
     * @param nodes
     */
    public Sankey nodes(List nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * 设置links值
     *
     * @param links
     */
    public Sankey links(List<Link> links) {
        this.links = links;
        return this;
    }

    /**
     * 设置links值
     *
     * @param edges
     */
    public Sankey edges(List<Link> edges) {
        this.edges = edges;
        return this;
    }

    /**
     * 力导向图的顶点数据
     */
    public List<Node> nodes() {
        if (this.nodes == null) {
            this.nodes = new ArrayList();
        }
        return this.nodes;
    }

    /**
     * 添加力导向图的顶点数据
     *
     * @param values
     * @return
     */
    public Sankey nodes(Node... values) {
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
    public Sankey links(Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.links().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 力导向图的边数据
     */
    public List<Link> edges() {
        if (this.edges == null) {
            this.edges = new ArrayList<Link>();
        }
        return this.edges;
    }

    /**
     * 添加力导向图的边数据
     *
     * @param values
     * @return
     */
    public Sankey edges(Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.edges().addAll(Arrays.asList(values));
        return this;
    }

    public Integer getNodeWidth() {
        return nodeWidth;
    }

    public void setNodeWidth(Integer nodeWidth) {
        this.nodeWidth = nodeWidth;
    }

    public Integer getNodeGap() {
        return nodeGap;
    }

    public void setNodeGap(Integer nodeGap) {
        this.nodeGap = nodeGap;
    }

    public Integer getLayoutIterations() {
        return layoutIterations;
    }

    public void setLayoutIterations(Integer layoutIterations) {
        this.layoutIterations = layoutIterations;
    }

    public List getNodes() {
        return nodes;
    }

    public void setNodes(List nodes) {
        this.nodes = nodes;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Link> getEdges() {
        return edges;
    }

    public void setEdges(List<Link> edges) {
        this.edges = edges;
    }
}
