package com.test.operation;



import org.apache.log4j.Logger;

import com.test.baiduCase.LoginCase;


import com.test.base.Base;
import com.test.page.LoginPage;

public class LoginOperation extends LoginPage {

	public Logger log = Logger.getLogger(LoginCase.class);

	Base base = new Base();

	public void loginClick() {
		System.out.println(getLoginClick());
		getLoginClick().click();
		log.info("点击登录按钮");
		base.sleep(2000);
		getUserNaneLogin().click();
		log.info("点击用户名登录按钮");
		base.sleep(2000);
	}

	public void loginSendKey(String name, String pass) {
		getNameInput().sendKeys(name);
		log.info("输入用户名：" + name);
		base.sleep(2000);
		getPassInput().sendKeys(pass);
		log.info("输入密码：" + pass);
		base.sleep(2000);
	}
}
