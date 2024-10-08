package ElementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class WorkerPage {
WebDriver driver;
	
	//1)Constructor
	public WorkerPage(WebDriver driver)// Webdriver parameter will be passed in testcase
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);// static method- page factoryil ulla method is initElements
	}
	
	//2)Locators
	@FindBy(xpath="//a[text()='Create Worker']")
	WebElement createworker;
	
	@FindBy(id="worker-title")
	WebElement titleDropdown;
	
	@FindBy(xpath="//select[@id='worker-employment_type']")
	WebElement employmentDropdown;
	
	
	//3)Functions
	public WorkerPage navigateToCreateWorkermenu()
	{
		createworker.click(); 
		return new WorkerPage(driver);
	}
	
	public String employmentTypeDropdown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)", " ");
		Select select = new Select(employmentDropdown);
		select.selectByVisibleText("Contractor");
		WebElement selectedValue = select.getFirstSelectedOption();
		String actualSelectedvalue = selectedValue.getText();
		return actualSelectedvalue;
	}

	
	
	
	
	
	
	public String titleDropdown()
	{
		Select select = new Select(titleDropdown);
		select.selectByValue("Ms");
		WebElement selectedValue = select.getFirstSelectedOption();
		String actualSelectedvalue = selectedValue.getText();
		return actualSelectedvalue;
	}


}
