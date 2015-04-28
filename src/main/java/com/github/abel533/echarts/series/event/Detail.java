package com.github.abel533.echarts.series.event;

import java.io.Serializable;

/**
 * 事件的详细信息
 *
 * @author liuzh
 */
public class Detail implements Serializable {

    private static final long serialVersionUID = 680903438457621422L;

    private String link;

    /**
     * 获取link值
     */
    public String link() {
        return this.link;
    }

    /**
     * 设置link值
     *
     * @param link
     */
    public Detail link(String link) {
        this.link = link;
        return this;
    }

    private String text;

    /**
     * 获取text值
     */
    public String text() {
        return this.text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public Detail text(String text) {
        this.text = text;
        return this;
    }

    private String img;

    /**
     * 获取img值
     */
    public String img() {
        return this.img;
    }

    /**
     * 设置img值
     *
     * @param img
     */
    public Detail img(String img) {
        this.img = img;
        return this;
    }

    /**
     * 构造方法
     */
    public Detail() {
    }

    /**
     * 构造方法
     *
     * @param link
     * @param text
     */
    public Detail(String link, String text) {
        this.link = link;
        this.text = text;
    }

    /**
     * 构造方法
     *
     * @param link
     * @param text
     * @param img
     */
    public Detail(String link, String text, String img) {
        this.link = link;
        this.text = text;
        this.img = img;
    }

    /**
     * 获取link值
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置link值
     *
     * @param link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 获取text值
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text值
     *
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取img值
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置img值
     *
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }
}
