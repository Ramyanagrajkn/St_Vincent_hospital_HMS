//package HMS_test;
//
//import org.HMS.GenericUtilities.BaseClass;
//import org.HMS.ObjectRepository.DashBoardPage;
//import org.HMS.ObjectRepository.LoginPage;
//import org.HMS.ObjectRepository.bookAppointmentPage;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Test;
//
//public class patientToDoctorTest extends BaseClass {
//
//	@Test
//	public void patToDoc ()
//	{
//		LoginPage loginPage=new LoginPage(driver);
//		loginPage.scrollclickHereLink(wdu,driver);
//		loginPage.clickHereLink(wdu);
//		loginPage.loginAction(username, password);
//		DashBoardPage db = new DashBoardPage(driver);
//		db.appointmentClick();
//		bookAppointmentPage book= new bookAppointmentPage(driver);
//		book.specializationDermatologist(wdu);
//		book.doctorBhavani(wdu);
//		book.dateClick();
//		book.dateSelect();
//		book.timeClick();
//		WebElement time = book.timeAddress();
//		time.sendKeys(Keys.CONTROL+"a");
//		time.sendKeys(Keys.DELETE);
//		time.sendKeys("9:00 AM");
//		book.submitButton();
//		db.dashboardPage();
//		driver.switchTo().alert().accept();
//		db.appointmentHistoryClick();
//		db.logoutButton();
//		loginPage.doctorLoginClick();
//		loginPage.loginActionOfDoctor(username, password);
//		loginPage.submitForDoctor();
//		db.doctorAppointmentHistoryCheck();
//		
//	}
//}