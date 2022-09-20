package org.HMS.ObjectRepository;

import org.HMS.GenericUtilities.WebDriverUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//declaration of Patient login
	
	@FindBy(xpath="//h3[text()='Patients']/following::a[@href='hms/user-login.php']")
	private WebElement clickHereLink;
	
	@FindBy(name="username")
	private WebElement userNameTextField;
	
	@FindBy(name="password")
	private WebElement passwordTextField;
	
	@FindBy(name="submit")
	private WebElement submitButton;
	
	// declaration of doctor login
	
	@FindBy(xpath="//a[@href='hms/doctor/']")
	private WebElement doctorLogin;
	
	@FindBy(name="username")
	private WebElement doctorUsernameClick;
	
	@FindBy(name="password")
	private WebElement doctorPasswordClick;
	
	@FindBy(name="submit")
	private WebElement doctorSubmitButtonClick;
	
	//declaration of admin login
	
	@FindBy(xpath="//a[@href='hms/admin']")
	private WebElement adminLoginLink;
	
	@FindBy(name="username")
	private WebElement adminUsernameClick;
	
	@FindBy(name="password")
	private WebElement adminPasswordClick;
	
	@FindBy(name="submit")
	private WebElement adminSubmitButtonClick;
	
	//initialization all element variable
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
    //business Library
	public void scrollclickHereLink(WebDriverUtility wdu,WebDriver driver)
	{
	//	wdu.waittilElementisVisisble(clickHereLink);
		wdu.initializeJSE(driver);
	wdu.scrollByUsingJse(clickHereLink);
	}
	public void clickHereLink(WebDriverUtility wdu)
	{
		wdu.waittilElementisVisisble(clickHereLink);
		clickHereLink.click();
	}
	public void loginAction(String username, String password)
	{
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		submitButton.click();
	}
	public void doctorLoginClick()
		{
		doctorLogin.click();
		}
	
	public void loginActionOfDoctor(String Username, String Password)
	{
		doctorUsernameClick.sendKeys(Username);
		doctorPasswordClick.sendKeys(Password);
	}
	public void submitForDoctor()
	{
		doctorSubmitButtonClick.click();
	}
	
	public void adminLoginClick()
	{
		adminLoginLink.click();
	}

	public void loginActionOfAdmin(String userName, String passWord)
	{
		adminUsernameClick.sendKeys(userName);
		adminPasswordClick.sendKeys(passWord);
	}
	
	public void submitForAdmin()
	{
		adminSubmitButtonClick.click();
		}
	}
//	public void scrollByElement(WebDriver driver,WebDriverUtility wdu)
//	{
//		wdu.initializeJSE(driver);
//		wdu.scrollByUsingJse(clickHereLink);
//	}