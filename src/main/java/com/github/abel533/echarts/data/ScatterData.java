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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: ScatterData
 *
 * @author liuzh
 */
public class ScatterData implements Serializable {

    private static final long serialVersionUID = 658151140767993468L;

    private List<Object> value;

    /**
     * 横值，纵值
     *
     * @param width
     * @param height
     */
    public ScatterData(Object width, Object height) {
        this.value(width, height);
    }

    /**
     * 横值，纵值，大小
     *
     * @param width
     * @param height
     * @param size
     */
    public ScatterData(Object width, Object height, Object size) {
        this.value(width, height, size);
    }

    /**
     * 获取value值
     */
    public List<Object> value() {
        if (this.value == null) {
            this.value = new ArrayList<Object>();
        }
        return this.value;
    }

    /**
     * 设置values值
     *
     * @param values
     */
    private ScatterData value(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.value().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 获取value值
     */
    public List<Object> getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(List<Object> value) {
        this.value = value;
    }
}
