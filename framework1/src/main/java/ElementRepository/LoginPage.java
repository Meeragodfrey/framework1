package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	//1)Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//2)Locators
	@FindBy(id="loginform-username")
	WebElement userName;
	
	@FindBy(id="loginform-password")
	WebElement passWord;
	
	@FindBy(name="login-button")
	WebElement loginButton;
	
	//3)Functions or Actions
	public void setUsername(String username) 
	{
		userName.sendKeys(username);
	}
	public void setPassword(String password)
	{
		passWord.sendKeys(password);
	}
	public DashBoardPage clickLoginButton()
	{
		loginButton.click();
		return new DashBoardPage(driver);
	}
		

	

}
