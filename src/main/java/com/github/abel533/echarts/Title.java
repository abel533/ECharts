/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
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

package com.github.abel533.echarts;

import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.style.TextStyle;

/**
 * @author liuzh
 */
public class Title extends Basic<Title> implements Component {
    /**
     * 主标题文本，'\n'指定换行
     */
    private String text;
    /**
     * 主标题文本超链接
     */
    private String link;
    /**
     * 指定窗口打开主标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    private String target;
    /**
     * 副标题文本，'\n'指定换行
     */
    private String subtext;
    /**
     * 副标题文本超链接
     */
    private String sublink;
    /**
     * 指定窗口打开副标题超链接，支持'self' | 'blank'，不指定等同为'blank'（新窗口）
     */
    private String subtarget;
    /**
     * 水平对齐方式，默认根据x设置自动调整，可选为： left' | 'right' | 'center
     *
     * @see com.github.abel533.echarts.code.X
     */
    private X textAlign;
    /**
     * 主标题文本样式（详见textStyle）
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle textStyle;
    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    private TextStyle subtextStyle;

    public Title textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Title subtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
        return this;
    }

    public String text() {
        return this.text;
    }

    public Title text(String text) {
        this.text = text;
        return this;
    }

    public String link() {
        return this.link;
    }

    public Title link(String link) {
        this.link = link;
        return this;
    }

    public String target() {
        return this.target;
    }

    public Title target(String target) {
        this.target = target;
        return this;
    }

    public String subtext() {
        return this.subtext;
    }

    public Title subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    public String sublink() {
        return this.sublink;
    }

    public Title sublink(String sublink) {
        this.sublink = sublink;
        return this;
    }

    public String subtarget() {
        return this.subtarget;
    }

    public Title subtarget(String subtarget) {
        this.subtarget = subtarget;
        return this;
    }

    public X textAlign() {
        return this.textAlign;
    }

    public Title textAlign(X textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    /**
     * 主标题文本样式（详见textStyle）
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 默认值{color: '#aaa'}，副标题文本样式
     *
     * @see com.github.abel533.echarts.style.TextStyle
     */
    public TextStyle subtextStyle() {
        if (this.subtextStyle == null) {
            this.subtextStyle = new TextStyle();
        }
        return this.subtextStyle;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public TextStyle getSubtextStyle() {
        return subtextStyle;
    }

    public void setSubtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSubtext() {
        return subtext;
    }

    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    public String getSublink() {
        return sublink;
    }

    public void setSublink(String sublink) {
        this.sublink = sublink;
    }

    public String getSubtarget() {
        return subtarget;
    }

    public void setSubtarget(String subtarget) {
        this.subtarget = subtarget;
    }

    public X getTextAlign() {
        return textAlign;
    }

    public void setTextAlign(X textAlign) {
        this.textAlign = textAlign;
    }
}
