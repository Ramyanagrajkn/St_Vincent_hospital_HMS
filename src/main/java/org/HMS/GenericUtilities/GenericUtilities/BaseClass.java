package org.HMS.GenericUtilities;

import java.io.IOException;

import org.HMS.ObjectRepository.DashBoardPage;
import org.HMS.ObjectRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	protected LoginPage loginPage;
	//patient
	protected String username;
	protected String password;
	protected DashBoardPage dashboard;
	protected WebDriver driver;
	protected WebDriverUtility wdu;
	protected ExcelUtility excelUtil;
	protected int randomNumber;
	protected JavaUtility javaUtil;
	//admin
	protected String userName;
	protected String passWord;
	
	
	@BeforeClass
	public void classSetup() throws IOException
	{
		//Generic Utility
		excelUtil=new ExcelUtility();
		javaUtil= new JavaUtility();
		wdu= new WebDriverUtility();
		FileUtility fileUtil=new FileUtility();
		
		// Property file and excel file
		fileUtil.initializePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
		
		//Fetch the data from property file
		String browser = fileUtil.getKeyValueFromPropertyFile("browser");
		//patient
		username=fileUtil.getKeyValueFromPropertyFile("username");
		password=fileUtil.getKeyValueFromPropertyFile("password");
		String url = fileUtil.getKeyValueFromPropertyFile("url");
		//randomNumber=javaUtil.getRandomNumber(1000);
		//admin
		userName=fileUtil.getKeyValueFromPropertyFile("userName");
		passWord=fileUtil.getKeyValueFromPropertyFile("passWord");
		//launching the browser
		driver=wdu.commonOperation(browser, url, 10);
		wdu.initializeJSE(driver);
		
		//creating the object
		//LoginPage loginPage=new LoginPage(driver);
	//	DashBoardPage db = new DashBoardPage(driver);
		
	}
	
		// login to the application
//		@BeforeMethod
//		public void methodSetUp1()
//		{
//			loginPage.loginAction(username, password);
//		}
		
		
		@AfterClass
		public void classTearDown()
		{
		wdu.closeBrowser(driver);
		}
}