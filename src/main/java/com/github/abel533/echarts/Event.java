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

/**
 * Description: Event
 *
 * @author liuzh
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

    /**
     * 构造函数,参数:event
     *
     * @param event
     */
    private Event(String event) {
        this.event = event;
    }

    @Override
    /**
     * 获取toString值
     */
    public String toString() {
        return this.event;
    }
}
