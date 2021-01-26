package com.serenity.test.implementation;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * This Class contains page Objects related to Family Immigration Check Status
 *
 */

public class GovUKFamilyVisaSelecCriteria extends PageObject {

    @FindBy(xpath = "//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]")
    private WebElementFacade clkReaToVisitImmChkConBtn;

	public void FamilyVisaUKImmigrationChk(String immgStatus) {
		String imgStatusChk = "//label[contains(text(),'" + immgStatus + "')]/parent::div//input[@type='radio']";
		WebElementFacade ele_famUKImmgChk = $(By.xpath(imgStatusChk));
		ele_famUKImmgChk.click();
		clkReaToVisitImmChkConBtn.click();

	}

}
