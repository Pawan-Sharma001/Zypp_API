package com.utils;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_Reports_Suite  {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent ;
	@BeforeSuite
	public void tearUp()
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}
@Test
public void Test() throws IOException
{
	ExtentTest test = extent.createTest("Test Execution on Kazam API", "Test For Sucess Response");
	test.log(Status.INFO, "This step shows usage of log(status, details)");
    test.info("This step shows usage of info(details)");
    test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    test.addScreenCaptureFromPath("screenshot.png");
 }
@AfterSuite
public void tearDown()
{
	 extent.flush();
}
}
