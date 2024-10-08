package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralUtilities{
	WebDriver driver;
	public String getElementText(WebElement element)// reusable general function and we have to parameter the web element
	{
		String text=element.getText();
		return text;
	}
	
	public String getAlertMsg()
	{
	driver.switchTo().alert().accept();// ok button for the prompt
	String text=driver.switchTo().alert().getText();
	System.out.println(text);
	return text;
	}
	
	public String getCssValueOfelement(WebElement element, String cssProperty)
	{
		return element.getCssValue(cssProperty);
	}
	
	public String get_Attribute(WebElement element, String aatribute)
	{
		return element.getAttribute(aatribute);
	}
	
	public boolean elementIsEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	
	public boolean elementIsDisplayed(WebElement element)
	{
		return element.isDisplayed();
	}
	
	public boolean elementIsSelected(WebElement element)
	{
		return element.isSelected();
	}
	
	
	
	
	
	
	
	/*public String getTooltip()
	{
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 WebElement alldropDown=driver.findElement(By.id("searchDropdownBox"));
		 String toolTipvalue=alldropDown.getAttribute("title");// when we hover the mouse we can see the value in that particular attribute
		 System.out.print(toolTipvalue);
		 return toolTipvalue;
		 
	}*/
	



}
