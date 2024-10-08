package TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.DashBoardPage;
import ElementRepository.LoginPage;
import base.BaseClass;


public class LogintestCases extends BaseClass {
	
	@Test(groups=("Sanity"))
	public void verifyLoginwithValidUser() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");// classname.function name excel table read
		lp.setPassword("1q2w3e4r");
		lp.clickLoginButton();
		

	}
}
	
