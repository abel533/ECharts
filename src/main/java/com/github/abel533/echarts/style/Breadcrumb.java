package com.github.abel533.echarts.style;

import java.io.Serializable;

/**
 * 面包屑
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class Breadcrumb implements Serializable {
    private static final long serialVersionUID = 1L;
    private Boolean show;
    private TextStyle textStyle;

    public Breadcrumb() {
    }

    public Breadcrumb(Boolean show) {
        this.show = show;
    }

    public Breadcrumb(Boolean show, TextStyle textStyle) {
        this.show = show;
        this.textStyle = textStyle;
    }

    public Breadcrumb show(Boolean show) {
        this.show = show;
        return this;
    }

    public Boolean show() {
        return this.show;
    }

    public Breadcrumb textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }
}
