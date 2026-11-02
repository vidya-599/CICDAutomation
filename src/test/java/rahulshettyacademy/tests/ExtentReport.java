package rahulshettyacademy.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	ExtentReports e ; 
	
	@BeforeTest
	public void config() {
		
		String path = System.getProperty("user.dir") + "\\reports\\index.html"; // path to store reports
		ExtentSparkReporter er = new ExtentSparkReporter(path); // Helper method for extend report to set some config
		er.config().setReportName("Web Automation REport"); // setting report name
		er.config().setDocumentTitle("Test REsult");
		
		ExtentReports e = new ExtentReports(); // main class which generate reports
		e.attachReporter(er);
		e.setSystemInfo("Tests", "arnika");
	}
	
	@Test
	public void test() {
		
		e.createTest("testName"); /// wil create report upon test pass/fail
		// if we need to capture screenshot of failed test we can use as below
		ExtentTest et = e.createTest("testName");
		et.addScreenCaptureFromBase64String("fail");
		// if test fails it reports failure in report
		et.fail("test failed");
		// test case 
		e.flush(); // to end report generation 
		
	}

}
