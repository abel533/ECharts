package com.github.abel533.echarts.series;

/**
 * Description: Effect
 * Author: liuzh
 * Update: liuzh(2014-08-26 09:52)
 */
public class Effect {
    public Boolean show;
    public Boolean loop;
    public Integer period;
    public Integer scaleSize;
    public String color;
    public String shadowColor;
    public Integer shadowBlur;

    public Effect() {
        this.show = false;
        this.loop = true;
        this.period = 15;
        this.scaleSize = 2;
        this.shadowBlur = 0;
    }
}
