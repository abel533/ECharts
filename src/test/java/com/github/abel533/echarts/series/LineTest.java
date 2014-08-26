package com.github.abel533.echarts.series;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONAware;
import com.github.abel533.echarts.Label;
import org.junit.Test;

/**
 * Description: LineTest
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:23)
 */
public class LineTest {

    class Function implements JSONAware {
        private String functionString;

        public Function(String functionString) {
            this.functionString = functionString;
        }

        @Override
        public String toJSONString() {
            return this.functionString;
        }
    }

    @Test
    public void printLine() {
        Line line = new Line();
        line.itemStyle.normal.label = new Label();
        line.itemStyle.normal.label.formatter = new Function("function(a,b){console.log(a,b);}");
        System.out.println(JSON.toJSONString(line));
    }

//    @Test
//    public void test(){
//        Map map = new HashMap();
//        map.put("key",1);
//        map.put("formatter","function(a,b){console.log(a,b);}");
//        Gson gson = new Gson();
//        String json = gson.toJson(map);
//        json = json.replaceAll("\"function","function");
//        json = json.replaceAll("}\"","}");
//        System.out.println(json);
//    }
//
//    public static String jsonFormatter(String uglyJSONString) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        JsonParser jp = new JsonParser();
//        JsonElement je = jp.parse(uglyJSONString);
//        String prettyJsonString = gson.toJson(je);
//        return prettyJsonString;
//    }
}
