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

package com.github.abel533.echarts.code;

/**
 * @author liuzh
 */
public enum SeriesType {
    line,//折线图.........................
    lines,//线图,用于带有起点和终点信息的线数据的绘制，主要用于地图上的航线，路线的可视化+++++++++++++++++++++
    bar,//柱状图
    scatter,//散点图
    effectScatter,//带有涟漪效果的散点图++++++++++++++++++++++++-
    //k,//K线图，3.0会转换为下面的candlestick----------------------------
    candlestick,//K线图，k会自动转换这个新的++++++++++++++++++++
    pie,//饼图
    //radar,//雷达图
    //chord,//和弦图
    //force,//力导向布局图,ECharts 2.x 中 force 类型的图表不再在 ECharts 3 中提供支持，转为统一使用 graph
    // 去展现关系数据。如果要使用力引导布局，可以将 layout 配置项设为'force'。--------------------
    graph,//关系图,用于展现节点以及节点之间的关系数据++++++++++++++++++++++++++
    map,//地图
    funnel,//漏斗图
    gauge,//仪表盘
    //island,//孤岛
    //eventRiver,//事件河流图
    //venn,//韦恩图
    treemap,//矩形树图
    //wordCloud,//词云
    //tree,//树图
    heatmap,//热力图
    boxplot,//中文可以称为『箱形图』、『盒须图』、『盒式图』、『盒状图』、『箱线图』++++++++++++++++++++++++
    parallel,//平行坐标系++++++++++++++++++++++
    sankey,//桑基图,是一种特殊的流图, 它主要用来表示原材料、能量等如何从初始形式经过中间过程的加工、转化到达最终形式++++++++++++++
}
