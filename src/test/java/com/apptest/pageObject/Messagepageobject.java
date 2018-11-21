package com.apptest.pageObject;

import javax.xml.ws.WebEndpoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Messagepageobject {
	
	public static WebElement element = null;

	public static WebElement messageModule(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[contains(text(), 'Messaging')]"));
	}
	
	public static WebElement sendSms(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//ul[@class='module-group'])[4]/li[3]/a"));
	}
	
	public static WebElement sendEmail(WebDriver driver)
	{
		return element= driver.findElement(By.xpath("(//ul[@class='module-group'])[4]/li[2]/a"));
	}
	
	public static WebElement startPoint(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='syn-node ui-draggable syn-node-active'])[2]"));
	}
	
	public static WebElement smsConnect(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[1]"));
	}
	
	public static WebElement smsModule(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@id='module-2']"));
	}
	
	public static WebElement emailModule(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@id='module-3']"));
	}
	
	public static WebElement smsToemail(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='syn-node syn-node-attached-e ui-draggable syn-node-active'])[1]"));
	}
	
	public static WebElement smsToemail2(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='mod-rail mod-north'])[4]/div"));
	}
	
	public static WebElement phoneNumber(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//textarea[@name='phone_constant']"));
	}
	
	public static WebElement messageText(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@class='panel-section-nominimize']//tbody//div[@class='syn-selectappvar-wrap']//textarea[@name='message_phrase[]']"));
	}
	
	public static WebElement smptHost(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//input[@name='smtp_url']"));
	}
	
	public static WebElement port(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//input[@name='port']"));
	}
	
	public static WebElement userName(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@class='left']//input[@name='username']"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//input[@name='password']"));
	}
	
	public static WebElement from(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//textarea[@name='from_constant']"));
	}
	
	public static WebElement to(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//textarea[@name='to_constant']"));
	}
	
	public static WebElement subject(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//textarea[@name='subject_constant']"));
	}
	
	public static WebElement messageMail(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@class='panel-subsection']//tbody//div[@class='syn-selectappvar-wrap']//textarea[@name='message_phrase[]']"));
	}
	
	public static WebElement basicModule(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//a[contains(text(),'Basic')]"));
	}
	
	public static WebElement exitApp(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//li[@class='module-item ui-widget-content ui-corner-all module-item-red ui-draggable']//span[@class='ui-icon ui-icon-circle-plus']"));
	}
	
	public static WebElement exitApp1(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@id='module-4']"));
	}
	
	public static WebElement exitApp2(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@id='module-5']"));
	}
	
	public static WebElement exitApp3(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("//div[@id='module-6']"));
	}
	
	public static WebElement sentpoint(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='panel-nodes-attached inner'])[1]/div[1]"));
	}
	
	public static WebElement connectexitApp1(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[3]"));
	}
	
	public static WebElement emailSentpoint(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='panel-nodes-attached inner'])[2]/div[1]"));
	}
	
	public static WebElement connectexitApp2(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[4]"));
	}
	
	public static WebElement emailNotsentpoint(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='panel-nodes-attached inner'])[2]/div[2]"));
	}
	
	public static WebElement connectexitApp3(WebDriver driver)
	{
		return element = driver.findElement(By.xpath("(//div[@class='syn-receptor ui-droppable syn-receptor-north ui-draggable syn-receptor-draggable'])[5]"));
	}

}
