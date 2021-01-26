package com.test.pages;

import com.serenity.test.implementation.GovUKVisaHomePage;

import net.thucydides.core.annotations.Step;

public class HomePage {
	
	GovUKVisaHomePage govUKPage;

	public void lauchURL() {
		govUKPage.launchGovWebSite();
		
	}
	
	@Step
	public boolean validateHomePage() {
		return govUKPage.validateHomePage();
	}
}
