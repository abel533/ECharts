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

package com.github.abel533.echarts.series.other;

import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;

import java.io.Serializable;

/**
 * 描述信息
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class RootLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    private Object x;
    private Object y;

    /**
     * 构造函数
     */
    public RootLocation() {
    }

    /**
     * 构造函数,参数:x,y
     *
     * @param x
     * @param y
     */
    public RootLocation(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(X x) {
        this.x = x;
        return this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(Integer x) {
        this.x = x;
        return this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(String x) {
        this.x = x;
        return this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public RootLocation x(Object x) {
        this.x = x;
        return this;
    }

    /**
     * 获取x值
	 */
	public Object x() {
        return this.x;
    }

    /**
     * 设置y值
     *
     * @param y
     */
	public RootLocation y(Y y) {
        this.y = y;
        return this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public RootLocation y(Integer y) {
        this.y = y;
        return this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public RootLocation y(String y) {
        this.y = y;
        return this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public RootLocation y(Object y) {
        this.y = y;
        return this;
    }

    /**
     * 获取y值
	 */
	public Object y() {
        return this.y;
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
}
