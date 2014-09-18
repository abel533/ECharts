#ECharts - Java类库

这是一个方便在Java中构造ECharts的Option数据结构的类库，使用这个可以让你很方便的在Java中操作Option.

本项目目前为1.0.0-SNAPSHOT版本，尚未发布，发布前接口以及功能改动很大。

该项目目前的进度是基本对象全部创建完成，当前阶段主要的工作是将ECharts官网上的大部分示例，在该项目中使用Java代码来实现。

通过在实现过程中的摸索来简化Java中的操作。

##最新进展

 1. 已经包含了全部类型的图表，每种图表至少有一个例子。

 2. 即使同一类的图表，在写的过程中仍然有不同的地方，所以后续后为每种图表再增加一两个例子。

 3. 等例子完成后，给代码增加尽可能完整的api文档（注释），然后导出一份doc文档。

 4. 最后会写一个基础的的教程，然后正式发布本项目。

##ECharts网址

http://echarts.baidu.com/

##Option说明

1. `Option`正式代码中使用，不需要任何依赖。

2. `GsonOption`正式代码中可以使用，需要引入`Gson`包，使用`toString()`方法可以转换为JSON结构的数据（支持formatter的`function`）。

3. `EnhancedOption`测试专用，主要方便在浏览器中直接查看效果。

##function说明

由于JSON标准中不包含`function`类型，因而大多数的JSON库都不直接支持这种类型，处理这种类型最简单的方式就是转换为JSON字符串时，对字符串进行处理。

虽然像jackson json和fastjson通过注解或者自定义的实现序列化接口可以实现，毕竟和JSON库的结合太密切了，而且使用起来也很麻烦，不如直接处理字符串，或者在js中处理。

本项目中提供了GSON实现的`GsonOption`，就是重写了`toString()`方法，改为输出JSON结构的字符串，并且支持以下两种`function`形式:

```javascript
{
    formatter:function(value){
        return value.substring(0,8);
    }
}

//和

{
    formatter:(function(){
        return 'Temperature : <br/>{b}km : {c}°C';
    })()
}
```

当然这种形式在Java中书写的时候有着严格的要求：

```java
option.tooltip().trigger(Trigger.axis).formatter("function(value){return value.substring(0,8);}");

option.tooltip().trigger(Trigger.axis).formatter("(function(){return 'Temperature : <br/>{b}km : {c}°C';})()");

```

 1. 先看第一种，这里的`"function`中，双引号和`function`必须连着，中间不能存在空格，否则不会识别。然后是结尾的`}"`，这里也必须连着不能有空格，在首位这两段代码之间不能出现`}"`，否则会判断出错。如果在`{}`中的代码有字符串，请使用单引号`'`，双引号出现在单引号内时使用`\\"`即可。除此之外没有别的限制。

 2. 再看第二种，这里的`"(function`中，双引号、括号和`function`必须连着，中间不能存在空格，否则不会识别。然后是结尾的`})()"`，这里也必须连着不能有空格，在首位这两段代码之间不能出现`})()"`，否则会判断出错。如果在`{}`中的代码有字符串，请使用单引号`'`，双引号出现在单引号内时使用`\\"`即可。除此之外没有别的限制。

**上述对`function`的处理很简单，不限制在`formatter`使用，所有值都能这么写，你可以参考写出自己的`Option`**



##挑两个例子大概的看看这个Java类库如何使用


###第一个例子，简单的折线图

对应的ECharts例子地址：  http://echarts.baidu.com/doc/example/line5.html

测试代码地址：[LineTest5.java][1]

```java
@Test
public void test() {
    //地址:http://echarts.baidu.com/doc/example/line5.html
    EnhancedOption option = new EnhancedOption();
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
    EnhancedOption option = new EnhancedOption();
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