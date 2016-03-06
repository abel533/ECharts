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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.Symbol;

import java.io.Serializable;

/**
 * 图形炫光特效
 *
 * @author liuzh
 */
public class Effect implements Serializable {

    private static final long serialVersionUID = 2768587032945006946L;
    /**
     * 特效类型，默认为'scale'（放大），可选还有'bounce'（跳动）
     *
     * @since 2.2.0
     */
    private Type type;
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
    /**
     * 跳动距离，单位为px，type为bounce时有效
     */
    private Integer bounceDistance;
    /**
     * 特效图形的标记
     */
    private Object symbol;
    /**
     * 特效标记的大小，可以设置成诸如 10 这样单一的数字，也可以用数组分开表示高和宽，例如 [20, 10] 表示标记宽为20，高为10
     */
    private Object symbolSize;
    /**
     * 特效尾迹的长度。取从 0 到 1 的值，数值越大尾迹越长
     */
    private Double trailLength;

    /**
     * 获取type值
     */
    public Type type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public Effect type(Type type) {
        this.type = type;
        return this;
    }

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public Effect show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取loop值
     */
    public Boolean loop() {
        return this.loop;
    }

    /**
     * 设置loop值
     *
     * @param loop
     */
    public Effect loop(Boolean loop) {
        this.loop = loop;
        return this;
    }

    /**
     * 获取period值
     */
    public Integer period() {
        return this.period;
    }

    /**
     * 设置period值
     *
     * @param period
     */
    public Effect period(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 获取scaleSize值
     */
    public Integer scaleSize() {
        return this.scaleSize;
    }

    /**
     * 设置scaleSize值
     *
     * @param scaleSize
     */
    public Effect scaleSize(Integer scaleSize) {
        this.scaleSize = scaleSize;
        return this;
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
    public Effect color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 获取shadowColor值
     */
    public String shadowColor() {
        return this.shadowColor;
    }

    /**
     * 设置shadowColor值
     *
     * @param shadowColor
     */
    public Effect shadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
        return this;
    }

    /**
     * 获取shadowBlur值
     */
    public Integer shadowBlur() {
        return this.shadowBlur;
    }

    /**
     * 设置shadowBlur值
     *
     * @param shadowBlur
     */
    public Effect shadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
        return this;
    }

    /**
     * 获取bounceDistance值
     */
    public Integer bounceDistance() {
        return this.bounceDistance;
    }

    /**
     * 设置bounceDistance值
     *
     * @param bounceDistance
     */
    public Effect bounceDistance(Integer bounceDistance) {
        this.bounceDistance = bounceDistance;
        return this;
    }

    public Object symbol() {
        return this.symbol;
    }

    public Effect symbol(Object symbol) {
        this.symbol = symbol;
        return this;
    }

    public Effect symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    public Object symbolSize() {
        return this.symbolSize;
    }

    public Effect symbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Effect symbolSize(Object[] symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public Effect symbolSize(Object width, Object height) {
        this.symbolSize = new Object[]{width, height};
        return this;
    }

    public Double trailLength() {
        return this.trailLength;
    }

    public Effect trailLength(Double trailLength) {
        this.trailLength = trailLength;
        return this;
    }

    /**
     * 获取show值
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * 获取loop值
     */
    public Boolean getLoop() {
        return loop;
    }

    /**
     * 设置loop值
     *
     * @param loop
     */
    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    /**
     * 获取period值
     */
    public Integer getPeriod() {
        return period;
    }

    /**
     * 设置period值
     *
     * @param period
     */
    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * 获取scaleSize值
     */
    public Integer getScaleSize() {
        return scaleSize;
    }

    /**
     * 设置scaleSize值
     *
     * @param scaleSize
     */
    public void setScaleSize(Integer scaleSize) {
        this.scaleSize = scaleSize;
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
     * 获取shadowColor值
     */
    public String getShadowColor() {
        return shadowColor;
    }

    /**
     * 设置shadowColor值
     *
     * @param shadowColor
     */
    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    /**
     * 获取shadowBlur值
     */
    public Integer getShadowBlur() {
        return shadowBlur;
    }

    /**
     * 设置shadowBlur值
     *
     * @param shadowBlur
     */
    public void setShadowBlur(Integer shadowBlur) {
        this.shadowBlur = shadowBlur;
    }

    /**
     * 获取type值
     */
    public Type getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * 获取bounceDistance值
     */
    public Integer getBounceDistance() {
        return bounceDistance;
    }

    /**
     * 设置bounceDistance值
     *
     * @param bounceDistance
     */
    public void setBounceDistance(Integer bounceDistance) {
        this.bounceDistance = bounceDistance;
    }

    public Object getSymbol() {
        return symbol;
    }

    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    public Object getSymbolSize() {
        return symbolSize;
    }

    public void setSymbolSize(Object symbolSize) {
        this.symbolSize = symbolSize;
    }

    public Double getTrailLength() {
        return trailLength;
    }

    public void setTrailLength(Double trailLength) {
        this.trailLength = trailLength;
    }

    public static enum Type {
        scale, bounce
    }
}
