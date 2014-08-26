package com.github.abel533.echarts;

/**
 * Created by Administrator on 14-8-25.
 */
public interface Data<T> {
    /**
     * 添加元素
     *
     * @param data
     * @return
     */
    T addData(Object... data);
}
