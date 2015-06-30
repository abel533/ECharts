package com.github.abel533.echarts.data;

import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 词云
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class WordCloudData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer value;
    private ItemStyle itemStyle;

    public WordCloudData() {
    }

    public WordCloudData(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public WordCloudData name(String name) {
        this.name = name;
        return this;
    }

    public String name() {
        return this.name;
    }

    public WordCloudData value(Integer value) {
        this.value = value;
        return this;
    }

    public Integer value() {
        return this.value;
    }

    public WordCloudData itemStyle(ItemStyle itemStyle) {
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

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
