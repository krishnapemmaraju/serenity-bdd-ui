package com.serenity.test.implementation;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GovUKVisaSelectCriteria extends PageObject {
	
    
    @FindBy(xpath="//select[@id='response']")
    WebElementFacade selCntryDrpDwn;
    
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElementFacade clkOnCtySelContBtn;
    
    @FindBy(xpath="//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]")
    WebElementFacade clkOnReasonToVisitContBtn;
    
    @FindBy(xpath="(//div[@id='result-info']//h2)[1]")
    WebElementFacade valVisaOutcomeMsg;
    
    
    
    public void selectNationalityAndReason(String nationality,String reason) {
    	String selReasonToVist = "//label[contains(text(),'"+reason.trim()+"')]/parent::div//input[@type='radio']";
    	selCntryDrpDwn.selectByVisibleText(nationality);
    	clkOnCtySelContBtn.click();
    	WebElementFacade ele_seleReason = $(By.xpath(selReasonToVist.trim()));
    	ele_seleReason.click();
    	clkOnReasonToVisitContBtn.click();
    }
    
    
    public String validateOutcome() {
        return valVisaOutcomeMsg.getText().trim();
    }
}
