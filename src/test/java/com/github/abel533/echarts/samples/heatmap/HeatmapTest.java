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

import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.Position;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.series.Heatmap;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class HeatmapTest {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/heatmap.html
        EnhancedOption option = new EnhancedOption();
        option.tooltip().position(Position.top);
        option.animation(false);

        CategoryAxis hoursC = new CategoryAxis();
        hoursC.data("12a", "1a", "2a", "3a", "4a", "5a", "6a",
                "7a", "8a", "9a", "10a", "11a",
                "12p", "1p", "2p", "3p", "4p", "5p",
                "6p", "7p", "8p", "9p", "10p", "11p");

        CategoryAxis daysC = new CategoryAxis();
        daysC.data("Saturday", "Friday", "Thursday",
                "Wednesday", "Tuesday", "Monday", "Sunday");

        option.xAxis(hoursC).yAxis(daysC);
        option.grid().height("50%").y("10%");
        option.visualMapNew().min(1).max(10).calculable(true).orient(Orient.horizontal).left(X.center).bottom("15%");

        Object[] data = new Object[]{new Integer[]{0, 0, 5}, new Integer[]{0, 1, 1}, new Integer[]{0, 2, 0}, new Integer[]{0, 3, 0}, new Integer[]{0, 4, 0},
                new Integer[]{0, 5, 0}, new Integer[]{0, 6, 0}, new Integer[]{0, 7, 0}, new Integer[]{0, 8, 0}, new Integer[]{0, 9, 0},
                new Integer[]{0, 10, 0}, new Integer[]{0, 11, 2}, new Integer[]{0, 12, 4}, new Integer[]{0, 13, 1}, new Integer[]{0, 14, 1},
                new Integer[]{0, 15, 3}, new Integer[]{0, 16, 4}, new Integer[]{0, 17, 6}, new Integer[]{0, 18, 4}, new Integer[]{0, 19, 4},
                new Integer[]{0, 20, 3}, new Integer[]{0, 21, 3}, new Integer[]{0, 22, 2}, new Integer[]{0, 23, 5}, new Integer[]{1, 0, 7},
                new Integer[]{1, 1, 0}, new Integer[]{1, 2, 0}, new Integer[]{1, 3, 0}, new Integer[]{1, 4, 0}, new Integer[]{1, 5, 0},
                new Integer[]{1, 6, 0}, new Integer[]{1, 7, 0}, new Integer[]{1, 8, 0}, new Integer[]{1, 9, 0}, new Integer[]{1, 10, 5},
                new Integer[]{1, 11, 2}, new Integer[]{1, 12, 2}, new Integer[]{1, 13, 6}, new Integer[]{1, 14, 9}, new Integer[]{1, 15, 11},
                new Integer[]{1, 16, 6}, new Integer[]{1, 17, 7}, new Integer[]{1, 18, 8}, new Integer[]{1, 19, 12}, new Integer[]{1, 20, 5},
                new Integer[]{1, 21, 5}, new Integer[]{1, 22, 7}, new Integer[]{1, 23, 2}, new Integer[]{2, 0, 1}, new Integer[]{2, 1, 1},
                new Integer[]{2, 2, 0}, new Integer[]{2, 3, 0}, new Integer[]{2, 4, 0}, new Integer[]{2, 5, 0}, new Integer[]{2, 6, 0},
                new Integer[]{2, 7, 0}, new Integer[]{2, 8, 0}, new Integer[]{2, 9, 0}, new Integer[]{2, 10, 3}, new Integer[]{2, 11, 2},
                new Integer[]{2, 12, 1}, new Integer[]{2, 13, 9}, new Integer[]{2, 14, 8}, new Integer[]{2, 15, 10}, new Integer[]{2, 16, 6},
                new Integer[]{2, 17, 5}, new Integer[]{2, 18, 5}, new Integer[]{2, 19, 5}, new Integer[]{2, 20, 7}, new Integer[]{2, 21, 4},
                new Integer[]{2, 22, 2}, new Integer[]{2, 23, 4}, new Integer[]{3, 0, 7}, new Integer[]{3, 1, 3}, new Integer[]{3, 2, 0},
                new Integer[]{3, 3, 0}, new Integer[]{3, 4, 0}, new Integer[]{3, 5, 0}, new Integer[]{3, 6, 0}, new Integer[]{3, 7, 0},
                new Integer[]{3, 8, 1}, new Integer[]{3, 9, 0}, new Integer[]{3, 10, 5}, new Integer[]{3, 11, 4}, new Integer[]{3, 12, 7},
                new Integer[]{3, 13, 14}, new Integer[]{3, 14, 13}, new Integer[]{3, 15, 12}, new Integer[]{3, 16, 9}, new Integer[]{3, 17, 5},
                new Integer[]{3, 18, 5}, new Integer[]{3, 19, 10}, new Integer[]{3, 20, 6}, new Integer[]{3, 21, 4}, new Integer[]{3, 22, 4},
                new Integer[]{3, 23, 1}, new Integer[]{4, 0, 1}, new Integer[]{4, 1, 3}, new Integer[]{4, 2, 0}, new Integer[]{4, 3, 0},
                new Integer[]{4, 4, 0}, new Integer[]{4, 5, 1}, new Integer[]{4, 6, 0}, new Integer[]{4, 7, 0}, new Integer[]{4, 8, 0},
                new Integer[]{4, 9, 2}, new Integer[]{4, 10, 4}, new Integer[]{4, 11, 4}, new Integer[]{4, 12, 2}, new Integer[]{4, 13, 4},
                new Integer[]{4, 14, 4}, new Integer[]{4, 15, 14}, new Integer[]{4, 16, 12}, new Integer[]{4, 17, 1}, new Integer[]{4, 18, 8},
                new Integer[]{4, 19, 5}, new Integer[]{4, 20, 3}, new Integer[]{4, 21, 7}, new Integer[]{4, 22, 3}, new Integer[]{4, 23, 0},
                new Integer[]{5, 0, 2}, new Integer[]{5, 1, 1}, new Integer[]{5, 2, 0}, new Integer[]{5, 3, 3}, new Integer[]{5, 4, 0},
                new Integer[]{5, 5, 0}, new Integer[]{5, 6, 0}, new Integer[]{5, 7, 0}, new Integer[]{5, 8, 2}, new Integer[]{5, 9, 0},
                new Integer[]{5, 10, 4}, new Integer[]{5, 11, 1}, new Integer[]{5, 12, 5}, new Integer[]{5, 13, 10}, new Integer[]{5, 14, 5},
                new Integer[]{5, 15, 7}, new Integer[]{5, 16, 11}, new Integer[]{5, 17, 6}, new Integer[]{5, 18, 0}, new Integer[]{5, 19, 5},
                new Integer[]{5, 20, 3}, new Integer[]{5, 21, 4}, new Integer[]{5, 22, 2}, new Integer[]{5, 23, 0}, new Integer[]{6, 0, 1},
                new Integer[]{6, 1, 0}, new Integer[]{6, 2, 0}, new Integer[]{6, 3, 0}, new Integer[]{6, 4, 0}, new Integer[]{6, 5, 0},
                new Integer[]{6, 6, 0}, new Integer[]{6, 7, 0}, new Integer[]{6, 8, 0}, new Integer[]{6, 9, 0}, new Integer[]{6, 10, 1},
                new Integer[]{6, 11, 0}, new Integer[]{6, 12, 2}, new Integer[]{6, 13, 1}, new Integer[]{6, 14, 3}, new Integer[]{6, 15, 4},
                new Integer[]{6, 16, 0}, new Integer[]{6, 17, 0}, new Integer[]{6, 18, 0}, new Integer[]{6, 19, 0}, new Integer[]{6, 20, 1},
                new Integer[]{6, 21, 2}, new Integer[]{6, 22, 2}, new Integer[]{6, 23, 6}};

        Object[] datas = new Object[data.length];
        for (int i = 0; i < data.length; i++) {
            Integer[] is = (Integer[]) data[i];
            datas[i] = new Integer[]{is[1], is[0], is[2]};
        }

        Heatmap heatmap = new Heatmap("Punch Card");
        heatmap.data(datas);
        heatmap.label().normal().show(true);
        heatmap.itemStyle().emphasis().shadowBlur(10).shadowColor("rgba(0, 0, 0, 0.5)");

        option.series(heatmap);
        option.exportToHtml("heatmap.html");
        option.view();
    }
}
