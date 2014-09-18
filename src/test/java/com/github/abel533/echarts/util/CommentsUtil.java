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

package com.github.abel533.echarts.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 自动生成链式调用方法 - 仅针对本项目之前的代码
 *
 * @author liuzh
 */
public class CommentsUtil {
    public static final String[] EMPTY = new String[0];

    public static void main(String[] args) {
//        System.out.println(getMethodFieldName("public Boolean getShow() {"));
        //System.out.println();//
        //输出全部类
//        String srcPath = getSrcPath();
//        File srcFoler = new File(srcPath);
//        List<File> all = allFiles(srcFoler);
//        for (File file : all) {
//            chainFile(file);
//        }
        commentsFile(new File("D:\\IdeaProjects\\GitHub\\ECharts\\src\\main\\java\\com\\github\\abel533\\echarts\\Tooltip.java"));
    }

    public static void commentsFile(File file) {
        BufferedReader reader = null;
        StringBuffer sb = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            String className = file.getName();
            className = className.substring(0, className.lastIndexOf("."));
            String prevLine = null;
            while ((line = reader.readLine()) != null) {
                String tempLline = line;
                if (tempLline.contains("private") || tempLline.contains("public") || tempLline.contains("protected")) {
                    if (prevLine == null || !prevLine.contains("*")) {
                        if (tempLline.contains("(") && tempLline.contains(")")) {
                            //分解参数
                            tempLline = tempLline.trim();
                            String[] ps = getParameter(tempLline);
                            if (ps == EMPTY) {
                                sb.append("\t/**\n\t * 获取"+getMethodFieldName(tempLline)+"值 \n");
                            } else {
                                for (String s : ps) {
                                    sb.append("\t/**\n\t * 设置" + s + "值 \n\t * \n");
                                    sb.append("\t * @param " + s + "\n");
                                }
                            }
                            sb.append("\t */\n");
                            tempLline = "\t" + tempLline;
                        }
                    }
                }
                sb.append(tempLline + "\n");
                prevLine = tempLline;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getMethodFieldName(String line) {
        int end = line.lastIndexOf("(");
        int start = line.lastIndexOf(" ", end);
        String name = line.substring(start + 1, end);
        if (name.startsWith("get")) {
            name = name.substring(3);
            name = name.substring(0, 1).toLowerCase() + name.substring(1);
        }
        return name;
    }

    public static String[] getParameter(String line) {
        if (line.contains("(") && line.contains(")")) {
            //分解参数
            String all = line.substring(line.indexOf("(") + 1, line.lastIndexOf(")"));
            if (all.equals("")) {
                return EMPTY;
            }
            String[] alls = all.split(",");
            String[] parameters = new String[alls.length];
            for (int i = 0; i < alls.length; i++) {
                parameters[i] = alls[i].split(" ")[1].trim();
            }
            return parameters;
        }
        return EMPTY;
    }

    public static List<File> allFiles(File file) {
        List<File> result = new ArrayList<File>();
        if (file.isFile()) {
            result.add(file);
        } else if (file.isDirectory()) {
            File[] files = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    if (dir.isDirectory()) {
                        return true;
                    } else if (name.toUpperCase().endsWith(".JAVA")) {
                        return true;
                    }
                    return false;
                }
            });
            for (File f : files) {
                result.addAll(allFiles(f));
            }
        }
        return result;
    }

    public static String getSrcPath() {
        String basePath = getBasePath();
        return basePath + "src/main/java";
    }

    public static String getBasePath() {
        String path = CommentsUtil.class.getResource("/").getPath();
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (path.indexOf("target1") > 0) {
            path = path.substring(0, path.indexOf("target"));
        } else if (path.indexOf("ECharts") > 0) {
            path = path.substring(0, path.indexOf("ECharts")) + "Echarts/";
        }
        return path;
    }
}
