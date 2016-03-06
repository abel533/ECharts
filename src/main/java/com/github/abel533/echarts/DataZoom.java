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

package com.github.abel533.echarts;

import com.github.abel533.echarts.code.DataZoomType;
import com.github.abel533.echarts.code.FilterMode;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.style.TextStyle;

import java.util.Date;

/**
 * 数据区域缩放。与toolbox.feature.dataZoom同步，仅对直角坐标系图表有效
 *
 * @author liuzh
 */
public class DataZoom extends Basic<DataZoom> implements Component {
    /**
     * 类型
     */
    private DataZoomType type;
    /**
     * 显示label的小数精度。默认根据数据自动决定
     */
    private String labelPrecision;
    /**
     * 显示的label的格式化器
     */
    private String labelFormatter;
    /**
     * 是否在 dataZoom-silder 组件中显示数据阴影。数据阴影可以简单得反应数据走势
     */
    private String showDataShadow;
    /**
     * 文字样式
     */
    private TextStyle textStyle;
    /**
     * 数据窗口范围的起始数值。如果设置了 dataZoom-slider.start 则 startValue 失效
     */
    private Object startValue;
    /**
     * 数据窗口范围的结束数值。如果设置了 dataZoom-slider.end 则 endValue 失效
     */
    private Object endValue;
    /**
     * 设置 dataZoom-inside 组件控制的 角度轴
     */
    private Object angleAxisIndex;
    /**
     * 设置 dataZoom-inside 组件控制的 半径轴
     */
    private Object radiusAxisIndex;
    /**
     * dataZoom 的运行原理是通过 数据过滤 来达到 数据窗口缩放 的效果
     */
    private FilterMode filterMode;
    /**
     * 设置触发视图刷新的频率。单位为毫秒（ms）。一般不需要更改这个值
     */
    private Integer throttle;
    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     */
    private Orient orient;
    /**
     * 默认#ccc，数据缩略背景颜色
     */
    private String dataBackgroundColor;
    /**
     * 默认值rgba(144,197,237,0.2)，选择区域填充颜色
     */
    private String fillerColor;
    /**
     * 默认值rgba(70,130,180,0.8)，控制手柄颜色
     */
    private String handleColor;
    /**
     * 控制手柄大小
     */
    private Integer handleSize;
    /**
     * 当不指定时默认控制所有横向类目，可通过数组指定多个需要控制的横向类目坐标轴Index，仅一个时可直接为数字
     */
    private Object xAxisIndex;
    /**
     * 当不指定时默认控制所有纵向类目，可通过数组指定多个需要控制的纵向类目坐标轴Index，仅一个时可直接为数字
     */
    private Object yAxisIndex;
    /**
     * 数据缩放，选择起始比例，默认为0（%），从首个数据起选择
     */
    private Integer start;
    /**
     * 数据缩放，选择结束比例，默认为100（%），到最后一个数据选择结束
     */
    private Integer end;
    /**
     * 缩放变化是否实时显示，建议性能较低的浏览器或数据量巨大时不启动实时效果
     */
    private Boolean realtime;
    /**
     * 数据缩放锁，默认为false，当设置为true时选择区域不能伸缩，即(end - start)值保持不变，仅能做数据漫游
     */
    private Boolean zoomLock;
    /**
     * 缩放变化是否显示定位详情
     */
    private Boolean showDetail;

    public String labelPrecision() {
        return this.labelPrecision;
    }

    public DataZoom labelPrecision(String labelPrecision) {
        this.labelPrecision = labelPrecision;
        return this;
    }

    public String labelFormatter() {
        return this.labelFormatter;
    }

    public DataZoom labelFormatter(String labelFormatter) {
        this.labelFormatter = labelFormatter;
        return this;
    }

    public String showDataShadow() {
        return this.showDataShadow;
    }

    public DataZoom showDataShadow(String showDataShadow) {
        this.showDataShadow = showDataShadow;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public DataZoom textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Object startValue() {
        return this.startValue;
    }

    public DataZoom startValue(Object startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom startValue(String startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom startValue(Integer startValue) {
        this.startValue = startValue;
        return this;
    }

    public DataZoom startValue(Date startValue) {
        this.startValue = startValue;
        return this;
    }

    public Object endValue() {
        return this.endValue;
    }

    public DataZoom endValue(Object endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom endValue(Integer endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom endValue(String endValue) {
        this.endValue = endValue;
        return this;
    }

    public DataZoom endValue(Date endValue) {
        this.endValue = endValue;
        return this;
    }

    public String getLabelPrecision() {
        return labelPrecision;
    }

    public void setLabelPrecision(String labelPrecision) {
        this.labelPrecision = labelPrecision;
    }

    public String getLabelFormatter() {
        return labelFormatter;
    }

    public void setLabelFormatter(String labelFormatter) {
        this.labelFormatter = labelFormatter;
    }

    public String getShowDataShadow() {
        return showDataShadow;
    }

    public void setShowDataShadow(String showDataShadow) {
        this.showDataShadow = showDataShadow;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public Object getStartValue() {
        return startValue;
    }

    public void setStartValue(Object startValue) {
        this.startValue = startValue;
    }

    public Object getEndValue() {
        return endValue;
    }

    public void setEndValue(Object endValue) {
        this.endValue = endValue;
    }

    public DataZoomType type() {
        return this.type;
    }

    public DataZoom type(DataZoomType type) {
        this.type = type;
        return this;
    }

    public Object angleAxisIndex() {
        return this.angleAxisIndex;
    }

    public DataZoom angleAxisIndex(Object angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public DataZoom angleAxisIndex(Integer angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public DataZoom angleAxisIndex(Integer... angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
        return this;
    }

    public Object radiusAxisIndex() {
        return this.radiusAxisIndex;
    }

    public DataZoom radiusAxisIndex(Object radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public DataZoom radiusAxisIndex(Integer radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public DataZoom radiusAxisIndex(Integer... radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
        return this;
    }

    public FilterMode filterMode() {
        return this.filterMode;
    }

    public DataZoom filterMode(FilterMode filterMode) {
        this.filterMode = filterMode;
        return this;
    }

    public Integer throttle() {
        return this.throttle;
    }

    public DataZoom throttle(Integer throttle) {
        this.throttle = throttle;
        return this;
    }

    public DataZoomType getType() {
        return type;
    }

    public void setType(DataZoomType type) {
        this.type = type;
    }

    public Object getAngleAxisIndex() {
        return angleAxisIndex;
    }

    public void setAngleAxisIndex(Object angleAxisIndex) {
        this.angleAxisIndex = angleAxisIndex;
    }

    public Object getRadiusAxisIndex() {
        return radiusAxisIndex;
    }

    public void setRadiusAxisIndex(Object radiusAxisIndex) {
        this.radiusAxisIndex = radiusAxisIndex;
    }

    public FilterMode getFilterMode() {
        return filterMode;
    }

    public void setFilterMode(FilterMode filterMode) {
        this.filterMode = filterMode;
    }

    public Integer getThrottle() {
        return throttle;
    }

    public void setThrottle(Integer throttle) {
        this.throttle = throttle;
    }

    /**
     * 获取handleSize值
     */
    public Integer handleSize() {
        return this.handleSize;
    }

    /**
     * 设置handleSize值
     *
     * @param handleSize
     */
    public DataZoom handleSize(Integer handleSize) {
        this.handleSize = handleSize;
        return this;
    }

    /**
     * 获取orient值
     */
    public Orient orient() {
        return this.orient;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
    public DataZoom orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    /**
     * 获取dataBackgroundColor值
     */
    public String dataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    /**
     * 设置dataBackgroundColor值
     *
     * @param dataBackgroundColor
     */
    public DataZoom dataBackgroundColor(String dataBackgroundColor) {
        this.dataBackgroundColor = dataBackgroundColor;
        return this;
    }

    /**
     * 获取fillerColor值
     */
    public String fillerColor() {
        return this.fillerColor;
    }

    /**
     * 设置fillerColor值
     *
     * @param fillerColor
     */
    public DataZoom fillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }

    /**
     * 获取handleColor值
     */
    public String handleColor() {
        return this.handleColor;
    }

    /**
     * 设置handleColor值
     *
     * @param handleColor
     */
    public DataZoom handleColor(String handleColor) {
        this.handleColor = handleColor;
        return this;
    }

    /**
     * 获取xAxisIndex值
     */
    public Object xAxisIndex() {
        return this.xAxisIndex;
    }

    /**
     * 设置xAxisIndex值
     *
     * @param xAxisIndex
     */
    public DataZoom xAxisIndex(Object xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    /**
     * 获取yAxisIndex值
     */
    public Object yAxisIndex() {
        return this.yAxisIndex;
    }

    /**
     * 设置yAxisIndex值
     *
     * @param yAxisIndex
     */
    public DataZoom yAxisIndex(Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    /**
     * 获取start值
     */
    public Integer start() {
        return this.start;
    }

    /**
     * 设置start值
     *
     * @param start
     */
    public DataZoom start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 获取end值
     */
    public Integer end() {
        return this.end;
    }

    /**
     * 设置end值
     *
     * @param end
     */
    public DataZoom end(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * 获取realtime值
     */
    public Boolean realtime() {
        return this.realtime;
    }

    /**
     * 设置realtime值
     *
     * @param realtime
     */
    public DataZoom realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    /**
     * 获取zoomLock值
     */
    public Boolean zoomLock() {
        return this.zoomLock;
    }

    /**
     * 设置zoomLock值
     *
     * @param zoomLock
     */
    public DataZoom zoomLock(Boolean zoomLock) {
        this.zoomLock = zoomLock;
        return this;
    }

    /**
     * 获取showDetail值
     */
    public Boolean showDetail() {
        return this.showDetail;
    }

    /**
     * 设置showDetail值
     *
     * @param showDetail
     */
    public DataZoom showDetail(Boolean showDetail) {
        this.showDetail = showDetail;
        return this;
    }

    /**
     * 获取orient值
     */
    public Orient getOrient() {
        return orient;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
    public void setOrient(Orient orient) {
        this.orient = orient;
    }

    /**
     * 获取dataBackgroundColor值
     */
    public String getDataBackgroundColor() {
        return dataBackgroundColor;
    }

    /**
     * 设置dataBackgroundColor值
     *
     * @param dataBackgroundColor
     */
    public void setDataBackgroundColor(String dataBackgroundColor) {
        this.dataBackgroundColor = dataBackgroundColor;
    }

    /**
     * 获取fillerColor值
     */
    public String getFillerColor() {
        return fillerColor;
    }

    /**
     * 设置fillerColor值
     *
     * @param fillerColor
     */
    public void setFillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
    }

    /**
     * 获取handleColor值
     */
    public String getHandleColor() {
        return handleColor;
    }

    /**
     * 设置handleColor值
     *
     * @param handleColor
     */
    public void setHandleColor(String handleColor) {
        this.handleColor = handleColor;
    }

    /**
     * 获取xAxisIndex值
     */
    public Object getxAxisIndex() {
        return xAxisIndex;
    }

    /**
     * 设置xAxisIndex值
     *
     * @param xAxisIndex
     */
    public void setxAxisIndex(Object xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }

    /**
     * 获取yAxisIndex值
     */
    public Object getyAxisIndex() {
        return yAxisIndex;
    }

    /**
     * 设置yAxisIndex值
     *
     * @param yAxisIndex
     */
    public void setyAxisIndex(Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
    }

    /**
     * 获取start值
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 设置start值
     *
     * @param start
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * 获取end值
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * 设置end值
     *
     * @param end
     */
    public void setEnd(Integer end) {
        this.end = end;
    }

    /**
     * 获取realtime值
     */
    public Boolean getRealtime() {
        return realtime;
    }

    /**
     * 设置realtime值
     *
     * @param realtime
     */
    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    /**
     * 获取zoomLock值
     */
    public Boolean getZoomLock() {
        return zoomLock;
    }

    /**
     * 设置zoomLock值
     *
     * @param zoomLock
     */
    public void setZoomLock(Boolean zoomLock) {
        this.zoomLock = zoomLock;
    }

    /**
     * 获取showDetail值
     */
    public Boolean getShowDetail() {
        return showDetail;
    }

    /**
     * 设置showDetail值
     *
     * @param showDetail
     */
    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    /**
     * 获取handleSize值
     */
    public Integer getHandleSize() {
        return handleSize;
    }

    /**
     * 设置handleSize值
     *
     * @param handleSize
     */
    public void setHandleSize(Integer handleSize) {
        this.handleSize = handleSize;
    }
}
