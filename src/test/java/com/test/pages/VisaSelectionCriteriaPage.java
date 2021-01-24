package com.test.pages;

import com.test.implementation.GovUKVisaSelectCriteria;

import net.thucydides.core.annotations.Step;

public class VisaSelectionCriteriaPage {
	
	GovUKVisaSelectCriteria visaSelPage;
	
	@Step
	public void selectNationalityAndReason(String nationality,String reason) {
		visaSelPage.selectNationalityAndReason(nationality,reason);
	}
	
	@Step
	public void validateOutcome(String outcome) {
		visaSelPage.validateOutcome(outcome);
	}
}
