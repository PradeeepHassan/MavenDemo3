package com.qa.pradeep.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassACT {
	
public static WebDriver driver;
	
	@BeforeMethod	
	public void precondtionAT(){
    	System.setProperty("webdriver.chrome.driver","I:\\andrea automation workspace\\Andrea Automation\\exefiles\\chromedriver.exe");
    	driver = new ChromeDriver();		
//		System.setProperty("webdriver.gecko.driver","I:\\andrea automation workspace\\Andrea Automation\\exefiles\\geckodriver.exe");
//		WebDriver driver= new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void postcondtionAT(){
		driver.quit();
	}

}
