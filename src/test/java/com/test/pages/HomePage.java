package com.test.pages;

import com.test.implementation.GovUKVisaHomePage;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	GovUKVisaHomePage govUKPage;

	@Step
	public void lauchURL() {
		govUKPage.launchGovWebSite();
	}
	
	@Step
	public void validateHomePage() {
		govUKPage.validateHomePage();
	}
}
