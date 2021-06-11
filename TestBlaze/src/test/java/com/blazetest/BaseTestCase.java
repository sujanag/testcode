package com.blazetest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.utils.UtilMethods;

public class BaseTestCase {
	UtilMethods utilMethods= new UtilMethods();	

@BeforeTest
public void launchApplication()
{
	utilMethods= new UtilMethods();
}

@AfterTest
public void closeApplication()
{
	utilMethods.closeApp();
}




}
