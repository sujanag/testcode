package com.blazetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.utils.UtilMethods.driver;

public class Landingpage extends BasePage{
	
	WebElement getTitleOnLandinpage=driver.findElement(By.xpath("//h1[contains(text(),'Welcome to the Simple Travel Agency!')]"));
	WebElement getFromPort_Dropdown=driver.findElement(By.name("fromPort"));
	WebElement getToPort__Dropdown=driver.findElement(By.name("toPort"));
	WebElement getFinDFlights_Btn=driver.findElement(By.xpath("//*[@value='Find Flights']"));
	
	
	
	public void verifyUserLandedInLandingPage()
	{
		waitforelement(getTitleOnLandinpage, "title on landing page");
		Assert.assertTrue(verifyElemDisplayed(getTitleOnLandinpage,"title on landing page"),"title  displayed");
		
	}
	
	public void verifyFieldsOnLandingPage()
	{
		Assert.assertTrue(verifyElemDisplayed(getFromPort_Dropdown,"FromPort_Dropdown on landing page"),"title  displayed");
		Assert.assertTrue(verifyElemDisplayed(getToPort__Dropdown,"ToPort__Dropdown on landing page"),"title  displayed");
		Assert.assertTrue(verifyElemDisplayed(getFinDFlights_Btn,"FinDFlights_Btn"),"title  displayed");
	}
	
	public void selectToAndFromFlight_annClickFind()
	{
		selectByIndex(getFromPort_Dropdown,2,"from port");
		selectByIndex(getToPort__Dropdown,2,"to port");
		waitforelementToBeclickable(getFinDFlights_Btn, 
				"find flights button");
		click(getFinDFlights_Btn,"find flights");
		
	}

}
