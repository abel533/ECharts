#ECharts - Java类库

**当前版本2.2.6**

本项目是一个供Java开发使用的ECharts的开发包，主要目的是方便在Java中构造ECharts中可能用到的全部数据结构，如完整的结构Option。Option中的数据Series，包含Bar-柱状图，Line-折线图，Pie-饼图，Chord-和弦图等，支持ECharts中的所有图表。支持所有的Style类，如AreaStyle,ChordStyle,ItemStyle,LineStyle,LinkStyle等等。支持多种Data数据类型，一个通用的Data数据，以及PieData,MapData,ScatterData,KData等针对性的数据结构。  

你可以使用本项目直接构造一个`Option`对象，转换为JSON后直接用js设置`myChart.setOption(option)`，或者你也可以在前端构造基本的`Option`对象，然后使用本项目来构造其中需要的任意某部分的数据，如使用`Series`支持的图表类型创建`Series`数据。

**为了便于使用对应版本的ECcharts，本项目的版本号会使用和ECharts相同的版本号。**

**由于本项目反馈的bug并不多，为了方便每一个开发人员，每次修复bug都会发布一个小版本，并且bug修复只针对当前的大版本进行修复。**

##Maven坐标

```xml
<dependency>
  <groupId>com.github.abel533</groupId>
  <artifactId>ECharts</artifactId>
  <version>2.2.6</version>
</dependency>
```

##下载地址

[ECharts-x.x.x.jar](http://mvnrepository.com/artifact/com.github.abel533/ECharts)

[API文档-2.2.6](https://oss.sonatype.org/content/repositories/releases/com/github/abel533/ECharts/2.2.6/ECharts-2.2.6-javadoc.jar) 下载后解压即可
##项目支持

###图表类型

 - Line - 折线（面积）图
 - Bar - 柱状（条形）图
 - Scatter - 散点（气泡）图
 - K - K线图
 - Pie - 饼（圆环）图
 - Radar - 雷达（面积）图
 - Chord - 和弦图
 - Force - 力导向布局图
 - Map - 地图
 - Gauge - 仪表盘
 - Funnel - 漏斗图
 - Island - 孤岛图（官方未提供，这里只有数据Island对象）
 - EventRiver - 事件河流图
 - Venn - 韦恩图
 - Tree - 树图
 - Treemap - 矩形树图
 - WordCloud - 词云
 - Heatmap - 热力图

###ECharts组件

 - Axis - 坐标轴
 - Grid - 网格
 - Title - 标题
 - Tooltip - 提示
 - Legend - 图例
 - DataZoom - 数据区域缩放
 - DataRange - 值域漫游
 - Toolbox - 工具箱
 - Timeline - 时间线

##更新日志

###2.2.6

- 由于echarts.js-2.2.5版本只是修复bug，对本项目没有影响,可以直接用echarts-java-2.2.4，所以跳过2.2.5版本
- echarts.js-2.2.6新增Option 查找工具，本项目已经完全和这个工具对照过，已经补充部分缺少的属性
- 新增热力图`heatmap`，对应测试代码[HeatmapTest](http://git.oschina.net/free/ECharts/blob/master/src/test/java/com/github/abel533/echarts/samples/heatmap/HeatmapTest.java)(如果看不到效果，那就是因为测试中的引用的echarts-all.js还不是2.2.6版本，自己替换就行)

###2.2.4

- `TreeMap`增加`root`
- 官方该版本主要解决一些bug
- 由于2.2.1,2.2.2,2.2.3版本添加比较匆忙，所以没有进行过测试，但是在2.2.4版本进行了全面的测试，对新增的图表和一些属性进行了测试，所以如果使用2.2.0以后的版本，请直接使用2.2.4版本
- 测试过程中发现一些官方没有提到的属性，都已经添加到2.2.4版本
- 新增的4个图表在`src/test`下面有相应的测试
- 由于2.2.0~2.2.4间隔周期长，可能存在一些还没发现的bug，主要是少属性或者属性类型的问题，如果大家发现问题，欢迎及时反馈

###2.2.3

- 新增词云`WordCloud`
- 新增树图`Tree`
- `DataRange`增加`splitList`
- <b>重要：由于`WordCloud`和`Tree`在2.2.4中才添加的测试，因此修复了一些bug，如果需要这两个新功能，请使用2.2.4版本</b>

###2.2.2

- 新增韦恩图`Venn`
- 新增`Treemap`
- 新增对数轴`LogAxis`
- <b>重要：由于`Venn`和`Treemap`在2.2.4中才添加的测试，因此修复了一些bug，如果需要这两个新功能，请使用2.2.4版本</b>

###2.2.1

- `Gauge`去掉`precision`
- `MarkLine`支持边捆绑`Boundling`
- `Tooltip`增加`enterable`配置项
- echarts.js-2.2.1大部分为修改bug

###2.2.0.4

- 修改`SplitArea`继承`sunw.io.Serializable`的bug，改为`java.io.Serializable`
- `Axis`增加和`log`类型有关的两个参数(2.2.2版本有效)

###2.2.0.3

- 更新`serialVersionUID`生成方式(不是默认的`1L`) - [galaxist](http://git.oschina.net/galaxist)
- `Option`中添加`RoamController` - [galaxist](http://git.oschina.net/galaxist)
- 添加fastjson转换，可以使用`FsonOption` - [galaxist](http://git.oschina.net/galaxist)
- 测试代码添加fastjson对应的`FsonOption`测试 - [galaxist](http://git.oschina.net/galaxist)
- `Toolbox`的`feature`改为有序的`LinkedHashMap`[#21](http://git.oschina.net/free/ECharts/issues/21)
- `Bar`和`K`的`barWidth`和`barMaxWidth`属性[#32](http://git.oschina.net/free/ECharts/issues/32)
- `Legend`增加`selected`属性，可以配置默认选中状态[#34](http://git.oschina.net/free/ECharts/issues/34)
- 感谢[galaxist](http://git.oschina.net/galaxist)提交的合并请求，欢迎各位参与

###2.2.0.2

- 修复5个类中部分属性缺少getter和setter的bug

###2.2.0.1

- 增加`Serializable`序列化

###2.2.0

- `Effect`增加`Type`枚举类型，增加属性`type`和`bounceDistance`
- `MarkLine`增加属性`smoothness`和`precision`
- `MarkLine`增加`Bundling`（边捆绑）类型和`bundling`属性
- `Data`数据增加`smoothRadian`属性，可以用在`MarkLine`的`data`中
- 由于`K`和`Map`都有`hoverable`属性，因此将该属性提升到父类中

###2.1.9

- `Node`节点增加`label`属性[#963](https://github.com/ecomfe/echarts/issues/963)
- `Chord`图表加入`categories,nodes,links`三项属性
- `Tooltip`加入`enterable`属性:[tooltip mouse enterable 优化](https://github.com/ecomfe/echarts/commit/781887f31619b0f7e7c3b69746d1ef314f6f9bfd)

###2.1.8.4

- 解决`MarkLine`缺少`smooth`属性的问题，这是2.1.8的最后一个版本。

###2.1.8.3

- `DataZoom`类中`zoomLook`属性名字错误，修改为`zoomLock`

###2.1.8.2

- 解决一个反序列时Axis类型为time时的 [bug#12](http://git.oschina.net/free/ECharts/issues/12)

- 反序列化不是本项目的重点，估计用的人也不多，但是`GsonUtil`确实支持，但是不会继续强化。

###2.1.8.1

- 该版本在2.1.8基础上解决该问题：[http://www.oschina.net/question/2303268_219485](http://www.oschina.net/question/2303268_219485)
  
- `GsonOption`解决序列化多余空白的问题

- `GsonOption`增加`view`和`exportToHtml`方法，和测试类中的`EnhancedOption`功能完全一样

##文档地址

>http://git.oschina.net/free/ECharts/wikis/Home  

目前文档并不全面，但是我本人并不知道大家需要什么样的文档，所以暂时就这样了，如果有建议可以在这里提建议

>http://git.oschina.net/free/ECharts/issues

##ECharts网址

http://echarts.baidu.com/

##Option说明

1. `Option`正式代码中使用，不需要任何依赖。

2. `GsonOption`正式代码中可以使用，需要引入`Gson`包，使用`toString()`方法可以转换为JSON结构的数据（支持`function`，详情看下面的<b>function说明</b>）。

3. `EnhancedOption`测试专用，主要方便在浏览器中直接查看效果。

4. 使用`GsonOption`,`FsonOption`的`toString()`方法返回给前端时，前端需要使用`eval('('+optionJsonStr+')')`转换为JSON结构

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

 1. 先看第一种，这里的`"function`中，双引号和`function`必须连着，中间不能存在空格，否则不会识别。然后是结尾的`}"`，这里也必须连着不能有空格，在首尾这两段代码之间不能出现`}"`，否则会判断出错。如果在`{}`中的代码有字符串，请使用单引号`'`，双引号出现在单引号内时使用`\\"`即可。除此之外没有别的限制。

 2. 再看第二种，这里的`"(function`中，双引号、括号和`function`必须连着，中间不能存在空格，否则不会识别。然后是结尾的`})()"`，这里也必须连着不能有空格，在首尾这两段代码之间不能出现`})()"`，否则会判断出错。如果在`{}`中的代码有字符串，请使用单引号`'`，双引号出现在单引号内时使用`\\"`即可。除此之外没有别的限制。

**上述对`function`的处理很简单，不限制在`formatter`使用，所有值都能这么写，你可以参考写出自己的`Option`**


<br><br>
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
            0, 10, 20, 30, 40, 50, 60, 70, 80
        ]
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
            15, -50, -56.5, -46.5, -22.1, -2.5, -27.7, -55.7, -76.5
        ]
    }]
}
```
<br><br>
###第二个例子，使用`(function(){})()`执行JS代码

对应的ECharts例子地址：  http://echarts.baidu.com/doc/example/pie6.html

测试代码地址：[PieTest6.java][2]

```java
@Test
public void test() {
    //地址：http://echarts.baidu.com/doc/example/pie6.html
    ItemStyle dataStyle = new ItemStyle();
    dataStyle.normal().label(new Label().show(false)).labelLine().show(false);

    ItemStyle placeHolderStyle = new ItemStyle();
    placeHolderStyle.normal().color("rgba(0,0,0,0)").label(new Label().show(false)).labelLine().show(false);
    placeHolderStyle.emphasis().color("rgba(0,0,0,0)");

    EnhancedOption option = new EnhancedOption();
    option.title().text("你幸福吗？")
            .subtext("From ExcelHome")
            .sublink("http://e.weibo.com/1341556070/AhQXtjbqh")
            .x(X.center)
            .y(Y.center)
            .itemGap(20)
            .textStyle().color("rgba(30,144,255,0.8)")
            .fontFamily("微软雅黑")
            .fontSize(35)
            .fontWeight("bolder");
    option.tooltip().show(true).formatter("{a} <br/>{b} : {c} ({d}%)");
    option.legend().orient(Orient.vertical)
            .x("(function(){return document.getElementById('main').offsetWidth / 2;})()")
            .y(56)
            .itemGap(12)
            .data("68%的人表示过的不错", "29%的人表示生活压力很大", "3%的人表示“我姓曾”");
    option.toolbox().show(true).feature(Tool.mark, Tool.dataView, Tool.restore, Tool.saveAsImage);

    Pie p1 = new Pie("1");
    p1.clockWise(false).radius(125, 150).itemStyle(dataStyle)
            .data(new Data("68%的人表示过的不错", 68), new Data("invisible", 32).itemStyle(placeHolderStyle));

    Pie p2 = new Pie("2");
    p2.clockWise(false).radius(100, 125).itemStyle(dataStyle)
            .data(new Data("29%的人表示生活压力很大", 29), new Data("invisible", 71).itemStyle(placeHolderStyle));

    Pie p3 = new Pie("3");
    p3.clockWise(false).radius(75, 100).itemStyle(dataStyle)
            .data(new Data("3%的人表示“我姓曾”", 3), new Data("invisible", 97).itemStyle(placeHolderStyle));

    option.series(p1, p2, p3);
    option.exportToHtml("pie6.html");
    option.view();
}
```

这段代码注意

```java
.x("(function(){return document.getElementById('main').offsetWidth / 2;})()")
```

这个地方，这里巧妙的利用`(function(){})()`执行JS代码，实现了官方例子中的功能，生成的JSON结果如下：

```javascript
{
    "title": {
        "text": "你幸福吗？",
        "subtext": "From ExcelHome",
        "sublink": "http://e.weibo.com/1341556070/AhQXtjbqh",
        "textStyle": {
            "color": "rgba(30,144,255,0.8)",
            "fontSize": 35,
            "fontFamily": "微软雅黑",
            "fontWeight": "bolder"
        },
        "x": "center",
        "y": "center",
        "itemGap": 20
    },
    "toolbox": {
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
        },
        "show": true
    },
    "tooltip": {
        "show": true,
        "formatter": "{a} <br/>{b} : {c} ({d}%)"
    },
    "legend": {
        "orient": "vertical",
        "data": ["68%的人表示过的不错", "29%的人表示生活压力很大", "3%的人表示“我姓曾”"],
        "x": (function() {
            return document.getElementById('main').offsetWidth / 2;
        })(),
        "y": 56,
        "itemGap": 12
    },
    "series": [{
        "radius": [125, 150],
        "clockWise": false,
        "name": "1",
        "type": "pie",
        "itemStyle": {
            "normal": {
                "label": {
                    "show": false
                },
                "labelLine": {
                    "show": false
                }
            }
        },
        "data": [{
            "name": "68%的人表示过的不错",
            "value": 68
        }, {
            "name": "invisible",
            "value": 32,
            "itemStyle": {
                "normal": {
                    "label": {
                        "show": false
                    },
                    "labelLine": {
                        "show": false
                    },
                    "color": "rgba(0,0,0,0)"
                },
                "emphasis": {
                    "color": "rgba(0,0,0,0)"
                }
            }
        }]
    }, {
        "radius": [100, 125],
        "clockWise": false,
        "name": "2",
        "type": "pie",
        "itemStyle": {
            "normal": {
                "label": {
                    "show": false
                },
                "labelLine": {
                    "show": false
                }
            }
        },
        "data": [{
            "name": "29%的人表示生活压力很大",
            "value": 29
        }, {
            "name": "invisible",
            "value": 71,
            "itemStyle": {
                "normal": {
                    "label": {
                        "show": false
                    },
                    "labelLine": {
                        "show": false
                    },
                    "color": "rgba(0,0,0,0)"
                },
                "emphasis": {
                    "color": "rgba(0,0,0,0)"
                }
            }
        }]
    }, {
        "radius": [75, 100],
        "clockWise": false,
        "name": "3",
        "type": "pie",
        "itemStyle": {
            "normal": {
                "label": {
                    "show": false
                },
                "labelLine": {
                    "show": false
                }
            }
        },
        "data": [{
            "name": "3%的人表示“我姓曾”",
            "value": 3
        }, {
            "name": "invisible",
            "value": 97,
            "itemStyle": {
                "normal": {
                    "label": {
                        "show": false
                    },
                    "labelLine": {
                        "show": false
                    },
                    "color": "rgba(0,0,0,0)"
                },
                "emphasis": {
                    "color": "rgba(0,0,0,0)"
                }
            }
        }]
    }]
};
```  



  [1]: http://git.oschina.net/free/ECharts/blob/master/src/test/java/com/github/abel533/echarts/samples/line/LineTest5.java
  [2]: http://git.oschina.net/free/ECharts/blob/master/src/test/java/com/github/abel533/echarts/samples/pie/PieTest6.java
