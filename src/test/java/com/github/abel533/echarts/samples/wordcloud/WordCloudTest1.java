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

package com.github.abel533.echarts.samples.wordcloud;

import com.github.abel533.echarts.data.WordCloudData;
import com.github.abel533.echarts.series.WordCloud;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.itemstyle.Normal;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class WordCloudTest1 {

    private Normal createRandomItemStyle() {
        Normal normal = new Normal();
        normal.color("rgb(" + Math.round(Math.random() * 160) + ","
                + Math.round(Math.random() * 160) + ","
                + Math.round(Math.random() * 160) + ")");
        return normal;
    }

    @Test
    public void test() {
        //地址:http://echarts.baidu.com/doc/example/wordCloud.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("Google Trends").link("http://www.google.com/trends/hottrends");
        option.tooltip().show(true);

        WordCloud wordCloud = new WordCloud("Google Trends");
        wordCloud.size("80%", "80%");
        wordCloud.textRotation(0, 45, 90, -45);
        wordCloud.textPadding(0);
        wordCloud.autoSize().enable(true).minSize(14);
        wordCloud.data(new WordCloudData("Sam S Club", 10000).itemStyle(new ItemStyle().normal(new Normal().color("black"))),
                new WordCloudData("Macys", 6181).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Amy Schumer", 4386).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Jurassic World", 4055).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Charter Communications", 2467).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Chick Fil A", 2244).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Planet Fitness", 1898).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Pitch Perfect", 1484).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Express", 1112).itemStyle(new ItemStyle().normal(createRandomItemStyle())),
                new WordCloudData("Home", 965).itemStyle(new ItemStyle().normal(createRandomItemStyle())));
        //例子数据太多，这里测试不写那么全
        option.series(wordCloud);
        option.exportToHtml("wordCloud.html");
        option.view();
    }
}
