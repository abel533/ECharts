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

package com.github.abel533.echarts.samples.eventriver;

import com.github.abel533.echarts.axis.TimeAxis;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.series.EventRiver;
import com.github.abel533.echarts.series.event.Event;
import com.github.abel533.echarts.series.event.Evolution;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class EventRiverTest1 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/bar1.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("Event River").subtext("纯属虚构");
        option.tooltip().trigger(Trigger.item);
        option.legend("财经事件", "政治事件");
        option.toolbox().show(true).feature(Tool.mark, Tool.restore, Tool.saveAsImage);
        option.xAxis(new TimeAxis().boundaryGap(0.05, 0.1));

        EventRiver eventRiver1 = new EventRiver("财经事件", 123);
        eventRiver1.data(new Event("阿里巴巴上市", 123).evolution(
                        new Evolution("2014-05-01", 14).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-02", 34).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-03", 60).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-04", 40).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-05", 10).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png")
                ),
                new Event("阿里巴巴上市2", 123).evolution(
                        new Evolution("2014-05-02", 10).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-03", 34).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-04", 40).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-05", 10).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png")
                ),
                new Event("三星业绩暴跌", 123).evolution(
                        new Evolution("2014-05-03", 24).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-04", 34).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-05", 50).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-06", 30).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-07", 20).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png")
                ));

        EventRiver eventRiver2 = new EventRiver("政治事件", 123);
        eventRiver2.data(new Event("Apec峰会", 123).evolution(
                        new Evolution("2014-05-06", 14).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-07", 34).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-08", 60).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-09", 40).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-10", 10).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png")
                ),
                new Event("运城官帮透视", 123).evolution(
                        new Evolution("2014-05-08", 4).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-09", 14).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-10", 30).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-11", 20).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-12", 10).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png")
                ),
                new Event("底层公务员收入超过副部长", 123).evolution(
                        new Evolution("2014-05-11", 4).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-12", 24).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-13", 40).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-14", 20).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-15", 15).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png"),
                        new Evolution("2014-05-16", 10).detail(
                                "http://www.baidu.com", "百度指数", "http://echarts.baidu.com/doc/asset/ico/favicon.png")
                ));

        option.series(eventRiver1, eventRiver2);
        option.exportToHtml("eventRiver1.html");
        option.view();
    }
}
