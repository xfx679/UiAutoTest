package com.test.base;

import java.io.IOException;


import java.util.ArrayList;
import java.util.List;

public class ParameterValue {
	
	public static Parameter par = new Parameter();
	public static String url ;
	
	public static String[] parameterValue() throws IOException {
		url = par.obtain("url", "baidu");
		String username = par.obtain("name", "baidu");
		String password = par.obtain("pass", "baidu");
		List<String> list = new ArrayList<String>();
		list.add(url);
		list.add(username);
		list.add(password);
		//第二种遍历,把把链表变为数组相关的内容进行遍历
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		//用这个的话所有调用的数据类型为object
//		Object[] strArray = list.toArray();
		return strArray;
	}
}
