package TestCases;

import org.testng.annotations.Test;

import ElementRepository.DashBoardPage;
import ElementRepository.LoginPage;
import ElementRepository.PayslipPage;
import base.BaseClass;

public class PaySlipTestCase_001 extends BaseClass {
  @Test
  public void toverifyPayslipTextheading() {
	  
	  LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		
		DashBoardPage dp = lp.clickLoginButton();
		dp.navigateToPayslipmenu();
		
		PayslipPage ps=new PayslipPage(driver);
		ps.getTextHeading();
  }
}
