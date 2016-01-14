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

package com.github.abel533.echarts.samples.map;

import com.github.abel533.echarts.code.SelectedMode;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.EMap;
import com.github.abel533.echarts.series.Map;
import com.github.abel533.echarts.series.MapLocation;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class MapTest {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/map.html
        EnhancedOption option = new EnhancedOption();
        EMap map = new EMap("Map");
        map.mapLocation(new MapLocation(X.left, Y.top, 500));
        map.selectedMode(SelectedMode.multiple);
        map.itemStyle().normal().borderWidth(2)
                .borderColor("lightgreen").color("orange")
                .label().show(true);

        map.itemStyle().emphasis()
                .borderWidth(2).borderColor("#fff").color("#32cd32")
                .label().show(true)
                .textStyle().color("#fff");
        Data data = new Data("广东");
        data.value(Math.round(Math.random() * 1000));
        data.itemStyle().normal().color("#32cd32")
                .label().show(true).textStyle().color("#fff").fontSize(15);
        data.itemStyle().emphasis().borderColor("yellow").color("#cd5c5c")
                .label().show(false).textStyle().color("blue");

        map.data(data);
        map.markPoint().itemStyle().normal().color("skyblue");
        map.markPoint().data(new Data("天津", 350), new Data("上海", 103));

        map.geoCoord("上海", "121.4648", "31.2891").geoCoord("天津", "117.4219", "39.4189");

        option.series(map);
        option.exportToHtml("map.html");
        option.view();
    }
}
