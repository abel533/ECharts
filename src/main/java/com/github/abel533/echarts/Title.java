package com.github.abel533.echarts;

import com.github.abel533.echarts.code.XPosition;
import com.github.abel533.echarts.code.YPosition;
import com.github.abel533.echarts.style.SubtextStyle;
import com.github.abel533.echarts.style.TextStyle;

/**
 * Created by Administrator on 14-8-25.
 */
public class Title extends Basic {
    public String text;
    public String link;
    public String target;
    public String subtext;
    public String sublink;
    public String subtarget;

    public XPosition textAlign;

    public TextStyle textStyle;

    public SubtextStyle subtextStyle;

    public Title() {
        super();
        this.text = "";
        this.x = XPosition.left;
        this.y = YPosition.top;
        this.textStyle = new TextStyle();
        this.textStyle.fontSize = 18;
        this.textStyle.fontWeight = "bolder";
        this.textStyle.color = "#333";
    }
}
