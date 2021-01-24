package com.test.implementation;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GovUKVisaSelectCriteria extends PageObject {
	
    private String selectCountry = "//select[@id='response']";
    private String clickOnContinue = "//button[contains(text(),'Continue')]";
    private String clkContBtnReasonToVisit = "//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]";
    private String valVisaOutcomeMsg = "(//div[@id='result-info']//h2)[1]";
    
    public void selectNationalityAndReason(String nationality,String reason) {
    	String selReasonToVist = "//label[contains(text(),'"+reason.trim()+"')]/parent::div//input[@type='radio']";
    	WebElementFacade ele = $(By.xpath(selectCountry));
    	ele.selectByVisibleText(nationality);
    	WebElementFacade ele_click = $(By.xpath(clickOnContinue));
    	ele_click.click();
    	WebElementFacade ele_seleReason = $(By.xpath(selReasonToVist.trim()));
    	ele_seleReason.click();
    	WebElementFacade ele_clkContReason = $(By.xpath(clkContBtnReasonToVisit));
    	ele_clkContReason.click();
    }
    
    
    public void validateOutcome(String outcome) {
    	WebElementFacade ele_outcome = $(By.xpath(valVisaOutcomeMsg));
        Assert.assertTrue(ele_outcome.getText().trim().equals(outcome.trim()));
    }
}
