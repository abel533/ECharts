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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 同一事件的的演化过程，每一个数组项为Object {}，内容如下
 *
 * @author liuzh
 */
public class Evolution implements Serializable {

    private static final long serialVersionUID = -3014023133802074740L;

    private static final SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private String time;
    private Integer value;
    /**
     * 事件的详细信息
     */
    private Detail detail;

    /**
     * 构造方法
     */
    public Evolution() {
    }

    /**
     * 构造方法
     *
     * @param time
     * @param value
     */
    public Evolution(String time, Integer value) {
        this.time = time;
        this.value = value;
    }

    /**
     * 获取time值
     */
    public String time() {
        return this.time;
    }

    /**
     * 设置time值
     *
     * @param time
     */
    public Evolution time(String time) {
        this.time = time;
        return this;
    }

    /**
     * 设置time值，默认yyyy-MM-dd,其他情况建议使用字符串类型的时间
     *
     * @param time
     */
    public Evolution time(Date time) {
        this.time = FORMAT.format(time);
        return this;
    }

    /**
     * 获取value值
     */
    public Integer value() {
        return this.value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public Evolution value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 获取detail值
     */
    public Detail detail() {
        return this.detail;
    }

    /**
     * 设置detail值
     *
     * @param detail
     */
    public Evolution detail(Detail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 设置detail值
     *
     * @param link
     * @param text
     */
    public Evolution detail(String link, String text) {
        this.detail = new Detail(link, text);
        return this;
    }

    /**
     * 设置detail值
     *
     * @param link
     * @param text
     * @param img
     */
    public Evolution detail(String link, String text, String img) {
        this.detail = new Detail(link, text, img);
        return this;
    }

    /**
     * 获取time值
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置time值
     *
     * @param time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 获取value值
     */
    public Integer getValue() {
        return value;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public void setValue(Integer value) {
        this.value = value;
    }

    /**
     * 获取detail值
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * 设置detail值
     *
     * @param detail
     */
    public void setDetail(Detail detail) {
        this.detail = detail;
    }
}
