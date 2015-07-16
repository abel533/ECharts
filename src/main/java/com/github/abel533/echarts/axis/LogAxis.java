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

import com.github.abel533.echarts.code.AxisType;

/**
 * 时间型坐标轴用法同数值型，只是目标处理和格式化显示时会自动转变为时间，并且随着时间跨度的不同自动切换需要显示的时间粒度
 *
 * @author liuzh
 */
public class LogAxis extends Axis<LogAxis> {
    /**
     * axis.type === 'log'时生效。指定时，axisLabel显示为指数形式，如指定为4时，axisLabel可显示为4²、4³。不指定时，显示为普通形式，如 1,000,000
     */
    private Integer logLabelBase;
    /**
     * axis.type === 'log'时生效。指明是否使用反向log数轴（从而支持value为负值）。默认自适应，即如果value全为负值，则logPositive自动设为false，否则为true
     */
    private Boolean logPositive;

    /**
     * 构造函数
     */
    public LogAxis() {
        this.type(AxisType.log);
    }

    /**
     * 设置logLabelBase值
     *
     * @param logLabelBase
     */
    public LogAxis logLabelBase(Integer logLabelBase) {
        this.logLabelBase = logLabelBase;
        return this;
    }

    /**
     * 获取logLabelBase值
     */
    public Integer logLabelBase() {
        return this.logLabelBase;
    }

    /**
     * 设置logPositive值
     *
     * @param logPositive
     */
    public LogAxis logPositive(Boolean logPositive) {
        this.logPositive = logPositive;
        return this;
    }

    /**
     * 获取logPositive值
     */
    public Boolean logPositive() {
        return this.logPositive;
    }

    /**
     * 获取logLabelBase
     */
    public Integer getLogLabelBase() {
        return logLabelBase;
    }

    /**
     * 设置logLabelBase
     *
     * @param logLabelBase
     */
    public void setLogLabelBase(Integer logLabelBase) {
        this.logLabelBase = logLabelBase;
    }

    /**
     * 获取logPositive
     */
    public Boolean getLogPositive() {
        return logPositive;
    }

    /**
     * 设置logPositive
     *
     * @param logPositive
     */
    public void setLogPositive(Boolean logPositive) {
        this.logPositive = logPositive;
    }
}
