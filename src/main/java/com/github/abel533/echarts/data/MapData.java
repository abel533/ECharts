package com.github.abel533.echarts.data;

/**
 * Description: MapData
 * Author: liuzh
 * Update: liuzh(2014-08-26 13:09)
 */
public class MapData {
    public String name;
    public Object value;
    public Boolean selected;

    public MapData(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public MapData(String name, Object value, Boolean selected) {
        this.name = name;
        this.value = value;
        this.selected = selected;
    }
}
