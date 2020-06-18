package com.ebaypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage 
{
	WebDriver driver;
	
	By SignInButton = By.xpath("//a[@class='login']");
	By EmailAddress = By.xpath("//input[@name='email_create']");
	By createAccountButton = By.xpath("//button[@id='SubmitCreate']");
	
	//locators of Registration Page
	By firstName = By.xpath("//input[@name='customer_firstname']");
	By lastName = By.name("customer_lastname");
	By passwd = By.name("passwd");
	By selectDay = By.name("days");
	By selectMonth = By.name("months");
	By selectYear = By.name("years");
	By addressFirstName = By.id("firstname");
	By addressLastName  = By.id("lastname");
	By companyName = By.id("company");
	By addressLine1 = By.xpath("//input[@id='address1']");
	By addressLine2 = By.xpath("//input[@id='address2']");
	By city= By.xpath("//input[@id='city']");
	By state = By.xpath("//select[@id='id_state']");
	By zipCode = By.xpath("//input[@id='postcode']");
	By Country = By.xpath("//Select[@id='id_country']");
	By additionalInfo = By.xpath("//textarea[@id='other']");
	By homePhone = By.xpath("//input[@name='phone']");
	By mobilePhone = By.xpath("//input[@name='phone_mobile']");
	By alias = By.xpath("//input[@name='alias']");
	By register = By.xpath("//button[@id='submitAccount']");
	By Gender1 =By.xpath("//input[@id='id_gender1']");
	By Gender2 = By.xpath("//input[@id='id_gender2']");
	
	
	By MyAccount = By.xpath("//span[text()='My account']");
	
	
	
	
public RegistrationPage(WebDriver driver)
{
	this.driver= driver ;
}


public  WebElement SignInButton()
{
	 return driver.findElement(SignInButton);
}

public WebElement EmailAddress() {
	return driver.findElement(EmailAddress);
}

public WebElement createAccountButton() {
	return driver.findElement(createAccountButton);
}


//Methods For the registration Page Locators


public WebElement firstName() {
	return driver.findElement(firstName);
}
public WebElement lastName() {
	return driver.findElement(lastName);
}

public WebElement passwd() {
	return driver.findElement(passwd);
}

public WebElement selectDay() {
	return driver.findElement(selectDay);
}

public WebElement selectMonth() {
	return driver.findElement(selectMonth);
}

public WebElement selectYear() {
	return driver.findElement(selectYear);
}

public WebElement addressFirstName() {
	return driver.findElement(addressFirstName);
}

public WebElement addressLastName() {
	return driver.findElement(addressLastName);
}

public WebElement companyName() {
	return driver.findElement(companyName);
}

public WebElement addressLine1() {
	return driver.findElement(addressLine1);
}

public WebElement addressLine2() {
	return driver.findElement(addressLine2);
}

public WebElement city() {
	return driver.findElement(city);
}

public WebElement state() {
	return driver.findElement(state);
}

public WebElement zipCode() {
	return driver.findElement(zipCode);
}

public WebElement Country() {
	return driver.findElement(Country);
}

public WebElement additionalInfo() {
	return driver.findElement(additionalInfo);
}

public WebElement homePhone() {
	return driver.findElement(homePhone);
}

public WebElement mobilePhone() {
	return driver.findElement(mobilePhone);
}

public WebElement alias() {
	return driver.findElement(alias);
}

public WebElement register() {
	return driver.findElement(register);
}

public WebElement Gender1() {
	return driver.findElement(Gender1);
}

public WebElement Gender2() {
	return driver.findElement(Gender2);
}

public WebElement MyAccount() {
	return driver.findElement(MyAccount);
}

}

