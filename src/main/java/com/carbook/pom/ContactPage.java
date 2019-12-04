package com.carbook.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	public WebDriver driver;
	
	public ContactPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Address:']")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	@FindBy(xpath="//span[text()='Phone:']//following-sibling::a")
	private WebElement phone;
	
	@FindBy(xpath="//span[text()='Email:']//following-sibling::a")
	private WebElement email;
}
