package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Align;
import com.github.abel533.echarts.code.YPosition;
import com.github.abel533.echarts.style.TextStyle;

/**
 * Created by Administrator on 14-8-25.
 */
public class Legend extends Basic {
    public Align orient;

    public Integer itemWidth;
    public Integer itemHeight;

    public TextStyle textStyle;
    //enum SelectedMode
    public Object selectedMode;

    public Data[] data;

    public Legend() {
        super();
        this.orient = Align.horizontal;
        this.x = YPosition.center;
        this.y = YPosition.top;
        this.selectedMode = true;
        this.textStyle = new TextStyle();
        this.textStyle.color = "#333";
    }
}
