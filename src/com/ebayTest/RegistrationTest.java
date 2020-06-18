package com.ebayTest;

import com.ebaypages.RegistrationPage;
import com.utility.Xls_Reader;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegistrationTest extends SuperClass
{
	@Test(priority=1)
	public void enterTheEmailAddress()
	{
	RegistrationPage regPage = new RegistrationPage(driver);
	regPage.SignInButton().click();
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(regPage.EmailAddress()));
	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\hp\\Desktop\\TestData.xlsx");
	String EmailAdd = reader.getCellData("Email_Address", "emailAddress", 2);
	
	regPage.EmailAddress().sendKeys(EmailAdd);
	
	regPage.createAccountButton().click();
	
	wait.until(ExpectedConditions.visibilityOf(regPage.firstName()));
	
	}
	
	@Test(priority=2)
	public void enterRegistraionDeatils()
	{
		RegistrationPage regPage = new RegistrationPage(driver);
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\hp\\Desktop\\TestData.xlsx");
		String gender =reader.getCellData("registration", "Prefix", 2);
		
		if(gender.equalsIgnoreCase("Mr."))
		{
			regPage.Gender1().click();
		}
		else if (gender.equalsIgnoreCase("Mrs."))
		{
			regPage.Gender2().click();
		}
		
		else {
			System.out.println("Gender Not found");
		}
		
		String customerFirtName =reader.getCellData("registration", "Fisrtname", 2);
		regPage.firstName().sendKeys(customerFirtName);
		
		String customerLastName =reader.getCellData("registration", "Lastname", 2);
		regPage.lastName().sendKeys(customerLastName);
		
		regPage.passwd().sendKeys(reader.getCellData("registration", "Password", 2));
		
		Select selDay = new Select(regPage.selectDay());
		//selDay.selectByVisibleText("10");
		selDay.selectByIndex(11);
		
		Select selYear = new Select(regPage.selectYear());
		//selYear.selectByVisibleText("2011");
		selYear.selectByIndex(9);
		
		String month = reader.getCellData("registration", "Month", 2);

		Select selMonth	= new Select(regPage.selectMonth());
		selMonth.selectByVisibleText(month);
		
		//regPage.addressFirstName().sendKeys(reader.getCellData("registration", "Fisrtname", 2));
		//regPage.addressLastName().sendKeys(reader.getCellData("registration", "Lastname", 2));
		regPage.companyName().sendKeys(reader.getCellData("registration", "Company", 2));
		regPage.addressLine1().sendKeys(reader.getCellData("registration", "AddressLine1", 2));
		regPage.addressLine2().sendKeys(reader.getCellData("registration", "AddressLine2", 2));
		regPage.city().sendKeys(reader.getCellData("registration", "City", 2));
		
		Select selState = new Select(regPage.state());
		selState.selectByVisibleText("Georgia");
		
		regPage.zipCode().sendKeys("99524");
		regPage.additionalInfo().sendKeys(reader.getCellData("registration", "AdditionalInformation", 2));
		regPage.mobilePhone().sendKeys("81459809789");
		regPage.alias().sendKeys(reader.getCellData("registration", "Alias", 2));
		
		regPage.register().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(regPage.MyAccount()));
		
		String actualTitle= driver.getTitle();
		String expectedTitle = "My account - My Store";
		
		Assert.assertEquals(actualTitle, expectedTitle, "Account Not Created Sucessfully");

	
	
	}
	
	
}
