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

import com.github.abel533.echarts.json.GsonUtil;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class FromJsonTest {

    @Test
    public void testFromJson() {
        String json = "{\n" +
                "    tooltip : {\n" +
                "        trigger: 'axis',\n" +
                "        axisPointer : {            // 坐标轴指示器，坐标轴触发有效\n" +
                "            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'\n" +
                "        }\n" +
                "    },\n" +
                "    legend: {\n" +
                "        data:['利润', '支出', '收入']\n" +
                "    },\n" +
                "    toolbox: {\n" +
                "        show : true,\n" +
                "        feature : {\n" +
                "            mark : {show: true},\n" +
                "            dataView : {show: true, readOnly: false},\n" +
                "            magicType : {show: true, type: ['line', 'bar']},\n" +
                "            restore : {show: true},\n" +
                "            saveAsImage : {show: true}\n" +
                "        }\n" +
                "    },\n" +
                "    calculable : true,\n" +
                "    xAxis : [\n" +
                "        {\n" +
                "            type : 'value'\n" +
                "        }\n" +
                "    ],\n" +
                "    yAxis : [\n" +
                "        {\n" +
                "            type : 'category',\n" +
                "            axisTick : {show: false},\n" +
                "            data : ['周一','周二','周三','周四','周五','周六','周日']\n" +
                "        }\n" +
                "    ],\n" +
                "    series : [\n" +
                "        {\n" +
                "            name:'利润',\n" +
                "            type:'bar',\n" +
                "            itemStyle : { normal: {label : {show: true, position: 'inside'}}},\n" +
                "            data:[200, 170, 240, 244, 200, 220, 210]\n" +
                "        },\n" +
                "        {\n" +
                "            name:'收入',\n" +
                "            type:'bar',\n" +
                "            stack: '总量',\n" +
                "            barWidth : 5,\n" +
                "            itemStyle: {normal: {\n" +
                "                label : {show: true}\n" +
                "            }},\n" +
                "            data:[320, 302, 341, 374, 390, 450, 420]\n" +
                "        },\n" +
                "        {\n" +
                "            name:'支出',\n" +
                "            type:'bar',\n" +
                "            stack: '总量',\n" +
                "            itemStyle: {normal: {\n" +
                "                label : {show: true, position: 'left'}\n" +
                "            }},\n" +
                "            data:[-120, -132, -101, -134, -190, -230, -210]\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        EnhancedOption option = GsonUtil.fromJSON(json, EnhancedOption.class);
        //增加一些内容
        option.legend("测试");
        Bar bar = new Bar();
        bar.name("测试").stack("总量").data(142, 123, 65, 441, 341, 467, 90).itemStyle().normal().label().show(true);
        option.series(bar);
        option.view();
    }

    @Test
    public void testAxisFromJson() {
        String json = "{\"xAxis\": [{\"splitNumber\":10, \"type\": \"time\"}]}";
        EnhancedOption option = GsonUtil.fromJSON(json, EnhancedOption.class);
        System.out.println(option);
    }
}
