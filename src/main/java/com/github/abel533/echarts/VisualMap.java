package com.github.abel533.echarts;

import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.style.TextStyle;

/**
 * 视觉映射组件，用于进行『视觉编码』，也就是将数据映射到视觉元素（视觉通道）
 *
 * @author liuzh
 * @since 2016-03-03 22:19
 */
public class VisualMap extends Basic<VisualMap> {
    /**
     * 类型
     */
    private VisualMapType type;
    /**
     * 最小值
     */
    private Integer min;
    /**
     * 最大值
     */
    private Integer max;
    /**
     * 是否启用值域漫游
     */
    private Boolean calculable;
    /**
     * 拖拽时，是否实时更新
     */
    private Boolean realtime;
    /**
     * 是否反转
     */
    private Boolean inverse;
    /**
     * 数据展示的小数精度，默认为0，无小数点
     */
    private Integer precision;
    /**
     * 图形的宽度，即长条的宽度
     */
    private Integer itemWidth;
    /**
     * 图形的高度，即长条的高度
     */
    private Integer itemHeight;
    private Symbol itemSymbol;
    /**
     * 指定组件中手柄和文字的摆放关系
     */
    private Align align;
    /**
     * handle 指『拖拽手柄』。handlePosition 指定了手柄的位置
     */
    private Align handlePosition;
    /**
     * 指定用数据的『哪个维度』，映射到视觉元素上
     */
    private Object dimension;
    /**
     * 指定取哪个系列的数据，即哪个系列的 series.data
     */
    private Integer seriesIndex;
    /**
     * 定义 在选中范围中 的视觉元素
     */
    private VisualMapType inRange;
    /**
     * 定义 在选中范围外 的视觉元素
     */
    private VisualMapType outOfRange;
    /**
     * 水平（'horizontal'）或者竖直（'vertical'）
     */
    private Orient orient;
    /**
     * 标签的格式化工具
     */
    private String formatter;
    /**
     * 对于连续型数据，自动平均切分成几段
     */
    private Integer splitNumber;
    private SelectedMode selectedMode;
    private TextStyle textStyle;
    private Object[] color;
    private Object[] text;
    private Object[] textGap;
    private Object[] pieces;
    private Object[] categories;

    public VisualMapType type() {
        return this.type;
    }

    public VisualMap type(VisualMapType type) {
        this.type = type;
        return this;
    }

    public Integer min() {
        return this.min;
    }

    public VisualMap min(Integer min) {
        this.min = min;
        return this;
    }

    public Integer max() {
        return this.max;
    }

    public VisualMap max(Integer max) {
        this.max = max;
        return this;
    }

    public Boolean calculable() {
        return this.calculable;
    }

    public VisualMap calculable(Boolean calculable) {
        this.calculable = calculable;
        return this;
    }

    public Boolean realtime() {
        return this.realtime;
    }

    public VisualMap realtime(Boolean realtime) {
        this.realtime = realtime;
        return this;
    }

    public Boolean inverse() {
        return this.inverse;
    }

    public VisualMap inverse(Boolean inverse) {
        this.inverse = inverse;
        return this;
    }

    public Integer precision() {
        return this.precision;
    }

    public VisualMap precision(Integer precision) {
        this.precision = precision;
        return this;
    }

    public Integer itemWidth() {
        return this.itemWidth;
    }

    public VisualMap itemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
        return this;
    }

    public Integer itemHeight() {
        return this.itemHeight;
    }

    public VisualMap itemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
        return this;
    }

    public Symbol itemSymbol() {
        return this.itemSymbol;
    }

    public VisualMap itemSymbol(Symbol itemSymbol) {
        this.itemSymbol = itemSymbol;
        return this;
    }

    public Align align() {
        return this.align;
    }

    public VisualMap align(Align align) {
        this.align = align;
        return this;
    }

    public Align handlePosition() {
        return this.handlePosition;
    }

    public VisualMap handlePosition(Align handlePosition) {
        this.handlePosition = handlePosition;
        return this;
    }

    public Object dimension() {
        return this.dimension;
    }

    public VisualMap dimension(Object dimension) {
        this.dimension = dimension;
        return this;
    }

    public Integer seriesIndex() {
        return this.seriesIndex;
    }

    public VisualMap seriesIndex(Integer seriesIndex) {
        this.seriesIndex = seriesIndex;
        return this;
    }

    public VisualMapType inRange() {
        return this.inRange;
    }

    public VisualMap inRange(VisualMapType inRange) {
        this.inRange = inRange;
        return this;
    }

    public VisualMapType outOfRange() {
        return this.outOfRange;
    }

    public VisualMap outOfRange(VisualMapType outOfRange) {
        this.outOfRange = outOfRange;
        return this;
    }

    public Orient orient() {
        return this.orient;
    }

    public VisualMap orient(Orient orient) {
        this.orient = orient;
        return this;
    }

    public String formatter() {
        return this.formatter;
    }

    public VisualMap formatter(String formatter) {
        this.formatter = formatter;
        return this;
    }

    public Integer splitNumber() {
        return this.splitNumber;
    }

    public VisualMap splitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
        return this;
    }

    public SelectedMode selectedMode() {
        return this.selectedMode;
    }

    public VisualMap selectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
        return this;
    }

    public TextStyle textStyle() {
        if (this.textStyle == null) {
            this.textStyle = new TextStyle();
        }
        return this.textStyle;
    }

    public VisualMap textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public VisualMap color(Object[] color) {
        this.color = color;
        return this;
    }

    public VisualMap text(Object[] text) {
        this.text = text;
        return this;
    }

    public VisualMap textGap(Object[] textGap) {
        this.textGap = textGap;
        return this;
    }

    public VisualMap pieces(Object[] pieces) {
        this.pieces = pieces;
        return this;
    }

    public VisualMap categories(Object[] categories) {
        this.categories = categories;
        return this;
    }

    public VisualMapType getType() {
        return type;
    }

    public void setType(VisualMapType type) {
        this.type = type;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Boolean getCalculable() {
        return calculable;
    }

    public void setCalculable(Boolean calculable) {
        this.calculable = calculable;
    }

    public Boolean getRealtime() {
        return realtime;
    }

    public void setRealtime(Boolean realtime) {
        this.realtime = realtime;
    }

    public Boolean getInverse() {
        return inverse;
    }

    public void setInverse(Boolean inverse) {
        this.inverse = inverse;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getItemWidth() {
        return itemWidth;
    }

    public void setItemWidth(Integer itemWidth) {
        this.itemWidth = itemWidth;
    }

    public Integer getItemHeight() {
        return itemHeight;
    }

    public void setItemHeight(Integer itemHeight) {
        this.itemHeight = itemHeight;
    }

    public Symbol getItemSymbol() {
        return itemSymbol;
    }

    public void setItemSymbol(Symbol itemSymbol) {
        this.itemSymbol = itemSymbol;
    }

    public Align getAlign() {
        return align;
    }

    public void setAlign(Align align) {
        this.align = align;
    }

    public Object[] getText() {
        return text;
    }

    public void setText(Object[] text) {
        this.text = text;
    }

    public Object[] getTextGap() {
        return textGap;
    }

    public void setTextGap(Object[] textGap) {
        this.textGap = textGap;
    }

    public Align getHandlePosition() {
        return handlePosition;
    }

    public void setHandlePosition(Align handlePosition) {
        this.handlePosition = handlePosition;
    }

    public Object getDimension() {
        return dimension;
    }

    public void setDimension(Object dimension) {
        this.dimension = dimension;
    }

    public Integer getSeriesIndex() {
        return seriesIndex;
    }

    public void setSeriesIndex(Integer seriesIndex) {
        this.seriesIndex = seriesIndex;
    }

    public VisualMapType getInRange() {
        return inRange;
    }

    public void setInRange(VisualMapType inRange) {
        this.inRange = inRange;
    }

    public VisualMapType getOutOfRange() {
        return outOfRange;
    }

    public void setOutOfRange(VisualMapType outOfRange) {
        this.outOfRange = outOfRange;
    }

    public Orient getOrient() {
        return orient;
    }

    public void setOrient(Orient orient) {
        this.orient = orient;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public Object[] getColor() {
        return color;
    }

    public void setColor(Object[] color) {
        this.color = color;
    }

    public TextStyle getTextStyle() {
        return textStyle;
    }

    public void setTextStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
    }

    public Integer getSplitNumber() {
        return splitNumber;
    }

    public void setSplitNumber(Integer splitNumber) {
        this.splitNumber = splitNumber;
    }

    public Object[] getPieces() {
        return pieces;
    }

    public void setPieces(Object[] pieces) {
        this.pieces = pieces;
    }

    public Object[] getCategories() {
        return categories;
    }

    public void setCategories(Object[] categories) {
        this.categories = categories;
    }

    public SelectedMode getSelectedMode() {
        return selectedMode;
    }

    public void setSelectedMode(SelectedMode selectedMode) {
        this.selectedMode = selectedMode;
    }
}
