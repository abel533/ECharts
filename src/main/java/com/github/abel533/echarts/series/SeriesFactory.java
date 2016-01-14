package com.github.abel533.echarts.series;

/**
 * Series工厂类
 *
 * @author liuzh
 */
public class SeriesFactory {

    public static Tree newTree(){
        return new Tree();
    }

    public static Tree newTree(String name){
        return new Tree(name);
    }

    public static Line newLine(){
        return new Line();
    }

    public static Line newLine(String name){
        return new Line(name);
    }

    public static Gauge newGauge(){
        return new Gauge();
    }

    public static Gauge newGauge(String name){
        return new Gauge(name);
    }

    public static Chord newChord(){
        return new Chord();
    }

    public static Chord newChord(String name){
        return new Chord(name);
    }

    public static Bar newBar(){
        return new Bar();
    }

    public static Bar newBar(String name){
        return new Bar(name);
    }

    public static Scatter newScatter(){
        return new Scatter();
    }

    public static Scatter newScatter(String name){
        return new Scatter(name);
    }

    public static Force newForce(){
        return new Force();
    }

    public static Force newForce(String name){
        return new Force(name);
    }

    public static Radar newRadar(){
        return new Radar();
    }

    public static Radar newRadar(String name){
        return new Radar(name);
    }

    public static Pie newPie(){
        return new Pie();
    }

    public static Pie newPie(String name){
        return new Pie(name);
    }

    public static Venn newVenn(){
        return new Venn();
    }

    public static Venn newVenn(String name){
        return new Venn(name);
    }

    public static K newK(){
        return new K();
    }

    public static K newK(String name){
        return new K(name);
    }

    public static EventRiver newEventRiver(){
        return new EventRiver();
    }

    public static EventRiver newEventRiver(String name){
        return new EventRiver(name);
    }

    public static Island newIsland(){
        return new Island();
    }

    public static Island newIsland(String name){
        return new Island(name);
    }

    public static Funnel newFunnel(){
        return new Funnel();
    }

    public static Funnel newFunnel(String name){
        return new Funnel(name);
    }

    public static Treemap newTreemap(){
        return new Treemap();
    }

    public static Treemap newTreemap(String name){
        return new Treemap(name);
    }

    public static Heatmap newHeatmap(){
        return new Heatmap();
    }

    public static Heatmap newHeatmap(String name){
        return new Heatmap(name);
    }

    public static Map newMap(){
        return new Map();
    }

    public static Map newMap(String name){
        return new Map(name);
    }

    public static WordCloud newWordCloud(){
        return new WordCloud();
    }

    public static WordCloud newWordCloud(String name){
        return new WordCloud(name);
    }

}
