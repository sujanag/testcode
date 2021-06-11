package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UtilMethods {
		
	public static WebDriver driver;
	
	//driver initialization and launch URL
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Sujana\\chrom driver 91\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://blazedemo.com");
	
	}
	
	
	
public void closeApp()
{
	driver.close();
}












}
