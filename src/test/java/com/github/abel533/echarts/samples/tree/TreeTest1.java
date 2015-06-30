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

package com.github.abel533.echarts.samples.tree;

import com.github.abel533.echarts.Label;
import com.github.abel533.echarts.code.*;
import com.github.abel533.echarts.data.TreeData;
import com.github.abel533.echarts.series.Tree;
import com.github.abel533.echarts.util.EnhancedOption;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * @author liuzh
 */
public class TreeTest1 {

    @Test
    public void test() {
        //地址:http://echarts.baidu.com/doc/example/tree.html
        EnhancedOption option = new EnhancedOption();
        option.title().text("树图").subtext("虚构数据");
        option.tooltip().trigger(Trigger.item).formatter("{b}: {c}");
        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                Tool.restore,
                Tool.saveAsImage);
        option.calculable(false);

        Tree tree = new Tree("树图");
        tree.orient(Orient.vertical).nodePadding(1).rootLocation().x(X.center).y(50);
        tree.itemStyle().normal().label(new Label().show(false).formatter("{b}"))
                .lineStyle().color("#48b")
                .shadowColor("#000")
                .shadowBlur(3)
                .shadowOffsetX(3)
                .shadowOffsetY(5)
                .type(LineType.curve);
        tree.itemStyle().emphasis().label().show(true);

        TreeData root = new TreeData("根节点",4);
        List<TreeData> children = new LinkedList<TreeData>();
        children.add(new TreeData("子节点1",4));
        children.add(new TreeData("子节点2",4));
        children.add(new TreeData("子节点3",3));
        children.add(new TreeData("子节点4",2));
        children.add(new TreeData("子节点5",1));
        root.setChildren(children);
        tree.data(root);

        option.series(tree);
        option.exportToHtml("tree.html");
        option.view();
    }
}
