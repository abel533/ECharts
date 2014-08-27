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

import com.github.abel533.echarts.code.Align;
import com.github.abel533.echarts.feature.Feature;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuzh on 14-8-25.
 */
public class Toolbox extends Basic {
    /**
     * 默认false，显示策略，可选为：true（显示） | false（隐藏）
     */
    public Boolean show;

    /**
     * 布局方式，默认为水平布局，可选为：'horizontal' | 'vertical'
     *
     * @see com.github.abel533.echarts.code.Align
     */
    public Align orient;

    /**
     * 工具箱背景颜色，默认透明
     */
    public Object[] color;

    /**
     * 无效颜色
     */
    public String disableColor;

    /**
     * 激活颜色
     */
    public String effectiveColor;

    /**
     * 工具箱icon大小，单位（px）
     */
    public Integer itemSize;

    /**
     * 是否显示工具箱文字提示，默认启用
     */
    public Boolean showTitle;

    /**
     * 启用功能，目前支持feature见下，工具箱自定义功能回调处理
     */
    public Map<String, Feature> feature;

    /**
     * 添加组件
     *
     * @param values
     * @return
     */
    public Toolbox addFeature(Feature... values) {
        if (values == null && values.length == 0) {
            return this;
        }
        if (this.feature == null) {
            this.feature = new HashMap<String, Feature>();
        }
        for (Feature f : values) {
            //第一个字母转小写
            String name = f.getClass().getName();
            name = name.substring(0, 1).toLowerCase() + name.substring(1);
            if (!this.feature.containsKey(name)) {
                this.feature.put(name, f);
            }
        }
        return this;
    }
}
