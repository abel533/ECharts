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

package com.github.abel533.echarts.samples.chord;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.data.PointData;
import com.github.abel533.echarts.series.Chord;
import com.github.abel533.echarts.series.MarkPoint;
import com.github.abel533.echarts.style.ChordStyle;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.style.itemstyle.Emphasis;
import com.github.abel533.echarts.style.itemstyle.Normal;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class ChordTest {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/chord.html
        EnhancedOption option = new EnhancedOption();
        option.title("测试数据").tooltip(Trigger.item);
        option.toolbox().show(true).y(Y.bottom).feature(Tool.restore, Tool.saveAsImage);
        option.legend().x(X.right).data("g1", "g2", "g3", "g4");

        Chord chord = new Chord();
        chord.sort(Sort.descending).
                sortSub(Sort.descending).
                radius("55%", "75%").
                startAngle(90).
                clockWise(false).
                showScale(true).
                showScaleText(true).
                data(new Data("g1").itemStyle(
                                new ItemStyle().normal(new Normal().color("rgba(255,30,30,0.5)")
                                        .lineStyle(new LineStyle().width(1).color("green")))
                                        .emphasis(new Emphasis().color("yellow")
                                                .lineStyle(new LineStyle().width(2).color("blue")))),
                        new Data("g2"),
                        new Data("g3"),
                        new Data("g4")).
                matrix(new Object[][]{
                        {11975, 5871, 8916, 2868},
                        {1951, 10048, 2060, 6171},
                        {8010, 16145, 8090, 8045},
                        {1013, 990, 940, 6907}
                }).
                markPoint(new MarkPoint().symbol(Symbol.star).
                        data(new PointData("打酱油的标注", 100).x("5%").y("50%").symbolSize(32),
                                new PointData("打酱油的标注", 100).x("95%").y("50%").symbolSize(32)
                        )).
                itemStyle().normal(
                new Normal()
                        .lineStyle(new LineStyle().width(0).color("#000"))
                        .chordStyle(new ChordStyle().width(1).color("#333"))
                        .label(new Label().show(true).color("red")))
                .emphasis(new Emphasis()
                        .lineStyle(new LineStyle().width(0).color("#000"))
                        .chordStyle(new ChordStyle().width(2).color("black")));
        option.series(chord);
        option.exportToHtml("chord.html");
        option.view();
    }
}
