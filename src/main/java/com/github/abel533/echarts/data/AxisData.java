package com.github.abel533.echarts.data;

import com.github.abel533.echarts.style.TextStyle;

/**
 * Description: 自定义样式的数据 - 适用于axis.data
 * Author: liuzh
 * Update: liuzh(2014-08-26 12:06)
 */
public class AxisData {
    public Object value;
    public TextStyle textStyle;

    public AxisData(Object value) {
        this.value = value;
    }

    public AxisData(Object value, TextStyle textStyle) {
        this.value = value;
        this.textStyle = textStyle;
    }
}
