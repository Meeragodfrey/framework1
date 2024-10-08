package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class TimesheetPage {
	WebDriver driver;
	
	// Constructor
		public TimesheetPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	//Locators
		@FindBy(xpath = "//button[@class='btn btn-warning btn-responsive invoice']")
		WebElement genrateInvoice;
		
		@FindBy(xpath = "//a[text()='Approved Timesheets']")
		WebElement approvedTimesheet;

		
	//Functions
		public void navigateTogenearateinvoice()
		{
			genrateInvoice.click();
		}
		
		public String alertmsg() throws InterruptedException 
		{
		driver.switchTo().alert().accept();// ok button for the prompt
		Thread.sleep(5000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();// cancel button for the alert box button*/
		return text;
		}
		
		public void navigateToapprovedTimesheet()
		{
			approvedTimesheet.click();
		}
		
		/*public String alertmsg()
		{
		return gu.getAlertMsg();
		}*/
		/*public String getTextHeading() {
		return gu.getElementText(textHeading);
	}*/
}
