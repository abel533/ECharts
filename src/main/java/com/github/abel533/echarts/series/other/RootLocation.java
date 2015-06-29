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

    public RootLocation(Object x, Object y) {
        this.x = x;
        this.y = y;
    }

    private RootLocation x(X x) {
        this.x = x;
        return this;
    }

    private RootLocation x(Integer x) {
        this.x = x;
        return this;
    }

    private RootLocation x(String x) {
        this.x = x;
        return this;
    }

    private RootLocation x(Object x) {
        this.x = x;
        return this;
    }

    private Object x() {
        return this.x;
    }

    private RootLocation y(Y y) {
        this.y = y;
        return this;
    }

    private RootLocation y(Integer y) {
        this.y = y;
        return this;
    }

    private RootLocation y(String y) {
        this.y = y;
        return this;
    }

    private RootLocation y(Object y) {
        this.y = y;
        return this;
    }

    private Object y() {
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
