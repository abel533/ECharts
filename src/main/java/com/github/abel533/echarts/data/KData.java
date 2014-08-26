package com.github.abel533.echarts.data;

/**
 * Description: KData
 * Author: liuzh
 * Update: liuzh(2014-08-26 12:58)
 */
public class KData {
    public Double[] value;

    /**
     * 开盘，收盘，最低，最高
     *
     * @param open
     * @param close
     * @param min
     * @param max
     */
    public KData(Double open, Double close, Double min, Double max) {
        this.value = new Double[4];
        this.value[0] = open;
        this.value[1] = close;
        this.value[2] = min;
        this.value[3] = max;
    }
}
