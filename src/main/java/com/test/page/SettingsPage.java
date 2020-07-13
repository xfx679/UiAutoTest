package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {
	
	@FindBy(xpath="//*[@id=\"s-usersetting-top\"]")
	private WebElement settingBotton;
	
	@FindBy(xpath="//*[@id=\"s-user-setting-menu\"]/div/a[1]")
	private WebElement serachBotton;
	
	@FindBy(xpath="//*[@id=\"s1_2\"]")
	private WebElement noShowButton;
	
	@FindBy(xpath="//*[@id=\"se-setting-7\"]/a[1]")
	private WebElement defaultBotton;

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

	public WebElement getNoShowButton() {
		return noShowButton;
	}

	public void setNoShowButton(WebElement noShowButton) {
		this.noShowButton = noShowButton;
	}

	public WebElement getDefaultBotton() {
		return defaultBotton;
	}

	public void setDefaultBotton(WebElement defaultBotton) {
		this.defaultBotton = defaultBotton;
	}
	
}
