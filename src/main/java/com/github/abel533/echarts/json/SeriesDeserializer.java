/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 abel533@gmail.com
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

import com.github.abel533.echarts.code.SeriesType;
import com.github.abel533.echarts.series.*;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * @author liuzh
 */
public class SeriesDeserializer implements JsonDeserializer<Series> {
    @Override
    /**
     * 设置json,typeOfT,context值
     *
     * @param json
     * @param typeOfT
     * @param context
     */
    public Series deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        final JsonObject jsonObject = json.getAsJsonObject();
        String _type = jsonObject.get("type").getAsString();
        SeriesType type = SeriesType.valueOf(_type);
        Series series = null;
        switch (type) {
            case line:
                series = context.deserialize(jsonObject, Line.class);
                break;
            case bar:
                series = context.deserialize(jsonObject, Bar.class);
                break;
            case scatter:
                series = context.deserialize(jsonObject, Scatter.class);
                break;
            case funnel:
                series = context.deserialize(jsonObject, Funnel.class);
                break;
            case pie:
                series = context.deserialize(jsonObject, Pie.class);
                break;
            case gauge:
                series = context.deserialize(jsonObject, Gauge.class);
                break;
            case map:
                series = context.deserialize(jsonObject, Map.class);
                break;
            case lines:
                series = context.deserialize(jsonObject, Lines.class);
                break;
            case effectScatter:
                series = context.deserialize(jsonObject, EffectScatter.class);
                break;
            case candlestick:
                series = context.deserialize(jsonObject, Candlestick.class);
                break;
            case graph:
                series = context.deserialize(jsonObject, Graph.class);
                break;
            case boxplot:
                series = context.deserialize(jsonObject, Boxplot.class);
                break;
            case parallel:
                series = context.deserialize(jsonObject, Parallel.class);
                break;
            case sankey:
                series = context.deserialize(jsonObject, Sankey.class);
                break;
        }
        return series;
    }
}
