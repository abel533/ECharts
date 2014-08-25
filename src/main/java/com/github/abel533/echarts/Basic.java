package com.github.abel533.echarts;

import com.github.abel533.echarts.code.XPosition;
import com.github.abel533.echarts.code.YPosition;

/**
 * Created by Administrator on 14-8-25.
 */
public abstract class Basic {
    public Object x;
    public Object y;

    public String backgroundColor;
    public String borderColor;
    public Integer borderWidth;
    public Integer padding;
    public Integer itemGap;

    protected Basic() {
        this.backgroundColor = "rgba(0,0,0,0)";
        this.borderColor = "#ccc";
        this.borderWidth = 0;
        this.padding = 5;
        this.itemGap = 5;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public void setX(XPosition x) {
        this.x = x;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void setY(YPosition y) {
        this.y = y;
    }
}
