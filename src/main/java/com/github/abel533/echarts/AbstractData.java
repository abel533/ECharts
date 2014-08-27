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

package com.github.abel533.echarts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Data接口 - 添加数据
 *
 * @author liuzh
 *         Created by liuzh on 14-8-25.
 */
public abstract class AbstractData<T> implements Data<T> {
    /**
     * 标线图形数据
     *
     * @see com.github.abel533.echarts.data.PointData
     */
    public List<Object> data;

    /**
     * 添加元素
     *
     * @param values
     * @return
     */
    public T addData(Object... values) {
        if (values == null || values.length == 0) {
            return (T) this;
        }
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        this.data.addAll(Arrays.asList(values));
        return (T) this;
    }
}
