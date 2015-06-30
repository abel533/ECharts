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

package com.github.abel533.echarts.samples.other;

import com.github.abel533.echarts.axis.AxisLine;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.SplitLine;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzh
 */
public class AccessTest {
    /**
     * 模拟从数据库获取数据
     *
     * @return
     */
    public List<AccessData> getWeekData() {
        List<AccessData> list = new ArrayList<AccessData>(7);
        list.add(new AccessData("09-16", 4));
        list.add(new AccessData("09-17", 7));
        list.add(new AccessData("09-18", 14));
        list.add(new AccessData("09-19", 304));
        list.add(new AccessData("09-20", 66));
        list.add(new AccessData("09-21", 16));
        list.add(new AccessData("09-22", 205));
        return list;
    }

    @Test
    public void test() {
        //获取数据
        List<AccessData> datas = getWeekData();
        //创建Option对象
        EnhancedOption option = new EnhancedOption();
        //设置图表标题，并且居中显示
        option.title().text("最近7天访问量图表").x(X.center);
        //设置图例,居中底部显示，显示边框
        option.legend().data("访问量").x(X.center).y(Y.bottom).borderWidth(1);
        //设置y轴为值轴，并且不显示y轴，最大值设置400（实际上这个属性不必设置，默认即可）
        option.yAxis(new ValueAxis().name("IP")
                .axisLine(new AxisLine().show(true).lineStyle(new LineStyle().width(0)))
                .max(400).min(-100));
        //创建类目轴，并且不显示竖着的分割线
        CategoryAxis categoryAxis = new CategoryAxis()
                .splitLine(new SplitLine().show(false))
                .axisLine(new AxisLine().onZero(false));
        //不显示表格边框，就是围着图标的方框
        option.grid().borderWidth(0);
        //创建Line数据
        Line line = new Line("访问量").smooth(true);
        //根据获取的数据赋值
        for (AccessData data : datas) {
            //增加类目，值为日期
            categoryAxis.data(data.getDate());
            //日期对应的数据
            line.data(data.getNums());
        }
        //设置x轴为类目轴
        option.xAxis(categoryAxis);
        //设置数据
        option.series(line);
        //打开浏览器预览
        option.exportToHtml("access.html");
        option.view();
    }

    //数据对象
    class AccessData {
        //日期
        private String date;
        //访问量
        private Integer nums;

        AccessData(String date, Integer nums) {
            this.date = date;
            this.nums = nums;
        }

        public String getDate() {
            return date;
        }

        public Integer getNums() {
            return nums;
        }
    }
}
