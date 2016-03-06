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

import com.github.abel533.echarts.code.Easing;

import java.util.ArrayList;
import java.util.List;

/**
 * Data接口 - 添加数据
 *
 * @author liuzh
 */
public abstract class AbstractData<T> implements Data<T>, java.io.Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 标线图形数据
     *
     * @see com.github.abel533.echarts.data.PointData
     */
    protected List data;
    /**
     * 是否可点击，默认开启
     */
    private Boolean clickable;
    /**
     * 非数值显示（如仅用于显示标注标线时），可以通过hoverable:false关闭区域悬浮高亮
     *
     * @since 2.2.0
     */
    private Boolean hoverable;

    /**
     * 是否开启动画，默认开启。
     */
    private Boolean animation;
    /**
     * 初始动画的时长。
     */
    private Integer animationDuration;
    /**
     * 初始动画的缓动效果
     */
    private Object animationEasing;
    /**
     * 数据更新动画的时长。
     */
    private Integer animationDurationUpdate;
    /**
     * 数据更新动画的缓动效果
     */
    private Object animationEasingUpdate;

    public Boolean animation() {
        return this.animation;
    }

    public T animation(Boolean animation) {
        this.animation = animation;
        return (T) this;
    }

    public T animationEasing(Easing animationEasing) {
        this.animationEasing = animationEasing;
        return (T) this;
    }

    public Integer animationDuration() {
        return this.animationDuration;
    }

    public T animationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
        return (T) this;
    }

    public Object animationEasing() {
        return this.animationEasing;
    }

    public T animationEasing(Object animationEasing) {
        this.animationEasing = animationEasing;
        return (T) this;
    }

    public Integer animationDurationUpdate() {
        return this.animationDurationUpdate;
    }

    public T animationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
        return (T) this;
    }

    public Object animationEasingUpdate() {
        return this.animationEasingUpdate;
    }

    public T animationEasingUpdate(Object animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return (T) this;
    }

    public T animationEasingUpdate(Easing animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
        return (T) this;
    }

    public Boolean getAnimation() {
        return animation;
    }

    public void setAnimation(Boolean animation) {
        this.animation = animation;
    }

    public Integer getAnimationDuration() {
        return animationDuration;
    }

    public void setAnimationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
    }

    public Object getAnimationEasing() {
        return animationEasing;
    }

    public void setAnimationEasing(Object animationEasing) {
        this.animationEasing = animationEasing;
    }

    public Integer getAnimationDurationUpdate() {
        return animationDurationUpdate;
    }

    public void setAnimationDurationUpdate(Integer animationDurationUpdate) {
        this.animationDurationUpdate = animationDurationUpdate;
    }

    public Object getAnimationEasingUpdate() {
        return animationEasingUpdate;
    }

    public void setAnimationEasingUpdate(Object animationEasingUpdate) {
        this.animationEasingUpdate = animationEasingUpdate;
    }

    /**
     * 获取data值
     */
    public List data() {
        if (this.data == null) {
            this.data = new ArrayList();
        }
        return this.data;
    }

    /**
     * 添加元素
     *
     * @param values
     * @return
     */
    public T data(Object... values) {
        if (values == null || values.length == 0) {
            return (T) this;
        }
        for (Object value : values) {
            this.data().add(value);
        }
        return (T) this;
    }


    /**
     * 获取clickable值
     */
    public Boolean clickable() {
        return this.clickable;
    }

    /**
     * 设置clickable值
     *
     * @param clickable
     */
    public T clickable(Boolean clickable) {
        this.clickable = clickable;
        return (T) this;
    }

    /**
     * 获取clickable值
     */
    public Boolean getClickable() {
        return clickable;
    }

    /**
     * 设置clickable值
     *
     * @param clickable
     */
    public void setClickable(Boolean clickable) {
        this.clickable = clickable;
    }

    /**
     * 获取hoverable值
     */
    public Boolean hoverable() {
        return this.hoverable;
    }

    /**
     * 设置hoverable值
     *
     * @param hoverable
     */
    public T hoverable(Boolean hoverable) {
        this.hoverable = hoverable;
        return (T) this;
    }

    /**
     * 获取hoverable值
     */
    public Boolean getHoverable() {
        return hoverable;
    }

    /**
     * 设置hoverable值
     *
     * @param hoverable
     */
    public void setHoverable(Boolean hoverable) {
        this.hoverable = hoverable;
    }

    /**
     * 获取data值
     */
    public List getData() {
        return data;
    }

    /**
     * 设置data值
     *
     * @param data
     */
    public void setData(List data) {
        this.data = data;
    }
}
