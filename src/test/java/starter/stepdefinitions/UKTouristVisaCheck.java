package starter.stepdefinitions;

import com.test.pages.HomePage;
import com.test.pages.UKImmigrationStatusChk;
import com.test.pages.VisaSelectionCriteriaPage;
import com.test.pages.WorkVisaSelectionCriteriaPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UKTouristVisaCheck {
	
	@Steps
	HomePage page;
	@Steps
	VisaSelectionCriteriaPage VisaSelpage;
	@Steps
	WorkVisaSelectionCriteriaPage wrkVisaCriSel;
	@Steps
	UKImmigrationStatusChk ukImgStatusChk;
	
	@Before
	public void luancHomePage() {
		page.lauchURL();
	}
	
	@Given("the UK-Visa Home page")
	public void the_uk_visa_home_page() {
	    page.validateHomePage();
	}

	
	@When("user checks eligibility for {string} nationality with reason to visit UK as {string}")
	public void user_checks_eligibility_for_natijonality_with_reason_as(String nationality, String reason) {
	     VisaSelpage.selectNationalityAndReason(nationality,reason);
	}

	@Then("should see the message {string}")
	public void should_see_the_message(String outcome) { 
	     VisaSelpage.validateOutcome(outcome);
	}
	
	@When("select planning to work in UK as {string}")
	public void select_planning_to_work_in_uk_as(String selCriteria) {
		wrkVisaCriSel.WorkVisaCriteriaSele(selCriteria);
	}

	@When("select family member immigration status {string}")
	public void select_family_member_immigration_status(String immgStatus) {
		ukImgStatusChk.FamilyVisaUKImmigrationChk(immgStatus);
	}
	
	@After
	public void teardown() {
		
		System.out.println("***************************************************************");
		System.out.println("*                                                             *");
		System.out.println("*                  Test Ended                                 *");
		System.out.println("*                                                             *");
		System.out.println("*                                                             *");
		System.out.println("***************************************************************");
	}

}
