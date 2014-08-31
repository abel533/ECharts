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

/**
 * 时间轴控制器样式
 *
 * @author liuzh
 */
public class ControlStyle {
    public class Color {
        /**
         * 时间轴控制器样式颜色
         */
        private String color;

        public String color(){
            return this.color;
        }

        public Color color(String color){
            this.color = color;
            return this;
        }
    }

    /**
     * 正常
     */
	private Color normal;

	public Color normal(){
		return this.normal;
	}

	public ControlStyle normal(Color normal){
		this.normal = normal;
		return this;
	}

    /**
     * 高亮
     */
	private Color emphasis;

	public Color emphasis(){
		return this.emphasis;
	}

	public ControlStyle emphasis(Color emphasis){
		this.emphasis = emphasis;
		return this;
	}

    public ControlStyle() {
        this.normal = new Color();
        this.emphasis = new Color();
    }
}
