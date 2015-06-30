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

package com.github.abel533.echarts.style.itemstyle;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.LabelLine;
import com.github.abel533.echarts.style.*;

import java.io.Serializable;

/**
 * @author liuzh
 */
public abstract class Style<T> implements Serializable {

    private static final long serialVersionUID = -3920258078225722832L;

    /**
     * 标签，饼图默认显示在外部，离饼图距离由labelLine.length决定，地图标签不可指定位置
     * 折线图，柱形图，K线图，散点图可指定position见下
     *
     * @see com.github.abel533.echarts.Label
     */
    private Label label;
    /**
     * 饼图标签视觉引导线，默认显示
     *
     * @see com.github.abel533.echarts.LabelLine
     */
    private LabelLine labelLine;
    /**
     * 阳线颜色
     */
    private String color;
    /**
     * 阴线颜色
     */
    private String color0;
    /**
     * 线条样式
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;
    /**
     * 区域样式
     *
     * @see com.github.abel533.echarts.style.AreaStyle
     */
    private AreaStyle areaStyle;
    /**
     * 和弦图 - 弦样式
     *
     * @see com.github.abel533.echarts.style.ChordStyle
     */
    private ChordStyle chordStyle;
    /**
     * 力导向图 - 弦样式
     *
     * @see com.github.abel533.echarts.style.NodeStyle
     */
    private NodeStyle nodeStyle;
    /**
     * 力导向图 - 弦样式
     *
     * @see com.github.abel533.echarts.style.LinkStyle
     */
    private LinkStyle linkStyle;
    /**
     * 边框颜色
     */
    private String borderColor;
    /**
     * 边框圆角，单位px，默认为0
     */
    private Integer borderRadius;
    /**
     * 边框线宽，单位px，默认为1
     */
    private Integer borderWidth;
    /**
     * 柱形边框颜色
     */
    private String barBorderColor;
    /**
     * 柱形边框圆角，单位px，默认为0
     */
    private Integer barBorderRadius;
    /**
     * 柱形边框线宽，单位px，默认为1
     */
    private Integer barBorderWidth;

    /**
     * 设置label值
     *
     * @param label
     */
    public T label(Label label) {
        this.label = label;
        return (T) this;
    }

    /**
     * 设置labelLine值
     *
     * @param labelLine
     */
    public T labelLine(LabelLine labelLine) {
        this.labelLine = labelLine;
        return (T) this;
    }

    /**
     * 设置areaStyle值
     *
     * @param areaStyle
     */
    public T areaStyle(AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
        return (T) this;
    }

    /**
     * 设置chordStyle值
     *
     * @param chordStyle
     */
    public T chordStyle(ChordStyle chordStyle) {
        this.chordStyle = chordStyle;
        return (T) this;
    }

    /**
     * 设置nodeStyle值
     *
     * @param nodeStyle
     */
    public T nodeStyle(NodeStyle nodeStyle) {
        this.nodeStyle = nodeStyle;
        return (T) this;
    }

    /**
     * 设置linkStyle值
     *
     * @param linkStyle
     */
    public T linkStyle(LinkStyle linkStyle) {
        this.linkStyle = linkStyle;
        return (T) this;
    }

    /**
     * 标签，饼图默认显示在外部，离饼图距离由labelLine.length决定，地图标签不可指定位置
     * 折线图，柱形图，K线图，散点图可指定position见下
     *
     * @see com.github.abel533.echarts.Label
     */
    public Label label() {
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }

    /**
     * 饼图标签视觉引导线，默认显示
     *
     * @see com.github.abel533.echarts.LabelLine
     */
    public LabelLine labelLine() {
        if (this.labelLine == null) {
            this.labelLine = new LabelLine();
        }
        return this.labelLine;
    }

    /**
     * 获取color值
     */
    public String color() {
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public T color(String color) {
        this.color = color;
        return (T) this;
    }

    /**
     * 获取color0值
     */
    public String color0() {
        return this.color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public T color0(String color0) {
        this.color0 = color0;
        return (T) this;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public T lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return (T) this;
    }

    /**
     * 线条样式
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
     * 区域样式
     *
     * @see com.github.abel533.echarts.style.AreaStyle
     */
    public AreaStyle areaStyle() {
        if (this.areaStyle == null) {
            this.areaStyle = new AreaStyle();
        }
        return this.areaStyle;
    }

    /**
     * 和弦图 - 弦样式
     *
     * @see com.github.abel533.echarts.style.ChordStyle
     */
    public ChordStyle chordStyle() {
        if (this.chordStyle == null) {
            this.chordStyle = new ChordStyle();
        }
        return this.chordStyle;
    }

    /**
     * 力导向图 - 弦样式
     *
     * @see com.github.abel533.echarts.style.NodeStyle
     */
    public NodeStyle nodeStyle() {
        if (this.nodeStyle == null) {
            this.nodeStyle = new NodeStyle();
        }
        return this.nodeStyle;
    }

    /**
     * 力导向图 - 弦样式
     *
     * @see com.github.abel533.echarts.style.LinkStyle
     */
    public LinkStyle linkStyle() {
        if (this.linkStyle == null) {
            this.linkStyle = new LinkStyle();
        }
        return this.linkStyle;
    }

    /**
     * 获取borderColor值
     */
    public String borderColor() {
        return this.borderColor;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public T borderColor(String borderColor) {
        this.borderColor = borderColor;
        return (T) this;
    }

    /**
     * 获取borderRadius值
     */
    public Integer borderRadius() {
        return this.borderRadius;
    }

    /**
     * 设置borderRadius值
     *
     * @param borderRadius
     */
    public T borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return (T) this;
    }

    /**
     * 获取borderWidth值
     */
    public Integer borderWidth() {
        return this.borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public T borderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
        return (T) this;
    }

    /**
     * 获取barBorderColor值
     */
    public String barBorderColor() {
        return this.barBorderColor;
    }

    /**
     * 设置barBorderColor值
     *
     * @param barBorderColor
     */
    public T barBorderColor(String barBorderColor) {
        this.barBorderColor = barBorderColor;
        return (T) this;
    }

    /**
     * 获取barBorderRadius值
     */
    public Integer barBorderRadius() {
        return this.barBorderRadius;
    }

    /**
     * 设置barBorderRadius值
     *
     * @param barBorderRadius
     */
    public T barBorderRadius(Integer barBorderRadius) {
        this.barBorderRadius = barBorderRadius;
        return (T) this;
    }

    /**
     * 获取barBorderWidth值
     */
    public Integer barBorderWidth() {
        return this.barBorderWidth;
    }

    /**
     * 设置barBorderWidth值
     *
     * @param barBorderWidth
     */
    public T barBorderWidth(Integer barBorderWidth) {
        this.barBorderWidth = barBorderWidth;
        return (T) this;
    }

    /**
     * 获取label值
     */
    public Label getLabel() {
        return label;
    }

    /**
     * 设置label值
     *
     * @param label
     */
    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * 获取labelLine值
     */
    public LabelLine getLabelLine() {
        return labelLine;
    }

    /**
     * 设置labelLine值
     *
     * @param labelLine
     */
    public void setLabelLine(LabelLine labelLine) {
        this.labelLine = labelLine;
    }

    /**
     * 获取areaStyle值
     */
    public AreaStyle getAreaStyle() {
        return areaStyle;
    }

    /**
     * 设置areaStyle值
     *
     * @param areaStyle
     */
    public void setAreaStyle(AreaStyle areaStyle) {
        this.areaStyle = areaStyle;
    }

    /**
     * 获取chordStyle值
     */
    public ChordStyle getChordStyle() {
        return chordStyle;
    }

    /**
     * 设置chordStyle值
     *
     * @param chordStyle
     */
    public void setChordStyle(ChordStyle chordStyle) {
        this.chordStyle = chordStyle;
    }

    /**
     * 获取nodeStyle值
     */
    public NodeStyle getNodeStyle() {
        return nodeStyle;
    }

    /**
     * 设置nodeStyle值
     *
     * @param nodeStyle
     */
    public void setNodeStyle(NodeStyle nodeStyle) {
        this.nodeStyle = nodeStyle;
    }

    /**
     * 获取linkStyle值
     */
    public LinkStyle getLinkStyle() {
        return linkStyle;
    }

    /**
     * 设置linkStyle值
     *
     * @param linkStyle
     */
    public void setLinkStyle(LinkStyle linkStyle) {
        this.linkStyle = linkStyle;
    }

    /**
     * 获取color值
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取color0值
     */
    public String getColor0() {
        return color0;
    }

    /**
     * 设置color0值
     *
     * @param color0
     */
    public void setColor0(String color0) {
        this.color0 = color0;
    }

    /**
     * 获取lineStyle值
     */
    public LineStyle getLineStyle() {
        return lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    /**
     * 获取borderColor值
     */
    public String getBorderColor() {
        return borderColor;
    }

    /**
     * 设置borderColor值
     *
     * @param borderColor
     */
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * 获取borderRadius值
     */
    public Integer getBorderRadius() {
        return borderRadius;
    }

    /**
     * 设置borderRadius值
     *
     * @param borderRadius
     */
    public void setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
    }

    /**
     * 获取borderWidth值
     */
    public Integer getBorderWidth() {
        return borderWidth;
    }

    /**
     * 设置borderWidth值
     *
     * @param borderWidth
     */
    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * 获取barBorderColor值
     */
    public String getBarBorderColor() {
        return barBorderColor;
    }

    /**
     * 设置barBorderColor值
     *
     * @param barBorderColor
     */
    public void setBarBorderColor(String barBorderColor) {
        this.barBorderColor = barBorderColor;
    }

    /**
     * 获取barBorderRadius值
     */
    public Integer getBarBorderRadius() {
        return barBorderRadius;
    }

    /**
     * 设置barBorderRadius值
     *
     * @param barBorderRadius
     */
    public void setBarBorderRadius(Integer barBorderRadius) {
        this.barBorderRadius = barBorderRadius;
    }

    /**
     * 获取barBorderWidth值
     */
    public Integer getBarBorderWidth() {
        return barBorderWidth;
    }

    /**
     * 设置barBorderWidth值
     *
     * @param barBorderWidth
     */
    public void setBarBorderWidth(Integer barBorderWidth) {
        this.barBorderWidth = barBorderWidth;
    }
}
