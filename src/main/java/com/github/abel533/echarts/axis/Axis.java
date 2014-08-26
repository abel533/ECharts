package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.style.LineStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 14-8-26.
 */
public class Axis {
    public AxisType type;
    public Object position;
    public String name;
    public NameLocation nameLocation;
    public LineStyle nameTextStyle;
    public Object boundaryGap;

    public AxisLine axisLine;
    public AxisTick axisTick;
    public AxisLabel axisLabel;
    public SplitLine splitLine;
    public SplitArea splitArea;

    public List<Object> data;

    public static Axis getInstance(AxisType type) {
        if (type == AxisType.value) {
            return new ValueAxis();
        }
        return new CategoryAxis();
    }

    /**
     * 添加坐标轴的类目属性
     *
     * @param values
     * @return
     */
    public Axis addData(Object... values) {
        if (values == null && values.length == 0) {
            return this;
        }
        if (this.data == null) {
            if (this.type == AxisType.category) {
                data = new ArrayList<Object>();
            } else {
                throw new RuntimeException("数据轴不能添加类目信息!");
            }
        }
        this.data.addAll(Arrays.asList(values));
        return this;
    }

}
