package com.test.LoginPage;
import com.test.commanFuncations.*;

import org.openqa.selenium.WebDriver;

import com.test.BaseClass.BaseClass;
import com.test.dashboardPage.DashboardAction;


public class LoginPageAction extends BaseClass {
	LoginPageRepo loginrepo;
	public LoginPageAction(WebDriver driver)
	{
		loginrepo = new LoginPageRepo(driver);
	}
	
	public DashboardAction loginFunction(String _userName, String _password)
	{
		WaitLib.sendKeys(driver, 10,_userName,loginrepo.getUserName());
		WaitLib.sendKeys(driver, 10, _password,loginrepo.getPassword());
		 Commanfunctions.JavascriptExecutor(driver, "arguments[0].click();", loginrepo.getLoginBtn());
		return new DashboardAction(driver);
	}
}
