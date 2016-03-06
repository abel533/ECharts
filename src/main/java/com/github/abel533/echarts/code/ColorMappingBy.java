package com.github.abel533.echarts.code;

/**
 * 表示同一层级节点，在颜色列表中（参见 color 属性）选择时，按照什么来选择
 *
 * @author liuzh
 * @since 2016-02-28 10:58
 */
public enum ColorMappingBy {
    value,//将节点的值（即 series-treemap.data.value）映射到颜色列表中。这样得到的颜色，反应了节点值的大小。 可以使用 visualDimension 属性来设置，用 data 中那个纬度的值来映射
    index,//将节点的 index（序号）映射到颜色列表中。即同一层级中，第一个节点取颜色列表中第一个颜色，第二个节点取第二个。这样得到的颜色，便于区分相邻节点。
    id    //将节点的 id（即 series-treemap.data.id）映射到颜色列表中。id 是用户指定的，这样能够使得，在treemap 通过 setOption 变化数值时，同一 id 映射到同一颜色，保持一致性。
}
