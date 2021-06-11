package com.blazetest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.google.common.base.Verify;

import static com.utils.UtilMethods.driver;

public class ConfirmationPage extends BasePage{
	String confirmationMsg="Thank you for your purchase today!";
	
	WebElement getconfirmation_Msg=driver.findElement(By.xpath("//*[@class='container hero-unit']/h1"));
	WebElement getconfirmation_Status=driver.findElement(By.xpath("//table//td[text()='Status']/..//td[2]"));
	
	
	
	public void verifyConfirmationmsg_on_ConfirmationPage()
	{
	
	waitforelement(getconfirmation_Msg, "confirmationMsg");
	Verify.verify(getconfirmation_Msg.getText().trim().equals(confirmationMsg));
	Reporter.log(getconfirmation_Status.getText()+" status is");
	
	}

}
