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

package com.github.abel533.echarts.samples.heatmap;

import com.github.abel533.echarts.data.GradientColor;
import com.github.abel533.echarts.series.Heatmap;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liuzh
 */
public class HeatmapTest {

    public List<Object[]> headData() {
        List<Object[]> list = new LinkedList<Object[]>();
        for (int i = 0; i < 20; ++i) {
            list.add(new Object[]{
                    400 + Math.random() * 300,
                    5 + Math.random() * 10,
                    Math.random()
            });
        }
        for (int i = 0; i < 100; ++i) {
            list.add(new Object[]{
                    100 + Math.random() * 600,
                    150 + Math.random() * 50,
                    Math.random()
            });
        }
        for (int i = 0; i < 200; ++i) {
            list.add(new Object[]{
                    400 + Math.random() * 1000,
                    5 + Math.random() * 800,
                    Math.random() * 0.5
            });
        }
        return list;
    }

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/heatmap.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("热力图自定义样式");
        Heatmap heatmap = new Heatmap();
        heatmap.data(headData().toArray());
        heatmap.hoverable(false)
                .gradientColors(
                        new GradientColor(0.4, "green"),
                        new GradientColor(0.5, "yellow"),
                        new GradientColor(0.8, "orange"),
                        new GradientColor(1d, "red"));
        heatmap.minAlpha(0.2).valueScale(2d).opacity(0.6);
        option.series(heatmap);
        option.exportToHtml("heatmap.html");
        option.view();
    }
}
