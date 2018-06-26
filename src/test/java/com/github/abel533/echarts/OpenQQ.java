package com.github.abel533.echarts;

/**
 * @description: 使用java.lang.RunTime 打开QQ
 * @version:v1.0
 * @author:w
 * @date：2018年6月26日下午3:44:34
 *
 */

public class OpenQQ {
	public static void main(String[] args) throws Exception {
		Runtime.getRuntime().exec("E:\\soft\\tecentQQ\\Bin\\QQScLauncher.exe");
		System.out.println("QQ打开完毕~ ");
	}
}
