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

import com.github.abel533.echarts.style.TextStyle;
import org.codehaus.jackson.annotate.JsonRawValue;

/**
 * Description: Label
 *
 * @author liuzh
 */
public class Label {
    /**
     * 是否显示，在Timeline中默认true
     */
    private Boolean show;
    private Object position;
    /**
     * 挑选间隔，默认为'auto'，可选为：'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}
     */
    private Object interval;
    /**
     * rotate : 旋转角度，默认为0，不旋转，正值为逆时针，负值为顺时针，可选为：-90 ~ 90
     */
    private Integer rotate;
    /**
     * [Axis有效]坐标轴文本标签是否可点击
     */
    private Boolean clickable;
    /**
     * 间隔名称格式器：{string}（Template） | {Function}
     */
    @JsonRawValue
    private Object formatter;
    /**
     * 文字样式（详见{@link com.github.abel533.echarts.style.TextStyle}）
     */
    private TextStyle textStyle;
    /**
     * 坐标轴文本标签与坐标轴的间距
     */
    private Integer margin;

    public Label textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Boolean show() {
        return this.show;
    }

    public Label show(Boolean show) {
        this.show = show;
        return this;
    }

    public Object position() {
        return this.position;
    }

    public Label position(Object position) {
        this.position = position;
        return this;
    }

    public Object interval() {
        return this.interval;
    }

    public Label interval(Object interval) {
        this.interval = interval;
        return this;
    }

    public Integer rotate() {
        return this.rotate;
    }

    public Label rotate(Integer rotate) {
        this.rotate = rotate;
        return this;
    }

    public Boolean clickable() {
        return this.clickable;
    }

    public Label clickable(Boolean clickable) {
        this.clickable = clickable;
        return this;
    }

    public Object formatter() {
        return this.formatter;
    }

    public Label formatter(Object formatter) {
        if (formatter instanceof Function) {
            this.formatter = ((Function) formatter).getScript();
        } else {
            this.formatter = "\"" + formatter + "\"";
        }
        return this;
    }

    /**
     * 文字样式（详见{@link com.github.abel533.echarts.style.TextStyle}）
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public Integer margin() {
        return this.margin;
    }

    public Label margin(Integer margin) {
        this.margin = margin;
        return this;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Object getPosition() {
        return position;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    public Object getInterval() {
        return interval;
    }

    public void setInterval(Object interval) {
        this.interval = interval;
    }

    public Integer getRotate() {
        return rotate;
    }

    public void setRotate(Integer rotate) {
        this.rotate = rotate;
    }

    public Boolean getClickable() {
        return clickable;
    }

    public void setClickable(Boolean clickable) {
        this.clickable = clickable;
    }

    public Object getFormatter() {
        return formatter;
    }

    public void setFormatter(Object formatter) {
        if (formatter instanceof Function) {
            this.formatter = ((Function) formatter).getScript();
        } else {
            this.formatter = "\"" + formatter + "\"";
        }
    }

    public Integer getMargin() {
        return margin;
    }

    public void setMargin(Integer margin) {
        this.margin = margin;
    }
}
