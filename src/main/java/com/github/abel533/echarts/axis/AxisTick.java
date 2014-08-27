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

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.style.LineStyle;

/**
 * Created by liuzh on 14-8-26.
 */
public class AxisTick {
    /**
     * 是否显示，默认为false，设为true后下面为默认样式
     */
    public Boolean show;
    /**
     * 小标记显示挑选间隔，默认为'auto'，可选为：
     * 'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}（用户指定选择间隔）
     */
    public Object interval;

    /**
     * 小标记是否显示为间隔，默认等于boundaryGap
     */
    public Boolean onGap;

    /**
     * 小标记是否显示为在grid内部，默认在外部
     */
    public Boolean inside;

    /**
     * 默认值5，属性length控制线长
     */
    public Integer length;

    /**
     * 属性lineStyle控制线条样式，（详见lineStyle）
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle;

    public AxisTick() {
        //this.show = false;
        this.inside = false;
        this.length = 5;
        this.lineStyle = new LineStyle();
        this.lineStyle.color = "#333";
        this.lineStyle.width = 1;
    }
}
