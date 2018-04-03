package com.actitime.demo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement unTextBox;
	
	@FindBy(name="pwd")
	private WebElement pwdTextBox;

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String uname){
		unTextBox.sendKeys(uname);
	}
	
	public void setPassword(String pwd){
		pwdTextBox.sendKeys(pwd);
	}
	
	public void clickLogin(){
		loginButton.click();
	}
	
}
