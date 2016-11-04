package com.amazon.baseclass;

import org.openqa.selenium.WebDriver;

public class BasePage {
public WebDriver driver;
	
	public BasePage (WebDriver driver){
		this.driver = driver ;
	}

System.out.println("Changes made");
public String getTitle ( ){
	return driver.getTitle();
}

public boolean isElementPresent(String Locator){
	
	return true;
}
}
