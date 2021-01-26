package com.test.pages;

import com.serenity.test.implementation.GovUKVisaSelectCriteria;

import net.thucydides.core.annotations.Step;

public class VisaSelectionCriteriaPage {
	
	GovUKVisaSelectCriteria visaSelPage;
	
	@Step
	public void selectNationalityAndReason(String nationality,String reason) {
		visaSelPage.selectNationalityAndReason(nationality,reason);
	}
	
	
	public String validateOutcome() {
		return visaSelPage.validateOutcome();
	}
}
