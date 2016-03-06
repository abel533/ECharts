package com.github.abel533.echarts.style;

import com.github.abel533.echarts.code.FontStyle;
import com.github.abel533.echarts.code.FontWeight;

import java.io.Serializable;

/**
 * 坐标轴名称的文字样式
 *
 * @author liuzh
 * @since 2016-02-28 17:21
 */
public class NameTextStyle implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 坐标轴名称文字的颜色
     */
    private String color;
    /**
     * 坐标轴名称文字字体的风格
     */
    private FontStyle fontStyle;
    /**
     * 坐标轴名称文字字体的粗细
     */
    private FontWeight fontWeight;
    /**
     * 坐标轴名称文字的字体系列
     */
    private String fontFamily;
    /**
     * 坐标轴名称文字的字体大小
     */
    private Double fontSize;

    public String color() {
        return this.color;
    }

    public NameTextStyle color(String color) {
        this.color = color;
        return this;
    }

    public FontStyle fontStyle() {
        return this.fontStyle;
    }

    public NameTextStyle fontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        return this;
    }

    public FontWeight fontWeight() {
        return this.fontWeight;
    }

    public NameTextStyle fontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
        return this;
    }

    public String fontFamily() {
        return this.fontFamily;
    }

    public NameTextStyle fontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public Double fontSize() {
        return this.fontSize;
    }

    public NameTextStyle fontSize(Double fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FontStyle getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(FontStyle fontStyle) {
        this.fontStyle = fontStyle;
    }

    public FontWeight getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Double getFontSize() {
        return fontSize;
    }

    public void setFontSize(Double fontSize) {
        this.fontSize = fontSize;
    }
}
