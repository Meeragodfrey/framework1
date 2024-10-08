package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ElementRepository.DashBoardPage;
import ElementRepository.DeductioPage;
import ElementRepository.InvoicePage;
import ElementRepository.LoginPage;
import base.BaseClass;

public class InvoiceTestCases extends BaseClass {
	@Test
	public void toverifyInvoiceTablevalue() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("carol");
		lp.setPassword("1q2w3e4r");

		DashBoardPage dp = lp.clickLoginButton();

		InvoicePage ip = dp.navigateToInvoicePage();

		//ip.invoiceTablepagination();
		String actual = ip.getTextHeading();
		String expectedResult = "INVOICE";
		Assert.assertEquals(actual, expectedResult, "Search text is not working");

		/*
		 * List<WebElement> firstColumn=driver.findElements(By.xpath(
		 * "//table[@id='dtBasicExample']//thead//tr[1]//th"));//header datas for(int
		 * j=0;j<firstColumn.size();j++) { String text1=firstColumn.get(j).getText();
		 * System.out.println(text1);
		 * 
		 * }
		 */
	}
}
