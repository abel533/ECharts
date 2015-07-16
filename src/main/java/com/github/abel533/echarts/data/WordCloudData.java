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

package com.github.abel533.echarts.data;

import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;

/**
 * 词云
 *
 * @author liuzh
 * @since 2015-06-29
 */
public class WordCloudData implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer value;
    private ItemStyle itemStyle;

    /**
     * 构造函数
     */
    public WordCloudData() {
    }

    /**
     * 构造函数,参数:name,value
     *
     * @param name
     * @param value
     */
    public WordCloudData(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 设置name值
     *
     * @param name
     */
    public WordCloudData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * 获取name值
     */
    public String name() {
        return this.name;
    }

    /**
     * 设置value值
     *
     * @param value
     */
    public WordCloudData value(Integer value) {
        this.value = value;
        return this;
    }

    /**
     * 获取value值
     */
	public Integer value() {
        return this.value;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public WordCloudData itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 获取itemStyle值
     */
	public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    /**
     * 获取name值
	 */
	public String getName() {
        return name;
    }

    /**
     * 设置name值
     *
     * @param name
     */
	public void setName(String name) {
        this.name = name;
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
     * 获取itemStyle值
     */
	public ItemStyle getItemStyle() {
        return itemStyle;
    }

    /**
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
