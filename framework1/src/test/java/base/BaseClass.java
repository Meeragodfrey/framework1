package base;

import org.testng.annotations.Test;

import Utilities.CaptureScreenShot;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public WebDriver driver;

	public static Properties prop;// prop is the reference variable for class properties, 

	public static void testBasic() throws IOException {
		prop = new Properties();//create an obj for property class
		FileInputStream ip = new FileInputStream(// inorder get input from the file and storing
				System.getProperty("user.dir") + "//src//test//resources//Config.properties");
		prop.load(ip);//load is the function in property class
	}

	/*@BeforeMethod
	public void beforeMethod()throws IOException {
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		testBasic();
		driver.get(prop.getProperty("appurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}*/
	
	@BeforeMethod(groups= {"Sanity","critical","Regression"})
	@Parameters("browser")
	public void beforeMethod(String br) throws IOException  {
		if(br.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		//testBasic();
		//driver.get(prop.getProperty("appurl"));//reading url from the properties file
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	 @AfterMethod(groups= {"Sanity","critical","Regression"})
	
	  public void afterMethod(ITestResult iTestResult) throws IOException {//listener ref variable
	  if(iTestResult.getStatus()==ITestResult.FAILURE)// check if above method is failure
	  {
		  CaptureScreenShot cs=new CaptureScreenShot();
		  cs.captureScreenshotFailedTestCases(driver,iTestResult.getName());
	  }
	  //driver.close(); 
	  }
	 

}
