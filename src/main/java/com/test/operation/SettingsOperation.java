package com.test.operation;

import org.openqa.selenium.WebDriver;

import com.test.base.Base;
import com.test.page.SettingsPage;

public class SettingsOperation extends SettingsPage{
	
	Base base = new Base();
	
	public void settingClick(WebDriver deiver) {
		//第一种方式点击设置按钮
//		getSettingBotton().click();
		//第二种方式鼠标悬停
		base.hover(deiver, getSettingBotton());
		base.sleep(5000);
		//点击搜索设置
		getSerachBotton().click();
		base.sleep(2000);
	}
}
