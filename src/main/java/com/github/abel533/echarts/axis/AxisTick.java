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

package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.style.LineStyle;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 坐标轴小标记
 *
 * @author liuzh
 */
@Getter
@Setter
public class AxisTick implements Serializable {

    private static final long serialVersionUID = -1941931349381173253L;

    /**
     * 是否显示，默认为false，设为true后下面为默认样式
     */
    private Boolean show;
    /**
     * 小标记显示挑选间隔，默认为'auto'，可选为：
     * 'auto'（自动隐藏显示不下的） | 0（全部显示） | {number}（用户指定选择间隔）
     */
    private Object interval;
    /**
     * 小标记是否显示为间隔，默认等于boundaryGap
     */
    private Boolean onGap;
    /**
     * 小标记是否显示为在grid内部，默认在外部
     */
    private Boolean inside;
    /**
     * 默认值5，属性length控制线长
     */
    private Integer length;
    /**
     * 属性lineStyle控制线条样式，（详见lineStyle）
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;
    /**
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份
     */
    private Integer splitNumber;
    
    /**
     * 类目轴中在 boundaryGap 为 true 的时候有效，可以保证刻度线和标签对齐。 
     *  defalut:false
     *  @see http://echarts.baidu.com/option.html#xAxis
     *  @author w
     *  @date 2018年6月27日 16:31:27
     */
    private Boolean alignWithLabel = false;
    
    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public AxisTick show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取interval值
     */
    public Object interval() {
        return this.interval;
    }

    /**
     * 设置interval值
     *
     * @param interval
     */
    public AxisTick interval(Object interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 获取onGap值
     */
    public Boolean onGap() {
        return this.onGap;
    }

    /**
     * 设置onGap值
     *
     * @param onGap
     */
    public AxisTick onGap(Boolean onGap) {
        this.onGap = onGap;
        return this;
    }

    /**
     * 获取inside值
     */
    public Boolean inside() {
        return this.inside;
    }

    /**
     * 设置inside值
     *
     * @param inside
     */
    public AxisTick inside(Boolean inside) {
        this.inside = inside;
        return this;
    }

    /**
     * 获取length值
     */
    public Integer length() {
        return this.length;
    }

    /**
     * 设置length值
     *
     * @param length
     */
    public AxisTick length(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * 属性lineStyle控制线条样式，（详见lineStyle）
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    public LineStyle lineStyle() {
        if (this.lineStyle == null) {
            this.lineStyle = new LineStyle();
        }
        return this.lineStyle;
    }

    /**
     * 设置style值
     *
     * @param style
     */
    public AxisTick lineStyle(LineStyle style) {
        this.lineStyle = style;
        return this;
    }

    /**
     * 获取splitNumber值
     */
    public Integer splitNumber() {
        return this.splitNumber;
    }

    /**
     * 设置splitNumber值
     *
     * @param splitNumber
     */
    public AxisTick splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }
    
    /**
     * description: 设置 alignWithLabel 的值。
     * @param alignWithLabel
     * @return
     * AxisTick
     * @version v1.0
     * @author w
     * @return 
     * @date 2018年6月27日 下午4:33:23
     *
     */
    public  AxisTick alignWithLabel(Boolean alignWithLabel){
    	this.alignWithLabel=alignWithLabel;
    	return this;
    }
    
    /**
     * description: 获取 alignWithLabel 的值。
     * @return
     * Boolean
     * @version v1.0
     * @author w
     * @date 2018年6月27日 下午4:34:19
     *
     */
    public Boolean alignWithLabel(){
    	return this.alignWithLabel;
    }
    
}
