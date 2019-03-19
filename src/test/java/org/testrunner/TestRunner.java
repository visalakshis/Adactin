package org.testrunner;

import org.cucumber.baseclass.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\org\\cucumberfeature\\Cucumber.feature\\", 
		tags = {"@TC8"},
		dryRun=false,
		glue="org.stepdefinition"
	        )

public class TestRunner {
	public static  WebDriver driver;
	
	@BeforeClass
	
	public static void browserlaunch() throws Throwable {

		driver = BaseClass.getBrowser("chrome");
		//getUrl("http://adactin.com/HotelAppBuild2/");
		
	}
	@AfterClass
	public static void after() {
		//driver.quit();
	}
	
	}
	