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

import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.code.Easing;
import com.github.abel533.echarts.code.Symbol;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.option.NoDataLoadingOption;
import com.github.abel533.echarts.series.Parallel;
import com.github.abel533.echarts.series.Series;
import com.github.abel533.echarts.style.ItemStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Description: Option
 *
 * @author liuzh
 */
public class Option implements Serializable {

    private static final long serialVersionUID = 4664955083296866542L;

    /**
     * 全图默认背景，（详见backgroundColor），默认为无，透明
     */
    private Object backgroundColor;
    /**
     * 数值系列的颜色列表，（详见color），可配数组，eg：['#87cefa', 'rgba(123,123,123,0.5)','...']，当系列数量个数比颜色列表长度大时将循环选取
     */
    private List<Object> color;
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
     * 是否启用图表初始化动画，默认开启，建议IE8-关闭，（详见 animation，相关的还有 addDataAnimation， animationThreshold， animationDuration， animationEasing）
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
    private List<DataZoom> dataZoom;
    /**
     * 缩放漫游组件（详见RoamController）,数据缩放漫游选择
     */
    private RoamController roamController;
    /**
     * 直角坐标系内绘图网格（详见grid）
     */
    private Grid grid;
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
     * 极坐标
     */
    private List<Polar> polar;
    /**
     * 默认标志图形类型列表，循环使用
     */
    private List<Symbol> symbolList;
    /**
     * 拖拽重计算提示边框颜色
     */
    private String calculableColor;
    /**
     * 可计算占位提示颜色,默认值 '#ccc'
     */
    private String calculableHolderColo;
    /**
     * 数据合并名字间连接符,默认值'&'
     */
    private String nameConnector;
    /**
     * 数据合并名字与数值间连接符,默认值 ':'
     */
    private String valueConnector;
    /**
     * 是否启用动态数据接口动画效果，默认开启，建议IE8-关闭
     */
    private Boolean addDataAnimation;
    /**
     * 动画元素阀值，产生的图形原素超过2000不出动画，默认开启，建议IE8-关闭
     */
    private Integer animationThreshold;
    /**
     * 进入动画时长，单位ms
     */
    private Integer animationDuration;
    /**
     * 更新动画时长，单位ms
     */
    private Integer animationDurationUpdate;
    /**
     * 主元素的缓动效果
     */
    private Easing animationEasing;
    /**
     * 数据更新动画的缓动效果
     */
    private Object animationEasingUpdate;
    /**
     * 无数据时载入配置
     */
    private NoDataLoadingOption noDataLoadingOption;
    /**
     * 当使用timeline时，每一组数据要放到单独的option中
     */
    private List<Option> options;
    /**
     * 样式
     */
    private ItemStyle itemStyle;
    /**
     * 地理坐标系组件
     */
    private Geo geo;
    /**
     * 平行坐标系介绍
     */
    private Parallel parallel;
    /**
     * visualMap 是视觉映射组件，用于进行『视觉编码』，也就是将数据映射到视觉元素（视觉通道）
     */
    private List<VisualMap> visualMap;

    public List<VisualMap> visualMap() {
        if (this.visualMap == null) {
            this.visualMap = new ArrayList<VisualMap>();
        }
        return this.visualMap;
    }

    public VisualMap visualMapNew() {
        VisualMap v = new VisualMap();
        this.visualMap().add(v);
        return v;
    }

    public Option visualMap(List<VisualMap> visualMap) {
        this.visualMap = visualMap;
        return this;
    }

    public List<VisualMap> getVisualMap() {
        return visualMap;
    }

    public void setVisualMap(List<VisualMap> visualMap) {
        this.visualMap = visualMap;
    }

    public Object animationEasingUpdate() {
        return this.animationEasingUpdate;
    }

    public Option animationEasingUpdate(Object animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return this;
    }

    public Option animationEasingUpdate(Easing animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return this;
    }

    public Object getAnimationEasingUpdate() {
        return animationEasingUpdate;
    }

    public void setAnimationEasingUpdate(Object animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
    }

    public Parallel parallel() {
        if (this.parallel == null) {
            this.parallel = new Parallel();
        }
        return this.parallel;
    }

    public Option parallel(Parallel parallel) {
        this.parallel = parallel;
        return this;
    }

    public Parallel getParallel() {
        return parallel;
    }

    public void setParallel(Parallel parallel) {
        this.parallel = parallel;
    }

    public Geo geo() {
        if (this.geo == null) {
            this.geo = new Geo();
        }
        return this.geo;
    }

    public Option geo(Geo geo) {
        this.geo = geo;
        return this;
    }


    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    /**
     * 获取symbolList值
     */
    public List<Symbol> symbolList() {
        return this.symbolList;
    }

    /**
     * 设置symbolList值
     *
     * @param symbolList
     */
    public Option symbolList(List<Symbol> symbolList) {
        if (this.symbolList == null) {
            this.symbolList = new LinkedList<Symbol>();
        }
        this.symbolList = symbolList;
        return this;
    }

    /**
     * 设置symbolList值
     *
     * @param symbolList
     */
    public Option symbolList(Symbol... symbolList) {
        if (symbolList == null || symbolList.length == 0) {
            return this;
        }
        this.symbolList().addAll(Arrays.asList(symbolList));
        return this;
    }

    /**
     * 获取calculableColor值
     */
    public String calculableColor() {
        return this.calculableColor;
    }

    /**
     * 设置calculableColor值
     *
     * @param calculableColor
     */
    public Option calculableColor(String calculableColor) {
        this.calculableColor = calculableColor;
        return this;
    }

    /**
     * 获取calculableHolderColo值
     */
    public String calculableHolderColo() {
        return this.calculableHolderColo;
    }

    /**
     * 设置calculableHolderColo值
     *
     * @param calculableHolderColo
     */
    public Option calculableHolderColo(String calculableHolderColo) {
        this.calculableHolderColo = calculableHolderColo;
        return this;
    }

    /**
     * 获取nameConnector值
     */
    public String nameConnector() {
        return this.nameConnector;
    }

    /**
     * 设置nameConnector值
     *
     * @param nameConnector
     */
    public Option nameConnector(String nameConnector) {
        this.nameConnector = nameConnector;
        return this;
    }

    /**
     * 获取valueConnector值
     */
    public String valueConnector() {
        return this.valueConnector;
    }

    /**
     * 设置valueConnector值
     *
     * @param valueConnector
     */
    public Option valueConnector(String valueConnector) {
        this.valueConnector = valueConnector;
        return this;
    }

    /**
     * 获取addDataAnimation值
     */
    public Boolean addDataAnimation() {
        return this.addDataAnimation;
    }

    /**
     * 设置addDataAnimation值
     *
     * @param addDataAnimation
     */
    public Option addDataAnimation(Boolean addDataAnimation) {
        this.addDataAnimation = addDataAnimation;
        return this;
    }

    /**
     * 获取animationThreshold值
     */
    public Integer animationThreshold() {
        return this.animationThreshold;
    }

    /**
     * 设置animationThreshold值
     *
     * @param animationThreshold
     */
    public Option animationThreshold(Integer animationThreshold) {
        this.animationThreshold = animationThreshold;
        return this;
    }

    /**
     * 获取animationDuration值
     */
    public Integer animationDuration() {
        return this.animationDuration;
    }

    /**
     * 设置animationDuration值
     *
     * @param animationDuration
     */
    public Option animationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    /**
     * 获取animationDurationUpdate值
     */
    public Integer animationDurationUpdate() {
        return this.animationDurationUpdate;
    }

    /**
     * 设置animationDurationUpdate值
     *
     * @param animationDurationUpdate
     */
    public Option animationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return this;
    }

    /**
     * 获取animationEasing值
     */
    public Easing animationEasing() {
        return this.animationEasing;
    }

    /**
     * 设置animationEasing值
     *
     * @param animationEasing
     */
    public Option animationEasing(Easing animationEasing) {
        this.animationEasing = animationEasing;
        return this;
    }

    /**
     * 获取noDataLoadingOption值
     */
    public NoDataLoadingOption noDataLoadingOption() {
        if (this.noDataLoadingOption == null) {
            this.noDataLoadingOption = new NoDataLoadingOption();
        }
        return this.noDataLoadingOption;
    }

    /**
     * 设置noDataLoadingOption值
     *
     * @param noDataLoadingOption
     */
    public Option noDataLoadingOption(NoDataLoadingOption noDataLoadingOption) {
        this.noDataLoadingOption = noDataLoadingOption;
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
     * 设置itemStyle值
     *
     * @param itemStyle
     */
    public Option itemStyle(ItemStyle itemStyle) {
        this.itemStyle = itemStyle;
        return this;
    }

    /**
     * 获取polar值
     */
    public List<Polar> polar() {
        if (this.polar == null) {
            this.polar = new ArrayList<Polar>();
        }
        return this.polar;
    }

    /**
     * 设置polar值
     *
     * @param polar
     */
    public Option polar(List<Polar> polar) {
        this.polar = polar;
        return this;
    }

    /**
     * 设置values值
     *
     * @param values
     */
    public Option polar(Polar... values) {
        if (values == null || values.length == 0) {
            return this;
        }
        this.polar().addAll(Arrays.asList(values));
        return this;
    }

    /**
     * 设置timeline值
     *
     * @param timeline
     */
    public Option timeline(Timeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * 设置title值
     *
     * @param title
     */
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

    /**
     * 设置toolbox值
     *
     * @param toolbox
     */
    public Option toolbox(Toolbox toolbox) {
        this.toolbox = toolbox;
        return this;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public Option tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    /**
     * 设置trigger值
     *
     * @param trigger
     */
    public Option tooltip(Trigger trigger) {
        this.tooltip().trigger(trigger);
        return this;
    }

    /**
     * 设置legend值
     *
     * @param legend
     */
    public Option legend(Legend legend) {
        this.legend = legend;
        return this;
    }

    /**
     * 设置dataRange值
     *
     * @param dataRange
     */
    public Option dataRange(DataRange dataRange) {
        this.dataRange = dataRange;
        return this;
    }

    /**
     * 设置dataZoom值
     *
     * @param dataZoom
     */
    public Option dataZoom(List<DataZoom> dataZoom) {
        this.dataZoom = dataZoom;
        return this;
    }

    /**
     * 设置dataZoom值
     *
     * @param dataZoom
     */
    public Option dataZoom(DataZoom... dataZoom) {
        if (dataZoom == null || dataZoom.length == 0) {
            return this;
        }
        this.dataZoom().addAll(Arrays.asList(dataZoom));
        return this;
    }

    /**
     * 设置grid值
     *
     * @param grid
     */
    public Option grid(Grid grid) {
        this.grid = grid;
        return this;
    }

    /**
     * 设置xAxis值
     *
     * @param xAxis
     */
    public Option xAxis(List<Axis> xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    /**
     * 设置yAxis值
     *
     * @param yAxis
     */
    public Option yAxis(List<Axis> yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    /**
     * 设置series值
     *
     * @param series
     */
    public Option series(List<Series> series) {
        this.series = series;
        return this;
    }

    /**
     * 设置options值
     *
     * @param options
     */
    public Option options(List<Option> options) {
        this.options = options;
        return this;
    }

    /**
     * 获取backgroundColor值
     */
    public Object backgroundColor() {
        return this.backgroundColor;
    }

    /**
     * 设置backgroundColor值
     *
     * @param backgroundColor
     */
    public Option backgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    /**
     * 获取color值
     */
    public List<Object> color() {
        if (this.color == null) {
            this.color = new ArrayList<Object>();
        }
        return this.color;
    }

    /**
     * 设置color值
     *
     * @param colors
     */
    public Option color(Object... colors) {
        if (colors == null || colors.length == 0) {
            return this;
        }
        this.color().addAll(Arrays.asList(colors));
        return this;
    }

    /**
     * 获取renderAsImage值
     */
    public Object renderAsImage() {
        return this.renderAsImage;
    }

    /**
     * 设置renderAsImage值
     *
     * @param renderAsImage
     */
    public Option renderAsImage(Object renderAsImage) {
        this.renderAsImage = renderAsImage;
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
    public Option calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    /**
     * 获取animation值
     */
    public Boolean animation() {
        return this.animation;
    }

    /**
     * 设置animation值
     *
     * @param animation
     */
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
    public DataZoom dataZoomNew() {
        DataZoom dataZoom = new DataZoom();
        this.dataZoom().add(dataZoom);
        return dataZoom;
    }

    /**
     * 数据区域缩放（详见dataZoom）,数据展现范围选择
     */
    public List<DataZoom> dataZoom() {
        if (this.dataZoom == null) {
            this.dataZoom = new ArrayList<DataZoom>();
        }
        return this.dataZoom;
    }

    /**
     * 数据缩放漫游选择（详见roamController）,数据缩放漫游选择
     */
    public RoamController roamController() {
        if (this.roamController == null) {
            this.roamController = new RoamController();
        }
        return this.roamController;
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

    /**
     * 获取timeline值
     */
    public Timeline getTimeline() {
        return timeline;
    }

    /**
     * 设置timeline值
     *
     * @param timeline
     */
    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    /**
     * 获取title值
     */
    public Title getTitle() {
        return title;
    }

    /**
     * 设置title值
     *
     * @param title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     * 获取toolbox值
     */
    public Toolbox getToolbox() {
        return toolbox;
    }

    /**
     * 设置toolbox值
     *
     * @param toolbox
     */
    public void setToolbox(Toolbox toolbox) {
        this.toolbox = toolbox;
    }

    /**
     * 获取tooltip值
     */
    public Tooltip getTooltip() {
        return tooltip;
    }

    /**
     * 设置tooltip值
     *
     * @param tooltip
     */
    public void setTooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * 获取legend值
     */
    public Legend getLegend() {
        return legend;
    }

    /**
     * 设置legend值
     *
     * @param legend
     */
    public void setLegend(Legend legend) {
        this.legend = legend;
    }

    /**
     * 获取dataRange值
     */
    public DataRange getDataRange() {
        return dataRange;
    }

    /**
     * 设置dataRange值
     *
     * @param dataRange
     */
    public void setDataRange(DataRange dataRange) {
        this.dataRange = dataRange;
    }

    /**
     * 获取dataZoom值
     */
    public List<DataZoom> getDataZoom() {
        return dataZoom;
    }

    /**
     * 设置dataZoom值
     *
     * @param dataZoom
     */
    public void setDataZoom(List<DataZoom> dataZoom) {
        this.dataZoom = dataZoom;
    }

    /**
     * 获取roamController值
     */
    public RoamController getRoamController() {
        return roamController;
    }

    /**
     * 设置roamController值
     *
     * @param roamController
     */
    public void setRoamController(RoamController roamController) {
        this.roamController = roamController;
    }

    /**
     * 获取grid值
     */
    public Grid getGrid() {
        return grid;
    }

    /**
     * 设置grid值
     *
     * @param grid
     */
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * 获取xAxis值
     */
    public List<Axis> getxAxis() {
        return xAxis;
    }

    /**
     * 设置xAxis值
     *
     * @param xAxis
     */
    public void setxAxis(List<Axis> xAxis) {
        this.xAxis = xAxis;
    }

    /**
     * 获取yAxis值
     */
    public List<Axis> getyAxis() {
        return yAxis;
    }

    /**
     * 设置yAxis值
     *
     * @param yAxis
     */
    public void setyAxis(List<Axis> yAxis) {
        this.yAxis = yAxis;
    }

    /**
     * 获取backgroundColor值
     */
    public Object getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * 设置backgroundColor值
     *
     * @param backgroundColor
     */
    public void setBackgroundColor(Object backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * 获取color值
     */
    public List<Object> getColor() {
        return color;
    }

    /**
     * 设置color值
     *
     * @param color
     */
    public void setColor(List<Object> color) {
        this.color = color;
    }

    /**
     * 获取renderAsImage值
     */
    public Object getRenderAsImage() {
        return renderAsImage;
    }

    /**
     * 设置renderAsImage值
     *
     * @param renderAsImage
     */
    public void setRenderAsImage(Object renderAsImage) {
        this.renderAsImage = renderAsImage;
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
     * 获取animation值
     */
    public Boolean getAnimation() {
        return animation;
    }

    /**
     * 设置animation值
     *
     * @param animation
     */
    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    /**
     * 获取series值
     */
    public List<Series> getSeries() {
        return series;
    }

    /**
     * 设置series值
     *
     * @param series
     */
    public void setSeries(List<Series> series) {
        this.series = series;
    }

    /**
     * 获取options值
     */
    public List<Option> getOptions() {
        return options;
    }

    /**
     * 设置options值
     *
     * @param options
     */
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    /**
     * 获取polar值
     */
    public List<Polar> getPolar() {
        return polar;
    }

    /**
     * 设置polar值
     *
     * @param polar
     */
    public void setPolar(List<Polar> polar) {
        this.polar = polar;
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

    /**
     * 获取symbolList值
     */
    public List<Symbol> getSymbolList() {
        return symbolList;
    }

    /**
     * 设置symbolList值
     *
     * @param symbolList
     */
    public void setSymbolList(List<Symbol> symbolList) {
        this.symbolList = symbolList;
    }

    /**
     * 获取calculableColor值
     */
    public String getCalculableColor() {
        return calculableColor;
    }

    /**
     * 设置calculableColor值
     *
     * @param calculableColor
     */
    public void setCalculableColor(String calculableColor) {
        this.calculableColor = calculableColor;
    }

    /**
     * 获取calculableHolderColo值
     */
    public String getCalculableHolderColo() {
        return calculableHolderColo;
    }

    /**
     * 设置calculableHolderColo值
     *
     * @param calculableHolderColo
     */
    public void setCalculableHolderColo(String calculableHolderColo) {
        this.calculableHolderColo = calculableHolderColo;
    }

    /**
     * 获取nameConnector值
     */
    public String getNameConnector() {
        return nameConnector;
    }

    /**
     * 设置nameConnector值
     *
     * @param nameConnector
     */
    public void setNameConnector(String nameConnector) {
        this.nameConnector = nameConnector;
    }

    /**
     * 获取valueConnector值
     */
    public String getValueConnector() {
        return valueConnector;
    }

    /**
     * 设置valueConnector值
     *
     * @param valueConnector
     */
    public void setValueConnector(String valueConnector) {
        this.valueConnector = valueConnector;
    }

    /**
     * 获取addDataAnimation值
     */
    public Boolean getAddDataAnimation() {
        return addDataAnimation;
    }

    /**
     * 设置addDataAnimation值
     *
     * @param addDataAnimation
     */
    public void setAddDataAnimation(Boolean addDataAnimation) {
        this.addDataAnimation = addDataAnimation;
    }

    /**
     * 获取animationThreshold值
     */
    public Integer getAnimationThreshold() {
        return animationThreshold;
    }

    /**
     * 设置animationThreshold值
     *
     * @param animationThreshold
     */
    public void setAnimationThreshold(Integer animationThreshold) {
        this.animationThreshold = animationThreshold;
    }

    /**
     * 获取animationDuration值
     */
    public Integer getAnimationDuration() {
        return animationDuration;
    }

    /**
     * 设置animationDuration值
     *
     * @param animationDuration
     */
    public void setAnimationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
    }

    /**
     * 获取animationDurationUpdate值
     */
    public Integer getAnimationDurationUpdate() {
        return animationDurationUpdate;
    }

    /**
     * 设置animationDurationUpdate值
     *
     * @param animationDurationUpdate
     */
    public void setAnimationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
    }

    /**
     * 获取animationEasing值
     */
    public Easing getAnimationEasing() {
        return animationEasing;
    }

    /**
     * 设置animationEasing值
     *
     * @param animationEasing
     */
    public void setAnimationEasing(Easing animationEasing) {
        this.animationEasing = animationEasing;
    }

    /**
     * 获取noDataLoadingOption值
     */
    public NoDataLoadingOption getNoDataLoadingOption() {
        return noDataLoadingOption;
    }

    /**
     * 设置noDataLoadingOption值
     *
     * @param noDataLoadingOption
     */
    public void setNoDataLoadingOption(NoDataLoadingOption noDataLoadingOption) {
        this.noDataLoadingOption = noDataLoadingOption;
    }
}
