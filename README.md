#ECharts - Java类库

这是一个方便在Java中构造ECharts的Option数据结构的类库，使用这个可以让你很方便的在Java中操作Option.

本项目目前为1.0.0-SNAPSHOT版本，尚未发布，发布前接口以及功能改动很大。

该项目目前的进度是基本对象全部创建完成，当前阶段主要的工作是将ECharts官网上的大部分示例，在该项目中使用Java代码来实现。

通过在实现过程中的摸索来简化Java中的操作。

##ECharts网址

http://echarts.baidu.com/


##挑两个例子大概的看看这个Java类库如何使用


###第一个例子，简单的折线图

对应的ECharts例子地址：  http://echarts.baidu.com/doc/example/line5.html

测试代码地址：[LineTest5.java][1]

```java
@Test
public void test() {
    //地址:http://echarts.baidu.com/doc/example/line5.html
    GsonOption option = new GsonOption();
    option.legend("高度(km)与气温(°C)变化关系");

    option.toolbox().show(true).feature(Tool.mark, Tool.dataView, new MagicType(Magic.line, Magic.bar), Tool.restore, Tool.saveAsImage);

    option.calculable(true);
    option.tooltip().trigger(Trigger.axis).formatter("Temperature : <br/>{b}km : {c}°C");

    ValueAxis valueAxis = new ValueAxis();
    valueAxis.axisLabel().formatter("{value} °C");
    option.xAxis(valueAxis);

    CategoryAxis categoryAxis = new CategoryAxis();
    categoryAxis.axisLine().onZero(false);
    categoryAxis.axisLabel().formatter("{value} km");
    categoryAxis.boundaryGap(false);
    categoryAxis.data(0, 10, 20, 30, 40, 50, 60, 70, 80);
    option.yAxis(categoryAxis);

    Line line = new Line();
    line.smooth(true).name("高度(km)与气温(°C)变化关系").data(15, -50, -56.5, -46.5, -22.1, -2.5, -27.7, -55.7, -76.5).itemStyle().normal().lineStyle().shadowColor("rgba(0,0,0,0.4)");
    option.series(line);
    option.exportToHtml("line5.html");
    option.view();
}
```

代码生成的json结果：

```javascript
{
	"calculable": true,
	"toolbox": {
		"show": true,
		"feature": {
			"restore": {
				"show": true,
				"title": "还原"
			},
			"magicType": {
				"show": true,
				"title": {
					"line": "折线图切换",
					"stack": "堆积",
					"bar": "柱形图切换",
					"tiled": "平铺"
				},
				"type": ["line", "bar"]
			},
			"dataView": {
				"show": true,
				"title": "数据视图",
				"readOnly": false,
				"lang": ["Data View", "close", "refresh"]
			},
			"mark": {
				"show": true,
				"title": {
					"mark": "辅助线开关",
					"markClear": "清空辅助线",
					"markUndo": "删除辅助线"
				},
				"lineStyle": {
					"color": "#1e90ff",
					"type": "dashed",
					"width": 2
				}
			},
			"saveAsImage": {
				"show": true,
				"title": "保存为图片",
				"type": "png",
				"lang": ["点击保存"]
			}
		}
	},
	"tooltip": {
		"trigger": "axis",
		"formatter": "Temperature : \u003cbr/\u003e{b}km : {c}°C"
	},
	"legend": {
		"data": ["高度(km)与气温(°C)变化关系"]
	},
	"xAxis": [{
		"type": "value",
		"axisLabel": {
			"formatter": "{value} °C"
		}
	}],
	"yAxis": [{
		"type": "category",
		"boundaryGap": false,
		"axisLine": {
			"onZero": false
		},
		"axisLabel": {
			"formatter": "{value} km"
		},
		"data": [
		0, 10, 20, 30, 40, 50, 60, 70, 80]
	}],
	"series": [{
		"smooth": true,
		"name": "高度(km)与气温(°C)变化关系",
		"type": "line",
		"itemStyle": {
			"normal": {
				"lineStyle": {
					"shadowColor": "rgba(0,0,0,0.4)"
				}
			},
			"emphasis": {}
		},
		"data": [
		15, -50, -56.5, -46.5, -22.1, -2.5, -27.7, -55.7, -76.5]
	}]
}
```

###第二个例子，复杂的带时间轴的饼图

对应的ECharts例子地址：  http://echarts.baidu.com/doc/example/pie7.html  

测试代码地址：[PieTest7.java][2]

```java
@Test
public void test() {
    //地址：http://echarts.baidu.com/doc/example/pie7.html
    GsonOption option = new GsonOption();
    //时间轴
    option.timeline().data("2013-01-01", "2013-02-01", "2013-03-01", "2013-04-01", "2013-05-01",
            new LineData("2013-06-01","emptyStart6",8), "2013-07-01", "2013-08-01", "2013-09-01", "2013-10-01",
            "2013-11-01", new LineData("2013-12-01","star6",8));
    option.timeline().autoPlay(true).label().formatter("function(s){return s.slice(0,7);}");
    //timeline变态的地方在于多个Option
    Option basic = new Option();
    basic.title().text("浏览器占比变化").subtext("纯属虚构");
    basic.tooltip().trigger(Trigger.item).formatter("{a} <br/>{b} : {c} ({d}%)");
    basic.legend().data("Chrome", "Firefox", "Safari", "IE9+", "IE8-");
    basic.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage);

    int idx = 1;
    basic.series(getPie(idx++).center("50%", "45%").radius("50%"));
    //加入
    option.options(basic);
    //构造11个数据
    Option[] os = new Option[11];
    for (int i = 0; i < os.length; i++) {
        os[i] = new Option().series(getPie(idx++));
    }
    option.options(os);
    option.exportToHtml("pie7.html");
    option.view();
}

/**
 * 获取饼图数据
 *
 * @param idx
 * @return
 */
public Pie getPie(int idx) {
    return new Pie().name("浏览器（数据纯属虚构）").data(
            new PieData("Chrome", idx * 128 + 80),
            new PieData("Firefox", idx * 64 + 160),
            new PieData("Safari", idx * 32 + 320),
            new PieData("IE9+", idx * 16 + 640),
            new PieData("IE8-", idx * 8 + 1280));
}
```

由于这里有12个月份的数据，生成的json太长：  

```javascript
{
	"timeline": {
		"autoPlay": true,
		"label": {
			"formatter": function(s) {
				return s.slice(0, 7);
			}
		},
		"data": ["2013-01-01", "2013-02-01", "2013-03-01", "2013-04-01", "2013-05-01", {
			"name": "2013-06-01",
			"symbol": "emptyStart6",
			"symbolSize": 8
		},
		"2013-07-01", "2013-08-01", "2013-09-01", "2013-10-01", "2013-11-01", {
			"name": "2013-12-01",
			"symbol": "star6",
			"symbolSize": 8
		}]
	},
	"options": [{
		"title": {
			"text": "浏览器占比变化",
			"subtext": "纯属虚构"
		},
		"toolbox": {
			"show": true,
			"feature": {
				"restore": {
					"show": true,
					"title": "还原"
				},
				"dataView": {
					"show": true,
					"title": "数据视图",
					"readOnly": false,
					"lang": ["Data View", "close", "refresh"]
				},
				"mark": {
					"show": true,
					"title": {
						"mark": "辅助线开关",
						"markClear": "清空辅助线",
						"markUndo": "删除辅助线"
					},
					"lineStyle": {
						"color": "#1e90ff",
						"type": "dashed",
						"width": 2
					}
				},
				"saveAsImage": {
					"show": true,
					"title": "保存为图片",
					"type": "png",
					"lang": ["点击保存"]
				}
			}
		},
		"tooltip": {
			"trigger": "item",
			"formatter": "{a} \u003cbr/\u003e{b} : {c} ({d}%)"
		},
		"legend": {
			"data": ["Chrome", "Firefox", "Safari", "IE9+", "IE8-"]
		},
		"series": [{
			"center": ["50%", "45%"],
			"radius": "50%",
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 208,
				"name": "Chrome"
			},
			{
				"value": 224,
				"name": "Firefox"
			},
			{
				"value": 352,
				"name": "Safari"
			},
			{
				"value": 656,
				"name": "IE9+"
			},
			{
				"value": 1288,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 336,
				"name": "Chrome"
			},
			{
				"value": 288,
				"name": "Firefox"
			},
			{
				"value": 384,
				"name": "Safari"
			},
			{
				"value": 672,
				"name": "IE9+"
			},
			{
				"value": 1296,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 464,
				"name": "Chrome"
			},
			{
				"value": 352,
				"name": "Firefox"
			},
			{
				"value": 416,
				"name": "Safari"
			},
			{
				"value": 688,
				"name": "IE9+"
			},
			{
				"value": 1304,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 592,
				"name": "Chrome"
			},
			{
				"value": 416,
				"name": "Firefox"
			},
			{
				"value": 448,
				"name": "Safari"
			},
			{
				"value": 704,
				"name": "IE9+"
			},
			{
				"value": 1312,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 720,
				"name": "Chrome"
			},
			{
				"value": 480,
				"name": "Firefox"
			},
			{
				"value": 480,
				"name": "Safari"
			},
			{
				"value": 720,
				"name": "IE9+"
			},
			{
				"value": 1320,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 848,
				"name": "Chrome"
			},
			{
				"value": 544,
				"name": "Firefox"
			},
			{
				"value": 512,
				"name": "Safari"
			},
			{
				"value": 736,
				"name": "IE9+"
			},
			{
				"value": 1328,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 976,
				"name": "Chrome"
			},
			{
				"value": 608,
				"name": "Firefox"
			},
			{
				"value": 544,
				"name": "Safari"
			},
			{
				"value": 752,
				"name": "IE9+"
			},
			{
				"value": 1336,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 1104,
				"name": "Chrome"
			},
			{
				"value": 672,
				"name": "Firefox"
			},
			{
				"value": 576,
				"name": "Safari"
			},
			{
				"value": 768,
				"name": "IE9+"
			},
			{
				"value": 1344,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 1232,
				"name": "Chrome"
			},
			{
				"value": 736,
				"name": "Firefox"
			},
			{
				"value": 608,
				"name": "Safari"
			},
			{
				"value": 784,
				"name": "IE9+"
			},
			{
				"value": 1352,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 1360,
				"name": "Chrome"
			},
			{
				"value": 800,
				"name": "Firefox"
			},
			{
				"value": 640,
				"name": "Safari"
			},
			{
				"value": 800,
				"name": "IE9+"
			},
			{
				"value": 1360,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 1488,
				"name": "Chrome"
			},
			{
				"value": 864,
				"name": "Firefox"
			},
			{
				"value": 672,
				"name": "Safari"
			},
			{
				"value": 816,
				"name": "IE9+"
			},
			{
				"value": 1368,
				"name": "IE8-"
			}]
		}]
	},
	{
		"series": [{
			"name": "浏览器（数据纯属虚构）",
			"type": "pie",
			"data": [{
				"value": 1616,
				"name": "Chrome"
			},
			{
				"value": 928,
				"name": "Firefox"
			},
			{
				"value": 704,
				"name": "Safari"
			},
			{
				"value": 832,
				"name": "IE9+"
			},
			{
				"value": 1376,
				"name": "IE8-"
			}]
		}]
	}]
}
```  



  [1]: http://git.oschina.net/free/ECharts/blob/master/src/test/java/com/github/abel533/echarts/samples/line/LineTest5.java
  [2]: http://git.oschina.net/free/ECharts/blob/master/src/test/java/com/github/abel533/echarts/samples/pie/PieTest7.java