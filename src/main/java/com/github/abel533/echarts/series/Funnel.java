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
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.style.ItemStyle;

/**
 * 漏斗图
 *
 * @author liuzh
 */
public class Funnel extends Series<Funnel> {
    /**
     * 左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    private Object x;
    /**
     * 左上角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    private Object y;
    /**
     * 右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    private Object x2;
    /**
     * 右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    private Object y2;
    /**
     * 水平方向对齐布局类型，默认居中对齐，可用选项还有：'left' | 'right' | 'center'
     */
    private X funnelAlign;
    /**
     * 指定的最小值
     */
    private Integer min;
    /**
     * 指定的最大值
     */
    private Integer max;
    /**
     * 最小值min映射到总宽度的比例，如果需要最小值的图形并不是尖端三角，可设置minSize实现
     */
    private String minSize;
    /**
     * 最大值max映射到总宽度的比例
     */
    private String maxSize;
    /**
     * 数据排序， 可以取ascending, descending
     *
     * @see com.github.abel533.echarts.code.Sort
     */
    private Sort sort;
    /**
     * 数据图形间距
     */
    private Integer gap;
    /**
     * 标签的视觉引导线样式，在 label 位置 设置为'left'或者'right'的时候会显示视觉引导线
     */
    private ItemStyle labelLine;

    /**
     * 构造函数
     */
    public Funnel() {
        this.type(SeriesType.funnel);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public Funnel(String name) {
        super(name);
        this.type(SeriesType.funnel);
    }

    public ItemStyle labelLine() {
        if (this.labelLine == null) {
            this.labelLine = new ItemStyle();
        }
        return this.labelLine;
    }

    public Funnel labelLine(ItemStyle labelLine) {
        this.labelLine = labelLine;
        return this;
    }

    /**
     * 获取x值
     */
    public Object x() {
        return this.x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public Funnel x(Object x) {
        this.x = x;
        return this;
    }

    /**
     * 获取y值
     */
    public Object y() {
        return this.y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public Funnel y(Object y) {
        this.y = y;
        return this;
    }

    /**
     * 获取x2值
     */
    public Object x2() {
        return this.x2;
    }

    /**
     * 设置x2值
     *
     * @param x2
     */
    public Funnel x2(Object x2) {
        this.x2 = x2;
        return this;
    }

    /**
     * 获取y2值
     */
    public Object y2() {
        return this.y2;
    }

    /**
     * 设置y2值
     *
     * @param y2
     */
    public Funnel y2(Object y2) {
        this.y2 = y2;
        return this;
    }

    /**
     * 获取funnelAlign值
     */
    public X funnelAlign() {
        return this.funnelAlign;
    }

    /**
     * 设置funnelAlign值
     *
     * @param funnelAlign
     */
    public Funnel funnelAlign(X funnelAlign) {
        this.funnelAlign = funnelAlign;
        return this;
    }

    /**
     * 获取min值
     */
    public Integer min() {
        return this.min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public Funnel min(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 获取max值
     */
    public Integer max() {
        return this.max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public Funnel max(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 获取minSize值
     */
    public String minSize() {
        return this.minSize;
    }

    /**
     * 设置minSize值
     *
     * @param minSize
     */
    public Funnel minSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * 获取maxSize值
     */
    public String maxSize() {
        return this.maxSize;
    }

    /**
     * 设置maxSize值
     *
     * @param maxSize
     */
    public Funnel maxSize(String maxSize) {
        this.maxSize = maxSize;
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
    public Funnel sort(Sort sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 获取gap值
     */
    public Integer gap() {
        return this.gap;
    }

    /**
     * 设置gap值
     *
     * @param gap
     */
    public Funnel gap(Integer gap) {
        this.gap = gap;
        return this;
    }

    /**
     * 获取x值
     */
    public Object getX() {
        return x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public void setX(Object x) {
        this.x = x;
    }

    /**
     * 获取y值
     */
    public Object getY() {
        return y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public void setY(Object y) {
        this.y = y;
    }

    /**
     * 获取x2值
     */
    public Object getX2() {
        return x2;
    }

    /**
     * 设置x2值
     *
     * @param x2
     */
    public void setX2(Object x2) {
        this.x2 = x2;
    }

    /**
     * 获取y2值
     */
    public Object getY2() {
        return y2;
    }

    /**
     * 设置y2值
     *
     * @param y2
     */
    public void setY2(Object y2) {
        this.y2 = y2;
    }

    /**
     * 获取min值
     */
    public Integer getMin() {
        return min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * 获取max值
     */
    public Integer getMax() {
        return max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * 获取minSize值
     */
    public String getMinSize() {
        return minSize;
    }

    /**
     * 设置minSize值
     *
     * @param minSize
     */
    public void setMinSize(String minSize) {
        this.minSize = minSize;
    }

    /**
     * 获取maxSize值
     */
    public String getMaxSize() {
        return maxSize;
    }

    /**
     * 设置maxSize值
     *
     * @param maxSize
     */
    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
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
     * 获取gap值
     */
    public Integer getGap() {
        return gap;
    }

    /**
     * 设置gap值
     *
     * @param gap
     */
    public void setGap(Integer gap) {
        this.gap = gap;
    }

    /**
     * 设置funnelAlign值
     */
    public X getFunnelAlign() {
        return funnelAlign;
    }

    /**
     * 获取funnelAlign值
     *
     * @param funnelAlign
     */
    public void setFunnelAlign(X funnelAlign) {
        this.funnelAlign = funnelAlign;
    }

    public ItemStyle getLabelLine() {
        return labelLine;
    }

    public void setLabelLine(ItemStyle labelLine) {
        this.labelLine = labelLine;
    }
}
