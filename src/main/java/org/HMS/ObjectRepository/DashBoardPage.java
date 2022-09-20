package org.HMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage 
{
// declaration
	@FindBy(xpath="//a[@href='book-appointment.php']")
	private WebElement bookAppointment;
	
//	@FindBy(xpath="(//div[@class='panel-body']/following::h2[text()='My Appointments']/following::a[contains(.,'View Appointment History')]")
//	private WebElement appointmentHistory;
	
	@FindBy(xpath = "//span[text()=' Dashboard ']")
	private WebElement dashboardPage;
	
	@FindBy(xpath = "//a[contains(text(),'Update Profile')]")
	private WebElement updateProfile;
	
	@FindBy(xpath="//i[@class='ti-angle-down']")
	private WebElement logoutButtonDropDown;
	
	@FindBy(xpath="//a[@href='logout.php']")
	private WebElement logoutButton;
	
	
	@FindBy(xpath = "//span[text()=' Appointment History ']")
	private WebElement appointmentHistoryClick;
	
	@FindBy(xpath="//div[@class='panel-body']/following::h2[text()='My Appointments']/following::a[contains(.,'View Appointment History')]")
	private WebElement viewAppointmentHistoryClick;
	
	@FindBy(xpath="//span[@class='username")
	private WebElement dropDownForLogout;
	
	@FindBy(xpath="//a[contains(text()='Log Out')]")
	private WebElement logoutOfDoctor;
	
	//admin
	@FindBy(xpath="//h2[text()='Manage Users']/following::a[@href='manage-users.php']")
	private WebElement adminManageUsers;

//initialization all element variable
		public DashBoardPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

//business Library
	public void appointmentClick()
	{
		bookAppointment.click();
		
	}
//	public void appointmentHistory()
//	{
//		appointmentHistory.click();
//	}
	public void dashboardPage()
	{
		dashboardPage.click();
	}
	public void updateProfileClick()
	{
		updateProfile.click();
	}
	public void logoutButtonDropDown()
	{
		logoutButtonDropDown.click();
		
	}
	public void logoutButton()
	{
		logoutButton.click();
	}
	public void appointmentHistoryClick()
	{
		appointmentHistoryClick.click();
	}
	public void doctorAppointmentHistoryCheck()
	{
		viewAppointmentHistoryClick.click();
	}
	public void doctorLogoutDropDown()
	{
		dropDownForLogout.click();
	}
	public void doctorLogoutClick()
	{
		logoutOfDoctor.click();
	}
	public void adminManageUsersClick()
	{
		adminManageUsers.click();
	}
}