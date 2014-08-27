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

    public abstract class Style {
        /**
         * 标签，饼图默认显示在外部，离饼图距离由labelLine.length决定，地图标签不可指定位置
         * 折线图，柱形图，K线图，散点图可指定position见下
         *
         * @see com.github.abel533.echarts.Label
         */
        public Label label;

        /**
         * 饼图标签视觉引导线，默认显示
         *
         * @see com.github.abel533.echarts.LabelLine
         */
        public LabelLine labelLine;

        /**
         * 阳线颜色
         */
        public String color;

        /**
         * 阴线颜色
         */
        public String color0;

        /**
         * 线条样式
         *
         * @see com.github.abel533.echarts.style.LineStyle
         */
        public LineStyle lineStyle;

        public LineStyle lineStyle() {
            if (this.lineStyle == null) {
                this.lineStyle = new LineStyle();
            }
            return this.lineStyle;
        }

        ;

        /**
         * 区域样式
         *
         * @see com.github.abel533.echarts.style.AreaStyle
         */
        public AreaStyle areaStyle;

        /**
         * 和弦图 - 弦样式
         *
         * @see com.github.abel533.echarts.style.ChordStyle
         */
        public ChordStyle chordStyle;

        /**
         * 力导向图 - 弦样式
         *
         * @see com.github.abel533.echarts.style.NodeStyle
         */
        public NodeStyle nodeStyle;

        /**
         * 力导向图 - 弦样式
         *
         * @see com.github.abel533.echarts.style.LinkStyle
         */
        public LinkStyle linkStyle;

        /**
         * 柱形边框颜色
         */
        public String borderColor;

        /**
         * 柱形边框圆角，单位px，默认为0
         */
        public Integer borderRadius;

        /**
         * 柱形边框线宽，单位px，默认为1
         */
        public Integer borderWidth;
    }

    public class Normal extends Style {
    }

    public class Emphasis extends Style {
    }

    /**
     * 默认样式
     */
    public Normal normal;

    /**
     * 强调样式（悬浮时样式）
     */
    public Emphasis emphasis;

    public ItemStyle() {
        this.normal = new Normal();
        this.emphasis = new Emphasis();
    }
}
