package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.properties.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature//Adactin.feature",
glue = "com\\adactin\\stepdefinition",
//tags = ("~@RegressionTest"),
plugin= {"pretty","html:Report\\CucumberReport","json:Report\\Cucumber.json"},
		//"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"},
monochrome = true,
dryRun = false)
//strict= true)



public class TestRunner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		
		 driver = BaseClass.browserLaunch(browser);
	}

}
