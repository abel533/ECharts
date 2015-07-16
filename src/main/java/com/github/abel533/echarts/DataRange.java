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

import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.SelectedMode;
import com.github.abel533.echarts.data.RangeData;
import com.github.abel533.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 值域选择，每个图表最多仅有一个值域控件
 *
 * @author liuzh
 */
public class DataRange extends Basic<DataRange> implements Component {
    /**
     * 布局方式，默认为垂直布局，可选为：'horizontal' | 'vertical'
     *
     * @see com.github.abel533.echarts.code.Orient
     */
    private Orient orient;
    /**
     * 默认值20，值域控件图形宽度
     */
    private Integer itemWidth;
    /**
     * 默认值14，值域控件图形高度
     */
    private Integer itemHeight;
    /**
     * 指定的最小值，eg: 0，默认无，必须参数
     */
    private Integer min;
    /**
     * 指定的最大值，eg: 100，默认无，必须参数
     */
    private Integer max;
    /**
     * 小数精度，默认为0，无小数点，当 min ~ max 间在当前精度下无法整除splitNumber份时，精度会自动提高以满足均分，不支持不等划分
     */
    private Integer precision;
    /**
     * 分割段数，默认为5，为0时为线性渐变，calculable为true是默认均分100份
     */
    private Integer splitNumber;
    /**
     * 是否启用值域漫游，启用后无视splitNumber，值域显示为线性渐变
     */
    private Boolean calculable;
    /**
     * 值域漫游是否实时显示
     */
    private Boolean realtime;
    /**
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识
     */
    private List<String> color;
    /**
     * 内容格式器：{string}（Template） | {Function}，模板变量为'{value}'和'{value2}'，代表数值起始值和结束值，函数参数两个，含义同模板变量
     */
    private Object formatter;
    /**
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高', '低']，'\n'指定换行
     */
    private List<String> text;
    /**
     * 默认只设定了值域控件文字颜色
     */
    private TextStyle textStyle;

    /**
     * 是否启用地图hover时的联动响应
     */
    private Boolean hoverLink;

    /**
     * 用于设置dataRange的初始选中范围。calculable为true时有效。
     */
    private RangeData range;
    /**
     * 自定义分割方式，支持不等距分割。splitList被指定时，splitNumber将被忽略。
     */
    private List<RangeData> splitList;
    /**
     * 选择模式，默认开启图例开关
     *
     * @see com.github.abel533.echarts.code.SelectedMode
     */
    private Object selectedMode;

    /**
     * 获取selectedMode值
     */
    public Object selectedMode() {
        return this.selectedMode;
    }

    /**
     * 设置selectedMode值
     *
     * @param selectedMode
     */
    public DataRange selectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    /**
     * 设置selectedMode值
     *
     * @param selectedMode
     */
    public DataRange selectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    /**
     * 设置range值
     *
     * @param range
     */
    public DataRange range(RangeData range) {
        this.range = range;
        return this;
    }

    /**
     * 获取range值
     */
	public RangeData range() {
        return this.range;
    }

    /**
     * 设置splitList值
     *
     * @param splitList
     */
    public DataRange splitList(RangeData... splitList) {
        if (splitList == null || splitList.length == 0) {
            return this;
        }
        this.splitList().addAll(Arrays.asList(splitList));
        return this;
    }

    /**
     * 获取splitList值
     */
	public List<RangeData> splitList() {
        if (this.splitList == null) {
            this.splitList = new ArrayList<RangeData>();
        }
        return this.splitList;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public DataRange color(List<String> color) {
        this.color = color;
        return this;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public DataRange text(List<String> text) {
        this.text = text;
        return this;
    }

    /**
     * 获取hoverLink值
     */
    public Boolean hoverLink() {
        return this.hoverLink;
    }

    /**
     * 设置hoverLink值
     *
     * @param hoverLink
     */
    public DataRange hoverLink(Boolean hoverLink) {
        this.hoverLink = hoverLink;
        return this;
    }

    /**
     * 获取orient值
     */
    public Orient getOrient() {
        return orient;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
    public void setOrient(Orient orient) {
        this.orient = orient;
    }

    /**
     * 获取itemWidth值
     */
    public Integer getItemWidth() {
        return itemWidth;
    }

    /**
     * 设置itemWidth值
     *
     * @param itemWidth
     */
    public void setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
    }

    /**
     * 获取itemHeight值
     */
    public Integer getItemHeight() {
        return itemHeight;
    }

    /**
     * 设置itemHeight值
     *
     * @param itemHeight
     */
    public void setItemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
    }

    /**
     * 获取min值
     */
    public Integer getMin() {
        return min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public void setMin(Integer min) {
        this.min = min;
    }

    /**
     * 获取max值
     */
    public Integer getMax() {
        return max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public void setMax(Integer max) {
        this.max = max;
    }

    /**
     * 获取precision值
     */
    public Integer getPrecision() {
        return precision;
    }

    /**
     * 设置precision值
     *
     * @param precision
     */
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    /**
     * 获取splitNumber值
     */
    public Integer getSplitNumber() {
        return splitNumber;
    }

    /**
     * 设置splitNumber值
     *
     * @param splitNumber
     */
    public void setSplitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
    }

    /**
     * 获取calculable值
     */
    public Boolean getCalculable() {
        return calculable;
    }

    /**
     * 设置calculable值
     *
     * @param calculable
     */
    public void setCalculable(Boolean calculable) {
        this.calculable = calculable;
    }

    /**
     * 获取realtime值
     */
    public Boolean getRealtime() {
        return realtime;
    }

    /**
     * 设置realtime值
     *
     * @param realtime
     */
    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    /**
     * 获取formatter值
     */
    public Object getFormatter() {
        return formatter;
    }

    /**
     * 设置formatter值
     *
     * @param formatter
     */
    public void setFormatter(Object formatter) {
        this.formatter = formatter;
    }

    /**
     * 设置textStyle值
     *
     * @param textStyle
     */
    public DataRange textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    /**
     * 获取orient值
     */
    public Orient orient() {
        return this.orient;
    }

    /**
     * 设置orient值
     *
     * @param orient
     */
    public DataRange orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    /**
     * 获取itemWidth值
     */
    public Integer itemWidth() {
        return this.itemWidth;
    }

    /**
     * 设置itemWidth值
     *
     * @param itemWidth
     */
    public DataRange itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    /**
     * 获取itemHeight值
     */
    public Integer itemHeight() {
        return this.itemHeight;
    }

    /**
     * 设置itemHeight值
     *
     * @param itemHeight
     */
    public DataRange itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    /**
     * 获取min值
     */
    public Integer min() {
        return this.min;
    }

    /**
     * 设置min值
     *
     * @param min
     */
    public DataRange min(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * 获取max值
     */
    public Integer max() {
        return this.max;
    }

    /**
     * 设置max值
     *
     * @param max
     */
    public DataRange max(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * 获取precision值
     */
    public Integer precision() {
        return this.precision;
    }

    /**
     * 设置precision值
     *
     * @param precision
     */
    public DataRange precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    /**
     * 获取splitNumber值
     */
    public Integer splitNumber() {
        return this.splitNumber;
    }

    /**
     * 设置splitNumber值
     *
     * @param splitNumber
     */
    public DataRange splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    /**
     * 获取calculable值
     */
    public Boolean calculable() {
        return this.calculable;
    }

    /**
     * 设置calculable值
     *
     * @param calculable
     */
    public DataRange calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    /**
     * 获取realtime值
     */
    public Boolean realtime() {
        return this.realtime;
    }

    /**
     * 设置realtime值
     *
     * @param realtime
     */
    public DataRange realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    /**
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识
     */
    public List<String> color() {
        if (this.color == null) {
            this.color = new ArrayList<String>();
        }
        return this.color;
    }

    /**
     * 值域颜色标识，颜色数组长度必须>=2，颜色代表从数值高到低的变化，即颜色数组低位代表数值高的颜色标识
     *
     * @param colors
     * @return
     */
    public DataRange color(String... colors) {
        if (colors == null || colors.length == 0) {
            return this;
        }
        this.color().addAll(Arrays.asList(colors));
        return this;
    }

    /**
     * 获取formatter值
     */
    public Object formatter() {
        return this.formatter;
    }

    /**
     * 设置formatter值
     *
     * @param formatter
     */
    public DataRange formatter(Object formatter) {
        this.formatter = formatter;
        return this;
    }

    /**
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高', '低']，'\n'指定换行
     */
    public List<String> text() {
        if (this.text == null) {
            this.text = new ArrayList<String>();
        }
        return this.text;
    }

    /**
     * 值域文字显示，splitNumber生效时默认以计算所得数值作为值域文字显示，可指定长度为2的文本数组显示简介的值域文本，如['高', '低']，'\n'指定换行
     *
     * @param texts
     * @return
     */
    public DataRange text(String... texts) {
        if (texts == null || texts.length == 0) {
            return this;
        }
        this.text().addAll(Arrays.asList(texts));
        return this;
    }

    /**
     * 默认只设定了值域控件文字颜色
     */
    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    /**
     * 获取color值
     */
    public List<String> getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(List<String> color) {
        this.color = color;
    }

    /**
     * 获取text值
     */
    public List<String> getText() {
        return text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public void setText(List<String> text) {
        this.text = text;
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
     * 获取hoverLink值
     */
    public Boolean getHoverLink() {
        return hoverLink;
    }

    /**
     * 设置hoverLink值
     *
     * @param hoverLink
     */
    public void setHoverLink(Boolean hoverLink) {
        this.hoverLink = hoverLink;
    }

    /**
     * 获取range值
     */
	public RangeData getRange() {
        return range;
    }

    /**
     * 设置range值
     *
     * @param range
     */
    public void setRange(RangeData range) {
        this.range = range;
    }

    /**
     * 获取splitList值
     */
    public List<RangeData> getSplitList() {
        return splitList;
    }

    /**
     * 设置splitList值
     *
     * @param splitList
     */
    public void setSplitList(List<RangeData> splitList) {
        this.splitList = splitList;
    }

    /**
     * 获取selectedMode值
     */
	public Object getSelectedMode() {
        return selectedMode;
    }

    /**
     * 设置selectedMode值
     *
     * @param selectedMode
     */
    public void setSelectedMode(Object selectedMode) {
        this.selectedMode = selectedMode;
    }
}
