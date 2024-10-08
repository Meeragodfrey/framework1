package ElementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateDeduction {
	WebDriver driver;
	
	// Constructor
		public CreateDeduction(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	//Locators
				
		@FindBy(xpath="//span[@class='select2-selection__placeholder']")
		WebElement worker;
		
		@FindBy(id="deduction-type")
		WebElement workertype;
		
		@FindBy(id="deduction-amount")
		WebElement deductionamount;
	
		
		@FindBy(id="deduction-effective_from")
		WebElement deductiondate;
		
		
		//Functions
		public String createDeduction()
		{
			worker.click();
			Select select = new Select(workertype);
			select.selectByValue("Boots");
			WebElement selectedValue = select.getFirstSelectedOption();
			System.out.println(selectedValue);
			String actualSelectedvalue = selectedValue.getText();
			return actualSelectedvalue;
		}
		
		

}
