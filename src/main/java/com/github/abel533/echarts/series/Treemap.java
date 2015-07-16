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
