package com.amazon.selenium.session;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazon.baseclass.BasePage;

public class LandingPage extends BasePage{
	
//public WebDriver driver;
	
	public LandingPage (WebDriver driver){
		super( driver);
	}
	
	
	public ProfilePage click(){
		
		driver.findElement(By.id("nav-cart")).click();
		
		ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
		
		return profilePage;
				
		
	}
	
	

}
