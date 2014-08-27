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

import com.github.abel533.echarts.code.Align;

/**
 * 数据区域缩放。与toolbox.feature.dataZoom同步，仅对直角坐标系图表有效
 *
 * @author liuzh
 *         Created by liuzh on 14-8-26.
 */
public class DataZoom extends Basic {
    /**
     * 是否显示，当show为true时则接管使用指定类目轴的全部系列数据，如不指定则接管全部直角坐标系数据
     */
    public Boolean show;

    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     */
    public Align orient;

    /**
     * 默认#ccc，数据缩略背景颜色
     */
    public String dataBackgroundColor;

    /**
     * 默认值rgba(144,197,237,0.2)，选择区域填充颜色
     */
    public String fillerColor;

    /**
     * 默认值rgba(70,130,180,0.8)，控制手柄颜色
     */
    public String handleColor;

    /**
     * 当不指定时默认控制所有横向类目，可通过数组指定多个需要控制的横向类目坐标轴Index，仅一个时可直接为数字
     */
    public Object xAxisIndex;

    /**
     * 当不指定时默认控制所有纵向类目，可通过数组指定多个需要控制的纵向类目坐标轴Index，仅一个时可直接为数字
     */
    public Object yAxisIndex;

    /**
     * 数据缩放，选择起始比例，默认为0（%），从首个数据起选择
     */
    public Integer start;

    /**
     * 数据缩放，选择结束比例，默认为100（%），到最后一个数据选择结束
     */
    public Integer end;

    /**
     * 缩放变化是否实时显示，建议性能较低的浏览器或数据量巨大时不启动实时效果
     */
    public Boolean realtime;

    /**
     * 数据缩放锁，默认为false，当设置为true时选择区域不能伸缩，即(end - start)值保持不变，仅能做数据漫游
     */
    public Boolean zoomLook;

    public DataZoom() {
        super();
        this.show = false;
        this.orient = Align.horizontal;
        this.dataBackgroundColor = "#eee";
        this.fillerColor = "rgba(144,197,237,0.2)";
        this.handleColor = "rgba(70,130,180,0.8)";
        this.realtime = true;
    }
}
