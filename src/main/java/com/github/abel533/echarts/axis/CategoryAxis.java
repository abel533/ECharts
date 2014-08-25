package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.Data;
import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.code.YPosition;

/**
 * Created by Administrator on 14-8-26.
 */
public class CategoryAxis extends Axis {
    public Data[] data;

    public CategoryAxis() {
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
    }
}
