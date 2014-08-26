package com.github.abel533.echarts.samples.line;

import com.github.abel533.echarts.*;
import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.LineData;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.style.ItemStyle;
import com.github.abel533.echarts.style.TextStyle;
import com.github.abel533.echarts.util.ViewECharts;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Administrator on 14-8-26.
 */
public class LineTest {

    @Test
    public void test(){
        //例子：http://echarts.baidu.com/doc/example/line.html
        Option option = new Option();
        option.tooltip = new Tooltip();
        option.tooltip.trigger = Trigger.axis;

        option.legend = new Legend();
        option.legend.addData("邮件营销","联盟广告","直接访问","搜索引擎");

        option.toolbox = new Toolbox();
        option.toolbox.show = true;
        //option.toolbox.feature

        option.calculable = true;

        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.boundaryGap = false;
        categoryAxis.addData("周一","周二","周三","周四","周五","周六","周日");
        option.xAxis = new ArrayList<Axis>();
        option.xAxis.add(categoryAxis);

        ValueAxis valueAxis = new ValueAxis();
        option.yAxis = new ArrayList<Axis>();
        option.yAxis.add(valueAxis);

        Line line = new Line();
        line.name = "邮件营销";
        line.stack = "总量";
        line.symbol = Symbol.none;
        line.smooth = true;
        //实现不了js的这个效果
        //line.itemStyle.normal.areaStyle = new AreaStyle();
        line.addData(120, 132, 301, 134,new LineData(90,Symbol.droplet,5),230,210);
        option.series.add(line);

        line = new Line();
        line.name = "联盟广告";
        line.stack = "总量";
        line.symbol = "image://http://echarts.baidu.com/doc/asset/ico/favicon.png";
        line.symbolSize = 8;
        line.smooth = true;
        //实现不了js的这个效果
        //line.itemStyle.normal.areaStyle = new AreaStyle();
        LineData lineData = new LineData(201,Symbol.star,15);
        lineData.itemStyle = new ItemStyle();
        lineData.itemStyle.normal.label = new Label();
        lineData.itemStyle.normal.label.show = true;
        lineData.itemStyle.normal.label.textStyle = new TextStyle();
        lineData.itemStyle.normal.label.textStyle.fontSize = 20;
        lineData.itemStyle.normal.label.textStyle.fontFamily = "微软雅黑";
        lineData.itemStyle.normal.label.textStyle.fontWeight = "bold";
        line.addData(120, 82, lineData,new LineData(134,Symbol.none),190,new LineData(230,Symbol.emptypin,8),110);
        option.series.add(line);

       /* line = new Line();
        line.name = "邮件营销";
        line.stack = "总量";
        line.symbol = Symbol.none;
        line.smooth = true;
        //实现不了js的这个效果
        //line.itemStyle.normal.areaStyle = new AreaStyle();
        line.addData(120, 132, 301, 134,new LineData(90,Symbol.droplet,5),230,210);
        option.series.add(line);

        line = new Line();
        line.name = "邮件营销";
        line.stack = "总量";
        line.symbol = Symbol.none;
        line.smooth = true;
        //实现不了js的这个效果
        //line.itemStyle.normal.areaStyle = new AreaStyle();
        line.addData(120, 132, 301, 134,new LineData(90,Symbol.droplet,5),230,210);
        option.series.add(line);*/

        ViewECharts.view(option);
    }
}
