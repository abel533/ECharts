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
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Radar;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class RadarTest2 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/radar2.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("罗纳尔多 vs 舍普琴科").subtext("完全实况球员数据");
        option.tooltip().trigger(Trigger.axis);
        option.legend().data("罗纳尔多", "舍普琴科").x(X.center);
        option.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage);
        option.calculable(true);

        Polar polar = new Polar();
        polar.indicator(new Data().text("进攻").max(100),
                new Data().text("防守").max(100),
                new Data().text("体能").max(100),
                new Data().text("速度").max(100),
                new Data().text("力量").max(100),
                new Data().text("技巧").max(100)).radius(130);
        option.polar(polar);

        Radar radar = new Radar("完全实况球员数据");
        radar.itemStyle().normal().areaStyle().typeDefault();
        radar.data(new Data().name("舍普琴科").value(97, 42, 88, 94, 90, 86), new Data().name("罗纳尔多").value(97, 32, 74, 95, 88, 92));
        option.series(radar);
        option.exportToHtml("radar2.html");
        option.view();
    }
}
