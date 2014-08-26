package com.github.abel533.echarts.data;

/**
 * Description: ScatterData
 * Author: liuzh
 * Update: liuzh(2014-08-26 12:56)
 */
public class ScatterData {
    public Object[] value;

    /**
     * 横值，纵值，大小(可选)
     *
     * @param value
     */
    public ScatterData(Object... value) {
        this.value = value;
    }
}
