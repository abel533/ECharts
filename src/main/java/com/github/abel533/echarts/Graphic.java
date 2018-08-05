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

import com.github.abel533.echarts.code.GraphicType;
import com.github.abel533.echarts.style.GraphicStyle;
import lombok.Getter;
import lombok.Setter;

/**
 * 图形元素组件
 *
 * @author liuxu
 * @date 18-7-9下午2:13
 */
@Getter
@Setter
public class Graphic extends Basic<Graphic> implements Component {

    /**
     * id 用于在更新图形元素时指定更新哪个图形元素，如果不需要用可以忽略
     */
    private String id;

    /**
     * 这个字段在第一次设置时不能忽略，取值见上方『支持的图形元素』
     */
    private GraphicType type;

    // 下面的各个属性如果不需要设置都可以忽略，忽略则取默认值

    /**
     * 指定本次 setOption 对此图形元素进行的操作。默认是 'merge'，还可以 'replace' 或 'remove'
     */
    private String $action;

    /**
     * 定位、形状相关的设置，如 x, y, cx, cy, width, height, r, points 等
     * 注意，如果设置了 left/right/top/bottom，这里的定位用的 x/y/cx/cy 会失效
     */
    private Object shape;

    /**
     * 样式相关的设置，如 fill, stroke, lineWidth, shadowBlur 等
     */
    private GraphicStyle style;

    /**
     * 表示不响应事件
     */
    private Boolean silent;

    /**
     * 表示节点不显示
     */
    private Boolean invisible;

    /**
     * 设置是否整体限制在父节点范围内。可选值：'raw', 'all'
     */
    private String bouding;

    /**
     * 是否可以被拖拽
     */
    private Boolean draggable;

    /**
     * 事件的监听器，还可以是 onmousemove, ondrag 等
     */
    private String onclick;

    public Graphic id(String id) {
        this.id = id;
        return this;
    }

    public Graphic type(GraphicType type) {
        this.type = type;
        return this;
    }

    public Graphic $action(String $action) {
        this.$action = $action;
        return this;
    }

    public Graphic shape(Object shape) {
        this.shape = shape;
        return this;
    }

    public Graphic style(GraphicStyle style) {
        this.style = style;
        return this;
    }

    public Graphic silent(Boolean silent) {
        this.silent = silent;
        return this;
    }

    public Graphic invisible(Boolean invisible) {
        this.invisible = invisible;
        return this;
    }

    public Graphic bouding(String bouding) {
        this.bouding = bouding;
        return this;
    }

    public Graphic draggable(Boolean draggable) {
        this.draggable = draggable;
        return this;
    }

    public Graphic onclick(String onclick) {
        this.onclick = onclick;
        return this;
    }

}
