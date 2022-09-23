//package org.HMS.ObjectRepository;
//
//import java.io.IOException;
//
//import org.HMS.GenericUtilities.ExcelUtility;
//import org.HMS.GenericUtilities.FileUtility;
//import org.HMS.GenericUtilities.IConstantPath;
//import org.HMS.GenericUtilities.WebDriverUtility;
//import org.openqa.selenium.WebDriver;
//
//public class patientToAdmin {
//
//	public static void main(String[] args) throws IOException {
//		FileUtility fileutil=new FileUtility();
//		//ExcelUtility eu=new ExcelUtility();
////		JavaUtility ju= new JavaUtility();
//		WebDriverUtility wdu= new WebDriverUtility();
//		String path = IConstantPath.PROPERTY_FILE_PATH;
//		String browser = fileutil.getKeyValueFromPropertyFile("browser");
//		String url = fileutil.getKeyValueFromPropertyFile("url");
//		String username = fileutil.getKeyValueFromPropertyFile("username");
//		String password = fileutil.getKeyValueFromPropertyFile("password");
//		
//		WebDriver driver = wdu.commonOperation(browser, url, 10);
//		LoginPage loginpage= new LoginPage(driver);
//		loginpage.scrollclickHereLink(wdu,driver);
//		loginpage.clickHereLink(wdu);
//		loginpage.loginAction(username, password);
//		DashBoardPage db = new DashBoardPage(driver);
//		db.dashboardPage();	
//		db.updateProfileClick();
//		eu.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 3, 1);
//		eu.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 4, 1);
//		eu.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 5, 1);
//		eu.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 6, 1);
//		patientUpdateProfilePage up=new patientUpdateProfilePage(driver);
//		up.submitButton();
//		db.logoutButton();
//	}
//}