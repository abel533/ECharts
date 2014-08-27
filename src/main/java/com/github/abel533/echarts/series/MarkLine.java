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

import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: MarkLine
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:00)
 */
public class MarkLine {
    public Object symbol;
    public Object symbolSize;
    public Object symbolRoate;
    public Effect effect;
    public ItemStyle itemStyle;
    public Map geoCoord;
    public List<Object> data;

    public MarkLine() {
        this.symbol = new Object[]{Symbol.circle, Symbol.arrow};
        this.symbolSize = new Integer[]{2, 4};
        this.effect = new Effect();
        this.itemStyle = new ItemStyle();
        this.geoCoord = new HashMap();

        this.data = new ArrayList<Object>();
    }
}
