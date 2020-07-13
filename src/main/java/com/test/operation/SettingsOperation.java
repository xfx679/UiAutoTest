package com.test.operation;

import org.openqa.selenium.WebDriver;

import com.test.base.Base;
import com.test.page.SettingsPage;

public class SettingsOperation extends SettingsPage{
	
	Base base = new Base();
	
	public void settingClick(WebDriver driver) {
		//第一种方式点击设置按钮
//		getSettingBotton().click();
		//第二种方式鼠标悬停
		base.hover(driver, getSettingBotton());
		base.sleep(5000);
		//点击搜索设置
		getSerachBotton().click();
		base.sleep(2000);
		//搜索框提示点击不显示
		getNoShowButton().click();
		base.sleep(3000);
		//点击恢复默认
		getDefaultBotton().click();
		base.sleep(3000);
		//点击确认按钮
		driver.switchTo().alert().accept();
		base.sleep(3000);
	}
}
