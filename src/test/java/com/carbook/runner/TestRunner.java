package com.carbook.runner;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.carbook.baseclass.BaseClass;
import com.carbook.helper.ConfigReader;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\carbook\\extentreport\\report.html",

		"pretty",
		"json:src\\test\\resource\\com\\carbook\\extentreport\\cucumber.json" }, features = "src\\test\\java\\com\\carbook\\feature", glue = "com.carbook.stepdefintion", dryRun = false, strict = true, monochrome = true, tags = {
				"@Carbook" })
public class TestRunner {

	public static WebDriver driver;

	static Logger log = Logger.getLogger(TestRunner.class);
	@BeforeClass
	public static void driverInitialization() throws Exception, Throwable {
	PropertyConfigurator.configure(
			System.getProperty("user.dir") + "\\src\\test\\resource\\com\\carbook\\config\\log4j.properties");

		ConfigReader cr = new ConfigReader();
		driver = BaseClass.gettingBrowser(cr.getBrowserName());
		// System.out.println("Browser is launched");
		log.info("Browser is launched");
	}

	@AfterClass
	public static void driverQuit() {
		PropertyConfigurator.configure(
				System.getProperty("user.dir") + "\\src\\test\\resource\\com\\carbook\\config\\log4j.properties");

		driver.quit();
		// System.out.println("Browser Quit");
		log.info("Browser Quit");

		Reporter.loadXMLConfig(new File(
				System.getProperty("user.dir") + "\\src\\test\\resource\\com\\carbook\\config\\extent-config.xml"));
		// System.out.println("Report generated");
		log.info("Report Generated");
		System.out.println(
				System.getProperty("user.dir") + "\\src\\test\\resource\\com\\carbook\\config\\extent-config.xml");
	}
}
