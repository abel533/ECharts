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
    /**
     * 属性offsetCenter用于详情定位，数组为横纵相对仪表盘圆心坐标偏移，支持百分比（相对外半径）
     */
    private Object offsetCenter;

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public Title textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 设置subtextStyle值
     *
     * @param subtextStyle
     */
    public Title subtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
        return this;
    }

    /**
     * 获取text值
     */
    public String text() {
        return this.text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public Title text(String text) {
        this.text = text;
        return this;
    }

    /**
     * 获取link值
     */
    public String link() {
        return this.link;
    }

    /**
     * 设置link值
     *
     * @param link
     */
    public Title link(String link) {
        this.link = link;
        return this;
    }

    /**
     * 获取target值
     */
    public String target() {
        return this.target;
    }

    /**
     * 设置target值
     *
     * @param target
     */
    public Title target(String target) {
        this.target = target;
        return this;
    }

    /**
     * 获取subtext值
     */
    public String subtext() {
        return this.subtext;
    }

    /**
     * 设置subtext值
     *
     * @param subtext
     */
    public Title subtext(String subtext) {
        this.subtext = subtext;
        return this;
    }

    /**
     * 获取sublink值
     */
    public String sublink() {
        return this.sublink;
    }

    /**
     * 设置sublink值
     *
     * @param sublink
     */
    public Title sublink(String sublink) {
        this.sublink = sublink;
        return this;
    }

    /**
     * 获取subtarget值
     */
    public String subtarget() {
        return this.subtarget;
    }

    /**
     * 设置subtarget值
     *
     * @param subtarget
     */
    public Title subtarget(String subtarget) {
        this.subtarget = subtarget;
        return this;
    }

    /**
     * 获取textAlign值
     */
    public X textAlign() {
        return this.textAlign;
    }

    /**
     * 设置textAlign值
     *
     * @param textAlign
     */
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

    /**
     * 获取offsetCenter值
     */
    public Object offsetCenter() {
        return this.offsetCenter;
    }

    /**
     * 设置offsetCenter值
     *
     * @param offsetCenter
     */
    public Title offsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
        return this;
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
     * 获取subtextStyle值
     */
    public TextStyle getSubtextStyle() {
        return subtextStyle;
    }

    /**
     * 设置subtextStyle值
     *
     * @param subtextStyle
     */
    public void setSubtextStyle(TextStyle subtextStyle) {
        this.subtextStyle = subtextStyle;
    }

    /**
     * 获取text值
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取link值
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置link值
     *
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取target值
     */
    public String getTarget() {
        return target;
    }

    /**
     * 设置target值
     *
     * @param target
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * 获取subtext值
     */
    public String getSubtext() {
        return subtext;
    }

    /**
     * 设置subtext值
     *
     * @param subtext
     */
    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    /**
     * 获取sublink值
     */
    public String getSublink() {
        return sublink;
    }

    /**
     * 设置sublink值
     *
     * @param sublink
     */
    public void setSublink(String sublink) {
        this.sublink = sublink;
    }

    /**
     * 获取subtarget值
     */
    public String getSubtarget() {
        return subtarget;
    }

    /**
     * 设置subtarget值
     *
     * @param subtarget
     */
    public void setSubtarget(String subtarget) {
        this.subtarget = subtarget;
    }

    /**
     * 获取textAlign值
     */
    public X getTextAlign() {
        return textAlign;
    }

    /**
     * 设置textAlign值
     *
     * @param textAlign
     */
    public void setTextAlign(X textAlign) {
        this.textAlign = textAlign;
    }

    /**
     * 获取offsetCenter值
     */
    public Object getOffsetCenter() {
        return offsetCenter;
    }


    /**
     * 设置offsetCenter值
     *
     * @param offsetCenter
     */
    public void setOffsetCenter(Object offsetCenter) {
        this.offsetCenter = offsetCenter;
    }
}
