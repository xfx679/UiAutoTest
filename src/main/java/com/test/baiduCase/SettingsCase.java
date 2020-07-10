package com.test.baiduCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.test.base.Base;
import com.test.base.ParameterValue;
import com.test.operation.SettingsOperation;

public class SettingsCase {

	@Test
	public void settings() throws IOException {
		//获取UI链接
		String[] paramet = ParameterValue.parameterValue();
		Base base = new Base();
		//打开浏览器
		base.openBrowser("chrome");
		//打开链接
		WebDriver deiver = base.getUrl(paramet[0]);
		//对页面进行操作
		SettingsOperation settion = PageFactory.initElements(deiver, SettingsOperation.class);
		settion.settingClick(deiver);
		//关闭浏览器
		base.colseBrowser();
	}
}
