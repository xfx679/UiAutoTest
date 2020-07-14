package com.test.operation;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.test.baiduCase.LoginCase;
import com.test.base.Base;
import com.test.page.SettingsPage;

public class SettingsOperation extends SettingsPage{
	
	public Base base = new Base();
	public Logger log = Logger.getLogger(LoginCase.class);

	
	public void settingClick(WebDriver driver) {
		//第一种方式点击设置按钮
//		getSettingBotton().click();
		//第二种方式鼠标悬停
		base.hover(driver, getSettingBotton());
		log.info("设置按钮鼠标悬停");
		base.sleep(5000);
		//点击搜索设置
		getSerachBotton().click();
		log.info("点击搜索设置按钮");
		base.sleep(2000);
		//搜索框提示点击不显示
		getNoShowButton().click();
		log.info("搜索框提示点击不显示复选框");
		base.sleep(3000);
		//点击恢复默认
		getDefaultBotton().click();
		log.info("点击霍夫默认按钮");
		base.sleep(3000);
		//点击确认按钮
		driver.switchTo().alert().accept();
		log.info("点击谷歌自带弹框的确认按钮");
		base.sleep(3000);
	}
}
