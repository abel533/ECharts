package com.github.abel533.echarts;

/**
 * Description: Event
 * Author: liuzh
 * Update: liuzh(2014-08-26 11:43)
 */
public enum Event {
    // -------全局通用
    REFRESH("refresh"),
    RESTORE("restore"),
    RESIZE("resize"),
    CLICK("click"),
    DBLCLICK("dblclick"),
    HOVER("hover"),
    //MOUSEWHEEL("mousewheel"),
    // -------业务交互逻辑
    DATA_CHANGED("dataChanged"),
    DATA_ZOOM("dataZoom"),
    DATA_RANGE("dataRange"),
    LEGEND_SELECTED("legendSelected"),
    MAP_SELECTED("mapSelected"),
    PIE_SELECTED("pieSelected"),
    MAGIC_TYPE_CHANGED("magicTypeChanged"),
    DATA_VIEW_CHANGED("dataViewChanged"),
    TIMELINE_CHANGED("timelineChanged"),
    MAP_ROAM("mapRoam"),
    // -------内部通信
    TOOLTIP_HOVER("tooltipHover"),
    TOOLTIP_IN_GRID("tooltipInGrid"),
    TOOLTIP_OUT_GRID("tooltipOutGrid");

    private String event;

    private Event(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return this.event;
    }
}
