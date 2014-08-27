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

import com.github.abel533.echarts.style.ItemStyle;

import java.util.List;
import java.util.Map;

/**
 * Description: MarkPoint
 *
 * @author liuzh
 * @since liuzh(2014-08-26 09:51)
 */
public class MarkPoint {
    /**
     * 标注类型
     *
     * @see com.github.abel533.echarts.series.Series#symbol
     */
    public Object symbol;

    /**
     * 标注大小
     *
     * @see com.github.abel533.echarts.series.Series#symbolSize
     */
    public Object symbolSize;

    /**
     * 标注图形旋转角度
     *
     * @see com.github.abel533.echarts.series.Series#symbolRoate
     */
    public Object symbolRoate;

    /**
     * 是否启动大规模标注模式
     */
    public Boolean large;

    /**
     * 标注图形炫光特效
     *
     * @see com.github.abel533.echarts.series.Effect
     */
    public Effect effect;

    /**
     * 标注图形样式属性
     *
     * @see com.github.abel533.echarts.series.Series#itemStyle
     */
    public ItemStyle itemStyle;

    /**
     * 地图特有，标注图形定位坐标
     *
     * @see com.github.abel533.echarts.series.Map#geoCoord
     */
    public Map geoCoord;

    /**
     * 标注图形数据
     *
     * @see com.github.abel533.echarts.data.PointData
     */
    public List<Object> data;
}
