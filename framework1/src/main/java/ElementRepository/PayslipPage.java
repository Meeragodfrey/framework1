package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class PayslipPage {
	
		WebDriver driver;
		GeneralUtilities gu=new GeneralUtilities();

		// Constructor
		public PayslipPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		//Locator
		@FindBy(xpath = "//h1[text()='Payslips']")
		WebElement textHeading;
		
		
	public String getTextHeading() {
			return gu.getElementText(textHeading);
		}


}
