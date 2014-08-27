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

import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.series.Series;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: Option
 *
 * @author liuzh
 */
public class Option {
    /**
     * 全图默认背景，（详见backgroundColor），默认为无，透明
     */
    public Object backgroundColor;

    /**
     * 数值系列的颜色列表，（详见color），可配数组，eg：['#87cefa', 'rgba(123,123,123,0.5)','...']，当系列数量个数比颜色列表长度大时将循环选取
     */
    public Object[] color;

    /**
     * 非IE8-支持渲染为图片，（详见renderAsImage）
     * {boolean | string} false，非IE8-支持渲染为图片，可设为true或指定图片格式（png | jpeg），渲染为图片后实例依然可用（如setOption，resize等），但各种交互失效
     */
    public Object renderAsImage;

    /**
     * 是否启用拖拽重计算特性，默认关闭，（详见calculable，相关的还有 calculableColor， calculableHolderColor， nameConnector， valueConnector）
     */
    public Boolean calculable;

    /**
     * 是否开启动画，默认开启，（详见 animation，相关的还有 addDataAnimation， animationThreshold， animationDuration， animationEasing）
     */
    public Boolean animation;

    /**
     * 时间轴（详见timeline），每个图表最多仅有一个时间轴控件
     */
    public Timeline timeline;

    /**
     * 标题（详见title），每个图表最多仅有一个标题控件
     */
    public Title title;

    /**
     * 工具箱（详见toolbox），每个图表最多仅有一个工具箱
     */
    public Toolbox toolbox;

    /**
     * 提示框（详见tooltip），鼠标悬浮交互时的信息提示
     */
    public Tooltip tooltip;

    /**
     * 图例（详见legend），每个图表最多仅有一个图例，混搭图表共享
     */
    public Legend legend;

    /**
     * 值域选择（详见dataRange）,值域范围
     */
    public DataRange dataRange;

    /**
     * 数据区域缩放（详见dataZoom）,数据展现范围选择
     */
    public DataZoom dataZoom;

    /**
     * 直角坐标系内绘图网格（详见grid）
     */
    public Grid grid;

    /**
     * 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
     */
    public List<Axis> xAxis;

    /**
     * 直角坐标系中纵轴数组（详见yAxis），数组中每一项代表一条纵轴坐标轴，标准（1.0）中规定最多同时存在2条纵轴
     */
    public List<Axis> yAxis;

    /**
     * 驱动图表生成的数据内容（详见series），数组中每一项代表一个系列的特殊选项及数据
     */
    public List<Series> series;

    public Option() {
        //数据必须有
        this.series = new ArrayList<Series>();
    }

    /**
     * 添加图例属性
     *
     * @param values
     * @return
     */
    public Option addLegend(Object... values) {
        if (legend == null) {
            legend = new Legend();
        }
        legend.addData(values);
        return this;
    }
}
