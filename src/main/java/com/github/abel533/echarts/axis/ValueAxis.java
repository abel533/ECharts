package com.github.abel533.echarts.axis;

import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.NameLocation;
import com.github.abel533.echarts.code.XPosition;

/**
 * Created by Administrator on 14-8-26.
 */
public class ValueAxis extends Axis {
    public Integer min;
    public Integer max;
    public Boolean scale;

    public Integer percision;
    public Integer power;
    public Integer splitNumber;


    public ValueAxis() {
        this.type = AxisType.value;
        this.position = XPosition.left;
        this.name = "";
        this.nameLocation = NameLocation.end;
        this.boundaryGap = new Integer[]{0, 0};
        this.scale = false;
        this.percision = 0;
        this.power = 100;
        this.splitNumber = 5;
        this.axisLine = new AxisLine();
        this.axisTick = new AxisTick();
        this.axisTick.show = false;
        this.axisTick.interval = "auto";
        this.axisLabel = new AxisLabel();
        this.axisLabel.interval = "auto";
        this.splitLine = new SplitLine();
        this.splitArea = new SplitArea();
    }
}
