package com.test.baiduCase;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.base.Base;
import com.test.base.ParameterValue;
import com.test.operation.SearchOperation;

public class SearchCase {
	
	public Logger log = Logger.getLogger(LoginCase.class);

	@Test
	public void serach() throws IOException {
		String[] strArray = ParameterValue.parameterValue();
		Base base = new Base();
		base.openBrowser("chrome");
		base.getUrl(strArray[0]);
		base.sleep(2000);
		WebDriver driver = base.getUrl(strArray[0]);
		SearchOperation search = PageFactory.initElements(driver, SearchOperation.class);
		log.info("打开浏览器了---------------------------");
		search.serachSendKeys();
		base.colseBrowser();
		log.info("关闭浏览器了----------------------------");
	}
}
