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

	public Boolean show(){
		return this.show;
	}

	public Effect show(Boolean show){
		this.show = show;
		return this;
	}

    /**
     * 循环动画，默认开启
     */
	private Boolean loop;

	public Boolean loop(){
		return this.loop;
	}

	public Effect loop(Boolean loop){
		this.loop = loop;
		return this;
	}

    /**
     * 运动周期，无单位，值越大越慢，默认为15
     */
	private Integer period;

	public Integer period(){
		return this.period;
	}

	public Effect period(Integer period){
		this.period = period;
		return this;
	}

    /**
     * 放大倍数，以markPoint symbolSize为基准
     */
	private Integer scaleSize;

	public Integer scaleSize(){
		return this.scaleSize;
	}

	public Effect scaleSize(Integer scaleSize){
		this.scaleSize = scaleSize;
		return this;
	}

    /**
     * 炫光颜色，默认跟随markPoint itemStyle定义颜色
     */
	private String color;

	public String color(){
		return this.color;
	}

	public Effect color(String color){
		this.color = color;
		return this;
	}

    /**
     * 光影颜色，默认跟随color
     */
	private String shadowColor;

	public String shadowColor(){
		return this.shadowColor;
	}

	public Effect shadowColor(String shadowColor){
		this.shadowColor = shadowColor;
		return this;
	}

    /**
     * 光影模糊度，默认为0
     */
	private Integer shadowBlur;

	public Integer shadowBlur(){
		return this.shadowBlur;
	}

	public Effect shadowBlur(Integer shadowBlur){
		this.shadowBlur = shadowBlur;
		return this;
	}
}
