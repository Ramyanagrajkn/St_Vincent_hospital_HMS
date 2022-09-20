package org.HMS.ObjectRepository;

import java.io.IOException;

//import org.HMS.GenericUtilities.ExcelUtility;
import org.HMS.GenericUtilities.FileUtility;
import org.HMS.GenericUtilities.IConstantPath;
//import org.HMS.GenericUtilities.JavaUtility;
import org.HMS.GenericUtilities.WebDriverUtility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patientToDoctor {

	public static void main(String[] args) throws IOException {
		FileUtility fileutil=new FileUtility();
//		ExcelUtility eu=new ExcelUtility();
//		JavaUtility ju= new JavaUtility();
		WebDriverUtility wdu= new WebDriverUtility();
		String path = IConstantPath.PROPERTY_FILE_PATH;
		String browser = fileutil.getKeyValueFromPropertyFile("browser");
		String url = fileutil.getKeyValueFromPropertyFile("url");
		String username = fileutil.getKeyValueFromPropertyFile("username");
		String password = fileutil.getKeyValueFromPropertyFile("password");
		
		WebDriver driver = wdu.commonOperation(browser, url, 10);
		LoginPage loginpage= new LoginPage(driver);
		loginpage.scrollclickHereLink(wdu,driver);
		loginpage.clickHereLink(wdu);
		loginpage.loginAction(username, password);
		DashBoardPage db = new DashBoardPage(driver);
		db.appointmentClick();
		bookAppointmentPage book= new bookAppointmentPage(driver);
		book.specializationDermatologist(wdu);
		book.doctorBhavani(wdu);
		book.dateClick();
		book.dateSelect();
		book.timeClick();
		WebElement time = book.timeAddress();
		time.sendKeys(Keys.CONTROL+"a");
		time.sendKeys(Keys.DELETE);
		time.sendKeys("9:00 AM");
		book.submitButton();
		db.dashboardPage();
	   	db.appointmentHistoryClick();
	   	db.logoutButtonDropDown();
		db.logoutButton();
		db.doctorLogoutDropDown();
		db.doctorLogoutClick();
	}
}
