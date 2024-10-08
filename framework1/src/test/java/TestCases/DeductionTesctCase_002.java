package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.CreateDeduction;
import ElementRepository.DashBoardPage;
import ElementRepository.DeductioPage;
import ElementRepository.LoginPage;
import base.BaseClass;

public class DeductionTesctCase_002 extends BaseClass {
  @Test
  public void toverifyAddDeductionworkerTypecheckbox() {
	  LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		
		DashBoardPage dp = lp.clickLoginButton();
		DeductioPage ddp=dp.navigateToDeductionPage();
		ddp.click_add_deductionbutton();
		
		CreateDeduction cd=new CreateDeduction(driver);
		cd.createDeduction();
		
		String actualValue = cd.createDeduction();
		String expectedResult = "Boots";
		Assert.assertEquals(actualValue, expectedResult,"Workertype dropdown  is not working");

		
  }
}
