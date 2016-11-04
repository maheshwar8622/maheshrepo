package com.amazon.selenium.session;

import org.openqa.selenium.WebDriver;

import com.amazon.baseclass.BasePage;

public class ProfilePage extends BasePage {
	
	
	public ProfilePage(WebDriver driver) {
		super(driver);
		
	}

	public String GetTitle() {
		
		return "Amazon";

	}
}
