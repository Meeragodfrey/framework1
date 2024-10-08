package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.DashBoardPage;
import ElementRepository.LoginPage;
import ElementRepository.WorkerPage;
import base.BaseClass;

public class WorkerTestCases extends BaseClass {
  @Test(groups="critical")
  public void verifyWorkerEmploymentTitleTypeDropdown() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		

		DashBoardPage dp = lp.clickLoginButton();
		dp.navigateToWorkermenu();
		
		WorkerPage wp= new WorkerPage(driver);
		wp.navigateToCreateWorkermenu();
		wp.titleDropdown();
		
		String actualValue = wp.titleDropdown();
		String expectedResult = "Ms";
		Assert.assertEquals(actualValue, expectedResult,"Drop down is not working");

	}
  @Test(groups="Regression")
  public void verifyWorkerEmploymentTypeDropdown() {
	  LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		

		DashBoardPage dp = lp.clickLoginButton();
		dp.navigateToWorkermenu();
		
		WorkerPage wp= new WorkerPage(driver);
		wp.navigateToCreateWorkermenu();
		wp.employmentTypeDropdown();
		String actualValue = wp.employmentTypeDropdown();
		String expectedResult = "Contractor";
		Assert.assertEquals(actualValue, expectedResult,"Drop down is not working");

  }

}
