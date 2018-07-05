package com.qa.pradeep.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewTaskACT {
	
	@FindBy (xpath="(//img[@src='/img/default/pixel.gif?hash=797058701'])[8]")
	private WebElement taskimage;
	

	@FindBy (xpath="//input[@value='Create New Tasks']")
	private WebElement createtasknew ;
	
	@FindBy(xpath="//select[@name='customerId']")
	private WebElement customerdownarrow;
	

	
	@FindBy (xpath="//input[@name='projectName']")
	private WebElement projectname;

	@FindBy(name="customerName")
	private WebElement custName;
	
	@FindBy(name="task[0].name")
	private WebElement task1name;
	
	@FindBy(name="task[0].billingType")
	private WebElement billTime;
	
	@FindBy(name="task[0].deadline")
	private WebElement deadline;
	
	@FindBy(xpath="//input[@value='Create Tasks']")
	private WebElement createtask;
	
//	@FindBy(xpath="//a[text()='Open Tasks']")
//	private WebElement openTask;
	
	@FindBy(xpath="(//input[@value='1'])[3]")
	private WebElement taskChekbox;
	
	@FindBy(xpath="//input[@value='Delete Selected Tasks']")
	private WebElement deleteTask;
	
	@FindBy(xpath="//input[@value='Delete Task']")
	private WebElement popupalert;
	
	@FindBy (xpath="//a[text()='Projects & Customers']")
	private WebElement customerimage;
	
	@FindBy (xpath="(//input[@type='checkbox'])[4]")
	private WebElement customercheckbox;
	
	@FindBy (xpath="//input[@value='Delete Selected']")
	private WebElement customerDelete;
	
	@FindBy (xpath="//input[@value='Delete This Customer']")
	private WebElement customerpopup;
	
	public NewTaskACT(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void imagetask(){
		taskimage.click();
	}
	
	public void newtaskcreate(){
		createtasknew.click();
	}
	

	public void idcustomer(){
		customerdownarrow.click();
		
		Select select1= new Select(customerdownarrow);
		select1.selectByIndex(1);
	}
	
	public void nameCustomer(){
		custName.sendKeys("Rupert");
		
	}
	

	
	public void nameProject(){
		projectname.sendKeys("Test1");
	}
	
	
	public void nameTask(String tn){
		task1name.sendKeys(tn);
	}
	
	public void timeBill(){
		deadline.sendKeys("Jul 15, 2018");
			
	}
	
	public void typeBill(){
		billTime.click();
		
		Select select2= new Select(billTime);
		select2.selectByIndex(1);
	}
	
	public void taskCreate(){
		createtask.click();
	}
	

	
	public void checkboxtask(){
		taskChekbox.click();
	}
	
	public void taskdeleted(){
		deleteTask.click();
	}
	
	public void allertpopup(){
		popupalert.click();
	}
	
	public void imageCustomer(){
		customerimage.click();
	}
	
	public void checkboxcustomer(){
	customercheckbox.click();
	}
	
	public void delecustomer(){
		customerDelete.click();
	}
	
	public void popupcustomer(){
		customerpopup.click();
	}
	

}
