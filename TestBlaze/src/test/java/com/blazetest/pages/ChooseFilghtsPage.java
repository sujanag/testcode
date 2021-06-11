package com.blazetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.utils.UtilMethods.driver;

public class ChooseFilghtsPage extends BasePage{
	
	WebElement getFirstChooseFilghts_Btn=driver.findElement(By.xpath("(//*[@value='Choose This Flight'])[1]"));
	
	
	
	
	public void clickFirstFlightOn_ChooseFlightsPage()
	{
		waitforelement(getFirstChooseFilghts_Btn, "choose flight first one");
		click(getFirstChooseFilghts_Btn, "choose filghts first button");
	}

}
