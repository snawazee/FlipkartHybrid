package com.qa.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.flipkart.base.BasePage;
import com.qa.hubspot.utils.Constants;
import com.qa.hubspot.utils.ElementUtil;
import io.qameta.allure.Step;

public class LandingPage extends BasePage {

	WebDriver driver;
	ElementUtil elementUtil;

	// 1. By locators:
	By crossBtn = By.xpath("//button[contains(.,'✕')]");
	

	// 2. constructor of the page class:

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	// 3. page actions/methods:
	@Step("get Landing  Page Title...")
	public String getLoginPageTitle() {
		return elementUtil.waitForTitleToBePresent(Constants.LANDING_PAGE_TITLE,10);
	}
	
	public void closePopup() {
		// TODO Auto-generated method stub
		elementUtil.doClick(crossBtn);
	}
			
	
}
