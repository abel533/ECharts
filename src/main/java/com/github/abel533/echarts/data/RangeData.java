package com.github.abel533.echarts.data;

import java.io.Serializable;

/**
 * 描述信息
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class RangeData implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer end;

    private String label;
    private Object color;

    public RangeData() {
    }

    public RangeData(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public RangeData start(Integer start) {
        this.start = start;
        return this;
    }

    public Integer start() {
        return this.start;
    }

    public RangeData end(Integer end) {
        this.end = end;
        return this;
    }

    public Integer end() {
        return this.end;
    }

    public RangeData label(String label) {
        this.label = label;
        return this;
    }

    public String label() {
        return this.label;
    }

    public RangeData color(Object color) {
        this.color = color;
        return this;
    }

    public Object color() {
        return this.color;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }
}
