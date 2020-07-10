package com.test.baiduCase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.base.Base;
import com.test.base.ParameterValue;
import com.test.operation.LoginOperation;

public class LoginCase {

	@Test
	public void login() throws IOException {
		Logger log = Logger.getLogger(LoginCase.class);
		String[] strArray = ParameterValue.parameterValue();
		Base base = new Base();
		base.openBrowser("chrome");
		WebDriver driver = base.getUrl(strArray[0]);
		LoginOperation oper = PageFactory.initElements(driver, LoginOperation.class);
		log.info("启动浏览器---------------------------");
		oper.loginClick();
		oper.loginSendKey(strArray[1], strArray[2]);
		//关闭浏览器
        base.colseBrowser();
        log.info("关闭浏览器---------------------------");
	}
}