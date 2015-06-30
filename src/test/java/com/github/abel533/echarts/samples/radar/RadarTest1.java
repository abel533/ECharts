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

package com.github.abel533.echarts.samples.radar;

import com.github.abel533.echarts.Polar;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Radar;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class RadarTest1 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/radar1.html
        EnhancedOption option = new EnhancedOption();
        option.title("预算 vs 开销（Budget vs spending）", "纯属虚构");
        option.tooltip(Trigger.axis);
        option.legend().orient(Orient.vertical).x(X.right).y(Y.bottom).data("预算分配（Allocated Budget）","实际开销（Actual Spending）");
        option.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage);
        option.calculable(true);

        Polar polar = new Polar();
        polar.indicator(new Data().text("销售（sales）").max(6000),
                new Data().text("管理（Administration）").max(16000),
                new Data().text("信息技术（Information Techology）").max(30000),
                new Data().text("客服（Customer Support）").max(38000),
                new Data().text("研发（Development）").max(52000),
                new Data().text("市场（Marketing）").max(25000));
        option.polar(polar);

        Radar radar = new Radar("预算 vs 开销（Budget vs spending）");
        radar.data(
                new Data().name("预算分配（Allocated Budget）").value(4300, 10000, 28000, 35000, 50000, 19000),
                new Data().name("实际开销（Actual Spending）").value(5000, 14000, 28000, 31000, 42000, 21000));
        option.series(radar);
        option.exportToHtml("radar1.html");
        option.view();
    }
}
