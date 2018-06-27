package com.qa.pradeep.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageACT {
	@FindBy(name="username") 
	private WebElement username;
	
	@FindBy(name="pwd") 
	private WebElement password;
	
	@FindBy(id="loginButton") 
	private WebElement login;
	
	@FindBy(xpath="//span[@class='errormsg']") 
	private WebElement errmsg;
	
	public LoginPageACT(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void usertexbox(String us){
		username.sendKeys(us);	
	}
	
	public void passtextbox(String pn){
		password.sendKeys(pn);		
	}
	
	public void loginbutton(){
		login.click();
	}
	
	public void errmssage(){
		Assert.assertTrue(errmsg.isDisplayed());
	}

}
