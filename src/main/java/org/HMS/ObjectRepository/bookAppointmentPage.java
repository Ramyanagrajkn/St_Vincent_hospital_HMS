 package org.HMS.ObjectRepository;

import org.HMS.GenericUtilities.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookAppointmentPage {
	
	//declaration
	@FindBy(xpath="//label[@for='DoctorSpecialization']/following::select[@name='Doctorspecialization']")
	private WebElement specialiation;
	
	//@FindBy(xpath = "//option[contains(.,'Dentist')]") 
	//private WebElement dentist;
	
	@FindBy(id="doctor")
	private WebElement doctor;
	
	@FindBy(xpath="//label[contains(.,'Date')]/following::input[@class='form-control datepicker']")
	private WebElement dateClick;
	
	@FindBy(xpath="//td[.='30']")
	private WebElement date;
	
	@FindBy(id="timepicker1")
	private WebElement timeClick;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitButton;
	
	//initialization all element variable
		public bookAppointmentPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
	//business library
	public void specializationDermatologist(WebDriverUtility wdu) 
	{
		wdu.initializeDropdown(specialiation);
		specialiation.click();
		wdu.selectByVisibleTextFromDropdown("Dermatologist");
    }
	
//	public void specializationDentist(WebDriverUtility wdu)
//	{
//		wdu.initializeDropdow(specialiation);
//		specialiation.click();
//		wdu.selectByVisibleTextFromDropdown("Dentist");
//	}
	
	public void doctorBhavani(WebDriverUtility wdu)
	{
		wdu.initializeDropdown(doctor);
		doctor.click();
		wdu.selectByVisibleTextFromDropdown("Bhavani");
	}
	
	public void dateClick()
	{
		dateClick.click();
	}
	public void dateSelect()
	{
		date.click();
	}
	
	public void timeClick()
	{
		timeClick.click();
	}
	
	public WebElement timeAddress()
	{
		return timeClick;
	}
	
	public void submitButton()
	{
		submitButton.click();
	}
}