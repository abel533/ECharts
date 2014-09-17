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

import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;

/**
 * 地图位置设置，默认只适应上下左右居中可配x，y，width，height，任意参数为空都将根据其他参数自适应
 *
 * @author liuzh
 */
public class MapLocation {
    private Object x;
    private Object y;
    private Object width;
    private Object height;

    public MapLocation() {
    }

    public MapLocation(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    public MapLocation(Object x, Object y, Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public MapLocation(Object x, Object y, Object width, Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public MapLocation(X x, Y y) {
        this.x = x;
        this.y = y;
    }

    public MapLocation(X x, Y y, Object width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public MapLocation(X x, Y y, Object width, Object height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Object x() {
        return this.x;
    }

    public MapLocation x(Object x) {
        this.x = x;
        return this;
    }

    public MapLocation x(X x) {
        this.x = x;
        return this;
    }

    public Object y() {
        return this.y;
    }

    public MapLocation y(Y y) {
        this.y = y;
        return this;
    }

    public MapLocation y(Object y) {
        this.y = y;
        return this;
    }

    public Object width() {
        return this.width;
    }

    public MapLocation width(Object width) {
        this.width = width;
        return this;
    }

    public Object height() {
        return this.height;
    }

    public MapLocation height(Object height) {
        this.height = height;
        return this;
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }
}
