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

import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.series.Series;
import com.github.abel533.echarts.style.ItemStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description: Option
 *
 * @author liuzh
 */
public class Option {
    /**
     * 全图默认背景，（详见backgroundColor），默认为无，透明
     */
    private Object backgroundColor;
    /**
     * 数值系列的颜色列表，（详见color），可配数组，eg：['#87cefa', 'rgba(123,123,123,0.5)','...']，当系列数量个数比颜色列表长度大时将循环选取
     */
    private Object[] color;
    /**
     * 非IE8-支持渲染为图片，（详见renderAsImage）
     * {boolean | string} false，非IE8-支持渲染为图片，可设为true或指定图片格式（png | jpeg），渲染为图片后实例依然可用（如setOption，resize等），但各种交互失效
     */
    private Object renderAsImage;
    /**
     * 是否启用拖拽重计算特性，默认关闭，（详见calculable，相关的还有 calculableColor， calculableHolderColor， nameConnector， valueConnector）
     */
    private Boolean calculable;
    /**
     * 是否开启动画，默认开启，（详见 animation，相关的还有 addDataAnimation， animationThreshold， animationDuration， animationEasing）
     */
    private Boolean animation;
    /**
     * 时间轴（详见timeline），每个图表最多仅有一个时间轴控件
     */
    private Timeline timeline;
    /**
     * 标题（详见title），每个图表最多仅有一个标题控件
     */
    private Title title;
    /**
     * 工具箱（详见toolbox），每个图表最多仅有一个工具箱
     */
    private Toolbox toolbox;
    /**
     * 提示框（详见tooltip），鼠标悬浮交互时的信息提示
     */
    private Tooltip tooltip;
    /**
     * 图例（详见legend），每个图表最多仅有一个图例，混搭图表共享
     */
    private Legend legend;
    /**
     * 值域选择（详见dataRange）,值域范围
     */
    private DataRange dataRange;
    /**
     * 数据区域缩放（详见dataZoom）,数据展现范围选择
     */
    private DataZoom dataZoom;
    /**
     * 直角坐标系内绘图网格（详见grid）
     */
    private Grid grid;

    /**
     * 极坐标
     */
    private List<Polar> polar;
    /**
     * 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
     */
    private List<Axis> xAxis;
    /**
     * 直角坐标系中纵轴数组（详见yAxis），数组中每一项代表一条纵轴坐标轴，标准（1.0）中规定最多同时存在2条纵轴
     */
    private List<Axis> yAxis;
    /**
     * 驱动图表生成的数据内容（详见series），数组中每一项代表一个系列的特殊选项及数据
     */
    private List<Series> series;
    /**
     * 当使用timeline时，每一组数据要放到单独的option中
     */
    private List<Option> options;

    private ItemStyle itemStyle;

    public ItemStyle itemStyle() {
        if (this.itemStyle == null) {
            this.itemStyle = new ItemStyle();
        }
        return this.itemStyle;
    }

    public Option itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    public List<Polar> polar() {
        if (this.polar == null) {
            this.polar = new ArrayList<Polar>();
        }
        return this.polar;
    }

    public Option polar(List<Polar> polar) {
        this.polar = polar;
        return this;
    }

    public Option polar(Polar... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.polar().addAll(Arrays.asList(values));
        return this;
    }

    public Option timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    public Option title(Title title) {
        this.title = title;
        return this;
    }

    /**
     * 标题
     *
     * @param text
     * @return
     */
    public Option title(String text) {
        this.title().text(text);
        return this;
    }

    /**
     * 标题和副标题
     *
     * @param text
     * @param subtext
     * @return
     */
    public Option title(String text, String subtext) {
        this.title().text(text).subtext(subtext);
        return this;
    }

    public Option toolbox(Toolbox toolbox) {
        this.toolbox = toolbox;
        return this;
    }

    public Option tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public Option tooltip(Trigger trigger) {
        this.tooltip().trigger(trigger);
        return this;
    }

    public Option legend(Legend legend) {
        this.legend = legend;
        return this;
    }

    public Option dataRange(DataRange dataRange) {
        this.dataRange = dataRange;
        return this;
    }

    public Option dataZoom(DataZoom dataZoom) {
        this.dataZoom = dataZoom;
        return this;
    }

    public Option grid(Grid grid) {
        this.grid = grid;
        return this;
    }

    public Option xAxis(List<Axis> xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public Option yAxis(List<Axis> yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public Option series(List<Series> series) {
        this.series = series;
        return this;
    }

    public Option options(List<Option> options) {
        this.options = options;
        return this;
    }

    public Object backgroundColor() {
        return this.backgroundColor;
    }

    public Option backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public Object[] color() {
        return this.color;
    }

    public Option color(Object[] color) {
        this.color = color;
        return this;
    }

    public Object renderAsImage() {
        return this.renderAsImage;
    }

    public Option renderAsImage(Object renderAsImage) {
        this.renderAsImage = renderAsImage;
        return this;
    }

    public Boolean calculable() {
        return this.calculable;
    }

    public Option calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    public Boolean animation() {
        return this.animation;
    }

    public Option animation(Boolean animation) {
        this.animation = animation;
        return this;
    }

    /**
     * 时间轴（详见timeline），每个图表最多仅有一个时间轴控件
     */
    public Timeline timeline() {
        if (this.timeline == null) {
            this.timeline = new Timeline();
        }
        return this.timeline;
    }

    /**
     * 标题（详见title），每个图表最多仅有一个标题控件
     */
    public Title title() {
        if (this.title == null) {
            this.title = new Title();
        }
        return this.title;
    }

    /**
     * 工具箱（详见toolbox），每个图表最多仅有一个工具箱
     */
    public Toolbox toolbox() {
        if (this.toolbox == null) {
            this.toolbox = new Toolbox();
        }
        return this.toolbox;
    }

    /**
     * 提示框（详见tooltip），鼠标悬浮交互时的信息提示
     */
    public Tooltip tooltip() {
        if (this.tooltip == null) {
            this.tooltip = new Tooltip();
        }
        return this.tooltip;
    }

    /**
     * 图例（详见legend），每个图表最多仅有一个图例，混搭图表共享
     */
    public Legend legend() {
        if (this.legend == null) {
            this.legend = new Legend();
        }
        return this.legend;
    }

    /**
     * 添加图例（详见legend），每个图表最多仅有一个图例，混搭图表共享
     *
     * @param values
     * @return
     */
    public Option legend(Object... values) {
        this.legend().data(values);
        return this;
    }

    /**
     * 值域选择（详见dataRange）,值域范围
     */
    public DataRange dataRange() {
        if (this.dataRange == null) {
            this.dataRange = new DataRange();
        }
        return this.dataRange;
    }

    /**
     * 数据区域缩放（详见dataZoom）,数据展现范围选择
     */
    public DataZoom dataZoom() {
        if (this.dataZoom == null) {
            this.dataZoom = new DataZoom();
        }
        return this.dataZoom;
    }

    /**
     * 直角坐标系内绘图网格（详见grid）
     */
    public Grid grid() {
        if (this.grid == null) {
            this.grid = new Grid();
        }
        return this.grid;
    }

    /**
     * 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
     */
    public List<Axis> xAxis() {
        if (this.xAxis == null) {
            this.xAxis = new ArrayList<Axis>();
        }
        return this.xAxis;
    }

    /**
     * 添加x轴
     *
     * @param values
     * @return
     */
    public Option xAxis(Axis... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.xAxis().size() == 2) {
            throw new RuntimeException("xAxis已经存在2个，无法继续添加!");
        }
        if (this.xAxis().size() + values.length > 2) {
            throw new RuntimeException("添加的xAxis超出了最大允许的范围:2!");
        }
        this.xAxis().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 直角坐标系中横轴数组（详见xAxis），数组中每一项代表一条横轴坐标轴，标准（1.0）中规定最多同时存在2条横轴
     */
    public List<Axis> yAxis() {
        if (this.yAxis == null) {
            this.yAxis = new ArrayList<Axis>();
        }
        return this.yAxis;
    }

    /**
     * 添加y轴
     *
     * @param values
     * @return
     */
    public Option yAxis(Axis... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        if (this.yAxis().size() == 2) {
            throw new RuntimeException("yAxis已经存在2个，无法继续添加!");
        }
        if (this.yAxis().size() + values.length > 2) {
            throw new RuntimeException("添加的yAxis超出了最大允许的范围:2!");
        }
        this.yAxis().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 驱动图表生成的数据内容（详见series），数组中每一项代表一个系列的特殊选项及数据
     */
    public List<Series> series() {
        if (this.series == null) {
            this.series = new ArrayList<Series>();
        }
        return this.series;
    }

    /**
     * 添加数据
     *
     * @param values
     * @return
     */
    public Option series(Series... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.series().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 当使用timeline时，每一组数据要放到单独的option中
     */
    public List<Option> options() {
        if (this.options == null) {
            this.options = new ArrayList<Option>();
        }
        return this.options;
    }

    /**
     * 添加Option数据
     *
     * @param values
     * @return
     */
    public Option options(Option... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.options().addAll(Arrays.asList(values));
        return this;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Toolbox getToolbox() {
        return toolbox;
    }

    public void setToolbox(Toolbox toolbox) {
        this.toolbox = toolbox;
    }

    public Tooltip getTooltip() {
        return tooltip;
    }

    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    public Legend getLegend() {
        return legend;
    }

    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    public DataRange getDataRange() {
        return dataRange;
    }

    public void setDataRange(DataRange dataRange) {
        this.dataRange = dataRange;
    }

    public DataZoom getDataZoom() {
        return dataZoom;
    }

    public void setDataZoom(DataZoom dataZoom) {
        this.dataZoom = dataZoom;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public List<Axis> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List<Axis> xAxis) {
        this.xAxis = xAxis;
    }

    public List<Axis> getyAxis() {
        return yAxis;
    }

    public void setyAxis(List<Axis> yAxis) {
        this.yAxis = yAxis;
    }

    public Object getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Object[] getColor() {
        return color;
    }

    public void setColor(Object[] color) {
        this.color = color;
    }

    public Object getRenderAsImage() {
        return renderAsImage;
    }

    public void setRenderAsImage(Object renderAsImage) {
        this.renderAsImage = renderAsImage;
    }

    public Boolean getCalculable() {
        return calculable;
    }

    public void setCalculable(Boolean calculable) {
        this.calculable = calculable;
    }

    public Boolean getAnimation() {
        return animation;
    }

    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public List<Polar> getPolar() {
        return polar;
    }

    public void setPolar(List<Polar> polar) {
        this.polar = polar;
    }

    public ItemStyle getItemStyle() {
        return itemStyle;
    }

    public void setItemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
    }
}
