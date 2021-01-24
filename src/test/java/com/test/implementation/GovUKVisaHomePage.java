package com.test.implementation;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.Setup.Setup1;
import com.test.driverwrappers.WebDriverWrapper;
import com.test.driverwrappers.WebElementFacadeWrapper;
import com.test.hooks.Setup;

import io.cucumber.java.Before;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GovUKVisaHomePage extends PageObject {
    Setup setup = new Setup();
    private String validateHomePageText = "//span[text()='Check if you need a UK visa']";
    private String clickOnContinue = "//button[contains(text(),'Continue')]";
    
    
	public void launchGovWebSite() {
	   getDriver().get(setup.getEnvironment("url"));	
	}
	
	public void validateHomePage() {
		   WebElementFacade ele = $(By.xpath(validateHomePageText));
	       Assert.assertTrue(ele.isDisplayed());
	}
}
