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

import com.github.abel533.echarts.code.Calculation;
import com.github.abel533.echarts.code.SeriesType;

/**
 * 地图
 *
 * @author liuzh
 * @since liuzh(2014-08-26 11:34)
 */
public class Map extends Series {
    /**
     * 选中模式，默认关闭，可选single，multiple
     *
     * @see com.github.abel533.echarts.code.SelectedMode
     */
    public Object selectedMode;

    /**
     * 地图类型，支持world，china及全国34个省市自治区。省市自治区的mapType直接使用简体中文
     * 支持子区域模式，通过主地图类型扩展出所包含的子区域地图，格式为'主地图类型|子区域名称'，如
     * 'world|Brazil'，'china|广东'
     */
    public String mapType;

    /**
     * 非数值显示（如仅用于显示标注标线时），可以通过hoverable:false关闭区域悬浮高亮
     */
    public Boolean hoverable;

    /**
     * 地图位置设置，默认只适应上下左右居中可配x，y，width，height，任意参数为空都将根据其他参数自适应
     */
    public Object mapLocation;

    /**
     * 地图数值计算方式，默认为加和，可选为：'sum'（总数） | 'average'（均值）
     *
     * @see com.github.abel533.echarts.code.Calculation
     */
    public Calculation mapValueCalculation;

    /**
     * 地图数值计算结果小数精度，mapValueCalculation为average时有效，默认为取整，需要小数精度时设置大于0的整数
     */
    public Integer mapValuePrecision;

    /**
     * 显示图例颜色标识（系列标识的小圆点），存在legend时生效
     */
    public Boolean showLegendSymbol;

    /**
     * 是否开启滚轮缩放和拖拽漫游
     */
    public Boolean roam;

    /**
     * 滚轮缩放的极限控制，可指定{max:number, min:number}，其中max为放大系数，有效值应大于1，min为缩小系数，有效值应小于1
     */
    public Object scaleLimit;

    /**
     * 自定义地区的名称映射，如{'China' : '中国'}
     */
    public Object nameMap;

    /**
     * 地区的名称文本位置修正，数值单位为px，正值为左下偏移，负值为右上偏移，如{'China' : [10, -10]}
     */
    public Object textFixed;

    /**
     * 通过绝对经纬度指定地区的名称文本位置，如{'Islands':[113.95, 22.26]}，香港离岛区名称显示定位到东经113.95，北纬22.26上
     */
    public Object geoCoord;

    public Map() {
        this.type = SeriesType.map;
    }
}
