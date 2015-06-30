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

package com.github.abel533.echarts.data;

import java.io.Serializable;

/**
 * 描述信息
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class RangeData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer end;

    private String label;
    private Object color;

    public RangeData() {
    }

    public RangeData(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public RangeData start(Integer start) {
        this.start = start;
        return this;
    }

    public Integer start() {
        return this.start;
    }

    public RangeData end(Integer end) {
        this.end = end;
        return this;
    }

    public Integer end() {
        return this.end;
    }

    public RangeData label(String label) {
        this.label = label;
        return this;
    }

    public String label() {
        return this.label;
    }

    public RangeData color(Object color) {
        this.color = color;
        return this;
    }

    public Object color() {
        return this.color;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }
}
