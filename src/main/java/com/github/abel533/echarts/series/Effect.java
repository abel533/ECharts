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

package com.github.abel533.echarts.series;

/**
 * 图形炫光特效
 *
 * @author liuzh
 */
public class Effect {
    /**
     * 是否开启，默认关闭
     */
    private Boolean show;
    /**
     * 循环动画，默认开启
     */
    private Boolean loop;
    /**
     * 运动周期，无单位，值越大越慢，默认为15
     */
    private Integer period;
    /**
     * 放大倍数，以markPoint symbolSize为基准
     */
    private Integer scaleSize;
    /**
     * 炫光颜色，默认跟随markPoint itemStyle定义颜色
     */
    private String color;
    /**
     * 光影颜色，默认跟随color
     */
    private String shadowColor;
    /**
     * 光影模糊度，默认为0
     */
    private Integer shadowBlur;

    public Boolean show() {
        return this.show;
    }

    public Effect show(Boolean show) {
        this.show = show;
        return this;
    }

    public Boolean loop() {
        return this.loop;
    }

    public Effect loop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    public Integer period() {
        return this.period;
    }

    public Effect period(Integer period) {
        this.period = period;
        return this;
    }

    public Integer scaleSize() {
        return this.scaleSize;
    }

    public Effect scaleSize(Integer scaleSize) {
        this.scaleSize = scaleSize;
        return this;
    }

    public String color() {
        return this.color;
    }

    public Effect color(String color) {
        this.color = color;
        return this;
    }

    public String shadowColor() {
        return this.shadowColor;
    }

    public Effect shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    public Integer shadowBlur() {
        return this.shadowBlur;
    }

    public Effect shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getLoop() {
        return loop;
    }

    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getScaleSize() {
        return scaleSize;
    }

    public void setScaleSize(Integer scaleSize) {
        this.scaleSize = scaleSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShadowColor() {
        return shadowColor;
    }

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    public Integer getShadowBlur() {
        return shadowBlur;
    }

    public void setShadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
    }
}
