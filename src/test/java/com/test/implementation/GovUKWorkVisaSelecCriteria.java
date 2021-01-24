package com.test.implementation;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GovUKWorkVisaSelecCriteria extends PageObject {
	
	private String clkContBtnReasonToVisit = "//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]";
	
	public void selDurationToWorkInUK(String workDuration) {
    	String selWorkDuration = "//label[contains(text(),'"+workDuration+"')]/parent::div//input[@type='radio']";
    	WebElementFacade ele_selWrkDur = $(By.xpath(selWorkDuration));
    	ele_selWrkDur.click();
    	WebElementFacade ele_click = $(By.xpath(clkContBtnReasonToVisit));
    	ele_click.click();
    }

}
