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
import com.github.abel533.echarts.code.Symbol;

/**
 * Description: 该类只在Timeline中使用
 * Author: liuzh
 * Update: liuzh(2014-08-26 13:52)
 */
public class CheckpointStyle {
    /**
     * 当前点symbol，默认随轴上的symbol
     */
    public Object symbol;

    /**
     * 当前点symbol大小，默认随轴上symbol大小
     */
    public Object symbolSize;

    /**
     * 当前点symbol颜色，默认为随当前点颜色，可指定具体颜色，如无则为'#1e90ff'
     */
    public String color;

    /**
     * 当前点symbol边线颜色
     */
    public String borderColor;

    /**
     * 当前点symbol边线宽度
     */
    public Object borderWidth;

    /**
     * @see com.github.abel533.echarts.Label
     */
    public Label label;

    public CheckpointStyle() {
        this.symbol = Symbol.auto;
        this.symbolSize = "auto";
        this.color = "auto";
        this.borderColor = "auto";
        this.borderWidth = "auto";
        this.label = new Label();
        this.label.show = true;
        this.label.interval = "auto";
        this.label.rotate = 0;
        this.label.textStyle = new TextStyle();
        this.label.textStyle.color = "#333";
        this.label.show = false;
        this.label.interval = null;
        this.label.rotate = null;
    }
}
