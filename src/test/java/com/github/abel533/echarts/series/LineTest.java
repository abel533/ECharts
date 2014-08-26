package com.github.abel533.echarts.series;

import com.github.abel533.echarts.GsonFormatter;
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
        GsonFormatter.print(line);
    }


}
