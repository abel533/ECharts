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

import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;

import java.io.Serializable;

/**
 * 地图位置设置，默认只适应上下左右居中可配x，y，width，height，任意参数为空都将根据其他参数自适应
 *
 * @author liuzh
 */
public class MapLocation implements Serializable {

    private static final long serialVersionUID = -9175820401945407194L;

    private Object x;
    private Object y;
    private Object width;
    private Object height;

    /**
     * 构造函数
     */
    public MapLocation() {
    }

    /**
     * 构造函数,参数:x,y
     *
     * @param x
     * @param y
     */
    public MapLocation(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 构造函数,参数:x,y,width
     *
     * @param x
     * @param y
     * @param width
     */
    public MapLocation(Object x, Object y, Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    /**
     * 构造函数,参数:x,y,width,height
     *
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public MapLocation(Object x, Object y, Object width, Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * 构造函数,参数:x,y
     *
     * @param x
     * @param y
     */
    public MapLocation(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 构造函数,参数:x,y,width
     *
     * @param x
     * @param y
     * @param width
     */
    public MapLocation(X x, Y y, Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    /**
     * 构造函数,参数:x,y,width,height
     *
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public MapLocation(X x, Y y, Object width, Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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
    public MapLocation x(Object x) {
        this.x = x;
        return this;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public MapLocation x(X x) {
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
    public MapLocation y(Y y) {
        this.y = y;
        return this;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public MapLocation y(Object y) {
        this.y = y;
        return this;
    }

    /**
     * 获取width值
     */
    public Object width() {
        return this.width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public MapLocation width(Object width) {
        this.width = width;
        return this;
    }

    /**
     * 获取height值
     */
    public Object height() {
        return this.height;
    }

    /**
     * 设置height值
     *
     * @param height
     */
    public MapLocation height(Object height) {
        this.height = height;
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
     * 获取width值
     */
    public Object getWidth() {
        return width;
    }

    /**
     * 设置width值
     *
     * @param width
     */
    public void setWidth(Object width) {
        this.width = width;
    }

    /**
     * 获取height值
     */
    public Object getHeight() {
        return height;
    }

    /**
     * 设置height值
     *
     * @param height
     */
    public void setHeight(Object height) {
        this.height = height;
    }
}
