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

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.AxisType;

/**
 * 值轴
 *
 * @author liuzh.
 */
public class ValueAxis extends Axis {
    /**
     * 指定的最小值，eg: 0，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[0]
     */
	private Integer min;

	public Integer min(){
		return this.min;
	}

	public ValueAxis min(Integer min){
		this.min = min;
		return this;
	}

    /**
     * 指定的最大值，eg: 100，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[1]
     */
	private Integer max;

	public Integer max(){
		return this.max;
	}

	public ValueAxis max(Integer max){
		this.max = max;
		return this;
	}

    /**
     * 默认值false，脱离0值比例，放大聚焦到最终_min，_max区间
     */
	private Boolean scale;

	public Boolean scale(){
		return this.scale;
	}

	public ValueAxis scale(Boolean scale){
		this.scale = scale;
		return this;
	}

    /**
     * 小数精度，默认为0，无小数点
     */
	private Integer precision;

	public Integer precision(){
		return this.precision;
	}

	public ValueAxis precision(Integer precision){
		this.precision = precision;
		return this;
	}

    /**
     * 整数精度，默认为100，个位和百位为0
     */
	private Integer power;

	public Integer power(){
		return this.power;
	}

	public ValueAxis power(Integer power){
		this.power = power;
		return this;
	}

    /**
     * 分割段数，默认为5
     */
	private Integer splitNumber;

	public Integer splitNumber(){
		return this.splitNumber;
	}

	public ValueAxis splitNumber(Integer splitNumber){
		this.splitNumber = splitNumber;
		return this;
	}


    public ValueAxis() {
        this.type(AxisType.value);
    }
}
