/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.feature;

import com.github.abel533.echarts.style.LineStyle;
import com.github.abel533.echarts.style.TextStyle;

import java.io.Serializable;

/**
 * @author liuzh
 */
public class Feature implements Serializable {

    /**
     * 获取DataView值
     */
    public static final DataView dataView = new DataView();
    /**
     * 获取DataZoom值
     */
    public static final DataZoom dataZoom = new DataZoom();
    /**
     * 获取Mark值
     */
    public static final Mark mark = new Mark();
    /**
     * 获取SaveAsImage值
     */
    public static final SaveAsImage saveAsImage = new SaveAsImage();
    /**
     * 获取MagicType值
     */
    public static final MagicType magicType = new MagicType();
    /**
     * 获取Restore值
     */
    public static final Restore restore = new Restore();
    private static final long serialVersionUID = 8546465308711709471L;
    /**
     * 是否显示
     */
    private Boolean show;
    /**
     * 标题
     */
    private Object title;
    /**
     * 类型
     *
     * @see com.github.abel533.echarts.code.Magic
     * @see com.github.abel533.echarts.code.LineType
     */
    private Object type;
    /**
     * 只读
     */
    private Boolean readOnly;
    /**
     * lang 非IE浏览器支持点击下载，有保存话术，默认是“点击保存”，可修改
     */
    private Object lang;
    /**
     * 线条颜色
     *
     * @see com.github.abel533.echarts.style.LineStyle
     */
    private LineStyle lineStyle;
    /**
     * 文字颜色
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;
    /**
     * 图标，image://开头
     */
    private String icon;

    /**
     * 获取show值
     */
    public Boolean show() {
        return this.show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public Feature show(Boolean show) {
        this.show = show;
        return this;
    }

    /**
     * 获取title值
     */
    public Object title() {
        return this.title;
    }

    /**
     * 设置title值
     *
     * @param title
     */
    public Feature title(Object title) {
        this.title = title;
        return this;
    }

    /**
     * 获取type值
     */
    public Object type() {
        return this.type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public Feature type(Object type) {
        this.type = type;
        return this;
    }

    /**
     * 获取readOnly值
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * 设置readOnly值
     *
     * @param readOnly
     */
    public Feature readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * 获取lang值
     */
    public Object lang() {
        return this.lang;
    }

    /**
     * 设置lang值
     *
     * @param lang
     */
    public Feature lang(Object lang) {
        this.lang = lang;
        return this;
    }

    /**
     * 获取lineStyle值
     */
    public LineStyle lineStyle() {
        return this.lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public Feature lineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
        return this;
    }

    /**
     * 获取textStyle值
     */
    public TextStyle textStyle() {
        return this.textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public Feature textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取icon值
     */
    public String icon() {
        return this.icon;
    }

    /**
     * 设置icon值
     *
     * @param icon
     */
    public Feature icon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * 获取show值
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * 设置show值
     *
     * @param show
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * 获取title值
     */
    public Object getTitle() {
        return title;
    }

    /**
     * 设置title值
     *
     * @param title
     */
    public void setTitle(Object title) {
        this.title = title;
    }

    /**
     * 获取type值
     */
    public Object getType() {
        return type;
    }

    /**
     * 设置type值
     *
     * @param type
     */
    public void setType(Object type) {
        this.type = type;
    }

    /**
     * 获取readOnly值
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * 设置readOnly值
     *
     * @param readOnly
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * 获取lang值
     */
    public Object getLang() {
        return lang;
    }

    /**
     * 设置lang值
     *
     * @param lang
     */
    public void setLang(Object lang) {
        this.lang = lang;
    }

    /**
     * 获取lineStyle值
     */
    public LineStyle getLineStyle() {
        return lineStyle;
    }

    /**
     * 设置lineStyle值
     *
     * @param lineStyle
     */
    public void setLineStyle(LineStyle lineStyle) {
        this.lineStyle = lineStyle;
    }

    /**
     * 获取textStyle值
     */
    public TextStyle getTextStyle() {
        return textStyle;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    /**
     * 获取icon值
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置icon值
     *
     * @param icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
