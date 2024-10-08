package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class ClientPage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	// Constructor
		public ClientPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	//Locators
		@FindBy(id="clientsearch-client_name")
		WebElement clientName;
		
		@FindBy(id="clientsearch-id")
		WebElement clientId;
		
		@FindBy(xpath="//button[@class='btn btn-primary']")
		WebElement clientSearchButton;
		
		@FindBy(id="client-require_po")
		WebElement clientReqcheckbox;
		
		
		
	//Functions
		public void searchClientname() 
		{
			clientName.sendKeys("sam");
		}
		public void searchClientid()
		{
			clientId.sendKeys("3");
		}
		public void clickSearchButton()
		{
			clientSearchButton.click();
	
		}
		
		
		//Functions
		public String getClientText() {
			return gu.getElementText(clientName);
		}
		
		public void clickreq_pay_checkbox()
		{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)", " ");
		js.executeScript("arguments[0].click()", clientReqcheckbox);
		clientReqcheckbox.click();
		clientReqcheckbox.isSelected();
		}
		


}
