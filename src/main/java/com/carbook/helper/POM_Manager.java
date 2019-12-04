package com.carbook.helper;

import org.openqa.selenium.WebDriver;

import com.carbook.pom.ContactPage;
import com.carbook.pom.HomePage;

import cucumber.runtime.snippets.Concatenator;

public class POM_Manager {
	
	public WebDriver driver;
	
	private HomePage hp;
	
	private ContactPage cp;
	
	public POM_Manager(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	public HomePage getHp() {
		if (hp==null) {
			hp = new HomePage(driver);
		}
		return hp;
	}
	
	public ContactPage getCp() {
		if (cp==null) {
			cp=new ContactPage(driver);
		}
		return cp;
	}

}
