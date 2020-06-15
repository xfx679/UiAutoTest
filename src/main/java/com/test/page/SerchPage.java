package com.test.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SerchPage {
	
	@FindBy(xpath="//*[@id=\"kw\"]")
	private WebElement input;
	
	@FindBy(xpath = "//*[@id=\"su\"]")
	private WebElement baiButton;

	public WebElement getInput() {
		return input;
	}

	public void setInput(WebElement input) {
		this.input = input;
	}

	public WebElement getBaiButton() {
		return baiButton;
	}

	public void setBaiButton(WebElement baiButton) {
		this.baiButton = baiButton;
	}
}
