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

import com.github.abel533.echarts.code.EffectType;
import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.code.ShowEffectOn;
import com.github.abel533.echarts.series.other.RippleEffect;

/**
 * 带有涟漪特效动画的散点（气泡）图
 *
 * @author liuzh
 */
public class EffectScatter extends Series<EffectScatter> {
    /**
     * 特效类型
     */
    private Object effectType;
    /**
     * 配置何时显示特效
     */
    private Object showEffectOn;
    /**
     * 涟漪特效相关配置
     */
    private RippleEffect rippleEffect;

    /**
     * 构造函数
     */
    public EffectScatter() {
        this.type(SeriesType.effectScatter);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public EffectScatter(String name) {
        super(name);
        this.type(SeriesType.effectScatter);
    }

    public Object effectType() {
        return this.effectType;
    }

    public EffectScatter effectType(Object effectType) {
        this.effectType = effectType;
        return this;
    }

    public EffectScatter effectType(EffectType effectType) {
        this.effectType = effectType;
        return this;
    }

    public Object showEffectOn() {
        return this.showEffectOn;
    }

    public EffectScatter showEffectOn(Object showEffectOn) {
        this.showEffectOn = showEffectOn;
        return this;
    }

    public EffectScatter showEffectOn(ShowEffectOn showEffectOn) {
        this.showEffectOn = showEffectOn;
        return this;
    }

    public RippleEffect rippleEffect() {
        return this.rippleEffect;
    }

    public EffectScatter rippleEffect(RippleEffect rippleEffect) {
        this.rippleEffect = rippleEffect;
        return this;
    }

    public Object getEffectType() {
        return effectType;
    }

    public void setEffectType(Object effectType) {
        this.effectType = effectType;
    }

    public Object getShowEffectOn() {
        return showEffectOn;
    }

    public void setShowEffectOn(Object showEffectOn) {
        this.showEffectOn = showEffectOn;
    }

    public RippleEffect getRippleEffect() {
        return rippleEffect;
    }

    public void setRippleEffect(RippleEffect rippleEffect) {
        this.rippleEffect = rippleEffect;
    }

}
