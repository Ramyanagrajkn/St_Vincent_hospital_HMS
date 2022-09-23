//package HMS_test;
//
//import org.HMS.GenericUtilities.BaseClass;
//import org.HMS.GenericUtilities.IConstantPath;
//import org.HMS.ObjectRepository.DashBoardPage;
//import org.HMS.ObjectRepository.LoginPage;
//import org.HMS.ObjectRepository.patientUpdateProfilePage;
//import org.testng.annotations.Test;
//
//public class patientToAdminTest extends BaseClass {
//
//	@Test
//	public void pacToAdm ()
//	{
//		LoginPage loginPage=new LoginPage(driver);
//		loginPage.scrollclickHereLink(wdu,driver);
//		loginPage.clickHereLink(wdu);
//		loginPage.loginAction(username, password);
//		DashBoardPage db = new DashBoardPage(driver);
//		db.updateProfileClick();
//		String UserName=excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 3, 2);
//		System.out.println(UserName);
//		String Address=excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 4, 2);
//		System.out.println(Address);
//		String City=excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 5, 2);
//		System.out.println(City);
//		String UserEmail=excelUtil.getDataFromExcel(IConstantPath.EXCEL_PATH, "Patient", 6, 2);
//		System.out.println(UserEmail);
//		patientUpdateProfilePage up=new patientUpdateProfilePage(driver);
//		up.submitButton();
//		db.logoutButtonDropDown();
//		db.logoutButton();
//		loginPage.adminLoginClick();
//		loginPage.loginActionOfAdmin(userName, passWord);
//		loginPage.submitForAdmin();
//		db.adminManageUsersClick();
//	}
//}
