package com.apptest.runner;

import org.testng.annotations.Test;

import com.apptest.common.Home;
import com.apptest.common.Message;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestRunner {
	
	WebDriver driver;
	Home home;
	Message mess;
	
	
  @Test
  public void testCases() {
	  home.navigateTocreatePage();
	  mess.selectMessaging();
  }
  
   
  @BeforeTest
  public void openBrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://quickfuseapps.com/");	
	  driver.manage().window().fullscreen();
  }
  
  @AfterTest
  public void closeBrowser()
  {
	driver.quit();  
  }
  
  
  @BeforeClass
  public void initialize()
  {
	  home = new Home(driver);
	  mess = new Message(driver);
  }

}
