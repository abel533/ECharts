package com.github.abel533.echarts;

/**
 * Created by Administrator on 14-8-27.
 */
public interface Data<T> {
    /**
     * 添加元素
     *
     * @param values
     * @return
     */
    T addData(Object... values);
}
