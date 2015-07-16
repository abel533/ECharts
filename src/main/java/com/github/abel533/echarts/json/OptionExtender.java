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

package com.github.abel533.echarts.json;

import com.github.abel533.echarts.Option;

/**
 * Option扩展类,目前实现了使用fastjson做生成json字符串
 *
 * @author zhangjunhui galaxist@vip.qq.com
 */
public class OptionExtender {

    private Option option;

    /**
     * 在浏览器中查看
     */
    public void view() {
        OptionUtil.browse(option);
    }

    /**
     * 获取option.
     *
     * @return the option
     * @since JDK 1.7
     */
    public Option getOption() {
        return option;
    }

    /**
     * 设置option.
     *
     * @param option the option to set
     * @since JDK 1.7
     */
    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    /**
     * 获取toString值
     */
    public String toString() {
        return FastJsonUtil.format(option);
    }
}
