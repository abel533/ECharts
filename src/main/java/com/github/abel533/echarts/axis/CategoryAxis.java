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
import com.github.abel533.echarts.code.YPosition;

import java.util.ArrayList;

/**
 * Created by liuzh on 14-8-26.
 */
public class CategoryAxis extends Axis {

    /**
     * [类目型]类目起始和结束两端空白策略，见下图，默认为true留空，false则顶头
     * <p/>
     * [数值型]数值轴两端空白策略，数组内数值代表百分比，
     * [原始数据最小值与最终最小值之间的差额，原始数据最大值与最终最大值之间的差额]
     */
    public Object boundaryGap;

    public CategoryAxis() {
        this.type = AxisType.category;
        this.position = YPosition.bottom;
        this.boundaryGap = true;
        this.axisLine = new AxisLine();
        this.axisTick = new AxisTick();
        this.axisTick.show = true;
        this.axisTick.interval = "auto";
        this.axisLabel = new Label();
        this.axisLabel.interval = "auto";
        this.splitLine = new SplitLine();
        this.splitArea = new SplitArea();

        this.data = new ArrayList<Object>();
    }
}
