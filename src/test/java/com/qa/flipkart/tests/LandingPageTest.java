package com.qa.flipkart.tests;

import java.util.Properties;

import javax.management.DescriptorKey;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.flipkart.base.BasePage;
import com.qa.flipkart.pages.HomePage;
import com.qa.flipkart.pages.LandingPage;
import com.qa.flipkart.pages.LoginPage;
import com.qa.hubspot.utils.Constants;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

@Epic("Epic - 101 : design login feature")
@Feature("US - 105 : design test cases for login page feature")
public class LandingPageTest {

	Properties prop;
	WebDriver driver;

	BasePage basePage;
	LandingPage landingPage;

	@BeforeTest
	public void setUp() {
		basePage = new BasePage();
		prop = basePage.init_prop();
		driver = basePage.init_driver(prop);
		landingPage = new LandingPage(driver);
	}

	
	@Test(priority=1, enabled=true)
	@Description("verify Login Page Title Test....")
	@Severity(SeverityLevel.NORMAL)
	public void verifyLoginPageTitleTest() {
		String title = landingPage.getLoginPageTitle();
		System.out.println("login page title is : " + title);
		Assert.assertEquals(title, Constants.LANDING_PAGE_TITLE, "title is not found...");
	}
	@Test(priority=2, enabled=true)
	public void closePopupTest() {
		landingPage.closePopup();
		
		
		
	}
}
