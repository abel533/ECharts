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

import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Chord;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class ChordTest1 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/chord1.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("测试数据").subtext("From d3.js").x(X.right).y(Y.bottom);
        option.tooltip().trigger(Trigger.item);
        option.toolbox().show(true).feature(Tool.restore, Tool.saveAsImage);
        option.legend().x(X.left).data("group1", "group2", "group3", "group4");

        Chord chord = new Chord();
        chord.sort(Sort.ascending).
                sortSub(Sort.descending).
                showScale(true).
                showScaleText(true).
                data(new Data().name("group1"),
                        new Data().name("group2"),
                        new Data().name("group3"),
                        new Data().name("group4")).
                matrix(new Object[][]{
                        {11975, 5871, 8916, 2868},
                        {1951, 10048, 2060, 6171},
                        {8010, 16145, 8090, 8045},
                        {1013, 990, 940, 6907}
                }).
                itemStyle().normal().label().show(true);
        option.series(chord);
        option.exportToHtml("chord1.html");
        option.view();
    }
}
