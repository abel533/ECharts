package com.github.abel533.echarts.code;

/**
 * 图的布局 - graph
 *
 * @author liuzh
 * @since 2016-02-28 11:42
 */
public enum Layout {
    none,//不采用任何布局，使用节点中提供的 x， y 作为节点的位置
    circular,//采用环形布局
    force,//采用力引导布局
}
