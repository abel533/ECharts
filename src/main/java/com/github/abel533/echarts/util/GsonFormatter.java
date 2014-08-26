package com.github.abel533.echarts.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Description: GsonFormatter
 * Author: liuzh
 * Update: liuzh(2014-08-26 14:10)
 */
public class GsonFormatter {

    /**
     * 格式化对象为Json
     *
     * @param object
     * @return
     */
    public static String format(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(gson.toJson(object));
        String prettyJsonString = gson.toJson(je);
        return prettyJsonString;
    }


    /**
     * 输出Json
     *
     * @param object
     * @return
     */
    public static void print(Object object) {
        System.out.println(format(object));
    }


}
