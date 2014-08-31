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

import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.style.TextStyle;

/**
 * @author liuzh
 */
public class Tooltip extends Basic<Tooltip> implements Component {
    /**
     * 显示策略，可选为：true（显示） | false（隐藏）
     */
    private Boolean show;
    /**
     * tooltip主体内容显示策略，只需tooltip触发事件或显示axisPointer而不需要显示内容时可配置该项为falase，
     * 可选为：true（显示） | false（隐藏）
     */
    private Boolean showContent;
    /**
     * 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
     *
     * @see com.github.abel533.echarts.code.Trigger
     */
    private Trigger trigger;
    /**
     *
     */
    private Object position;
    /**
     * 位置指定，传入{Array}，如[x, y]， 固定位置[x, y]；传入{Function}，如function([x, y]) {return [newX,newY]}，默认显示坐标为输入参数，用户指定的新坐标为输出返回。
     */
    private Object formatter;
    /**
     * 内容格式器：{string}（Template） | {Function}，支持异步回调见表格下方
     */
    private String islandFormatter;
    /**
     * 默认20，显示延迟，添加显示延迟可以避免频繁切换，特别是在详情内容需要异步获取的场景，单位ms
     */
    private Integer showDelay;
    /**
     * 默认100，隐藏延迟，单位ms
     */
    private Integer hideDelay;
    /**
     * 动画变换时长，单位s，如果你希望tooltip的跟随实时响应，showDelay设置为0是关键，同时transitionDuration设0也会有交互体验上的差别
     */
    private Double transitionDuration;
    /**
     * 提示边框圆角，单位px，默认为4
     */
    private Integer borderRadius;
    /**
     * 坐标轴指示器，坐标轴触发有效
     */
    private AxisPointer axisPointer;
    /**
     * 文本样式，默认为白色字体
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;

    public Tooltip axisPointer(AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
        return this;
    }

    public Tooltip textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Boolean show() {
        return this.show;
    }

    public Tooltip show(Boolean show) {
        this.show = show;
        return this;
    }

    public Boolean showContent() {
        return this.showContent;
    }

    public Tooltip showContent(Boolean showContent) {
        this.showContent = showContent;
        return this;
    }

    public Trigger trigger() {
        return this.trigger;
    }

    public Tooltip trigger(Trigger trigger) {
        this.trigger = trigger;
        return this;
    }

    public Object position() {
        return this.position;
    }

    public Tooltip position(Object position) {
        this.position = position;
        return this;
    }

    public Object formatter() {
        return this.formatter;
    }

    public Tooltip formatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    public String islandFormatter() {
        return this.islandFormatter;
    }

    public Tooltip islandFormatter(String islandFormatter) {
        this.islandFormatter = islandFormatter;
        return this;
    }

    public Integer showDelay() {
        return this.showDelay;
    }

    public Tooltip showDelay(Integer showDelay) {
        this.showDelay = showDelay;
        return this;
    }

    public Integer hideDelay() {
        return this.hideDelay;
    }

    public Tooltip hideDelay(Integer hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }

    public Double transitionDuration() {
        return this.transitionDuration;
    }

    public Tooltip transitionDuration(Double transitionDuration) {
        this.transitionDuration = transitionDuration;
        return this;
    }

    public Integer borderRadius() {
        return this.borderRadius;
    }

    public Tooltip borderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    /**
     * 坐标轴指示器，坐标轴触发有效
     */
    public AxisPointer axisPointer() {
        if (this.axisPointer == null) {
            this.axisPointer = new AxisPointer();
        }
        return this.axisPointer;
    }

    /**
     * 文本样式，默认为白色字体
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getShowContent() {
        return showContent;
    }

    public void setShowContent(Boolean showContent) {
        this.showContent = showContent;
    }

    public Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(Trigger trigger) {
        this.trigger = trigger;
    }

    public Object getPosition() {
        return position;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    public Object getFormatter() {
        return formatter;
    }

    public void setFormatter(Object formatter) {
        this.formatter = formatter;
    }

    public String getIslandFormatter() {
        return islandFormatter;
    }

    public void setIslandFormatter(String islandFormatter) {
        this.islandFormatter = islandFormatter;
    }

    public Integer getShowDelay() {
        return showDelay;
    }

    public void setShowDelay(Integer showDelay) {
        this.showDelay = showDelay;
    }

    public Integer getHideDelay() {
        return hideDelay;
    }

    public void setHideDelay(Integer hideDelay) {
        this.hideDelay = hideDelay;
    }

    public Double getTransitionDuration() {
        return transitionDuration;
    }

    public void setTransitionDuration(Double transitionDuration) {
        this.transitionDuration = transitionDuration;
    }

    public Integer getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(Integer borderRadius) {
        this.borderRadius = borderRadius;
    }

    public AxisPointer getAxisPointer() {
        return axisPointer;
    }

    public void setAxisPointer(AxisPointer axisPointer) {
        this.axisPointer = axisPointer;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }
}
