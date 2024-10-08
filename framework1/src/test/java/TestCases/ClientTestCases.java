package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.ClientPage;
import ElementRepository.DashBoardPage;
import ElementRepository.LoginPage;
import base.BaseClass;

public class ClientTestCases extends BaseClass {
  @Test
  public void verifyTosearchClientNameandId() {
	  LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");
		

		DashBoardPage dp = lp.clickLoginButton();
		dp.navigateToClientsmenu();
		
		ClientPage cp=dp.navigateToClientsmenu();
		cp.searchClientname();
		cp.searchClientid();
		cp.clickSearchButton();
		
		String actual = cp.getClientText();
		String expectedResult = "sam";
		Assert.assertEquals(actual,expectedResult,"invalid Clientname");

		/*Boolean value=true;
		List<WebElement> firstColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//td[1]"));
		for(int i=0;i<firstColumn.size();i++)
		{
			if(firstColumn.get(i).getText().equals("Ashton Cox"))
			{
				locator="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]";
				break;
			}
			
		}*/
		
		
		
  }
}
