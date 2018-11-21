package com.apptest.testutil;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class WebdriverUtils {
	
 static Actions ac =null;
 static JavascriptExecutor js =null;
	//public WebDriver driver;
	
	
	public static void dragAnddrop(WebDriver driver, WebElement source, WebElement destination)
	{
		try{
			ac = new Actions(driver);
			ac.dragAndDrop(source, destination).build().perform();
		}catch(Exception ex)
		{
			Assert.fail(ex.getMessage());
		}
	}
	
	public static void setAttributeValue(WebDriver driver, WebElement elem, String value){
		try{
			Thread.sleep(2000);
		     js = (JavascriptExecutor) driver; 
		    String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";
		    js.executeScript(scriptSetAttrValue, elem, "style", value);
		}catch(Exception ex)
		{
			Assert.fail(ex.getMessage());
		}
	 }

}
