package Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportUttilities implements ITestListener {
	
	ExtentSparkReporter sparkReporter;//library cclass global variable
	ExtentReports reports;
	ExtentTest test;

	public void configureReport() { //system current date and time capture

	String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//date time capture using java

	File reportPath=new File(System.getProperty("user.dir")+"//ExtentReport");

	if(!reportPath.exists()) {
	reportPath.mkdir(); //create folder using java for storing extent Report
	}

	//create file
	sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//ExtentReport//"+"ExtentReport_" + timeStamp + ".html");
	reports = new ExtentReports();//library class
	reports.attachReporter(sparkReporter);

	//System details
	reports.setSystemInfo("PC Name", "User");
	reports.setSystemInfo("OS", "Windows 10");
	sparkReporter.config().setDocumentTitle("Extent Report Sample");// sparkreporter is a methods in extents report class
	sparkReporter.config().setReportName("Report Summary");
	sparkReporter.config().setTheme(Theme.DARK);
	}

	public void onTestStart(ITestResult result) {

	}


	public void onTestSuccess(ITestResult result) {//test success
	test = reports.createTest(result.getName());//test is the reference variable
	test.log(Status.PASS,
	MarkupHelper.createLabel("Name of the Passed Test Case is : " + result.getName(), ExtentColor.GREEN));

	}


	public void onTestFailure(ITestResult result) {//listener interface abstract methods, test failure
	test = reports.createTest(result.getName());
	test.log(Status.FAIL,
	MarkupHelper.createLabel("Name of the Failed Test Case is : " + result.getName(), ExtentColor.RED));

	}


	public void onTestSkipped(ITestResult result) {//listener interface abstract methods, test skipped
	test = reports.createTest(result.getName());
	test.log(Status.SKIP,
	MarkupHelper.createLabel("Name of the skipped test case is : " + result.getName(), ExtentColor.YELLOW));

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {//listener interface abstract methods

	}


	public void onTestFailedWithTimeout(ITestResult result) {//listener interface abstract methods

	}


	public void onStart(ITestContext context) {//listener interface abstract methods, before execution control will be onStart
	configureReport();// 
	}


	public void onFinish(ITestContext context) {//listener interface abstract methods, aftere execution control will be onFinish
	reports.flush();// final output file will be generated using flush method
	}


}
