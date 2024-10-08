package TestCases;

import org.testng.annotations.Test;

import ElementRepository.DashBoardPage;
import ElementRepository.LoginPage;
import ElementRepository.TimesheetPage;
import base.BaseClass;

public class TimeSheetTestCases extends BaseClass {
  @Test
  
  public void toverifyTimesheetgenerateInvoiceAlertMsg() throws InterruptedException {
	  
	  LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		
		DashBoardPage dp = lp.clickLoginButton();
		dp.navigateToTimesheet();
		
		TimesheetPage tp= new TimesheetPage(driver);
		tp.navigateTogenearateinvoice();
		tp.alertmsg();
  }
}
