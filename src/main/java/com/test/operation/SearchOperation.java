package com.test.operation;

import java.io.IOException;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import com.test.baiduCase.LoginCase;
import com.test.base.Base;
import com.test.base.Parameter;
import com.test.page.SerchPage;

public class SearchOperation extends SerchPage {

	public Base base = new Base();
	public Parameter par = new Parameter();
	public Logger log = Logger.getLogger(LoginCase.class);

	// 点击输入框
	public void serachSendKeys() throws IOException {
		// 显示配置文件里的所有键值
		Iterator<Entry<Object, Object>> ite = par.getKeyValue("search");
		while (ite.hasNext()) {
			Map.Entry<Object, Object> entry = ite.next();
			String value = (String) entry.getValue();
			getInput().clear();
			log.info("清空输入框中的内容：" + value);
			getInput().sendKeys(value);
			log.info("输入框中输入" + value);
			base.sleep(2000);
			// 点击百度按钮
			getBaiButton().click();
			log.info("点击百度按钮---------------------------");
			base.sleep(3000);
		}
	}
}
