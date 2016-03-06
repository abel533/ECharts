package com.github.abel533.echarts.series.other;

import com.github.abel533.echarts.code.ColorMappingBy;
import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;

/**
 * 多层配置 - treemap
 *
 * @author liuzh
 * @since 2016-02-28 10:52
 */
public class Level implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * treemap 中支持对数据其他维度进行视觉映射
     */
    private Integer visualDimension;
    /**
     * 表示同一层级的节点的 颜色 选取列表。默认为空时，选取系统color列表
     */
    private Object[] color;
    /**
     * 表示同一层级的节点的 颜色透明度 选取范围。数值范围 0 ~ 1
     */
    private Object[] colorAlpha;
    /**
     * 表示同一层级的节点的 颜色饱和度 选取范围。数值范围 0 ~ 1
     */
    private Double colorSaturation;
    /**
     * 表示同一层级节点，在颜色列表中（参见 color 属性）选择时，按照什么来选择
     */
    private Object colorMappingBy;
    /**
     * 如果某个节点的矩形的面积，小于这个数值（单位：px平方），这个节点就不显示
     */
    private Double visibleMin;
    /**
     * 如果某个节点的矩形面积，小于这个数值（单位：px平方），则不显示这个节点的子节点
     */
    private Double childrenVisibleMin;
    /**
     * 图形上的文本标签，课用于说明图形的一些数据信息，比如值，名称等，label选项在 ECharts 2.x 中放置于itemStyle.normal下，在 ECharts 3 中为了让整个配置项结构更扁平合理，label被拿出来跟 itemStyle 平级，并且跟 itemStyle 一样拥有 normal, emphasis 两个状态
     */
    private ItemStyle label;
    /**
     * 图形样式
     *
     * @see com.github.abel533.echarts.style.ItemStyle
     */
    private ItemStyle itemStyle;

    public ItemStyle label() {
        if (this.label == null) {
            this.label = new ItemStyle();
        }
        return this.label;
    }

    public Level label(ItemStyle label) {
        this.label = label;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public Level itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }


    public Integer visualDimension() {
        return this.visualDimension;
    }

    public Level visualDimension(Integer visualDimension) {
        this.visualDimension = visualDimension;
        return this;
    }

    public Object[] color() {
        return this.color;
    }

    public Level color(Object[] color) {
        this.color = color;
        return this;
    }

    public Object[] colorAlpha() {
        return this.colorAlpha;
    }

    public Level colorAlpha(Object[] colorAlpha) {
        this.colorAlpha = colorAlpha;
        return this;
    }

    public Double colorSaturation() {
        return this.colorSaturation;
    }

    public Level colorSaturation(Double colorSaturation) {
        this.colorSaturation = colorSaturation;
        return this;
    }

    public Object colorMappingBy() {
        return this.colorMappingBy;
    }

    public Level colorMappingBy(Object colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Level colorMappingBy(ColorMappingBy colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
        return this;
    }

    public Double visibleMin() {
        return this.visibleMin;
    }

    public Level visibleMin(Double visibleMin) {
        this.visibleMin = visibleMin;
        return this;
    }

    public Double childrenVisibleMin() {
        return this.childrenVisibleMin;
    }

    public Level childrenVisibleMin(Double childrenVisibleMin) {
        this.childrenVisibleMin = childrenVisibleMin;
        return this;
    }

    public Integer getVisualDimension() {
        return visualDimension;
    }

    public void setVisualDimension(Integer visualDimension) {
        this.visualDimension = visualDimension;
    }

    public Object[] getColor() {
        return color;
    }

    public void setColor(Object[] color) {
        this.color = color;
    }

    public Object[] getColorAlpha() {
        return colorAlpha;
    }

    public void setColorAlpha(Object[] colorAlpha) {
        this.colorAlpha = colorAlpha;
    }

    public Double getColorSaturation() {
        return colorSaturation;
    }

    public void setColorSaturation(Double colorSaturation) {
        this.colorSaturation = colorSaturation;
    }

    public Object getColorMappingBy() {
        return colorMappingBy;
    }

    public void setColorMappingBy(Object colorMappingBy) {
        this.colorMappingBy = colorMappingBy;
    }

    public Double getVisibleMin() {
        return visibleMin;
    }

    public void setVisibleMin(Double visibleMin) {
        this.visibleMin = visibleMin;
    }

    public Double getChildrenVisibleMin() {
        return childrenVisibleMin;
    }

    public void setChildrenVisibleMin(Double childrenVisibleMin) {
        this.childrenVisibleMin = childrenVisibleMin;
    }

    public ItemStyle getLabel() {
        return label;
    }

    public void setLabel(ItemStyle label) {
        this.label = label;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
