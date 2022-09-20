package org.HMS.ObjectRepository;

import org.HMS.GenericUtilities.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class patientUpdateProfilePage {

	@FindBy(xpath="//label[contains(.,'User Name')]/following::input[@name='fname']")
	private WebElement nameClick;
	
	@FindBy(xpath="//label[contains(.,'Address')]/following::textarea[@name='address']")
	private WebElement addressClick;
	
	@FindBy(xpath="//label[contains(.,'City')]/following::input[@name='city']")
	private WebElement cityClick;
	
	@FindBy(xpath="//label[contains(.,'Gender')]/following::select[@name='gender']")
	private WebElement genderClick;
	
	@FindBy(xpath="//label[contains(.,'User Email')]/following::input[@type='email']")
	private WebElement emailClick;
	
	@FindBy(name="submit")
	private WebElement submitButtonProfile;
	
	//initialization all element variable
	public patientUpdateProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	public void updateProfileClick()
//	{
//		updateProfile.click();
//	}
	public void updateProfile(String UserName,String Address,String City,String UserEmail)
	{
		nameClick.sendKeys(UserName);
		addressClick.sendKeys(Address);
		cityClick.sendKeys(City);
		emailClick.sendKeys(UserEmail);
	}
	public void submitButton()
	{
		submitButtonProfile.click();
	}
//	public void nameTextfield(String UserName) 
//	{
//		nameClick.sendKeys(UserName);
//	}
//	public void addressTextfield(String Address) 
//	{
//		addressClick.sendKeys(Address);
//	}
//	public void cityTextfield1(String City) 
//	{
//		cityClick.sendKeys(City);
//	}
	public void genderTextfield(WebDriverUtility wdu) 
	{
		wdu.initializeDropdown(genderClick);
		genderClick.click();
		wdu.selectByVisibleTextFromDropdown("Female");
	}
//	public void emailTextfield(String UserEmail) 
//	{
//		emailClick.sendKeys(UserEmail);
//	}
//	public void submitButton() 
//	{
//		submitButtonProfile.click();
//	}
}
