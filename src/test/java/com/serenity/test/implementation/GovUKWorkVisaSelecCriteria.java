package com.serenity.test.implementation;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GovUKWorkVisaSelecCriteria extends PageObject {
		
	@FindBy(xpath="//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]")
	WebElementFacade clkWorkDurContBtn;
	
	public void selDurationToWorkInUK(String workDuration) {
    	String selWorkDuration = "//label[contains(text(),'"+workDuration+"')]/parent::div//input[@type='radio']";
    	WebElementFacade ele_selWrkDur = $(By.xpath(selWorkDuration));
    	ele_selWrkDur.click();
    	clkWorkDurContBtn.click();
    }

}
