package com.github.abel533.echarts;

import com.github.abel533.echarts.code.Align;
import com.github.abel533.echarts.code.YPosition;
import com.github.abel533.echarts.style.TextStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<Object> data;

    public Legend() {
        super();
        this.orient = Align.horizontal;
        this.x = YPosition.center;
        this.y = YPosition.top;
        this.selectedMode = true;
        this.textStyle = new TextStyle();
        this.textStyle.color = "#333";

        this.data = new ArrayList<Object>();
    }

    /**
     * 添加图例属性
     *
     * @param values
     * @return
     */
    public Legend addData(Object... values) {
        data.addAll(Arrays.asList(values));
        return this;
    }
}
