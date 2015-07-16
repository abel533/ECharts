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

import com.github.abel533.echarts.style.TextStyle;

/**
 * loading参数
 *
 * @author liuzh
 * @since 2015-07-16
 */
public class EffectOption {
    private Object effect;
    private Integer progress;
    private TextStyle textStyle;

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
	public EffectOption effect(Object effect) {
        this.effect = effect;
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
	public EffectOption progress(Integer progress) {
        this.progress = progress;
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
	public EffectOption textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
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
}
