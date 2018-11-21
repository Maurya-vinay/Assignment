package com.apptest.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.apptest.pageObject.Homepageobject;

public class Home {
	private WebDriver driver;
	WebDriverWait wait;
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 90);
	}
	
	public void navigateTocreatePage()
	{
		try
		{
			Homepageobject.createApp(driver).click();
			wait.until(ExpectedConditions.visibilityOf(Homepageobject.started(driver)));
			Homepageobject.started(driver).click();
			wait.until(ExpectedConditions .visibilityOf(Homepageobject.newPage(driver)));
			Homepageobject.newPage(driver).click();
			wait.until(ExpectedConditions .visibilityOf(Homepageobject.newPageName(driver)));
			Homepageobject.newPageName(driver).sendKeys("Test");
			Homepageobject.newPageCreatebutton(driver).click();
			
		}catch(Exception ex)
		{
			Assert.fail(ex.getMessage());
		}
	}

}
