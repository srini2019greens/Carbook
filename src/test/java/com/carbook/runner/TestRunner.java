package com.carbook.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.carbook.baseclass.BaseClass;
import com.carbook.helper.ConfigReader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\carbook\\extentreport\\report.html",

		"pretty",
		"json:src\\test\\resource\\com\\carbook\\extentreport\\cucumber.json" },
features = "src\\test\\java\\com\\carbook\\feature", glue = "com.carbook.stepdefintion", dryRun = false, strict = true, monochrome = true, tags = {
				"@Carbook" })
public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void driverInitialization() throws Exception, Throwable {
		ConfigReader cr = new ConfigReader();
		driver = BaseClass.gettingBrowser(cr.getBrowserName());
	}

	@AfterClass
	public static void driverQuit() {
		driver.quit();
	}
}
