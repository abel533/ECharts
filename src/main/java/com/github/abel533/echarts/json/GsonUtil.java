/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.github.abel533.echarts.json;

import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.series.Series;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * @author liuzh
 */
public class GsonUtil {

    /**
     * 格式化对象为Json
     *
     * @param object
     * @return
     */
    public static String format(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(gson.toJson(object));
        String prettyJsonString = gson.toJson(je);
        //简单处理function
        String[] lines = prettyJsonString.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        boolean function = false;
        for (String line : lines) {
            if (!function && line.contains("\"function")) {
                function = true;
                line = line.replaceAll("\"function", "function");
            }
            if (function && line.contains("}\"")) {
                function = false;
                line = line.replaceAll("\\}\"", "\\}");
            }
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    /**
     * 格式化对象为Json
     *
     * @param object
     * @return
     */
    public static String prettyFormat(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(gson.toJson(object));
        String prettyJsonString = gson.toJson(je);
        //简单处理function
        String[] lines = prettyJsonString.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        boolean function = false;
        for (String line : lines) {
            if (!function && line.contains("\"function")) {
                function = true;
                line = line.replaceAll("\"function", "function");
            }
            if (function && line.contains("}\"")) {
                function = false;
                line = line.replaceAll("\\}\"", "\\}");
            }
            stringBuilder.append(line + "\n");
        }
        return stringBuilder.toString();
    }

    /**
     * 反序列化
     *
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    public static <T extends Option> T fromJSON(String json, Class<T> type) {
        Gson gson = new GsonBuilder().setPrettyPrinting().
                registerTypeAdapter(Series.class, new SeriesDeserializer()).
                registerTypeAdapter(Axis.class, new AxisDeserializer()).create();
        return gson.fromJson(json, type);
    }

    /**
     * 反序列化
     *
     * @param json
     * @return
     */
    public static Option fromJSON(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().
                registerTypeAdapter(Series.class, new SeriesDeserializer()).
                registerTypeAdapter(Axis.class, new AxisDeserializer()).create();
        Option option = gson.fromJson(json, Option.class);
        return option;
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
