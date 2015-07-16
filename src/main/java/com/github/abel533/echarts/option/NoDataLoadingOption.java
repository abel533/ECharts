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

package com.github.abel533.echarts.option;

import com.github.abel533.echarts.code.LoadingEffect;
import com.github.abel533.echarts.style.TextStyle;

/**
 * 描述信息
 *
 * @author liuzh
 * @since 2015-07-16
 */
public class NoDataLoadingOption {
    private String text;
    private Object x;
    private Object y;
    /**
     * 显示话术的文本样式
     */
    private TextStyle textStyle;
    /**
     * loading效果，可以参考LoadingEffect
     */
    private Object effect;
    /**
     * loading效果选项，详见zrender
     */
    private EffectOption effectOption;
    /**
     * 指定当前进度[0~1]，个别效果有效
     */
    private Integer progress;

    public String text() {
        return this.text;
    }

    public NoDataLoadingOption text(String text) {
        this.text = text;
        return this;
    }

    public Object x() {
        return this.x;
    }

    public NoDataLoadingOption x(Object x) {
        this.x = x;
        return this;
    }

    public Object y() {
        return this.y;
    }

    public NoDataLoadingOption y(Object y) {
        this.y = y;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public NoDataLoadingOption textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Object effect() {
        return this.effect;
    }

    public NoDataLoadingOption effect(Object effect) {
        this.effect = effect;
        return this;
    }

    public NoDataLoadingOption effect(LoadingEffect effect) {
        this.effect = effect;
        return this;
    }

    public EffectOption effectOption() {
        if (this.effectOption == null) {
            this.effectOption = new EffectOption();
        }
        return this.effectOption;
    }

    public NoDataLoadingOption effectOption(EffectOption effectOption) {
        this.effectOption = effectOption;
        return this;
    }

    public Integer progress() {
        return this.progress;
    }

    public NoDataLoadingOption progress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public Object getEffect() {
        return effect;
    }

    public void setEffect(Object effect) {
        this.effect = effect;
    }

    public EffectOption getEffectOption() {
        return effectOption;
    }

    public void setEffectOption(EffectOption effectOption) {
        this.effectOption = effectOption;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}
