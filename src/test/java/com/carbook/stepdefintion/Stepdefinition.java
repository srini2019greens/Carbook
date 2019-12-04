package com.carbook.stepdefintion;

import org.junit.Assert;
import org.junit.rules.TestRule;
import org.openqa.selenium.WebDriver;

import com.carbook.baseclass.BaseClass;
import com.carbook.helper.ConfigReader;
import com.carbook.helper.POM_Manager;
import com.carbook.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver = TestRunner.driver;
	public static POM_Manager pom = new POM_Manager(driver);

	@Given("^User should launch the car book application$")
	public void user_should_launch_the_car_book_application() throws Throwable {
		ConfigReader cr = new ConfigReader();
		geturl(cr.getUrl());
	}

	@Then("^User should verify the logo present in the header$")
	public void user_should_verify_the_logo_present_in_the_header() throws Throwable {
		Assert.assertTrue(pom.getHp().getCarbookLogo().isDisplayed());
	}

	@Then("^User should verify the page title '(.*)'$")
	public void user_should_verify_the_page_title_Carbook_Free_Bootstrap_Template_by_Colorlib(String arg1)
			throws Throwable {
		Assert.assertEquals(arg1, driver.getTitle());
	}

	@Then("^User should see Home Menu$")
	public void user_should_see_Home_Menu() throws Throwable {
		Assert.assertTrue(pom.getHp().getHomemenu().isDisplayed());
		webelementHighlight(pom.getHp().getHomemenu());

	}

	@Then("^User should see About Menu$")
	public void user_should_see_About_Menu() throws Throwable {
		Assert.assertTrue(pom.getHp().getAboutmenu().isDisplayed());
		webelementHighlight(pom.getHp().getHomemenu());

	}

	@Then("^User should see Services Menu$")
	public void user_should_see_Services_Menu() throws Throwable {
		Assert.assertTrue(pom.getHp().getServicesMenu().isDisplayed());

	}

	@Then("^User should see pricing Menu$")
	public void user_should_see_pricing_Menu() throws Throwable {
		Assert.assertTrue(pom.getHp().getPricingmenu().isDisplayed());

	}

	@Then("^User should see Cars menu$")
	public void user_should_see_Cars_menu() throws Throwable {
		Assert.assertTrue(pom.getHp().getCarsMennu().isDisplayed());

	}

	@Then("^User should see Blog menu$")
	public void user_should_see_Blog_menu() throws Throwable {
		Assert.assertTrue(pom.getHp().getBlog().isDisplayed());

	}

	@Then("^User should see contact menu$")
	public void user_should_see_contact_menu() throws Throwable {
		Assert.assertTrue(pom.getHp().getContactmenu().isDisplayed());

	}

	@When("^User click on rent a car now$")
	public void user_click_on_rent_a_car_now() throws Throwable {
		clicks(pom.getHp().getRentacar());
	}

	@When("^User click on contact menu$")
	public void user_click_on_contact_menu() throws Throwable {
		clicks(pom.getHp().getContactmenu());
	}

	@When("^User scroll down to '(\\d+)' and '(\\d+)'$")
	public void user_scroll_down_to_and(int arg1, int arg2) throws Throwable {
		javaScriptusingpizels(arg1, arg2);
	}

	@Then("^User should see Address feild is present$")
	public void user_should_see_Address_feild_is_present() throws Throwable {
		Assert.assertTrue(pom.getCp().getAddress().isDisplayed());
	}

	@When("^User enter the pickup location \"([^\"]*)\"$")
	public void user_enter_the_pickup_location(String arg1) throws Throwable {
		inputValestoElement(pom.getHp().getPickupLocation(), arg1);
	}

	@When("^User enter the drop off location \"([^\"]*)\"$")
	public void user_enter_the_drop_off_location(String arg1) throws Throwable {

	}

	@When("^User enter the pickup date \"([^\"]*)\"$")
	public void user_enter_the_pickup_date(String arg1) throws Throwable {

	}

	@When("^User enter the dropoff date \"([^\"]*)\"$")
	public void user_enter_the_dropoff_date(String arg1) throws Throwable {

	}

	@When("^User enter the pick up time \"([^\"]*)\"$")
	public void user_enter_the_pick_up_time(String arg1) throws Throwable {

	}

	@Then("^User should see the phone number \"([^\"]*)\"$")
	public void user_should_see_the_phone_number(String arg1) throws Throwable {
		Assert.assertEquals(arg1, pom.getCp().getPhone().getText());
		webelementHighlight(pom.getCp().getPhone());

	}

	@Then("^User should see the email \"([^\"]*)\"$")
	public void user_should_see_the_email(String arg1) throws Throwable {
		Assert.assertEquals(arg1, pom.getCp().getEmail().getText());
		webelementHighlight(pom.getCp().getEmail());
	}

	@When("^User wait for '(.*)'$")
	public void user_Wait_for(int min) throws InterruptedException {
		Thread.sleep(min * 1000);
	}
}
