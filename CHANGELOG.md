# 更新日志

## 3.0.0 - 2016-02-28

- 3.0版本去掉了k(改为candlestick),radar(雷达图),chord(和弦图),force(使用graph,layout=force替代),island(孤岛),eventRiver(事件河流图),venn(韦恩图),wordCloud(词云),Tree(树图)
- 3.0版本新增了lines(线图),effectScatter(涟漪效果散点图),candlestick(新的k线图),graph(关系图,可以实现force),boxplot(箱形图),parallel(平行坐标系),sankey(桑基图)
- 新增大量相关类，部分已有类增加大量属性
- 新版本改动非常大，如果发现问题或者不合理的方法，可以在项目中提交issues

## 2.2.7 - 2016-01-15

- 修复`Gauge`中`AxisLine`类型使用错误的bug#65
- 解决`LineType`中的`broken`拼写错误#58
- `TreeData`中的`value`改为`Double`类型，仍然保留一个`Integer`的构造方法
- `TreeData`添加缺少的两个属性`symbol`和`symbolSize`#69
- `AxisPointer`增加`show`属性，该属性出现在scatter6的例子中
- `AbstractData`中的`List<Object> data`属性和相关调用都去掉泛型类型`<Object>`
- 新增`EMap`，和`Map`（地图）类完全相同，只是为了避免和`java.util.Map`同时使用时不方便
- 新增简单工厂`SeriesFactory`，提供了所有`Series`子类的创建方法
- `Legend`通用去掉`<Object>`
- 由于fastjson存在多种bug，从这个版本移除`FsonOption`相关的类
- 增加了一个`BarTest14`测试，彩虹柱状图

## 2.2.6

- 由于echarts.js-2.2.5版本只是修复bug，对本项目没有影响,可以直接用echarts-java-2.2.4，所以跳过2.2.5版本
- echarts.js-2.2.6新增Option 查找工具，本项目已经完全和这个工具对照过，已经补充部分缺少的属性
- 新增热力图`heatmap`，对应测试代码[HeatmapTest](http://git.oschina.net/free/ECharts/blob/master/src/test/java/com/github/abel533/echarts/samples/heatmap/HeatmapTest.java)(如果看不到效果，那就是因为测试中的引用的echarts-all.js还不是2.2.6版本，自己替换就行)

## 2.2.4

- `TreeMap`增加`root`
- 官方该版本主要解决一些bug
- 由于2.2.1,2.2.2,2.2.3版本添加比较匆忙，所以没有进行过测试，但是在2.2.4版本进行了全面的测试，对新增的图表和一些属性进行了测试，所以如果使用2.2.0以后的版本，请直接使用2.2.4版本
- 测试过程中发现一些官方没有提到的属性，都已经添加到2.2.4版本
- 新增的4个图表在`src/test`下面有相应的测试
- 由于2.2.0~2.2.4间隔周期长，可能存在一些还没发现的bug，主要是少属性或者属性类型的问题，如果大家发现问题，欢迎及时反馈

## 2.2.3

- 新增词云`WordCloud`
- 新增树图`Tree`
- `DataRange`增加`splitList`
- <b>重要：由于`WordCloud`和`Tree`在2.2.4中才添加的测试，因此修复了一些bug，如果需要这两个新功能，请使用2.2.4版本</b>

## 2.2.2

- 新增韦恩图`Venn`
- 新增`Treemap`
- 新增对数轴`LogAxis`
- <b>重要：由于`Venn`和`Treemap`在2.2.4中才添加的测试，因此修复了一些bug，如果需要这两个新功能，请使用2.2.4版本</b>

## 2.2.1

- `Gauge`去掉`precision`
- `MarkLine`支持边捆绑`Boundling`
- `Tooltip`增加`enterable`配置项
- echarts.js-2.2.1大部分为修改bug

## 2.2.0.4

- 修改`SplitArea`继承`sunw.io.Serializable`的bug，改为`java.io.Serializable`
- `Axis`增加和`log`类型有关的两个参数(2.2.2版本有效)

## 2.2.0.3

- 更新`serialVersionUID`生成方式(不是默认的`1L`) - [galaxist](http://git.oschina.net/galaxist)
- `Option`中添加`RoamController` - [galaxist](http://git.oschina.net/galaxist)
- 添加fastjson转换，可以使用`FsonOption` - [galaxist](http://git.oschina.net/galaxist)
- 测试代码添加fastjson对应的`FsonOption`测试 - [galaxist](http://git.oschina.net/galaxist)
- `Toolbox`的`feature`改为有序的`LinkedHashMap`[#21](http://git.oschina.net/free/ECharts/issues/21)
- `Bar`和`K`的`barWidth`和`barMaxWidth`属性[#32](http://git.oschina.net/free/ECharts/issues/32)
- `Legend`增加`selected`属性，可以配置默认选中状态[#34](http://git.oschina.net/free/ECharts/issues/34)
- 感谢[galaxist](http://git.oschina.net/galaxist)提交的合并请求，欢迎各位参与

## 2.2.0.2

- 修复5个类中部分属性缺少getter和setter的bug

## 2.2.0.1

- 增加`Serializable`序列化

## 2.2.0

- `Effect`增加`Type`枚举类型，增加属性`type`和`bounceDistance`
- `MarkLine`增加属性`smoothness`和`precision`
- `MarkLine`增加`Bundling`（边捆绑）类型和`bundling`属性
- `Data`数据增加`smoothRadian`属性，可以用在`MarkLine`的`data`中
- 由于`K`和`Map`都有`hoverable`属性，因此将该属性提升到父类中

## 2.1.9

- `Node`节点增加`label`属性[#963](https://github.com/ecomfe/echarts/issues/963)
- `Chord`图表加入`categories,nodes,links`三项属性
- `Tooltip`加入`enterable`属性:[tooltip mouse enterable 优化](https://github.com/ecomfe/echarts/commit/781887f31619b0f7e7c3b69746d1ef314f6f9bfd)

## 2.1.8.4

- 解决`MarkLine`缺少`smooth`属性的问题，这是2.1.8的最后一个版本。

## 2.1.8.3

- `DataZoom`类中`zoomLook`属性名字错误，修改为`zoomLock`

## 2.1.8.2

- 解决一个反序列时Axis类型为time时的 [bug#12](http://git.oschina.net/free/ECharts/issues/12)

- 反序列化不是本项目的重点，估计用的人也不多，但是`GsonUtil`确实支持，但是不会继续强化。

## 2.1.8.1

- 该版本在2.1.8基础上解决该问题：[http://www.oschina.net/question/2303268_219485](http://www.oschina.net/question/2303268_219485)
  
- `GsonOption`解决序列化多余空白的问题

- `GsonOption`增加`view`和`exportToHtml`方法，和测试类中的`EnhancedOption`功能完全一样