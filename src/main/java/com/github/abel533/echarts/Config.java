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

/**
 * 配置信息
 *
 * @author liuzh
 */
public interface Config {
    // 图表类型
    String CHART_TYPE_LINE = "line";
    String CHART_TYPE_BAR = "bar";
    String CHART_TYPE_SCATTER = "scatter";
    String CHART_TYPE_PIE = "pie";
    String CHART_TYPE_RADAR = "radar";
    String CHART_TYPE_MAP = "map";
    String CHART_TYPE_K = "k";
    String CHART_TYPE_ISLAND = "island";
    String CHART_TYPE_FORCE = "force";
    String CHART_TYPE_CHORD = "chord";
    String CHART_TYPE_GAUGE = "gauge";
    String CHART_TYPE_FUNNEL = "funnel";

    // 组件类型
    String COMPONENT_TYPE_TITLE = "title";
    String COMPONENT_TYPE_LEGEND = "legend";
    String COMPONENT_TYPE_DATARANGE = "dataRange";
    String COMPONENT_TYPE_DATAVIEW = "dataView";
    String COMPONENT_TYPE_DATAZOOM = "dataZoom";
    String COMPONENT_TYPE_TOOLBOX = "toolbox";
    String COMPONENT_TYPE_TOOLTIP = "tooltip";
    String COMPONENT_TYPE_GRID = "grid";
    String COMPONENT_TYPE_AXIS = "axis";
    String COMPONENT_TYPE_POLAR = "polar";
    String COMPONENT_TYPE_X_AXIS = "xAxis";
    String COMPONENT_TYPE_Y_AXIS = "yAxis";
    String COMPONENT_TYPE_AXIS_CATEGORY = "categoryAxis";
    String COMPONENT_TYPE_AXIS_VALUE = "valueAxis";
    String COMPONENT_TYPE_TIMELINE = "timeline";

    // 全图默认背景
    String backgroundColor = "rgba(0,0,0,0)";

    // 默认色板
    String[] color = new String[]{"#ff7f50", "#87cefa", "#da70d6", "#32cd32", "#6495ed",
            "#ff69b4", "#ba55d3", "#cd5c5c", "#ffa500", "#40e0d0",
            "#1e90ff", "#ff6347", "#7b68ee", "#00fa9a", "#ffd700",
            "#6699FF", "#ff6666", "#3cb371", "#b8860b", "#30e0e0"};

    Integer DRAG_ENABLE_TIME = 120;   // 降低图表内元素拖拽敏感度，单位ms，不建议外部干预
    Integer EFFECT_ZLEVEL = 7;

    // 主题，默认标志图形类型列表
    String[] symbolList = new String[]{"circle", "rectangle", "triangle", "diamond",
            "emptyCircle", "emptyRectangle", "emptyTriangle", "emptyDiamond"
    };

    String loadingText = "Loading...";

    // 可计算特性配置，孤岛，提示颜色
    Boolean calculable = false;              // 默认关闭可计算特性
    String calculableColor = "rgba(255,165,0,0.6)";       // 拖拽提示边框颜色
    String calculableHolderColor = "#ccc"; // 可计算占位提示颜色
    String nameConnector = " & ";
    String valueConnector = "=";
    Boolean animation = true;
    Boolean addDataAnimation = true;         // 动态数据接口是否开启动画效果
    Integer animationThreshold = 2000;       // 动画元素阀值，产生的图形原素超过2000不出动画
    Integer animationDuration = 2000;
    String animationEasing = "ExponentialOut";    //BounceOut
}
