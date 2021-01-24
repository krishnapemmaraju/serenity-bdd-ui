package com.test.pages;

import com.test.implementation.GovUKVisaSelectCriteria;
import com.test.implementation.GovUKWorkVisaSelecCriteria;

import net.thucydides.core.annotations.Step;

public class WorkVisaSelectionCriteriaPage {
	
	GovUKWorkVisaSelecCriteria wrkVisaSelCrit;
	
	@Step
	public void WorkVisaCriteriaSele(String selectCriteria) {
		wrkVisaSelCrit.selDurationToWorkInUK(selectCriteria);
	}

}
