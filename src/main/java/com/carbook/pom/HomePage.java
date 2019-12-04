package com.carbook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement carbookLogo;

	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homemenu;

	@FindBy(xpath = "//a[text()='About']//parent::li[@class]")
	private WebElement aboutmenu;

	@FindBy(xpath = "//a[text()='Services']//parent::li[@class]")
	private WebElement servicesMenu;

	@FindBy(xpath = "//a[text()='Pricing']//parent::li[@class]")
	private WebElement pricingmenu;

	@FindBy(xpath = "//a[text()='Cars']//parent::li[@class]")
	private WebElement carsMennu;

	public WebElement getCarbookLogo() {
		return carbookLogo;
	}

	public WebElement getHomemenu() {
		return homemenu;
	}

	public WebElement getAboutmenu() {
		return aboutmenu;
	}

	public WebElement getServicesMenu() {
		return servicesMenu;
	}

	public WebElement getPricingmenu() {
		return pricingmenu;
	}

	public WebElement getCarsMennu() {
		return carsMennu;
	}

	public WebElement getBlog() {
		return blog;
	}

	public WebElement getContactmenu() {
		return contactmenu;
	}

	public WebElement getPickupLocation() {
		return pickupLocation;
	}

	public WebElement getDropoffLocation() {
		return dropoffLocation;
	}

	public WebElement getPickupdate() {
		return pickupdate;
	}

	public WebElement getDropoffdate() {
		return dropoffdate;
	}

	public WebElement getPickuptime() {
		return pickuptime;
	}

	public WebElement getRentacar() {
		return rentacar;
	}

	@FindBy(xpath = "//a[text()='Blog']//parent::li[@class]")
	private WebElement blog;

	@FindBy(xpath = "//a[text()='Contact']//parent::li[@class]")
	private WebElement contactmenu;

	@FindBy(xpath = "//label[text()='Pick-up location']//following-sibling::input")
	private WebElement pickupLocation;

	@FindBy(xpath = "//label[text()='Drop-off location']//following-sibling::input")
	private WebElement dropoffLocation;

	@FindBy(xpath = "//label[text()='Pick-up date']//following-sibling::input")
	private WebElement pickupdate;

	@FindBy(xpath = "//label[text()='Drop-off date']//following-sibling::input")
	private WebElement dropoffdate;

	@FindBy(xpath = "//label[text()='Pick-up time']//following-sibling::input")
	private WebElement pickuptime;

	@FindBy(xpath = "//input[@value='Rent A Car Now']")
	private WebElement rentacar;

}
