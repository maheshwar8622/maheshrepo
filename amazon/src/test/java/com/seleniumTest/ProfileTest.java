package com.seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.amazon.selenium.Nosession.LaunchPage;
import com.amazon.selenium.Nosession.Loginpage;
import com.amazon.selenium.session.ProfilePage;

import junit.framework.Assert;

public class ProfileTest {
	WebDriver driver;
	LaunchPage launchPage;
	Loginpage loginpage;
	com.amazon.selenium.session.LandingPage LandingPage;
	ProfilePage profilePage;

	@Test
	public void ProfileTest3() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		launchPage = PageFactory.initElements(driver, LaunchPage.class);
		loginpage = launchPage.GoAmazon();
		LandingPage = loginpage.Signin("mnaidu94@gmail.com", "maheshwarnaidu");
		profilePage = LandingPage.click();
		System.out.println(profilePage.GetTitle());
		Assert.assertEquals("Hello", profilePage.GetTitle());
}
}