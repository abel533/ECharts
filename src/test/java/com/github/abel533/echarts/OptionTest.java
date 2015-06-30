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

package com.github.abel533.echarts;

import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.LineData;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * Description: OptionTest
 *
 * @author liuzh
 * @since liuzh(2014-08-26 14:08)
 */
public class OptionTest {

    @Test
    public void basicOption() {
        EnhancedOption option = new EnhancedOption();
        option.legend().padding(5).itemGap(10).data("ios7", "android4");
        option.toolbox().show(true).feature(Tool.dataView, Tool.saveAsImage, Tool.dataZoom, Tool.magicType);
        option.tooltip().trigger(Trigger.item);
        option.xAxis(new CategoryAxis().data("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
        option.yAxis(new ValueAxis().boundaryGap(new Double[]{0.1, 0.1}).splitNumber(10));

        Line line = new Line();
        line.name("ios7").data(112, 23, 45, 56, 233, 343, 454, 89, 343, 123, 45, 123).markLine().data(new LineData().type(MarkType.average).name("ios7"));
        option.series(line);

        line = new Line();
        line.name("android4").data(45, 123, 145, 526, 233, 343, 44, 829, 33, 123, 45, 13).itemStyle().normal().label().show(true);
        option.series(line);

        option.view();
    }
}
