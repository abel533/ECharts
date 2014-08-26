package com.github.abel533.echarts;

/**
 * Created by Administrator on 14-8-25.
 */
public interface Data {
    /**
     * data[]初始化大小
     */
    int INIT_SIZE = 10;

    /**
     * 添加元素
     *
     * @param data
     * @return
     */
    Data add(Object data);
}
