package com.actitime.demo.testscripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.demo.generic.BaseTest;
import com.actitime.demo.generic.Lib;
import com.actitime.demo.pompages.EnterTimeTrackPage;
import com.actitime.demo.pompages.LoginPage;

public class VerifyProductVersion extends BaseTest {

	@Test(priority=3)
	public void testProductVersion() throws InterruptedException{
		
		LoginPage l = new LoginPage(driver);
		String username = Lib.getCellValue("ValidLogin", 1, 0);
		//enter uname
		l.setUsername(username);
		//enter pwd
		String password = Lib.getCellValue("ValidLogin", 1, 1);
		l.setPassword(password);
		//click on Login button
		l.clickLogin();
		Thread.sleep(5000);
		
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.clickHelpMenu();
		e.clickAboutActiTimeLink();
		
		String expectedProductVersion = Lib.getCellValue("ProductVersion", 1, 0);
		String actualProductVersion = e.getProductVersion();
		SoftAssert s = new SoftAssert();
		s.assertEquals(expectedProductVersion, actualProductVersion);
		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(eTitle));*/
		
		e.clickClosePopup();
		e.clickLogout();
		s.assertAll();
	}
	
}
