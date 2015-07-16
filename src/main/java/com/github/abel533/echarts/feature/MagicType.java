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

import com.github.abel533.echarts.code.Magic;
import com.github.abel533.echarts.series.Funnel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuzh
 */
public class MagicType extends Feature {
    private Option option;

    /**
     * 构造函数,参数:magics
     *
     * @param magics
     */
    public MagicType(Magic... magics) {
        this.show(true);
        Map title = new HashMap<String, String>();
        title.put("line", "折线图切换");
        title.put("bar", "柱形图切换");
        title.put("stack", "堆积");
        title.put("tiled", "平铺");
        this.title(title);
        if (magics == null || magics.length == 0) {
            this.type(new Object[]{Magic.bar, Magic.line, Magic.stack, Magic.tiled});
        } else {
            this.type(magics);
        }
    }

    /**
     * 设置Option
     *
     * @param option
     * @return
     */
    public Feature option(Option option) {
        this.option = option;
        return this;
    }

    /**
     * 获取Option
     *
     * @return
     */
    public Option option() {
        return this.option;
    }

    /**
     * 获取option值
     *
     * @return
     */
    public Option getOption() {
        return option;
    }

    /**
     * 设置option
     *
     * @param option
     */
    public void setOption(Option option) {
        this.option = option;
    }

    /**
     * 内部类 Option
     */
    public static class Option {
        private Funnel funnel;

        /**
         * 设置funnel值
         *
         * @param funnel
         */
        public Option funnel(Funnel funnel) {
            this.funnel = funnel;
            return this;
        }

        /**
         * 获取funnel值
         */
        public Funnel funnel() {
        return this.funnel;
    }

        /**
         * 获取funnel值
         */
	public Funnel getFunnel() {
        return funnel;
    }

        /**
         * 设置funnel值
         *
         * @param funnel
         */
        public void setFunnel(Funnel funnel) {
            this.funnel = funnel;
        }
    }
}
