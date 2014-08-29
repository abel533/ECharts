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

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.code.Sort;

/**
 * Description: Chord
 *
 * @author liuzh
 */
public class Chord extends Series {
    /**
     * 每个sector之间的间距(用角度表示)
     */
    public Integer padding;

    /**
     * 数据排序， 可以取none, ascending, descending
     */
    public Sort sort;

    /**
     * 数据排序（弦）， 可以取none, ascending, descending
     */
    public Sort sortSub;

    /**
     * 是否显示刻度
     */
    public Boolean showScale;

    /**
     * 是否显示刻度文字
     */
    public Boolean showScaleText;

    /**
     * 显示是否顺时针
     */
    public Boolean clockWise;

    /**
     * 关系数据，用二维数组表示，项 [i][j] 的数值表示 i 到 j 的关系数据
     */
    public Object[][] matrix;

    public Chord() {
        this.type = SeriesType.chord;
    }

    public Chord(String name) {
        super(name);
        this.type = SeriesType.chord;
    }
}
