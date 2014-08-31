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
    /**
     * 正常
     */
    private Color normal;
    /**
     * 高亮
     */
    private Color emphasis;

    public ControlStyle() {
        this.normal = new Color();
        this.emphasis = new Color();
    }

    public Color normal() {
        return this.normal;
    }

    public ControlStyle normal(Color normal) {
        this.normal = normal;
        return this;
    }

    public Color emphasis() {
        return this.emphasis;
    }

    public ControlStyle emphasis(Color emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public Color getNormal() {
        return normal;
    }

    public void setNormal(Color normal) {
        this.normal = normal;
    }

    public Color getEmphasis() {
        return emphasis;
    }

    public void setEmphasis(Color emphasis) {
        this.emphasis = emphasis;
    }

    public class Color {
        /**
         * 时间轴控制器样式颜色
         */
        private String color;

        public String color() {
            return this.color;
        }

        public Color color(String color) {
            this.color = color;
            return this;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
