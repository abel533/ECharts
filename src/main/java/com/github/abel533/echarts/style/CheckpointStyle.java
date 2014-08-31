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

/**
 * 时间轴当前点，该类只在Timeline中使用
 *
 * @author liuzh
 */
public class CheckpointStyle {
    /**
     * 当前点symbol，默认随轴上的symbol
     */
	private Object symbol;

	public Object symbol(){
		return this.symbol;
	}

	public CheckpointStyle symbol(Object symbol){
		this.symbol = symbol;
		return this;
	}

    /**
     * 当前点symbol大小，默认随轴上symbol大小
     */
	private Object symbolSize;

	public Object symbolSize(){
		return this.symbolSize;
	}

	public CheckpointStyle symbolSize(Object symbolSize){
		this.symbolSize = symbolSize;
		return this;
	}

    /**
     * 当前点symbol颜色，默认为随当前点颜色，可指定具体颜色，如无则为'#1e90ff'
     */
	private String color;

	public String color(){
		return this.color;
	}

	public CheckpointStyle color(String color){
		this.color = color;
		return this;
	}

    /**
     * 当前点symbol边线颜色
     */
	private String borderColor;

	public String borderColor(){
		return this.borderColor;
	}

	public CheckpointStyle borderColor(String borderColor){
		this.borderColor = borderColor;
		return this;
	}

    /**
     * 当前点symbol边线宽度
     */
	private Object borderWidth;

	public Object borderWidth(){
		return this.borderWidth;
	}

	public CheckpointStyle borderWidth(Object borderWidth){
		this.borderWidth = borderWidth;
		return this;
	}

    /**
     * @see com.github.abel533.echarts.Label
     */
    private Label label;

    /**
     * @see com.github.abel533.echarts.Label
     */
    public Label label(){
        if (this.label == null) {
            this.label = new Label();
        }
        return this.label;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
