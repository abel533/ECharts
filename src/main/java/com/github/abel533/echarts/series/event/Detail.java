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

package com.github.abel533.echarts.series.event;

import java.io.Serializable;

/**
 * 事件的详细信息
 *
 * @author liuzh
 */
public class Detail implements Serializable {

    private static final long serialVersionUID = 680903438457621422L;

    private String link;
    private String text;
    private String img;

    /**
     * 构造方法
     */
    public Detail() {
    }

    /**
     * 构造方法
     *
     * @param link
     * @param text
     */
    public Detail(String link, String text) {
        this.link = link;
        this.text = text;
    }

    /**
     * 构造方法
     *
     * @param link
     * @param text
     * @param img
     */
    public Detail(String link, String text, String img) {
        this.link = link;
        this.text = text;
        this.img = img;
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
    public Detail link(String link) {
        this.link = link;
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
    public Detail text(String text) {
        this.text = text;
        return this;
    }

    /**
     * 获取img值
     */
    public String img() {
        return this.img;
    }

    /**
     * 设置img值
     *
     * @param img
     */
    public Detail img(String img) {
        this.img = img;
        return this;
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
     * 获取img值
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置img值
     *
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }
}
