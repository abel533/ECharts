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

import com.github.abel533.echarts.code.Orient;

/**
 * 数据区域缩放。与toolbox.feature.dataZoom同步，仅对直角坐标系图表有效
 *
 * @author liuzh
 */
public class DataZoom extends Basic<DataZoom> implements Component {
    /**
     * 是否显示，当show为true时则接管使用指定类目轴的全部系列数据，如不指定则接管全部直角坐标系数据
     */
    private Boolean show;
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
    private Boolean zoomLook;

    public Boolean show() {
        return this.show;
    }

    public DataZoom show(Boolean show) {
        this.show = show;
        return this;
    }

    public Orient orient() {
        return this.orient;
    }

    public DataZoom orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public String dataBackgroundColor() {
        return this.dataBackgroundColor;
    }

    public DataZoom dataBackgroundColor(String dataBackgroundColor) {
        this.dataBackgroundColor = dataBackgroundColor;
        return this;
    }

    public String fillerColor() {
        return this.fillerColor;
    }

    public DataZoom fillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
        return this;
    }

    public String handleColor() {
        return this.handleColor;
    }

    public DataZoom handleColor(String handleColor) {
        this.handleColor = handleColor;
        return this;
    }

    public Object xAxisIndex() {
        return this.xAxisIndex;
    }

    public DataZoom xAxisIndex(Object xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
        return this;
    }

    public Object yAxisIndex() {
        return this.yAxisIndex;
    }

    public DataZoom yAxisIndex(Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
        return this;
    }

    public Integer start() {
        return this.start;
    }

    public DataZoom start(Integer start) {
        this.start = start;
        return this;
    }

    public Integer end() {
        return this.end;
    }

    public DataZoom end(Integer end) {
        this.end = end;
        return this;
    }

    public Boolean realtime() {
        return this.realtime;
    }

    public DataZoom realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public Boolean zoomLook() {
        return this.zoomLook;
    }

    public DataZoom zoomLook(Boolean zoomLook) {
        this.zoomLook = zoomLook;
        return this;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Orient getOrient() {
        return orient;
    }

    public void setOrient(Orient orient) {
        this.orient = orient;
    }

    public String getDataBackgroundColor() {
        return dataBackgroundColor;
    }

    public void setDataBackgroundColor(String dataBackgroundColor) {
        this.dataBackgroundColor = dataBackgroundColor;
    }

    public String getFillerColor() {
        return fillerColor;
    }

    public void setFillerColor(String fillerColor) {
        this.fillerColor = fillerColor;
    }

    public String getHandleColor() {
        return handleColor;
    }

    public void setHandleColor(String handleColor) {
        this.handleColor = handleColor;
    }

    public Object getxAxisIndex() {
        return xAxisIndex;
    }

    public void setxAxisIndex(Object xAxisIndex) {
        this.xAxisIndex = xAxisIndex;
    }

    public Object getyAxisIndex() {
        return yAxisIndex;
    }

    public void setyAxisIndex(Object yAxisIndex) {
        this.yAxisIndex = yAxisIndex;
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

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public Boolean getZoomLook() {
        return zoomLook;
    }

    public void setZoomLook(Boolean zoomLook) {
        this.zoomLook = zoomLook;
    }
}
