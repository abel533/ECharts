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

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.code.XPosition;

/**
 * Created by liuzh on 14-8-26.
 */
public class ValueAxis extends Axis {
    /**
     * 指定的最小值，eg: 0，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[0]
     */
    public Integer min;

    /**
     * 指定的最大值，eg: 100，默认无，会自动根据具体数值调整，指定后将忽略boundaryGap[1]
     */
    public Integer max;

    /**
     * 默认值false，脱离0值比例，放大聚焦到最终_min，_max区间
     */
    public Boolean scale;

    /**
     * 小数精度，默认为0，无小数点
     */
    public Integer percision;

    /**
     * 整数精度，默认为100，个位和百位为0
     */
    public Integer power;

    /**
     * 分割段数，默认为5
     */
    public Integer splitNumber;


    public ValueAxis() {
        this.type = AxisType.value;
        this.position = XPosition.left;
        this.name = "";
        this.nameLocation = NameLocation.end;
        this.boundaryGap = new Integer[]{0, 0};
        this.scale = false;
        this.percision = 0;
        this.power = 100;
        this.splitNumber = 5;
        this.axisLine = new AxisLine();
        this.axisTick = new AxisTick();
        this.axisTick.show = false;
        this.axisTick.interval = "auto";
        this.axisLabel = new Label();
        this.axisLabel.interval = "auto";
        this.splitLine = new SplitLine();
        this.splitArea = new SplitArea();
    }
}
