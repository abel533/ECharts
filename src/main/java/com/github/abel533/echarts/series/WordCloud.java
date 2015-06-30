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

package com.github.abel533.echarts.series;

import com.github.abel533.echarts.code.SeriesType;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 雷达图
 *
 * @author liuzh
 */
public class WordCloud extends Series<WordCloud> {
    private Object[] center;
    private Object[] size;
    private List<Integer> textRotation;
    private AutoSize autoSize;
    private Integer textPadding;

    public static class AutoSize implements Serializable {
        private static final long serialVersionUID = 1L;
        private Boolean enable;
        private Integer minSize;

        public AutoSize() {
        }

        public AutoSize(Boolean enable, Integer minSize) {
            this.enable = enable;
            this.minSize = minSize;
        }

        public AutoSize enable(Boolean enable){
            this.enable = enable;
            return this;
        }

        public Boolean enable(){
            return this.enable;
        }

        public AutoSize minSize(Integer minSize){
            this.minSize = minSize;
            return this;
        }

        public Integer minSize(){
            return this.minSize;
        }

        public Boolean getEnable() {
            return enable;
        }

        public void setEnable(Boolean enable) {
            this.enable = enable;
        }

        public Integer getMinSize() {
            return minSize;
        }

        public void setMinSize(Integer minSize) {
            this.minSize = minSize;
        }
    }

    public WordCloud textPadding(Integer textPadding){
        this.textPadding = textPadding;
        return this;
    }

    public Integer textPadding(){
        return this.textPadding;
    }

    public WordCloud center(Object val1, Object val2) {
        this.center = new Object[2];
        this.center[0] = val1;
        this.center[1] = val2;
        return this;
    }

    public Object[] center() {
        if (this.center == null) {
            this.center = new Object[2];
        }
        return this.center;
    }

    public WordCloud size(Object val1, Object val2) {
        this.size = new Object[2];
        this.size[0] = val1;
        this.size[1] = val2;
        return this;
    }

    public Object[] size() {
        if (this.size == null) {
            this.size = new Object[2];
        }
        return this.size;
    }

    public WordCloud textRotation(Integer... textRotation) {
        if(textRotation == null || textRotation.length == 0){
            return this;
        }
        this.textRotation().addAll(Arrays.asList(textRotation));
        return this;
    }

    public List<Integer> textRotation() {
        if (this.textRotation == null) {
            this.textRotation = new LinkedList<Integer>();
        }
        return this.textRotation;
    }

    public WordCloud autoSize(AutoSize autoSize) {
        this.autoSize = autoSize;
        return this;
    }

    public AutoSize autoSize() {
        if(this.autoSize == null){
            this.autoSize = new AutoSize();
        }
        return this.autoSize;
    }

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

    public Object[] getCenter() {
        return center;
    }

    public void setCenter(Object[] center) {
        this.center = center;
    }

    public Object[] getSize() {
        return size;
    }

    public void setSize(Object[] size) {
        this.size = size;
    }

    public List<Integer> getTextRotation() {
        return textRotation;
    }

    public void setTextRotation(List<Integer> textRotation) {
        this.textRotation = textRotation;
    }

    public AutoSize getAutoSize() {
        return autoSize;
    }

    public void setAutoSize(AutoSize autoSize) {
        this.autoSize = autoSize;
    }

    public Integer getTextPadding() {
        return textPadding;
    }

    public void setTextPadding(Integer textPadding) {
        this.textPadding = textPadding;
    }
}
