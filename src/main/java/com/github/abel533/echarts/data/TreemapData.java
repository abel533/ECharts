package com.github.abel533.echarts.data;

import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 数据列表，每一个数组项为Object {}
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class TreemapData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer value;
    private List<TreemapData> children;
    private ItemStyle itemStyle;

    public TreemapData() {
    }

    public TreemapData(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public TreemapData name(String name) {
        this.name = name;
        return this;
    }

    public String name() {
        return this.name;
    }

    public TreemapData value(Integer value) {
        this.value = value;
        return this;
    }

    public Integer value() {
        return this.value;
    }

    public TreemapData children(TreemapData... treemapDatas) {
        if (treemapDatas == null || treemapDatas.length == 0) {
            return this;
        }
        this.children().addAll(Arrays.asList(treemapDatas));
        return this;
    }

    public List<TreemapData> children() {
        if (this.children == null) {
            this.children = new LinkedList<TreemapData>();
        }
        return this.children;
    }

    public TreemapData itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public List<TreemapData> getChildren() {
        return children;
    }

    public void setChildren(List<TreemapData> children) {
        this.children = children;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
