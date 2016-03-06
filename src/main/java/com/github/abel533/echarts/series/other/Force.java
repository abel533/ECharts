package com.github.abel533.echarts.series.other;

import com.github.abel533.echarts.code.Layout;

import java.io.Serializable;

/**
 * 力引导布局相关的配置项
 *
 * @author liuzh
 * @since 2016-02-28 11:44
 */
public class Force implements Serializable {
    private static final long serialVersionUID = 1L;

    private Object initLayout;
    private Integer repulsion;
    private Integer gravity;
    private Integer edgeLength;
    private Boolean layoutAnimation;

    public Object initLayout() {
        return this.initLayout;
    }

    public Force initLayout(Object initLayout) {
        this.initLayout = initLayout;
        return this;
    }

    public Force initLayout(String initLayout) {
        this.initLayout = initLayout;
        return this;
    }

    public Force initLayout(Layout initLayout) {
        this.initLayout = initLayout;
        return this;
    }

    public Integer repulsion() {
        return this.repulsion;
    }

    public Force repulsion(Integer repulsion) {
        this.repulsion = repulsion;
        return this;
    }

    public Integer gravity() {
        return this.gravity;
    }

    public Force gravity(Integer gravity) {
        this.gravity = gravity;
        return this;
    }

    public Integer edgeLength() {
        return this.edgeLength;
    }

    public Force edgeLength(Integer edgeLength) {
        this.edgeLength = edgeLength;
        return this;
    }

    public Boolean layoutAnimation() {
        return this.layoutAnimation;
    }

    public Force layoutAnimation(Boolean layoutAnimation) {
        this.layoutAnimation = layoutAnimation;
        return this;
    }

    public Object getInitLayout() {
        return initLayout;
    }

    public void setInitLayout(Object initLayout) {
        this.initLayout = initLayout;
    }

    public Integer getRepulsion() {
        return repulsion;
    }

    public void setRepulsion(Integer repulsion) {
        this.repulsion = repulsion;
    }

    public Integer getGravity() {
        return gravity;
    }

    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    public Integer getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(Integer edgeLength) {
        this.edgeLength = edgeLength;
    }

    public Boolean getLayoutAnimation() {
        return layoutAnimation;
    }

    public void setLayoutAnimation(Boolean layoutAnimation) {
        this.layoutAnimation = layoutAnimation;
    }
}
