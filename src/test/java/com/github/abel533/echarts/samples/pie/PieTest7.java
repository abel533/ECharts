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

package com.github.abel533.echarts.samples.pie;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.data.LineData;
import com.github.abel533.echarts.data.PieData;
import com.github.abel533.echarts.feature.MagicType;
import com.github.abel533.echarts.series.Funnel;
import com.github.abel533.echarts.series.Pie;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * 复杂的时间轴效果
 *
 * @author liuzh
 */
public class PieTest7 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/pie7.html
        EnhancedOption option = new EnhancedOption();
        //时间轴
        option.timeline().data("2013-01-01", "2013-02-01", "2013-03-01", "2013-04-01", "2013-05-01",
                new LineData("2013-06-01", "emptyStart6", 8), "2013-07-01", "2013-08-01", "2013-09-01", "2013-10-01",
                "2013-11-01", new LineData("2013-12-01", "star6", 8));
        option.timeline().autoPlay(true);
        //timeline变态的地方在于多个Option
        Option basic = new Option();
        basic.title().text("浏览器占比变化").subtext("纯属虚构");
        basic.tooltip().trigger(Trigger.item).formatter("{a} <br/>{b} : {c} ({d}%)");
        basic.legend().data("Chrome", "Firefox", "Safari", "IE9+", "IE8-");
        basic.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage, new MagicType(Magic.pie, Magic.funnel)
                .option(new MagicType.Option().funnel(
                        new Funnel().x("25%").width("50%").funnelAlign(X.left).max(1548))));

        int idx = 1;
        Pie pie = getPie(idx++).center("50%", "45%").radius("50%");
        pie.label().normal().show(true).formatter("{b}{c}({d}%)");
        basic.series(pie);
        //加入
        option.options(basic);
        //构造11个数据
        Option[] os = new Option[11];
        for (int i = 0; i < os.length; i++) {
            os[i] = new Option().series(getPie(idx++));
        }
        option.options(os);
        option.exportToHtml("pie7.html");
        option.view();
    }

    /**
     * 获取饼图数据
     *
     * @param idx
     * @return
     */
    public Pie getPie(int idx) {
        return new Pie().name("浏览器（数据纯属虚构）").data(
                new PieData("Chrome", idx * 128 + 80),
                new PieData("Firefox", idx * 64 + 160),
                new PieData("Safari", idx * 32 + 320),
                new PieData("IE9+", idx * 16 + 640),
                new PieData("IE8-", idx * 8 + 1280));
    }
}
