package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.code.YPosition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 14-8-26.
 */
public class CategoryAxis extends Axis {
    public List<Object> data;

    public CategoryAxis() {
        this.type = AxisType.category;
        this.position = YPosition.bottom;
        this.name = "";
        this.nameLocation = NameLocation.end;
        this.boundaryGap = true;
        this.axisLine = new AxisLine();
        this.axisTick = new AxisTick();
        this.axisTick.show = true;
        this.axisTick.interval = "auto";
        this.axisLabel = new AxisLabel();
        this.axisLabel.interval = "auto";
        this.splitLine = new SplitLine();
        this.splitArea = new SplitArea();

        this.data = new ArrayList<Object>();
    }
}
