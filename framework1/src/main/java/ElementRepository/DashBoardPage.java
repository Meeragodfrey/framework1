package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import TestCases.TimesheetPage;
import Utilities.GeneralUtilities;

public class DashBoardPage {
	WebDriver driver;
	//GeneralUtilities gu=new GeneralUtilities();

	// Constructor
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locator
	@FindBy(xpath = "//h1[text()='Payroll Application']")
	WebElement textHeading;
	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement client;
	
	@FindBy(xpath="//a[text()='Create Client']")
	WebElement createclient;
	
	@FindBy(xpath="//a[text()='Workers']")
	WebElement worker;
	
	@FindBy(xpath = "//a[text()='TimeSheet']")
	WebElement timesheet;
	
	@FindBy(xpath = "//a[text()='Deduction']")
	WebElement deduction;
	
	@FindBy(xpath = "//a[text()='Invoice']")
	WebElement invoice;
	
	@FindBy(xpath = "//a[text()='Payslip']")
	WebElement payslip;
	

	// Functions
	public ClientPage navigateToClientsmenu()
	{
		client.click();
		return new ClientPage(driver);
	}
	
	public void navigateTocreateClientsmenu()
	{
		createclient.click();
	
	}
	
	public WorkerPage navigateToWorkermenu()
	{
		worker.click();
		return new WorkerPage(driver);
		
	}
	
	public void navigateToTimesheet()
	{
		timesheet.click();
		//return new ClientPage(driver);
		//new TimesheetPage(driver);
	}
	
	public void navigateToPayslipmenu()
	{
		payslip.click();
		//return new ClientPage(driver);
		//new TimesheetPage(driver);
	}
	
	public DeductioPage navigateToDeductionPage()
	{
		deduction.click();
		return new DeductioPage(driver);
	}
	
	
	
	public InvoicePage navigateToInvoicePage()
	{
		invoice.click();
		return new InvoicePage(driver);
	}
	/*public String getTextHeading() {
		return gu.getElementText(textHeading);
	}*/
		
	
}
