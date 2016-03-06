package com.github.abel533.echarts.series;

/**
 * Series工厂类
 *
 * @author liuzh
 */
public class SeriesFactory {

    public static Line newLine() {
        return new Line();
    }

    public static Line newLine(String name) {
        return new Line(name);
    }

    public static Lines newLines() {
        return new Lines();
    }

    public static Lines newLines(String name) {
        return new Lines(name);
    }

    public static Gauge newGauge() {
        return new Gauge();
    }

    public static Gauge newGauge(String name) {
        return new Gauge(name);
    }

    public static Bar newBar() {
        return new Bar();
    }

    public static Bar newBar(String name) {
        return new Bar(name);
    }

    public static Scatter newScatter() {
        return new Scatter();
    }

    public static Scatter newScatter(String name) {
        return new Scatter(name);
    }

    public static EffectScatter newEffectScatter() {
        return new EffectScatter();
    }

    public static EffectScatter newEffectScatter(String name) {
        return new EffectScatter(name);
    }

    public static Pie newPie() {
        return new Pie();
    }

    public static Pie newPie(String name) {
        return new Pie(name);
    }


    public static K newK() {
        return new K();
    }

    public static K newK(String name) {
        return new K(name);
    }

    public static Candlestick newCandlestick() {
        return new Candlestick();
    }

    public static Candlestick newCandlestick(String name) {
        return new Candlestick(name);
    }

    public static Funnel newFunnel() {
        return new Funnel();
    }

    public static Funnel newFunnel(String name) {
        return new Funnel(name);
    }

    public static Graph newGraph() {
        return new Graph();
    }

    public static Graph newGraph(String name) {
        return new Graph(name);
    }

    public static Treemap newTreemap() {
        return new Treemap();
    }

    public static Treemap newTreemap(String name) {
        return new Treemap(name);
    }

    public static Heatmap newHeatmap() {
        return new Heatmap();
    }

    public static Heatmap newHeatmap(String name) {
        return new Heatmap(name);
    }

    public static Map newMap() {
        return new Map();
    }

    public static Map newMap(String name) {
        return new Map(name);
    }

    public static Boxplot newBoxplot() {
        return new Boxplot();
    }

    public static Boxplot newBoxplot(String name) {
        return new Boxplot(name);
    }

    public static Parallel newParallel() {
        return new Parallel();
    }

    public static Parallel newParallel(String name) {
        return new Parallel(name);
    }

    public static Sankey newSankey() {
        return new Sankey();
    }

    public static Sankey newSankey(String name) {
        return new Sankey(name);
    }


}
