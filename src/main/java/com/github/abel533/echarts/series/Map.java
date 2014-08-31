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
 */
public class Map extends Series<Map> {
    /**
     * 选中模式，默认关闭，可选single，multiple
     *
     * @see com.github.abel533.echarts.code.SelectedMode
     */
    private Object selectedMode;
    /**
     * 地图类型，支持world，china及全国34个省市自治区。省市自治区的mapType直接使用简体中文
     * 支持子区域模式，通过主地图类型扩展出所包含的子区域地图，格式为'主地图类型|子区域名称'，如
     * 'world|Brazil'，'china|广东'
     */
    private String mapType;
    /**
     * 非数值显示（如仅用于显示标注标线时），可以通过hoverable:false关闭区域悬浮高亮
     */
    private Boolean hoverable;
    /**
     * 地图位置设置，默认只适应上下左右居中可配x，y，width，height，任意参数为空都将根据其他参数自适应
     */
    private MapLocation mapLocation;
    /**
     * 地图数值计算方式，默认为加和，可选为：'sum'（总数） | 'average'（均值）
     *
     * @see com.github.abel533.echarts.code.Calculation
     */
    private Calculation mapValueCalculation;
    /**
     * 地图数值计算结果小数精度，mapValueCalculation为average时有效，默认为取整，需要小数精度时设置大于0的整数
     */
    private Integer mapValuePrecision;
    /**
     * 显示图例颜色标识（系列标识的小圆点），存在legend时生效
     */
    private Boolean showLegendSymbol;
    /**
     * 是否开启滚轮缩放和拖拽漫游
     */
    private Boolean roam;
    /**
     * 滚轮缩放的极限控制，可指定{max:number, min:number}，其中max为放大系数，有效值应大于1，min为缩小系数，有效值应小于1
     */
    private Object scaleLimit;
    /**
     * 自定义地区的名称映射，如{'China' : '中国'}
     */
    private Object nameMap;
    /**
     * 地区的名称文本位置修正，数值单位为px，正值为左下偏移，负值为右上偏移，如{'China' : [10, -10]}
     */
    private Object textFixed;
    /**
     * 通过绝对经纬度指定地区的名称文本位置，如{'Islands':[113.95, 22.26]}，香港离岛区名称显示定位到东经113.95，北纬22.26上
     */
    //TODO 结构可以优化
    private Object geoCoord;

    public Map() {
        this.type(SeriesType.map);
    }

    public Map(String name) {
        super(name);
        this.type(SeriesType.map);
    }

    public Map mapLocation(MapLocation mapLocation) {
        this.mapLocation = mapLocation;
        return this;
    }

    public Object selectedMode() {
        return this.selectedMode;
    }

    public Map selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public String mapType() {
        return this.mapType;
    }

    public Map mapType(String mapType) {
        this.mapType = mapType;
        return this;
    }

    public Boolean hoverable() {
        return this.hoverable;
    }

    public Map hoverable(Boolean hoverable) {
        this.hoverable = hoverable;
        return this;
    }

    /**
     * 地图位置设置，默认只适应上下左右居中可配x，y，width，height，任意参数为空都将根据其他参数自适应
     */
    public MapLocation mapLocation() {
        if (this.mapLocation == null) {
            this.mapLocation = new MapLocation();
        }
        return this.mapLocation;
    }

    public Calculation mapValueCalculation() {
        return this.mapValueCalculation;
    }

    public Map mapValueCalculation(Calculation mapValueCalculation) {
        this.mapValueCalculation = mapValueCalculation;
        return this;
    }

    public Integer mapValuePrecision() {
        return this.mapValuePrecision;
    }

    public Map mapValuePrecision(Integer mapValuePrecision) {
        this.mapValuePrecision = mapValuePrecision;
        return this;
    }

    public Boolean showLegendSymbol() {
        return this.showLegendSymbol;
    }

    public Map showLegendSymbol(Boolean showLegendSymbol) {
        this.showLegendSymbol = showLegendSymbol;
        return this;
    }

    public Boolean roam() {
        return this.roam;
    }

    public Map roam(Boolean roam) {
        this.roam = roam;
        return this;
    }

    public Object scaleLimit() {
        return this.scaleLimit;
    }

    public Map scaleLimit(Object scaleLimit) {
        this.scaleLimit = scaleLimit;
        return this;
    }

    public Object nameMap() {
        return this.nameMap;
    }

    public Map nameMap(Object nameMap) {
        this.nameMap = nameMap;
        return this;
    }

    public Object textFixed() {
        return this.textFixed;
    }

    public Map textFixed(Object textFixed) {
        this.textFixed = textFixed;
        return this;
    }

    public Object geoCoord() {
        return this.geoCoord;
    }

    public Map geoCoord(Object geoCoord) {
        this.geoCoord = geoCoord;
        return this;
    }

    public Object getSelectedMode() {
        return selectedMode;
    }

    public void setSelectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
    }

    public String getMapType() {
        return mapType;
    }

    public void setMapType(String mapType) {
        this.mapType = mapType;
    }

    public Boolean getHoverable() {
        return hoverable;
    }

    public void setHoverable(Boolean hoverable) {
        this.hoverable = hoverable;
    }

    public MapLocation getMapLocation() {
        return mapLocation;
    }

    public void setMapLocation(MapLocation mapLocation) {
        this.mapLocation = mapLocation;
    }

    public Calculation getMapValueCalculation() {
        return mapValueCalculation;
    }

    public void setMapValueCalculation(Calculation mapValueCalculation) {
        this.mapValueCalculation = mapValueCalculation;
    }

    public Integer getMapValuePrecision() {
        return mapValuePrecision;
    }

    public void setMapValuePrecision(Integer mapValuePrecision) {
        this.mapValuePrecision = mapValuePrecision;
    }

    public Boolean getShowLegendSymbol() {
        return showLegendSymbol;
    }

    public void setShowLegendSymbol(Boolean showLegendSymbol) {
        this.showLegendSymbol = showLegendSymbol;
    }

    public Boolean getRoam() {
        return roam;
    }

    public void setRoam(Boolean roam) {
        this.roam = roam;
    }

    public Object getScaleLimit() {
        return scaleLimit;
    }

    public void setScaleLimit(Object scaleLimit) {
        this.scaleLimit = scaleLimit;
    }

    public Object getNameMap() {
        return nameMap;
    }

    public void setNameMap(Object nameMap) {
        this.nameMap = nameMap;
    }

    public Object getTextFixed() {
        return textFixed;
    }

    public void setTextFixed(Object textFixed) {
        this.textFixed = textFixed;
    }

    public Object getGeoCoord() {
        return geoCoord;
    }

    public void setGeoCoord(Object geoCoord) {
        this.geoCoord = geoCoord;
    }
}
