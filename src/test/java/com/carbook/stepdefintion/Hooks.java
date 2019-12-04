package com.carbook.stepdefintion;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;

import com.carbook.baseclass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void beforeHook() {
		// TODO Auto-generated method stub

	}

	@After
	public void afterHook(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			File screenShot = BaseClass.screenShot(scenario.getName());
			Reporter.addScreenCaptureFromPath(screenShot.getAbsolutePath());
		}
	}

}
