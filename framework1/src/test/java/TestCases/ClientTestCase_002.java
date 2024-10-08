package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ElementRepository.ClientPage;
import ElementRepository.DashBoardPage;
import ElementRepository.LoginPage;
import base.BaseClass;

public class ClientTestCase_002 extends BaseClass {
  @Test
  public void verifyClientmenuCheckBox() {
	  
	  LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		
		DashBoardPage dp = lp.clickLoginButton();
		dp.navigateToClientsmenu();
		dp.navigateTocreateClientsmenu();
		
		ClientPage cp=new ClientPage(driver);
		cp.clickreq_pay_checkbox();
	  
	  
	}
}
