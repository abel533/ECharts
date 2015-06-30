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

/**
 * 雷达图
 *
 * @author liuzh
 */
public class Treemap extends Series<Treemap> {

    private Object[] center;
    private Object[] size;
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

    public Treemap center(Object val1, Object val2) {
        this.center = new Object[2];
        this.center[0] = val1;
        this.center[1] = val2;
        return this;
    }

    public Object[] center() {
        if (this.center == null) {
            this.center = new Object[2];
        }
        return this.center;
    }

    public Treemap size(Object val1, Object val2) {
        this.size = new Object[2];
        this.size[0] = val1;
        this.size[1] = val2;
        return this;
    }

    public Object[] size() {
        if (this.size == null) {
            this.size = new Object[2];
        }
        return this.size;
    }

    public Treemap root(String root) {
        this.root = root;
        return this;
    }

    public String root() {
        return this.root;
    }

    public Object[] getCenter() {
        return center;
    }

    public void setCenter(Object[] center) {
        this.center = center;
    }

    public Object[] getSize() {
        return size;
    }

    public void setSize(Object[] size) {
        this.size = size;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
