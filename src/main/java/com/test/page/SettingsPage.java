package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {
	
	@FindBy(xpath="//*[@id=\"s-usersetting-top\"]")
	private WebElement settingBotton;
	
	@FindBy(xpath="//*[@id=\"s-user-setting-menu\"]/div/a[1]")
	private WebElement serachBotton;

	public WebElement getSettingBotton() {
		return settingBotton;
	}

	public void setSettingBotton(WebElement settingBotton) {
		this.settingBotton = settingBotton;
	}

	public WebElement getSerachBotton() {
		return serachBotton;
	}

	public void setSerachBotton(WebElement serachBotton) {
		this.serachBotton = serachBotton;
	}
	
	
}
