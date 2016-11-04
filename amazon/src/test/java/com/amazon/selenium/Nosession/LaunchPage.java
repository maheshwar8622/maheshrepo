package com.amazon.selenium.Nosession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazon.baseclass.BasePage;

public class LaunchPage extends BasePage {
	
	//As it Extends base page we dont need to initialize webdriver 
	//public WebDriver driver;
	
	public LaunchPage (WebDriver driver){
		super( driver);
	     driver.get("http://www.google.com");
	}

	public Loginpage GoAmazon(){
		
		driver.get("http://www.amazon.com");
		
		Loginpage Loginpage = PageFactory.initElements(driver, Loginpage.class);
		return Loginpage;
	}
}
