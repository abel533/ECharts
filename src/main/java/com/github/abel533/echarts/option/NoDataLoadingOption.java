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

    /**
     * 获取text值
     */
    public String text() {
        return this.text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public NoDataLoadingOption text(String text) {
        this.text = text;
        return this;
    }

    /**
     * 获取x值
     */
    public Object x() {
        return this.x;
    }

    /**
     * 设置x值
     *
     * @param x
     */
    public NoDataLoadingOption x(Object x) {
        this.x = x;
        return this;
    }

    /**
     * 获取y值
     */
	public Object y() {
        return this.y;
    }

    /**
     * 设置y值
     *
     * @param y
     */
    public NoDataLoadingOption y(Object y) {
        this.y = y;
        return this;
    }

    /**
     * 获取textStyle值
     */
	public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public NoDataLoadingOption textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取effect值
     */
    public Object effect() {
        return this.effect;
    }

    /**
     * 设置effect值
     *
     * @param effect
     */
    public NoDataLoadingOption effect(Object effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 设置effect值
     *
     * @param effect
     */
    public NoDataLoadingOption effect(LoadingEffect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 获取effectOption值
     */
	public EffectOption effectOption() {
        if (this.effectOption == null) {
            this.effectOption = new EffectOption();
        }
        return this.effectOption;
    }

    /**
     * 设置effectOption值
     *
     * @param effectOption
     */
    public NoDataLoadingOption effectOption(EffectOption effectOption) {
        this.effectOption = effectOption;
        return this;
    }

	/**
     * 获取progress值
     */
    public Integer progress() {
        return this.progress;
    }

    /**
     * 设置progress值
     *
     * @param progress
     */
	public NoDataLoadingOption progress(Integer progress) {
        this.progress = progress;
        return this;
    }

	/**
     * 获取text值
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text值
     *
	 * @param text
	 */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取x值
     */
    public Object getX() {
        return x;
    }

	/**
     * 设置x值
	 *
     * @param x
     */
    public void setX(Object x) {
        this.x = x;
    }

    /**
     * 获取y值
     */
    public Object getY() {
        return y;
    }

	/**
     * 设置y值
     *
     * @param y
     */
    public void setY(Object y) {
        this.y = y;
    }

	/**
     * 获取textStyle值
     */
    public TextStyle getTextStyle() {
        return textStyle;
    }

    /**
     * 设置textStyle值
     *
	 * @param textStyle
	 */
	public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

	/**
     * 获取effect值
     */
    public Object getEffect() {
        return effect;
    }

    /**
     * 设置effect值
     *
	 * @param effect
     */
    public void setEffect(Object effect) {
        this.effect = effect;
    }

	/**
     * 获取effectOption值
     */
    public EffectOption getEffectOption() {
        return effectOption;
    }

    /**
     * 设置effectOption值
     *
     * @param effectOption
     */
	public void setEffectOption(EffectOption effectOption) {
        this.effectOption = effectOption;
    }

	/**
     * 获取progress值
     */
    public Integer getProgress() {
        return progress;
    }

    /**
     * 设置progress值
     *
	 * @param progress
	 */
	public void setProgress(Integer progress) {
        this.progress = progress;
    }
}
