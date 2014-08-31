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

	public Integer padding(){
		return this.padding;
	}

	public Chord padding(Integer padding){
		this.padding = padding;
		return this;
	}

    /**
     * 数据排序， 可以取none, ascending, descending
     */
	private Sort sort;

	public Sort sort(){
		return this.sort;
	}

	public Chord sort(Sort sort){
		this.sort = sort;
		return this;
	}

    /**
     * 数据排序（弦）， 可以取none, ascending, descending
     */
	private Sort sortSub;

	public Sort sortSub(){
		return this.sortSub;
	}

	public Chord sortSub(Sort sortSub){
		this.sortSub = sortSub;
		return this;
	}

    /**
     * 是否显示刻度
     */
	private Boolean showScale;

	public Boolean showScale(){
		return this.showScale;
	}

	public Chord showScale(Boolean showScale){
		this.showScale = showScale;
		return this;
	}

    /**
     * 是否显示刻度文字
     */
	private Boolean showScaleText;

	public Boolean showScaleText(){
		return this.showScaleText;
	}

	public Chord showScaleText(Boolean showScaleText){
		this.showScaleText = showScaleText;
		return this;
	}

    /**
     * 显示是否顺时针
     */
	private Boolean clockWise;

	public Boolean clockWise(){
		return this.clockWise;
	}

	public Chord clockWise(Boolean clockWise){
		this.clockWise = clockWise;
		return this;
	}

    /**
     * 关系数据，用二维数组表示，项 [i][j] 的数值表示 i 到 j 的关系数据
     */
	private Object[][] matrix;

	public Object[][] matrix(){
		return this.matrix;
	}

	public Chord matrix(Object[][] matrix){
		this.matrix = matrix;
		return this;
	}

    public Chord() {
        this.type(SeriesType.chord);
    }

    public Chord(String name) {
        super(name);
        this.type(SeriesType.chord);
    }
}
