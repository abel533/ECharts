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

import com.github.abel533.echarts.code.ControlPosition;
import com.github.abel533.echarts.code.TimeLineType;
import com.github.abel533.echarts.style.CheckpointStyle;
import com.github.abel533.echarts.style.ControlStyle;
import com.github.abel533.echarts.style.LineStyle;

/**
 * Description: Timeline
 *
 * @author liuzh
 */
public class Timeline extends AbstractData<Timeline> implements Component {
    /**
     * 默认值true,显示策略，可选为：true（显示） | false（隐藏）
     */
    private Boolean show;
    /**
     * 默认为time,模式是时间类型，时间轴间隔根据时间跨度计算，可选为：'number'
     *
     * @see com.github.abel533.echarts.code.TimeLineType
     */
    private TimeLineType type;
    /**
     * 默认值false,时间轴上多个option切换时是否进行merge操作，同setOption第二个参数
     */
    private Boolean notMerge;
    /**
     * 默认值true,拖拽或点击改变时间轴是否实时显示
     */
    private Boolean realtime;
    /**
     * 默认值80，时间轴左上角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    private Object x;
    /**
     * 默认值null,时间轴左上角纵坐标，数值单位px，支持百分比（字符串），
     * 默认无，随y2定位，如'50%'(显示区域纵向中心)
     */
    private Object y;
    /**
     * 默认值80，时间轴右下角横坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域横向中心)
     */
    private Object x2;
    /**
     * 默认值null,时间轴右下角纵坐标，数值单位px，支持百分比（字符串），如'50%'(显示区域纵向中心)
     */
    private Object y2;
    /**
     * 默认值 auto
     * 时间轴宽度，默认为总宽度 - x - x2，数值单位px，指定width后将忽略x2。见下图。
     * 支持百分比（字符串），如'50%'(显示区域一半的宽度)
     */
    private Object width;
    /**
     * 默认值50，时间轴高度，数值单位px，支持百分比（字符串），如'50%'(显示区域一半的高度)
     */
    private Object height;
    /**
     * 背景颜色，默认透明(rgba(0,0,0,0))。
     */
    private String backgroundColor;
    /**
     * 默认值#ccc，边框颜色
     */
    private String borderColor;
    /**
     * 默认值0，边框线宽
     */
    private Integer borderWidth;
    /**
     * 默认值5，内边距，单位px，默认各方向内边距为5，接受数组分别设定上右下左边距，同css，见下图
     */
    private Integer padding;
    /**
     * 默认值left,播放控制器位置，可选为：'left' | 'right' | 'none'
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    private ControlPosition controlPosition;
    /**
     * 默认值false,是否自动播放
     */
    private Boolean autoPlay;
    /**
     * 默认值true,是否循环播放
     */
    private Boolean loop;
    /**
     * 默认值2000，播放时间间隔，单位ms
     */
    private Integer playInterval;
    /**
     * 默认值{color: '#666', width: 1, type: 'dashed'}，时间轴轴线样式lineStyle控制线条样式，
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;
    /**
     * @see com.github.abel533.echarts.Label
     */
    private Label label;
    /**
     * 时间轴当前点
     *
     * @see com.github.abel533.echarts.style.CheckpointStyle
     */
    private CheckpointStyle checkpointStyle;
    /**
     * 时间轴控制器样式，可指定正常和高亮颜色
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    private ControlStyle controlStyle;
    /**
     * 默认值emptyDiamond，轴点symbol，同serie.symbol
     *
     * @see com.github.abel533.echarts.code.Symbol
     * @see com.github.abel533.echarts.series.Series#symbol
     */
    private Object symbol;
    /**
     * 默认值4，轴点symbol，同serie.symbolSize
     */
    private Object symbolSize;
    /**
     * 默认值0，当前索引位置，对应options数组，用于指定显示特定系列
     */
    private Integer currentIndex;

    public Boolean show() {
        return this.show;
    }

    public Timeline show(Boolean show) {
        this.show = show;
        return this;
    }

    public TimeLineType type() {
        return this.type;
    }

    public Timeline type(TimeLineType type) {
        this.type = type;
        return this;
    }

    public Boolean notMerge() {
        return this.notMerge;
    }

    public Timeline notMerge(Boolean notMerge) {
        this.notMerge = notMerge;
        return this;
    }

    public Boolean realtime() {
        return this.realtime;
    }

    public Timeline realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public Object x() {
        return this.x;
    }

    public Timeline x(Object x) {
        this.x = x;
        return this;
    }

    public Object y() {
        return this.y;
    }

    public Timeline y(Object y) {
        this.y = y;
        return this;
    }

    public Object x2() {
        return this.x2;
    }

    public Timeline x2(Object x2) {
        this.x2 = x2;
        return this;
    }

    public Object y2() {
        return this.y2;
    }

    public Timeline y2(Object y2) {
        this.y2 = y2;
        return this;
    }

    public Object width() {
        return this.width;
    }

    public Timeline width(Object width) {
        this.width = width;
        return this;
    }

    public Object height() {
        return this.height;
    }

    public Timeline height(Object height) {
        this.height = height;
        return this;
    }

    public String backgroundColor() {
        return this.backgroundColor;
    }

    public Timeline backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String borderColor() {
        return this.borderColor;
    }

    public Timeline borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Integer borderWidth() {
        return this.borderWidth;
    }

    public Timeline borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public Integer padding() {
        return this.padding;
    }

    public Timeline padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public ControlPosition controlPosition() {
        return this.controlPosition;
    }

    public Timeline controlPosition(ControlPosition controlPosition) {
        this.controlPosition = controlPosition;
        return this;
    }

    public Boolean autoPlay() {
        return this.autoPlay;
    }

    public Timeline autoPlay(Boolean autoPlay) {
        this.autoPlay = autoPlay;
        return this;
    }

    public Boolean loop() {
        return this.loop;
    }

    public Timeline loop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    public Integer playInterval() {
        return this.playInterval;
    }

    public Timeline playInterval(Integer playInterval) {
        this.playInterval = playInterval;
        return this;
    }

    /**
     * 默认值{color: '#666', width: 1, type: 'dashed'}，时间轴轴线样式lineStyle控制线条样式，
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * @see com.github.abel533.echarts.Label
     */
    public Label label() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }

    /**
     * 时间轴当前点
     *
     * @see com.github.abel533.echarts.style.CheckpointStyle
     */
    public CheckpointStyle checkpointStyle() {
        if (this.checkpointStyle == null) {
            this.checkpointStyle = new CheckpointStyle();
        }
        return this.checkpointStyle;
    }

    /**
     * 时间轴控制器样式，可指定正常和高亮颜色
     *
     * @see com.github.abel533.echarts.code.ControlPosition
     */
    public ControlStyle controlStyle() {
        if (this.controlStyle == null) {
            this.controlStyle = new ControlStyle();
        }
        return this.controlStyle;
    }

    public Object symbol() {
        return this.symbol;
    }

    public Timeline symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() {
        return this.symbolSize;
    }

    public Timeline symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Integer currentIndex() {
        return this.currentIndex;
    }

    public Timeline currentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
        return this;
    }

    public LineStyle getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public CheckpointStyle getCheckpointStyle() {
        return checkpointStyle;
    }

    public void setCheckpointStyle(CheckpointStyle checkpointStyle) {
        this.checkpointStyle = checkpointStyle;
    }

    public ControlStyle getControlStyle() {
        return controlStyle;
    }

    public void setControlStyle(ControlStyle controlStyle) {
        this.controlStyle = controlStyle;
    }
}
