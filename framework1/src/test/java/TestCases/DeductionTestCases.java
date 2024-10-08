package TestCases;

import org.testng.annotations.Test;

import ElementRepository.DashBoardPage;
import ElementRepository.DeductioPage;
import ElementRepository.LoginPage;
import base.BaseClass;

public class DeductionTestCases extends BaseClass {
  @Test
  public void toverifyTooltipDeductionPage() {
	  
	  LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		
		DashBoardPage dp = lp.clickLoginButton();
		//dp.navigateToDeductionPage();
		
		//DeductioPage ddp=new DeductioPage(driver);
		DeductioPage ddp=dp.navigateToDeductionPage();
		//ddp.toolTip();
	  
  }
}

