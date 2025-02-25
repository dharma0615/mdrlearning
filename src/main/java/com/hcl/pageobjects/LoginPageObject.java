package com.hcl.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	private WebDriver driver;
	
	@FindBy(id="username")
	private WebElement userName;
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userNameValue) {
		userName.sendKeys(userNameValue);
	}

}
