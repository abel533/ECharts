package com.github.abel533.echarts.json;

import com.github.abel533.echarts.Option;

/**
 * Option扩展类,目前实现了使用fastjson做生成json字符串
 *
 * @author zhangjunhui galaxist@vip.qq.com
 */
public class OptionExtender {

    /**
     * 在浏览器中查看
     */
    public void view() {
        OptionUtil.browse(option);
    }

    private Option option;

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
    public String toString() {
        return FastJsonUtil.format(option);
    }
}
