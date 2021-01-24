package com.test.implementation;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * This Class contains page Objects related to Family Immigration Check Status
 *
 */

public class GovUKFamilyVisaSelecCriteria extends PageObject {

	private String clkContBtnReasonToVisit = "//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]";

//    @FindBy(xpath = "//div[@class='govuk-radios']/ancestor::div//button[contains(text(),'Continue')]")
//    private WebElementFacade clkContBtnReasonToVisit;

	public void FamilyVisaUKImmigrationChk(String immgStatus) {
		// clkContBtnReasonToVisit.click();

		String imgStatusChk = "//label[contains(text(),'" + immgStatus + "')]/parent::div//input[@type='radio']";
		WebElementFacade ele_famUKImmgChk = $(By.xpath(imgStatusChk));
		ele_famUKImmgChk.click();
		WebElementFacade ele_click = $(By.xpath(clkContBtnReasonToVisit));
		ele_click.click();

	}

}
