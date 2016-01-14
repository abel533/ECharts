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

import com.github.abel533.echarts.Option;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: 提供浏览器查看图标的功能 - 必须能够联网
 *
 * @author liuzh
 */
public class OptionUtil {

    /**
     * 私有构造函数，防止创建该类
     */
    private OptionUtil() {

    }

    /**
     * 导出到html（tmp文件夹）
     *
     * @param option
     * @return 返回html路径
     */
    public static String exportToHtml(Option option) {
        String folderPath = System.getProperty("java.io.tmpdir");
        return exportToHtml(option, folderPath);
    }

    /**
     * 导出到指定文件夹，文件名随机
     *
     * @param option
     * @param folderPath
     * @return 返回html路径
     */
    public static String exportToHtml(Option option, String folderPath) {
        String fileName = "ECharts-" + System.currentTimeMillis() + ".html";
        return exportToHtml(option, folderPath, fileName);
    }

    /**
     * 获取文件夹路径，如果不存在则创建
     *
     * @param folderPath
     * @return
     */
    private static String getFolderPath(String folderPath) {
        File folder = new File(folderPath);
        if (folder.exists() && folder.isFile()) {
            String tempPath = folder.getParent();
            folder = new File(tempPath);
        }
        if (!folder.exists()) {
            folder.mkdirs();
        }
        return folder.getPath();
    }

    /**
     * 读取模板并写入数据
     *
     * @param option
     * @return
     */
    private static List<String> readLines(Option option) {
        String optionStr = GsonUtil.format(option);
        InputStream is = null;
        InputStreamReader iReader = null;
        BufferedReader bufferedReader = null;
        List<String> lines = new ArrayList<String>();
        String line;
        try {
            is = OptionUtil.class.getResourceAsStream("/template");
            iReader = new InputStreamReader(is, "UTF-8");
            bufferedReader = new BufferedReader(iReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("##option##")) {
                    line = line.replace("##option##", optionStr);
                }
                lines.add(line);
            }
        } catch (Exception e) {
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    //ignore
                }
            }
        }
        return lines;
    }

    /**
     * 导出到指定文件
     *
     * @param option
     * @param folderPath
     * @param fileName
     * @return 返回html路径
     */
    public static String exportToHtml(Option option, String folderPath, String fileName) {
        if (fileName == null || fileName.length() == 0) {
            return exportToHtml(option, folderPath);
        }
        Writer writer = null;
        List<String> lines = readLines(option);
        //写入文件
        File html = new File(getFolderPath(folderPath) + "/" + fileName);
        try {
            writer = new OutputStreamWriter(new FileOutputStream(html), "UTF-8");
            for (String l : lines) {
                writer.write(l + "\n");
            }
        } catch (Exception e) {
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    //ignore
                }
            }
        }
        //处理
        try {
            return html.getAbsolutePath();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 在浏览器中查看Option效果
     *
     * @param option
     */
    public static String browse(Option option) {
        String htmlPath = exportToHtml(option);
        //处理
        try {
            browse(htmlPath);
        } catch (Exception e) {
        }
        return htmlPath;
    }

    /**
     * 打开浏览器
     *
     * @param url
     * @throws Exception
     */
    public static void browse(String url) throws Exception {
        //获取操作系统的名字
        String osName = System.getProperty("os.name", "");
        if (osName.startsWith("Mac OS")) {
            //苹果的打开方式
            Class fileMgr = Class.forName("com.apple.eio.FileManager");
            Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[]{String.class});
            openURL.invoke(null, new Object[]{url});
        } else if (osName.startsWith("Windows")) {
            //windows的打开方式。
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } else {
            // Unix or Linux的打开方式
            String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape"};
            String browser = null;
            for (int count = 0; count < browsers.length && browser == null; count++) {
                //执行代码，在brower有值后跳出，
                //这里是如果进程创建成功了，==0是表示正常结束。
                if (Runtime.getRuntime().exec(new String[]{"which", browsers[count]}).waitFor() == 0) {
                    browser = browsers[count];
                }
            }
            if (browser == null) {
                throw new Exception("Could not find web browser");
            } else {
                //这个值在上面已经成功的得到了一个进程。
                Runtime.getRuntime().exec(new String[]{browser, url});
            }
        }
    }
}
