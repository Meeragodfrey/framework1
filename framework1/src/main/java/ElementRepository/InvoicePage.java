package ElementRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class InvoicePage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();
	
	// Constructor
		public InvoicePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	//Locators
		@FindBy(xpath = "//h1[text()='Invoice']")
		WebElement textHeading;
		
	//Functions
		
			public String getTextHeading() {
				return gu.getElementText(textHeading);
			}
		
		public void invoiceTablepagination()
		{
			List<WebElement> firstRow=driver.findElements(By.xpath("/table[@class='table table-striped table-bordered']//tr[1]//td"));//first row, first column datas
			for(int i=0;i<firstRow.size();i++)
			{
				String text=firstRow.get(i).getText();
				System.out.println(text);
			}
		}

}
