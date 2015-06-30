package com.github.abel533.echarts.series.other;

import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.code.Y;

import java.io.Serializable;

/**
 * 描述信息
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class RootLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    private Object x;
    private Object y;

    public RootLocation() {
    }

    public RootLocation(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    public RootLocation x(X x) {
        this.x = x;
        return this;
    }

    public RootLocation x(Integer x) {
        this.x = x;
        return this;
    }

    public RootLocation x(String x) {
        this.x = x;
        return this;
    }

    public RootLocation x(Object x) {
        this.x = x;
        return this;
    }

    public Object x() {
        return this.x;
    }

    public RootLocation y(Y y) {
        this.y = y;
        return this;
    }

    public RootLocation y(Integer y) {
        this.y = y;
        return this;
    }

    public RootLocation y(String y) {
        this.y = y;
        return this;
    }

    public RootLocation y(Object y) {
        this.y = y;
        return this;
    }

    public Object y() {
        return this.y;
    }

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}
