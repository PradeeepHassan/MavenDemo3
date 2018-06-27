package com.qa.pradeep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageACT {
	@FindBy (xpath="//span[text()='Help & Support']") private WebElement help;
	@FindBy(xpath="//div[@onclick='menuItemHandler_About();']") private WebElement aboutat;
	@FindBy(xpath="//td[contains(text(),'build')]") private WebElement build;
	@FindBy(xpath="//img[@class='close']") private WebElement close;
	@FindBy (id="logoutLink") private WebElement logout;
	
	public HomePageACT(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void helpHP()
	{
		help.click();
	}
	
	public void aboutTab()
	{
		aboutat.click();
	}
	 
	public void veryfyBuilNo(String bBuildNo)
	{
		String aBuildNo=build.getText();
		
		Assert.assertEquals(aBuildNo, bBuildNo);
	}
	
	public void closeHP()
	{
		close.click();
	}
	
	public void logoutAT()
	{
		logout.click();
	}

}
