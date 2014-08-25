package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.style.TextStyle;

/**
 * Created by Administrator on 14-8-25.
 */
public class Tooltip extends Basic {
    public Boolean show;
    public Boolean showContent;
    public Trigger trigger;

    public Object position;
    public String formatter;

    public String islandFormatter;
    public Integer showDelay;
    public Integer hideDelay;
    public Double transitionDuration;
    public Integer borderRadius;

    public AxisPointer axisPointer;

    public TextStyle textStyle;

    public Tooltip() {
        super();
        this.show = true;
        this.showContent = true;
        this.trigger = Trigger.item;
        this.islandFormatter = "{a} <br/>{b} : {c}";
        this.showDelay = 20;
        this.hideDelay = 100;
        this.transitionDuration = 0.4;
        this.borderRadius = 4;
        this.axisPointer = new AxisPointer();
        this.textStyle = new TextStyle();
        this.textStyle.color = "#fff";
    }
}
