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

package com.github.abel533.echarts.samples.bar;

import com.github.abel533.echarts.axis.*;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class BarTest12 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/bar12.html
        EnhancedOption option = new EnhancedOption();
        option.title("ECharts2 vs ECharts1", "Chrome下测试数据");
        option.tooltip(Trigger.axis);
        option.legend(
                "ECharts1 - 2k数据", "ECharts1 - 2w数据", "ECharts1 - 20w数据", "",
                "ECharts2 - 2k数据", "ECharts2 - 2w数据", "ECharts2 - 20w数据");
        option.toolbox().show(true)
                .feature(
                        Tool.mark, Tool.dataView,
                        new MagicType(Magic.line, Magic.bar),
                        Tool.restore, Tool.saveAsImage);
        option.calculable(true);
        option.grid().y(70).y2(30).x2(20);
        option.xAxis(
                new CategoryAxis().data("Line", "Bar", "Scatter", "K", "Map"),
                new CategoryAxis()
                        .axisLine(new AxisLine().show(false))
                        .axisTick(new AxisTick().show(false))
                        .axisLabel(new AxisLabel().show(false))
                        .splitArea(new SplitArea().show(false))
                        .axisLine(new AxisLine().show(false))
                        .data("Line", "Bar", "Scatter", "K", "Map")
        );
        option.yAxis(new ValueAxis().axisLabel(new AxisLabel().formatter("{value} ms")));

        Bar b1 = new Bar("ECharts2 - 2k数据");
        b1.itemStyle().normal().color("rgba(193,35,43,1)").label().show(true);
        b1.data(40, 155, 95, 75, 0);

        Bar b2 = new Bar("ECharts2 - 2w数据");
        b2.itemStyle().normal().color("rgba(181,195,52,1)").label().show(true).textStyle().color("#27727B");
        b2.data(100, 200, 105, 100, 156);

        Bar b3 = new Bar("ECharts2 - 20w数据");
        b3.itemStyle().normal().color("rgba(252,206,16,1)").label().show(true).textStyle().color("#E87C25");
        b3.data(906, 911, 908, 778, 0);

        Bar b4 = new Bar("ECharts1 - 2k数据");
        b4.itemStyle().normal().color("rgba(193,35,43,0.5)").label().show(true).formatter("function(a,b,c){return c>0 ? (c +'\n'):'';}");
        b4.data(96, 224, 164, 124, 0).xAxisIndex(1);

        Bar b5 = new Bar("ECharts1 - 2w数据");
        b5.itemStyle().normal().color("rgba(181,195,52,0.5)").label().show(true);
        b5.data(491, 2035, 389, 955, 347).xAxisIndex(1);

        Bar b6 = new Bar("ECharts1 - 20w数据");
        b6.itemStyle().normal().color("rgba(252,206,16,0.5)").label().show(true).formatter("function(a,b,c){return c>0 ? (c +'+'):'';}");
        b6.data(3000, 3000, 2817, 3000, 0, 1242).xAxisIndex(1);

        option.series(b1, b2, b3, b4, b5, b6);
        option.exportToHtml("bar12.html");
        option.view();
    }
}
