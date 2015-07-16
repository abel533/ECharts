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
import com.github.abel533.echarts.code.Sort;
import com.github.abel533.echarts.series.force.Category;
import com.github.abel533.echarts.series.force.Link;
import com.github.abel533.echarts.series.force.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: Chord
 *
 * @author liuzh
 */
public class Chord extends Series<Chord> {
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
     * ribbonType的和弦图节点使用扇形绘制，边使用有大小端的ribbon绘制，可以表示出边的权重，图的节点边之间必须是双向边，非ribbonType的和弦图节点使用symbol绘制，边使用贝塞尔曲线，不能表示边的权重，但是可以使用单向边
     */
    private Boolean ribbonType;
    /**
     * 每个sector之间的间距(用角度表示)
     */
    private Integer padding;
    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     */
    private Object radius;
    /**
     * 开始角度, 有效输入范围：[-180,180]
     */
    private Integer startAngle;
    /**
     * 数据排序， 可以取none, ascending, descending
     */
    private Sort sort;
    /**
     * 数据排序（弦）， 可以取none, ascending, descending
     */
    private Sort sortSub;
    /**
     * 是否显示刻度
     */
    private Boolean showScale;
    /**
     * 是否显示刻度文字
     */
    private Boolean showScaleText;
    /**
     * 显示是否顺时针
     */
    private Boolean clockWise;
    /**
     * 顶点数据映射成圆半径后的最小半径
     */
    private Integer minRadius;
    /**
     * 顶点数据映射成圆半径后的最大半径
     */
    private Integer maxRadius;
    /**
     * 关系数据，用二维数组表示，项 [i][j] 的数值表示 i 到 j 的关系数据
     */
    private Object[][] matrix;

    /**
     * 构造函数
     */
    public Chord() {
        this.type(SeriesType.chord);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Chord(String name) {
        super(name);
        this.type(SeriesType.chord);
    }

    /**
     * 设置categories值
     *
     * @param categories
     */
    public Chord categories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * 设置nodes值
     *
     * @param nodes
     */
    public Chord nodes(List<Node> nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * 设置links值
     *
     * @param links
     */
    public Chord links(List<Link> links) {
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
    public Chord categories(Category... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.categories().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 添加节点分类，使用分类名
     *
     * @param names
     * @return
     */
    public Chord categories(String... names) {
        if (names == null || names.length == 0) {
            return this;
        }
        for (String name : names) {
            this.categories().add(new Category(name));
        }
        return this;
    }

    /**
     * 添加节点分类，使用分类名
     *
     * @param values
     * @return
     */
    public Chord categories(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        for (Object value : values) {
            if (value instanceof String) {
                this.categories().add(new Category((String) value));
            } else if (value instanceof Category) {
                this.categories().add((Category) value);
            }
            //其他忽略
        }
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
    public Chord nodes(Node... values) {
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
    public Chord links(Link... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.links().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 获取ribbonType值
     *
     * @return
     */
    public Boolean ribbonType() {
        return this.ribbonType;
    }

    /**
     * 设置ribbonType值
     *
     * @param ribbonType
     * @return
     */
    public Chord ribbonType(Boolean ribbonType) {
        this.ribbonType = ribbonType;
        return this;
    }

    /**
     * 获取padding值
     */
    public Integer padding() {
        return this.padding;
    }

    /**
     * 设置padding值
     *
     * @param padding
     */
    public Chord padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    /**
     * 获取radius值
     */
    public Object radius() {
        return this.radius;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param value
     * @return
     */
    public Chord radius(Object value) {
        this.radius = value;
        return this;
    }

    /**
     * 半径，支持绝对值（px）和百分比，百分比计算比，min(width, height) / 2 * 75%，
     * 传数组实现环形图，[内半径，外半径]
     *
     * @param width
     * @param height
     * @return
     */
    public Chord radius(Object width, Object height) {
        radius = new Object[]{width, height};
        return this;
    }

    /**
     * 获取startAngle值
     */
    public Integer startAngle() {
        return this.startAngle;
    }

    /**
     * 设置startAngle值
     *
     * @param startAngle
     */
    public Chord startAngle(Integer startAngle) {
        this.startAngle = startAngle;
        return this;
    }

    /**
     * 获取sort值
     */
    public Sort sort() {
        return this.sort;
    }

    /**
     * 设置sort值
     *
     * @param sort
     */
    public Chord sort(Sort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 获取sortSub值
     */
    public Sort sortSub() {
        return this.sortSub;
    }

    /**
     * 设置sortSub值
     *
     * @param sortSub
     */
    public Chord sortSub(Sort sortSub) {
        this.sortSub = sortSub;
        return this;
    }

    /**
     * 获取showScale值
     */
    public Boolean showScale() {
        return this.showScale;
    }

    /**
     * 设置showScale值
     *
     * @param showScale
     */
    public Chord showScale(Boolean showScale) {
        this.showScale = showScale;
        return this;
    }

    /**
     * 获取showScaleText值
     */
    public Boolean showScaleText() {
        return this.showScaleText;
    }

    /**
     * 设置showScaleText值
     *
     * @param showScaleText
     */
    public Chord showScaleText(Boolean showScaleText) {
        this.showScaleText = showScaleText;
        return this;
    }

    /**
     * 获取clockWise值
     */
    public Boolean clockWise() {
        return this.clockWise;
    }

    /**
     * 设置clockWise值
     *
     * @param clockWise
     */
    public Chord clockWise(Boolean clockWise) {
        this.clockWise = clockWise;
        return this;
    }

    /**
     * 获取minRadius值
     */
    public Integer minRadius() {
        return this.minRadius;
    }

    /**
     * 设置minRadius值
     *
     * @param minRadius
     */
    public Chord minRadius(Integer minRadius) {
        this.minRadius = minRadius;
        return this;
    }

    /**
     * 获取maxRadius值
     */
    public Integer maxRadius() {
        return this.maxRadius;
    }

    /**
     * 设置maxRadius值
     *
     * @param maxRadius
     */
    public Chord maxRadius(Integer maxRadius) {
        this.maxRadius = maxRadius;
        return this;
    }

    /**
     * 获取matrix值
     */
    public Object[][] matrix() {
        return this.matrix;
    }

    /**
     * 设置matrix值
     *
     * @param matrix
     */
    public Chord matrix(Object[][] matrix) {
        this.matrix = matrix;
        return this;
    }

    /**
     * 获取categories值
     */
    public List<Category> getCategories() {
        return categories;
    }

    /**
     * 设置categories值
     *
     * @param categories
     */
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    /**
     * 获取nodes值
     */
    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * 设置nodes值
     *
     * @param nodes
     */
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    /**
     * 获取links值
     */
    public List<Link> getLinks() {
        return links;
    }

    /**
     * 设置links值
     *
     * @param links
     */
    public void setLinks(List<Link> links) {
        this.links = links;
    }

    /**
     * 获取ribbonType值
     */
	public Boolean getRibbonType() {
        return ribbonType;
    }

    /**
     * 设置ribbonType值
     *
     * @param ribbonType
     */
    public void setRibbonType(Boolean ribbonType) {
        this.ribbonType = ribbonType;
    }

    /**
     * 获取padding值
     */
    public Integer getPadding() {
        return padding;
    }

    /**
     * 设置padding值
     *
     * @param padding
     */
    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    /**
     * 获取radius值
     */
    public Object getRadius() {
        return radius;
    }

    /**
     * 设置radius值
     *
     * @param radius
     */
    public void setRadius(Object radius) {
        this.radius = radius;
    }

    /**
     * 获取startAngle值
     */
    public Integer getStartAngle() {
        return startAngle;
    }

    /**
     * 设置startAngle值
     *
     * @param startAngle
     */
    public void setStartAngle(Integer startAngle) {
        this.startAngle = startAngle;
    }

    /**
     * 获取sort值
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * 设置sort值
     *
     * @param sort
     */
    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /**
     * 获取sortSub值
     */
    public Sort getSortSub() {
        return sortSub;
    }

    /**
     * 设置sortSub值
     *
     * @param sortSub
     */
    public void setSortSub(Sort sortSub) {
        this.sortSub = sortSub;
    }

    /**
     * 获取showScale值
     */
    public Boolean getShowScale() {
        return showScale;
    }

    /**
     * 设置showScale值
     *
     * @param showScale
     */
    public void setShowScale(Boolean showScale) {
        this.showScale = showScale;
    }

    /**
     * 获取showScaleText值
     */
    public Boolean getShowScaleText() {
        return showScaleText;
    }

    /**
     * 设置showScaleText值
     *
     * @param showScaleText
     */
    public void setShowScaleText(Boolean showScaleText) {
        this.showScaleText = showScaleText;
    }

    /**
     * 获取clockWise值
     */
    public Boolean getClockWise() {
        return clockWise;
    }

    /**
     * 设置clockWise值
     *
     * @param clockWise
     */
    public void setClockWise(Boolean clockWise) {
        this.clockWise = clockWise;
    }

    /**
     * 获取matrix值
     */
    public Object[][] getMatrix() {
        return matrix;
    }

    /**
     * 设置matrix值
     *
     * @param matrix
     */
    public void setMatrix(Object[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * 获取minRadius值
     */
    public Integer getMinRadius() {
        return minRadius;
    }

    /**
     * 设置minRadius值
     *
     * @param minRadius
     */
    public void setMinRadius(Integer minRadius) {
        this.minRadius = minRadius;
    }

    /**
     * 获取maxRadius值
     *
     * @return
     */
    public Integer getMaxRadius() {
        return maxRadius;
    }

    /**
     * 设置maxRadius值
     *
     * @param maxRadius
     */
    public void setMaxRadius(Integer maxRadius) {
        this.maxRadius = maxRadius;
    }
}
