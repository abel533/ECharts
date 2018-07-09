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

package com.github.abel533.echarts.style;

import com.github.abel533.echarts.code.X;
import lombok.Getter;
import lombok.Setter;

/**
 * 图形元素样式
 *
 * @author liuxu
 * @date 18-7-9下午2:57
 */
@Getter
@Setter
public class GraphicStyle {

    /**
     * 文本
     */
    private String text;

    /**
     * 文本排列
     */
    private X textAlign;

    /**
     *文本填充颜色
     */
    private String fill;

    /**
     * 宽
     */
    private Object width;

    /**
     * 高
     */
    private Object height;

    
    public GraphicStyle text(String text) {
        this.text = text;
        return this;
    }

    
    public GraphicStyle textAlign(X textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    
    public GraphicStyle fill(String fill) {
        this.fill = fill;
        return this;
    }

    
    public GraphicStyle width(Object width) {
        this.width = width;
        return this;
    }

    
    public GraphicStyle height(Object height) {
        this.height = height;
        return this;
    }
    
}
