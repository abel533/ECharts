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

import com.github.abel533.echarts.style.itemstyle.Emphasis;
import com.github.abel533.echarts.style.itemstyle.Normal;

/**
 * Description: ItemStyle
 *
 * @author liuzh
 */
public class ItemStyle {

    /**
     * 默认样式
     */
    private Normal normal;
    /**
     * 强调样式（悬浮时样式）
     */
    private Emphasis emphasis;

    public Normal normal() {
        if (this.normal == null) {
            this.normal = new Normal();
        }
        return this.normal;
    }

    public ItemStyle normal(Normal normal) {
        this.normal = normal;
        return this;
    }

    public Emphasis emphasis() {
        if (this.emphasis == null) {
            this.emphasis = new Emphasis();
        }
        return this.emphasis;
    }

    public ItemStyle emphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
        return this;
    }

    public Normal getNormal() {
        return normal;
    }

    public void setNormal(Normal normal) {
        this.normal = normal;
    }

    public Emphasis getEmphasis() {
        return emphasis;
    }

    public void setEmphasis(Emphasis emphasis) {
        this.emphasis = emphasis;
    }
}
