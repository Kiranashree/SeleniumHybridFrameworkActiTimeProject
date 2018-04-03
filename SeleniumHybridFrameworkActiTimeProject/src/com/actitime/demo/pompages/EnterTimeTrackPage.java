package com.actitime.demo.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	
	@FindBy(xpath="//div[contains(text(),'Help')]")
	private WebElement helpMenu;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTimeLink;

	@FindBy(xpath="(//span[contains(text(),'actiTIME')])[1]")
	private WebElement productVersion;
	
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closePopupWindow;

	@FindBy(id="logoutLink")
	private WebElement logoutBtn;
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	public void clickHelpMenu(){
		helpMenu.click();
	}	
	public void clickAboutActiTimeLink(){
		aboutActiTimeLink.click();
	}
	public String getProductVersion(){
		return productVersion.getText();
	}
	public void clickClosePopup(){
		closePopupWindow.click();
	}
	public void clickLogout(){
		logoutBtn.click();
	}
	
}
