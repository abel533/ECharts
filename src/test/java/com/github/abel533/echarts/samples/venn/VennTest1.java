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

package com.github.abel533.echarts.samples.venn;

import com.github.abel533.echarts.code.FontStyle;
import com.github.abel533.echarts.code.LineType;
import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Venn;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class VennTest1 {

    @Test
    public void test() {
        //地址:http://echarts.baidu.com/doc/example/venn.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("访问 vs 咨询").subtext("各个数据的集合");
        option.tooltip().trigger(Trigger.item).formatter("{b}: {c}");
        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                Tool.restore,
                Tool.saveAsImage);
        option.calculable(false);

        Venn venn = new Venn("韦恩图");
        venn.itemStyle().normal().label().show(true)
                .textStyle().fontFamily("Arial, Verdana, sans-serif")
                .fontSize(16)
                .fontStyle(FontStyle.italic)
                .fontWeight("bolder");
        venn.itemStyle().normal().labelLine()
                .show(true)
                .length(10)
                .lineStyle().width(1).type(LineType.solid);
        venn.itemStyle().emphasis().color("#cc99cc").borderWidth(3).borderColor("#996699");
        venn.data(new Data("访问", 100),
                new Data("咨询", 50),
                new Data("公共", 20)
        );

        option.series(venn);
        option.exportToHtml("venn.html");
        option.view();
    }
}
