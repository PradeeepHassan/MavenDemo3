package com.qa.pradeep.testcase;

import java.util.Set;

import javax.security.auth.callback.ConfirmationCallback;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;














import com.qa.pradeep.baseclass.BaseClassACT;
import com.qa.pradeep.pages.HomePageACT;
import com.qa.pradeep.pages.LoginPageACT;
import com.qa.pradeep.pages.NewTaskACT;


// {
//	pradeep kumar
//}
public class ValidLoginactTest extends BaseClassACT {
	

	@Test (priority=2,enabled=true)
	public void validTestlogin(){	
		LoginPageACT l= new LoginPageACT(driver);
		l.usertexbox("admin");
		l.passtextbox("manager");
		l.loginbutton();
		
		HomePageACT h= new HomePageACT(driver);
		h.logoutAT();
	}
	
	@Test (priority=1,enabled=true , invocationCount=1)
	public void invalidlogin1() throws InterruptedException{
		LoginPageACT l= new LoginPageACT(driver);
		l.usertexbox("pardee");
		l.passtextbox("andrea");
		l.loginbutton();
		Thread.sleep(2000);
		l.errmssage();
		
	}
	
	@Test (priority=3, enabled=true)
	public void versionAT() throws InterruptedException{	
		LoginPageACT l= new LoginPageACT(driver);
		l.usertexbox("admin");
		l.passtextbox("manager");
		l.loginbutton();
		HomePageACT h= new HomePageACT(driver);	
		h.helpHP();
		h.aboutTab();
		Thread.sleep(2000);
		h.veryfyBuilNo("3.3 (build 17443), Auto-installation package");
		h.closeHP();
		h.logoutAT();		
	}
	
	@Test 
	public void task() throws InterruptedException{
		LoginPageACT l= new LoginPageACT(driver);
		l.usertexbox("admin");
		l.passtextbox("manager");
		l.loginbutton();
		
		NewTaskACT n=new NewTaskACT(driver);
		n.imagetask();
		n.newtaskcreate();
		n.idcustomer();
		n.nameCustomer();
		n.nameProject();
		n.nameTask("New bug");
		n.timeBill();
		Thread.sleep(2000);
		n.typeBill();
		n.taskCreate();
		Thread.sleep(2000);

		n.checkboxtask();
		n.taskdeleted();
		Thread.sleep(2000);

		n.allertpopup();
		n.imageCustomer();
		n.checkboxcustomer();
		n.delecustomer();
		n.popupcustomer();

	}
	
	
	

}
