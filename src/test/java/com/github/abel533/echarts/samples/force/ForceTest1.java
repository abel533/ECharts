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

package com.github.abel533.echarts.samples.force;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.series.Force;
import com.github.abel533.echarts.series.force.Link;
import com.github.abel533.echarts.series.force.Node;
import com.github.abel533.echarts.style.LinkStyle;
import com.github.abel533.echarts.style.NodeStyle;
import com.github.abel533.echarts.style.TextStyle;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

/**
 * @author liuzh
 */
public class ForceTest1 {

    @Test
    public void test() {
        //地址：http://echarts.baidu.com/doc/example/force1.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("人物关系：乔布斯").subtext("数据来自人立方").x(X.right).y(Y.bottom);
        option.tooltip().trigger(Trigger.item).formatter("{a} : {b}");
        option.toolbox().show(true).feature(Tool.restore, Tool.saveAsImage);
        option.legend("家人", "朋友").legend().x(X.left);

        //数据
        Force force = new Force("人物关系");
        force.categories("人物", "家人", "朋友");
        force.itemStyle().normal()
                .label(new Label().show(true).textStyle(new TextStyle().color("#333")))
                .nodeStyle().brushType(BrushType.both).color("rgba(255,215,0,0.4)").borderWidth(1);

        force.itemStyle().emphasis()
                .linkStyle(new LinkStyle())
                .nodeStyle(new NodeStyle())
                .label().show(true);
        force.useWorker(false).minRadius(15).maxRadius(25).gravity(1.1).scaling(1.1).linkSymbol(Symbol.arrow);
        force.nodes(new Node(0, "乔布斯", 10),
                new Node(1, "丽萨-乔布斯", 2),
                new Node(1, "保罗-乔布斯", 3),
                new Node(1, "克拉拉-乔布斯", 3),
                new Node(1, "劳伦-鲍威尔", 7),
                new Node(2, "史蒂夫-沃兹尼艾克", 5),
                new Node(2, "奥巴马", 8),
                new Node(2, "比尔-盖茨", 9),
                new Node(2, "乔纳森-艾夫", 4),
                new Node(2, "蒂姆-库克", 4),
                new Node(2, "龙-韦恩", 1));

        force.links(new Link("丽萨-乔布斯", "乔布斯", 1),
                new Link("保罗-乔布斯", "乔布斯", 2),
                new Link("克拉拉-乔布斯", "乔布斯", 1),
                new Link("劳伦-鲍威尔", "乔布斯", 2),
                new Link("史蒂夫-沃兹尼艾克", "乔布斯", 3),
                new Link("奥巴马", "乔布斯", 6),
                new Link("比尔-盖茨", "乔布斯", 6),
                new Link("乔纳森-艾夫", "乔布斯", 1),
                new Link("蒂姆-库克", "乔布斯", 1),
                new Link("龙-韦恩", "乔布斯", 1),
                new Link("克拉拉-乔布斯", "保罗-乔布斯", 1),
                new Link("奥巴马", "保罗-乔布斯", 1),
                new Link("奥巴马", "克拉拉-乔布斯", 1),
                new Link("奥巴马", "劳伦-鲍威尔", 1),
                new Link("奥巴马", "史蒂夫-沃兹尼艾克", 1),
                new Link("比尔-盖茨", "奥巴马", 6),
                new Link("比尔-盖茨", "克拉拉-乔布斯", 1),
                new Link("蒂姆-库克", "奥巴马", 1)
        );

        option.series(force);
        option.exportToHtml("force1.html");
        option.view();
    }
}
