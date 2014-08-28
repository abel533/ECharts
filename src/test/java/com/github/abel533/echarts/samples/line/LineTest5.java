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

package com.github.abel533.echarts.samples.line;

import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class LineTest5 {

    @Test
    public void test() {
        //地址:http://echarts.baidu.com/doc/example/line5.html

        EnhancedOption option = new EnhancedOption();
        option.addLegend("高度(km)与气温(°C)变化关系");

        option.toolbox().show = true;
        option.toolbox().addFeature(Tool.mark, Tool.dataView, new MagicType(Magic.line, Magic.bar), Tool.restore, Tool.saveAsImage);

        option.calculable = true;
        option.tooltip().trigger = Trigger.axis;
        option.tooltip().formatter = "Temperature : <br/>{b}km : {c}°C";

        ValueAxis valueAxis = new ValueAxis();
        valueAxis.axisLabel().formatter = "{value} °C";
        option.addXAxis(valueAxis);

        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.axisLine().onZero = false;
        categoryAxis.axisLabel().formatter = "{value} km";
        categoryAxis.boundaryGap = false;
        categoryAxis.addData(0, 10, 20, 30, 40, 50, 60, 70, 80);
        option.addYAxis(categoryAxis);

        Line line = new Line();
        line.name = "高度(km)与气温(°C)变化关系";
        line.smooth = true;
        line.itemStyle().normal.lineStyle().shadowColor = "rgba(0,0,0,0.4)";
        line.addData(15, -50, -56.5, -46.5, -22.1, -2.5, -27.7, -55.7, -76.5);
        option.addSeries(line);

        option.view();
    }
}
