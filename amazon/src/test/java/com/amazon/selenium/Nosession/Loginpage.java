package com.amazon.selenium.Nosession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.baseclass.BasePage;
import com.amazon.selenium.session.LandingPage;

public class Loginpage extends BasePage {
///public WebDriver driver;


@FindBy(id="ap_email")
public WebElement name;
@FindBy(id="ap_password")
public WebElement pswd;

	
	public Loginpage (WebDriver driver){
		super( driver);
		
	}
	
public  LandingPage Signin (String name ,  String pswd){
	
	driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//a//span[text()='Sign in']"));
	//driver.findElement(By.id("ap_email")).sendKeys(name);
	this.name.sendKeys(name);
	
	//driver.findElement(By.id("ap_password")).sendKeys(pswd);
	this.pswd.sendKeys(pswd);
	driver.findElement(By.id("signInSubmit")).click();
	
   
	
	LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
	
	return landingPage ;
	
}

}
