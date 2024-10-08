package ElementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.GeneralUtilities;

public class DeductioPage {
	WebDriver driver;
	GeneralUtilities gu=new GeneralUtilities();

	// Constructor
	public DeductioPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath = "//a[text()='Home']")
	WebElement deductiontoolTip;
	
	@FindBy(xpath = "//a[text()='Add Deduction']")
	WebElement add_deduction;

	
	//functions
	public void deductionpagetoolTip()
	{
		
	}
	
	public void click_add_deductionbutton()
	{
		add_deduction.click();
	}

}
