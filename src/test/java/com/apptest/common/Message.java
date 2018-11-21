package com.apptest.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.apptest.pageObject.Messagepageobject;
import com.apptest.testutil.WebdriverUtils;

public class Message {
	
	private WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	public Message(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 90);
		js = (JavascriptExecutor) driver; 
	}
	
	public void selectMessaging()
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.messageModule(driver)));
			Messagepageobject.messageModule(driver).click();
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.sendSms(driver)));
			js.executeScript("arguments[0].click();", Messagepageobject.sendSms(driver));
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.smsModule(driver)));
			WebdriverUtils.setAttributeValue(driver, Messagepageobject.smsModule(driver), "top: 144px; left: 523px;");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.smsConnect(driver)));
			WebdriverUtils.dragAnddrop(driver, Messagepageobject.startPoint(driver), Messagepageobject.smsConnect(driver));
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.phoneNumber(driver)));
			Messagepageobject.phoneNumber(driver).sendKeys("1234567890");
			Messagepageobject.messageText(driver).sendKeys("Hello World");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.sendEmail(driver)));
			js.executeScript("arguments[0].click();", Messagepageobject.sendEmail(driver));
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.emailModule(driver)));
			WebdriverUtils.setAttributeValue(driver, Messagepageobject.emailModule(driver), "top: 267px; left: 778px;");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.smsToemail2(driver)));
			WebdriverUtils.dragAnddrop(driver, Messagepageobject.smsToemail(driver), Messagepageobject.smsToemail2(driver));
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.smptHost(driver)));
			Messagepageobject.smptHost(driver).sendKeys("smpt.gmail.com");
			Messagepageobject.port(driver).sendKeys("465");
			Messagepageobject.userName(driver).sendKeys("abc@gmail.com");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.password(driver)));
			Messagepageobject.password(driver).sendKeys("abcde");
			Messagepageobject.from(driver).sendKeys("abc@gmail.com");
			Messagepageobject.to(driver).sendKeys("xyz@gmail.com");
			Messagepageobject.subject(driver).sendKeys("SMS not sent");
			Messagepageobject.messageMail(driver).sendKeys("sms to phone number 1234567890 not sent");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.basicModule(driver)));
			Messagepageobject.basicModule(driver).click();
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.exitApp(driver)));
			js.executeScript("arguments[0].click();", Messagepageobject.exitApp(driver));
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.exitApp1(driver)));
			WebdriverUtils.setAttributeValue(driver, Messagepageobject.exitApp1(driver), "top: 302px; left: 270px;");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.sentpoint(driver)));
			WebdriverUtils.dragAnddrop(driver, Messagepageobject.sentpoint(driver), Messagepageobject.connectexitApp1(driver));
			
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.exitApp(driver)));
			js.executeScript("arguments[0].click();", Messagepageobject.exitApp(driver));
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.exitApp2(driver)));
			WebdriverUtils.setAttributeValue(driver, Messagepageobject.exitApp2(driver), "top: 461px; left: 447px;");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.emailSentpoint(driver)));
			WebdriverUtils.dragAnddrop(driver, Messagepageobject.emailSentpoint(driver), Messagepageobject.connectexitApp2(driver));
			
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.exitApp(driver)));
			js.executeScript("arguments[0].click();", Messagepageobject.exitApp(driver));
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.exitApp3(driver)));
			WebdriverUtils.setAttributeValue(driver, Messagepageobject.exitApp3(driver), "top: 421px; left: 1077px;");
			wait.until(ExpectedConditions.visibilityOf(Messagepageobject.emailNotsentpoint(driver)));
			WebdriverUtils.dragAnddrop(driver, Messagepageobject.emailNotsentpoint(driver), Messagepageobject.connectexitApp3(driver));
			
			
		}catch(Exception ex)
		{
			Assert.fail(ex.getMessage());
		}
	}

}
