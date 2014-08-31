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
public class Chord extends Series<Chord> {
    /**
     * 每个sector之间的间距(用角度表示)
     */
    private Integer padding;
    /**
     * 数据排序， 可以取none, ascending, descending
     */
    private Sort sort;
    /**
     * 数据排序（弦）， 可以取none, ascending, descending
     */
    private Sort sortSub;
    /**
     * 是否显示刻度
     */
    private Boolean showScale;
    /**
     * 是否显示刻度文字
     */
    private Boolean showScaleText;
    /**
     * 显示是否顺时针
     */
    private Boolean clockWise;
    /**
     * 关系数据，用二维数组表示，项 [i][j] 的数值表示 i 到 j 的关系数据
     */
    private Object[][] matrix;

    public Chord() {
        this.type(SeriesType.chord);
    }

    public Chord(String name) {
        super(name);
        this.type(SeriesType.chord);
    }

    public Integer padding() {
        return this.padding;
    }

    public Chord padding(Integer padding) {
        this.padding = padding;
        return this;
    }

    public Sort sort() {
        return this.sort;
    }

    public Chord sort(Sort sort) {
        this.sort = sort;
        return this;
    }

    public Sort sortSub() {
        return this.sortSub;
    }

    public Chord sortSub(Sort sortSub) {
        this.sortSub = sortSub;
        return this;
    }

    public Boolean showScale() {
        return this.showScale;
    }

    public Chord showScale(Boolean showScale) {
        this.showScale = showScale;
        return this;
    }

    public Boolean showScaleText() {
        return this.showScaleText;
    }

    public Chord showScaleText(Boolean showScaleText) {
        this.showScaleText = showScaleText;
        return this;
    }

    public Boolean clockWise() {
        return this.clockWise;
    }

    public Chord clockWise(Boolean clockWise) {
        this.clockWise = clockWise;
        return this;
    }

    public Object[][] matrix() {
        return this.matrix;
    }

    public Chord matrix(Object[][] matrix) {
        this.matrix = matrix;
        return this;
    }

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Sort getSortSub() {
        return sortSub;
    }

    public void setSortSub(Sort sortSub) {
        this.sortSub = sortSub;
    }

    public Boolean getShowScale() {
        return showScale;
    }

    public void setShowScale(Boolean showScale) {
        this.showScale = showScale;
    }

    public Boolean getShowScaleText() {
        return showScaleText;
    }

    public void setShowScaleText(Boolean showScaleText) {
        this.showScaleText = showScaleText;
    }

    public Boolean getClockWise() {
        return clockWise;
    }

    public void setClockWise(Boolean clockWise) {
        this.clockWise = clockWise;
    }

    public Object[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Object[][] matrix) {
        this.matrix = matrix;
    }
}
