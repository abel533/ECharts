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

package com.github.abel533.echarts.samples.funnel;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.LabelLine;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Funnel;
import com.github.abel533.echarts.style.TextStyle;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class FunnelTest2 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/funnel2.html
        EnhancedOption option = new EnhancedOption();
        option.color("rgba(255, 69, 0, 0.5)",
                "rgba(255, 150, 0, 0.5)",
                "rgba(255, 200, 0, 0.5)",
                "rgba(155, 200, 50, 0.5)",
                "rgba(55, 200, 100, 0.5)");
        option.title().text("漏斗图").subtext("纯属虚构");
        option.tooltip().trigger(Trigger.item).formatter("{a} <br/>{b} : {c}%");
        option.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage);
        option.legend("展现", "点击", "访问", "咨询", "订单");
        option.calculable(true);

        Funnel funnel = new Funnel("预期");
        funnel.x("10%").y(60).width("80%");
        funnel.itemStyle().normal().label(new Label().formatter("{b}预期")).
                labelLine(new LabelLine().show(false));
        funnel.itemStyle().emphasis().label(new Label().formatter("{b}预期 : {c}%").position(Position.inside)).
                labelLine(new LabelLine().show(true));

        funnel.data(new Data().value(60).name("访问"),
                new Data().value(40).name("咨询"),
                new Data().value(20).name("订单"),
                new Data().value(80).name("点击"),
                new Data().value(100).name("展现")
        );

        Funnel funnel2 = new Funnel("实际");
        funnel2.x("10%").y(60).width("80%").maxSize("80%");
        funnel2.itemStyle().normal().label(new Label().formatter("{c}%").position(Position.inside).textStyle(new TextStyle().color("#fff"))).
                borderColor("#fff").borderWidth(2);
        funnel2.itemStyle().emphasis().label(new Label().formatter("{b}实际 : {c}%").position(Position.inside)).
                labelLine(new LabelLine().show(true));

        funnel2.data(new Data().value(30).name("访问"),
                new Data().value(10).name("咨询"),
                new Data().value(5).name("订单"),
                new Data().value(50).name("点击"),
                new Data().value(80).name("展现")
        );

        option.series(funnel,funnel2);
        option.exportToHtml("funnel2.html");
        option.view();
    }
}
