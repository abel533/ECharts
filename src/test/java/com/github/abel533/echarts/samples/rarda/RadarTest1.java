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

package com.github.abel533.echarts.samples.rarda;

import com.github.abel533.echarts.Radar;
import com.github.abel533.echarts.data.RadarData;
import com.github.abel533.echarts.series.RadarSeries;
import com.github.abel533.echarts.style.TextStyle;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * 雷达图测试1
 *
 * @author liuxu
 * @date 18-7-10下午4:21
 */
public class RadarTest1 {

    @Test
    public void test() {

        EnhancedOption option = new EnhancedOption();

        option.title().text("基础雷达图").subtext("基础雷达图subtext");

        option.legend("预算分配（Allocated Budget）", "实际开销（Actual Spending）");


        //设置 Radar
        Radar radar = new Radar();
        radar.name(new Radar.Name().textStyle(new TextStyle().color("#fff").backgroundColor("#999").borderRadius(3).padding(new Integer[]{3, 5})));


        radar.indicator(new Radar.Indicator().name("销售（sales）").max(6500),
                new Radar.Indicator().name("管理（Administration）").max(16000),
                new Radar.Indicator().name("信息技术（Information Techology）").max(30000),
                new Radar.Indicator().name("客服（Customer Support）").max(38000),
                new Radar.Indicator().name("研发（Development）").max(52000),
                new Radar.Indicator().name("市场（Marketing）").max(25000));

        option.radar(radar);

        //设置 Series
        RadarSeries radar1 = new RadarSeries("预算 vs 开销（Budget vs spending）");

        RadarData radarData1 = new RadarData("预算分配", new Integer[]{4300, 10000, 28000, 35000, 50000, 19000});
        RadarData radarData2 = new RadarData("实际开销", new Integer[]{5000, 14000, 28000, 31000, 42000, 21000});

        radar1.data(radarData1,radarData2);

        option.series(radar1);
        System.out.println(option.toString());
        option.exportToHtml("radar1.html");
        option.view();
    }
}
