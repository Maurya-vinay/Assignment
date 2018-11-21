package com.apptest.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepageobject {

	public static WebElement element = null;

	public static WebElement createApp(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[@id='link-create']"));
	}

	public static WebElement started(WebDriver driver) {
		return element = driver.findElement(
				By.xpath("(//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix'])[1]/button[1]"));
	}
	
	public static WebElement newPage(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//a[@id='add-page']"));
	}
	
	public static WebElement newPageName(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@class='indented submitonenter']"));
	}
	
	public static WebElement newPageCreatebutton(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//div[@class='ui-dialog-buttonpane ui-widget-content ui-helper-clearfix'])[15]/button[1]"));
	}

}
