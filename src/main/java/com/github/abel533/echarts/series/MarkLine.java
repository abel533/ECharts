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

import com.github.abel533.echarts.Data;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: MarkLine
 *
 * @author liuzh
 * @since liuzh(2014-08-26 10:00)
 */
public class MarkLine implements Data<MarkLine> {
    /**
     * 标线起始和结束的symbol介绍类型，如果都一样，可以直接传string，同series中的symbol
     *
     * @see com.github.abel533.echarts.code.Symbol
     * @see com.github.abel533.echarts.series.Series#symbol
     */
    public Object symbol;

    /**
     * 标线起始和结束的symbol大小，半宽（半径）参数，如果都一样，可以直接传number或function，同series中的symbolSize
     *
     * @see com.github.abel533.echarts.series.Series#symbolSize
     */
    public Object symbolSize;

    /**
     * 标线起始和结束的symbol旋转控制，同series中的symbolRotate
     *
     * @see com.github.abel533.echarts.series.Series#symbolRoate
     */
    public Object symbolRoate;

    /**
     * 标线图形炫光特效
     *
     * @see com.github.abel533.echarts.series.Effect
     */
    public Effect effect;

    /**
     * 标线图形样式属性
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     * @see com.github.abel533.echarts.series.Series#itemStyle
     */
    public ItemStyle itemStyle;

    /**
     * 地图特有，标线图形定位坐标
     *
     * @see com.github.abel533.echarts.series.Map#geoCoord
     */
    public Object geoCoord;

    /**
     * 标线图形数据
     *
     * @see com.github.abel533.echarts.data.PointData
     */
    public List<Object> data;

    @Override
    public MarkLine addData(Object... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.data == null) {
            this.data = new ArrayList<Object>();
        }
        data.addAll(Arrays.asList(values));
        return this;
    }
}
