package com.blazetest;

import org.testng.annotations.Test;

import com.blazetest.pages.ChooseFilghtsPage;
import com.blazetest.pages.ConfirmationPage;
import com.blazetest.pages.FillForm_ForConfirmationpage;
import com.blazetest.pages.Landingpage;
import com.utils.UtilMethods;

public class BlazeAppTest extends BaseTestCase {
	Landingpage landingPage;
	ChooseFilghtsPage chooseFilghtsPage;
	FillForm_ForConfirmationpage fillFormpage;
	ConfirmationPage confirmationPage;

	UtilMethods utilMethods = new UtilMethods();

	@Test // 1.write individual test cases to check fields on on all pages public
	void checkFieldsonLandingPage() {
		landingPage = new Landingpage();
		landingPage.verifyUserLandedInLandingPage();
		landingPage.verifyFieldsOnLandingPage();
	}

	@Test
	public void testTicketConfirmed() {
		landingPage = new Landingpage();

		landingPage.verifyUserLandedInLandingPage();
		landingPage.selectToAndFromFlight_annClickFind();

		chooseFilghtsPage = new ChooseFilghtsPage();
		chooseFilghtsPage.clickFirstFlightOn_ChooseFlightsPage();

		fillFormpage = new FillForm_ForConfirmationpage();
		fillFormpage.fillFormDetails_onPage();

		confirmationPage = new ConfirmationPage();
		confirmationPage.verifyConfirmationmsg_on_ConfirmationPage();

	}

	@Test(enabled = false)

	public void verifytheSameFlightDetailsDisplayedon_FillForm() {
		landingPage.verifyUserLandedInLandingPage();
		chooseFilghtsPage.clickFirstFlightOn_ChooseFlightsPage(); // verify same
		// flight details displayed on Form page which were selected on choose flight
//	  page

	}

	@Test(enabled = false)
	public void verifyAlltheDetailsMatchingon_Confirmationpage() {
		landingPage.verifyUserLandedInLandingPage();
		chooseFilghtsPage.clickFirstFlightOn_ChooseFlightsPage(); // verify same
//	  flight details displayed on Form page which were selected on choose flight
//	  page

	}

	@Test(enabled = false)
	public void performFieldValidationsOn_FillFormPage() {
		// landingPage.verifyRememberMeFunctioanlity();
		// verify remember me functionality on choose flight page
	}
	
	@Test(enabled = false)
	public void verifyDifferentconfirmationStatus_ConfirmationPage() {
		// landingPage.verifyRememberMeFunctioanlity();
		// verify remember me functionality on choose flight page
	}
	

}
