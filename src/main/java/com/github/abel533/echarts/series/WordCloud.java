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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 词云图
 *
 * @author liuzh
 */
public class WordCloud extends Series<WordCloud> {
    private Object[] center;
    private Object[] size;
    private List<Integer> textRotation;
    private AutoSize autoSize;
    private Integer textPadding;

    /**
     * 构造函数
     */
    public WordCloud() {
        this.type(SeriesType.wordCloud);
    }

    /**
     * 构造函数,参数:name
     *
     * @param name
     */
    public WordCloud(String name) {
        super(name);
        this.type(SeriesType.wordCloud);
    }

    /**
     * 设置textPadding值
     *
     * @param textPadding
     */
    public WordCloud textPadding(Integer textPadding) {
        this.textPadding = textPadding;
        return this;
    }

    /**
     * 获取textPadding值
     */
    public Integer textPadding() {
        return this.textPadding;
    }

    /**
     * 设置val1,val2值
     *
     * @param val1
     * @param val2
     */
    public WordCloud center(Object val1, Object val2) {
        this.center = new Object[2];
        this.center[0] = val1;
        this.center[1] = val2;
        return this;
    }

    /**
     * 获取center值
     */
    public Object[] center() {
        if (this.center == null) {
            this.center = new Object[2];
        }
        return this.center;
    }

    /**
     * 设置val1,val2值
     *
     * @param val1
     * @param val2
     */
    public WordCloud size(Object val1, Object val2) {
        this.size = new Object[2];
        this.size[0] = val1;
        this.size[1] = val2;
        return this;
    }

    /**
     * 获取size值
	 */
	public Object[] size() {
        if (this.size == null) {
            this.size = new Object[2];
        }
        return this.size;
    }

    /**
     * 设置textRotation值
     *
     * @param textRotation
     */
    public WordCloud textRotation(Integer... textRotation) {
        if (textRotation == null || textRotation.length == 0) {
            return this;
        }
        this.textRotation().addAll(Arrays.asList(textRotation));
        return this;
    }

    /**
     * 获取textRotation值
     */
	public List<Integer> textRotation() {
        if (this.textRotation == null) {
            this.textRotation = new LinkedList<Integer>();
        }
        return this.textRotation;
    }

    /**
     * 设置autoSize值
     *
     * @param autoSize
     */
	public WordCloud autoSize(AutoSize autoSize) {
        this.autoSize = autoSize;
        return this;
    }

    /**
     * 获取autoSize值
     */
    public AutoSize autoSize() {
        if (this.autoSize == null) {
            this.autoSize = new AutoSize();
        }
        return this.autoSize;
    }

    /**
     * 获取center值
     */
    public Object[] getCenter() {
        return center;
    }

    /**
     * 设置center值
     *
     * @param center
     */
	public void setCenter(Object[] center) {
        this.center = center;
    }

	/**
     * 获取size值
	 */
    public Object[] getSize() {
        return size;
    }

    /**
     * 设置size值
     *
     * @param size
     */
	public void setSize(Object[] size) {
        this.size = size;
    }

    /**
     * 获取textRotation值
     */
	public List<Integer> getTextRotation() {
        return textRotation;
    }

    /**
     * 设置textRotation值
     *
     * @param textRotation
     */
    public void setTextRotation(List<Integer> textRotation) {
        this.textRotation = textRotation;
    }

	/**
     * 获取autoSize值
	 */
    public AutoSize getAutoSize() {
        return autoSize;
    }

    /**
     * 设置autoSize值
     *
     * @param autoSize
     */
	public void setAutoSize(AutoSize autoSize) {
        this.autoSize = autoSize;
    }

	/**
     * 获取textPadding值
	 */
	public Integer getTextPadding() {
        return textPadding;
    }

    /**
     * 设置textPadding值
     *
     * @param textPadding
     */
	public void setTextPadding(Integer textPadding) {
        this.textPadding = textPadding;
    }

    public static class AutoSize implements Serializable {
        private static final long serialVersionUID = 1L;
        private Boolean enable;
        private Integer minSize;

        /**
         * 构造函数
         */
        public AutoSize() {
        }

        /**
         * 构造函数,参数:enable,minSize
         *
         * @param enable
         * @param minSize
         */
	public AutoSize(Boolean enable, Integer minSize) {
        this.enable = enable;
        this.minSize = minSize;
    }

        /**
         * 设置enable值
         *
	 * @param enable
	 */
	public AutoSize enable(Boolean enable) {
        this.enable = enable;
        return this;
        }

	/**
     * 获取enable值
     */
    public Boolean enable() {
        return this.enable;
    }

        /**
         * 设置minSize值
         *
	 * @param minSize
	 */
	public AutoSize minSize(Integer minSize) {
        this.minSize = minSize;
        return this;
        }

	/**
     * 获取minSize值
     */
    public Integer minSize() {
        return this.minSize;
        }

	/**
     * 获取enable值
     */
    public Boolean getEnable() {
        return enable;
    }

        /**
         * 设置enable值
         *
	 * @param enable
	 */
	public void setEnable(Boolean enable) {
        this.enable = enable;
        }

	/**
     * 获取minSize值
     */
    public Integer getMinSize() {
        return minSize;
    }

        /**
         * 设置minSize值
         *
	 * @param minSize
	 */
	public void setMinSize(Integer minSize) {
            this.minSize = minSize;
        }
    }
}
