package com.blazetest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import static com.utils.UtilMethods.driver;

public class BasePage {
	
	public boolean verifyElemDisplayed(WebElement elem, String elemName)
	{
		try {
			if(elem.isDisplayed())
				return true;
			else
				return false;
		}
		catch(Exception E)
		{
			Reporter.log(elemName+"element is not displayed");
			return false;
		}
	}
	
	public void selectByIndex(WebElement elem, int index,String elemName)
	{
		try {
			Select sel=new Select(elem);
			sel.selectByIndex(index);
		}
		catch(Exception E)
		{
			Reporter.log("Unbale to select element from "+elemName);
		}
	}
	public void click(WebElement elem, String elemName)
	{
		try {
			elem.click();

		}
		catch(Exception E)
		{
			Reporter.log("Unbale to click on element  "+elemName);
		}
	}
	public void enterValue(WebElement elem, String texttoBeEntered,String elemName)
	{
		
		try {
			elem.clear();
			elem.sendKeys(texttoBeEntered);

		}
		catch(Exception E)
		{
			Reporter.log("Unbale to click on element  "+elemName);
		}
	}
	public void waitforelement(WebElement elem, String elemName)
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.visibilityOf(elem) );
		}
		catch(Exception E)
		{
			Reporter.log("Unbale to click on element  "+elemName);
		}
	}
	public void waitforelementToBeclickable(WebElement elem, String elemName)
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver, 6);
			wait.until(ExpectedConditions.elementToBeClickable(elem));
		}
		catch(Exception E)
		{
			Reporter.log("Unbale to click on element  "+elemName);
		}
	}
	
	

}
