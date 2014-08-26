package com.github.abel533.echarts.series;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.junit.Test;

/**
 * Description: LineTest
 * Author: liuzh
 * Update: liuzh(2014-08-26 10:23)
 */
public class LineTest {

    @Test
    public void printLine() {
        Line line = new Line();
        Gson gson = new Gson();
        String json = gson.toJson(line);
        System.out.println(jsonFormatter(json));
    }

    public static String jsonFormatter(String uglyJSONString) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(uglyJSONString);
        String prettyJsonString = gson.toJson(je);
        return prettyJsonString;
    }
}
