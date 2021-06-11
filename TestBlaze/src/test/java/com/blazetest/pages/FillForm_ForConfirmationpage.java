package com.blazetest.pages;

import static com.utils.UtilMethods.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FillForm_ForConfirmationpage extends BasePage{
	
	WebElement getname_textbx=driver.findElement(By.id("inputName"));
	WebElement getAddr_textbx=driver.findElement(By.id("address"));
	WebElement getCity_textbx=driver.findElement(By.id("city"));
	WebElement getState_textbx=driver.findElement(By.id("state"));
	WebElement getZipcode_textbx=driver.findElement(By.id("zipCode"));
	WebElement getpurchaseFlight_btn=driver.findElement(By.xpath("//*[@value='Purchase Flight']"));
	//capture remaining detalls and fill form
	
	
	public void fillFormDetails_onPage()
	{
		RunTimeVariables.name="Cust name";
		RunTimeVariables.address="address1";
		RunTimeVariables.city="city name";
		RunTimeVariables.state="some state";
		RunTimeVariables.zipcode="some zipcode";
		
		
		waitforelement(getname_textbx, "name");
		enterValue(getname_textbx, RunTimeVariables.name,"enter");
		enterValue(getAddr_textbx, RunTimeVariables.address,"enter");
		enterValue(getCity_textbx, RunTimeVariables.city,"enter");
		enterValue(getState_textbx, RunTimeVariables.state,"enter");
		enterValue(getZipcode_textbx, RunTimeVariables.zipcode,"enter");
		
		//click purchase btn
		click(getpurchaseFlight_btn,"purchase btn");	
				
		
	}

}
