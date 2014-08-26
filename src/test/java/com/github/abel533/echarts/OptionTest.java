package com.github.abel533.echarts;

import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.MarkType;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.LineData;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.series.MarkLine;
import com.github.abel533.echarts.util.GsonFormatter;
import com.github.abel533.echarts.util.ViewECharts;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Description: OptionTest
 * Author: liuzh
 * Update: liuzh(2014-08-26 14:08)
 */
public class OptionTest {

    @Test
    public void basicOption() {
        Option option = new Option();
        option.legend = new Legend();
        option.legend.padding = 5;
        option.legend.itemGap = 10;
        option.addLegend("ios7", "android4");

        option.tooltip = new Tooltip();
        option.tooltip.trigger = Trigger.item;

        CategoryAxis categoryAxis = new CategoryAxis();
        option.xAxis = new ArrayList<Axis>();
        categoryAxis.addData("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        option.xAxis.add(categoryAxis);

        ValueAxis valueAxis = new ValueAxis();
        option.yAxis = new ArrayList<Axis>();
        valueAxis.boundaryGap = new Double[]{0.1, 0.1};
        valueAxis.splitNumber = 4;
        option.yAxis.add(valueAxis);

        Line line = new Line();
        line.name = "ios7";
        line.addData(112, 23, 45, 56, 233, 343, 454, 89, 343, 123, 45, 123);
        MarkLine markLine = new MarkLine();
        markLine.data.add(new LineData(MarkType.average, "ios7"));
        line.markLine = markLine;
        option.series.add(line);

        line = new Line();
        line.name = "android4";
        line.itemStyle.normal.label.show = true;
        line.addData(45, 123, 145, 526, 233, 343, 44, 829, 33, 123, 45, 13);
        option.series.add(line);

        //输出结构
        GsonFormatter.print(option);

        ViewECharts.view(option, "d:/echarts");
    }
}
