package com.ebayTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class SuperClass 
{
	WebDriver driver;
	@Parameters({"browsername", "url"})
	@BeforeClass
	public void precondition(String browsername, String url )
	{
		/*if(browser.equalsIgnoreCase("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\New_workspace\\MakeMytrip\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}*/
		
		 if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else
		{
			driver =  new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.get(url);
	}
	
	/*@AfterClass
	public void  postcondtion()
	{
		driver.quit();
	}*/
}
