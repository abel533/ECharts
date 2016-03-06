package com.github.abel533.echarts;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzh_3nofxnp
 * @since 2016-02-28 09:58
 */
public class Generator {
    public static void main(String[] args) {
        String _lines = "private TextStyle textStyle;";
        String _type = "DataZoom";
//        simple(_type, _lines);
        simpleNew(_type, _lines);
    }

    /**
     * 最简单的形式
     *
     * @param _type
     * @param _lines
     */
    public static void simple(String _type, String _lines) {
        String _this = "\treturn this;";
        if (_type.equals("T")) {
            _this = "\treturn (T) this;";
        }
        String[] lines = lines(_lines);
        for (String line : lines) {
            String[] ls = line.split(" ");
            System.out.println("public " + ls[1] + " " + ls[2] + "(){");
            System.out.println("\treturn this." + ls[2] + ";");
            System.out.println("}\n");
            System.out.println("public " + _type + " " + ls[2] + "(" + ls[1] + " " + ls[2] + "){");
            System.out.println("\tthis." + ls[2] + " = " + ls[2] + ";");
            System.out.println(_this);
            System.out.println("}\n");
        }
    }

    /**
     * 最简单的形式
     *
     * @param _type
     * @param _lines
     */
    public static void simpleNew(String _type, String _lines) {
        String _this = "\treturn this;";
        if (_type.equals("T")) {
            _this = "\treturn (T) this;";
        }
        String[] lines = lines(_lines);
        for (String line : lines) {
            String[] ls = line.split(" ");
            System.out.println("public " + ls[1] + " " + ls[2] + "(){");
            System.out.println("\tif(this." + ls[2] + " == null){");
            System.out.println("\t\tthis." + ls[2] + "= new " + ls[1] + "();");
            System.out.println("\t}");
            System.out.println("\treturn this." + ls[2] + ";");
            System.out.println("}\n");
            System.out.println("public " + _type + " " + ls[2] + "(" + ls[1] + " " + ls[2] + "){");
            System.out.println("\tthis." + ls[2] + " = " + ls[2] + ";");
            System.out.println(_this);
            System.out.println("}\n");
        }
    }

    public static String[] lines(String _lines) {
        List<String> lineList = new ArrayList<String>();
        String[] lines = _lines.split("\n");
        for (String line : lines) {
            line = line.trim();
            if (line.length() == 0) {
                continue;
            }
            if (line.endsWith(";")) {
                line = line.substring(0, line.length() - 1);
            }
            lineList.add(line);
        }
        return lineList.toArray(new String[]{});
    }
}
