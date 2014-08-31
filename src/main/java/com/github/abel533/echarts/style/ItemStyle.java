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

package com.github.abel533.echarts.style;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.LabelLine;

/**
 * Description: ItemStyle
 *
 * @author liuzh
 */
public class ItemStyle {

    /**
     * 默认样式
     */
    private Normal normal;
    /**
     * 强调样式（悬浮时样式）
     */
    private Emphasis emphasis;

    public ItemStyle() {
        this.normal = new Normal();
        this.emphasis = new Emphasis();
    }

    public Normal normal() {
        return this.normal;
    }

    public ItemStyle normal(Normal normal) {
        this.normal = normal;
        return this;
    }

    public Emphasis emphasis() {
        return this.emphasis;
    }

    public ItemStyle emphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public abstract class Style {
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
         * 柱形边框颜色
         */
        private String borderColor;
        /**
         * 柱形边框圆角，单位px，默认为0
         */
        private Integer borderRadius;
        /**
         * 柱形边框线宽，单位px，默认为1
         */
        private Integer borderWidth;

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

        public String color() {
            return this.color;
        }

        public Style color(String color) {
            this.color = color;
            return this;
        }

        public String color0() {
            return this.color0;
        }

        public Style color0(String color0) {
            this.color0 = color0;
            return this;
        }

        public Style lineStyle(LineStyle lineStyle) {
            this.lineStyle = lineStyle;
            return this;
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

        public String borderColor() {
            return this.borderColor;
        }

        public Style borderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Integer borderRadius() {
            return this.borderRadius;
        }

        public Style borderRadius(Integer borderRadius) {
            this.borderRadius = borderRadius;
            return this;
        }

        public Integer borderWidth() {
            return this.borderWidth;
        }

        public Style borderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public Label getLabel() {
            return label;
        }

        public void setLabel(Label label) {
            this.label = label;
        }

        public LabelLine getLabelLine() {
            return labelLine;
        }

        public void setLabelLine(LabelLine labelLine) {
            this.labelLine = labelLine;
        }

        public AreaStyle getAreaStyle() {
            return areaStyle;
        }

        public void setAreaStyle(AreaStyle areaStyle) {
            this.areaStyle = areaStyle;
        }

        public ChordStyle getChordStyle() {
            return chordStyle;
        }

        public void setChordStyle(ChordStyle chordStyle) {
            this.chordStyle = chordStyle;
        }

        public NodeStyle getNodeStyle() {
            return nodeStyle;
        }

        public void setNodeStyle(NodeStyle nodeStyle) {
            this.nodeStyle = nodeStyle;
        }

        public LinkStyle getLinkStyle() {
            return linkStyle;
        }

        public void setLinkStyle(LinkStyle linkStyle) {
            this.linkStyle = linkStyle;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor0() {
            return color0;
        }

        public void setColor0(String color0) {
            this.color0 = color0;
        }

        public LineStyle getLineStyle() {
            return lineStyle;
        }

        public void setLineStyle(LineStyle lineStyle) {
            this.lineStyle = lineStyle;
        }

        public String getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(String borderColor) {
            this.borderColor = borderColor;
        }

        public Integer getBorderRadius() {
            return borderRadius;
        }

        public void setBorderRadius(Integer borderRadius) {
            this.borderRadius = borderRadius;
        }

        public Integer getBorderWidth() {
            return borderWidth;
        }

        public void setBorderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
        }
    }

    public class Normal extends Style {
    }

    public class Emphasis extends Style {
    }


}
