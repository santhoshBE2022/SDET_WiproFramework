package com.crm.comcast.contact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContactTest 
{
	@Test(groups="smokeTest")
	public void createContact() throws Throwable
	{
		//System.out.println("Starting createContact test");
		
		//System.out.println("to verify");
		
		String Browser = System.getProperty("browser");
		//String Url = System.getProperty("url");
		
		System.out.println("Executing createContact test");
		
		WebDriver driver=null;
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		//driver.get(Url);
		Thread.sleep(1000);
		driver.close();
		
		System.out.println("Executing createContact test");
		
	}
	
	@Test(groups="regressionTest")
	public void modifyContact()
	{
		System.out.println("Starting modifyContact test");
		
		System.out.println("Executing modifyContact test");
	}
}











