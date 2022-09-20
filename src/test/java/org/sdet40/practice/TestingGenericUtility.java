package org.sdet40.practice;

import java.io.IOException;

import org.HMS.GenericUtilities.ExcelUtility;
import org.HMS.GenericUtilities.FileUtility;
import org.HMS.GenericUtilities.IConstantPath;
import org.HMS.GenericUtilities.JavaUtility;

public class TestingGenericUtility {

	public static void main(String[] args) throws IOException {
		int randomNumber = new JavaUtility().getRandomNumber(1000);
		
	String data = new ExcelUtility().getDataFromExcel(IConstantPath.EXCEL_PATH,"Patient",8, 3)+randomNumber;
	System.out.println(data);
	
	//String browser = new FileUtility().getDataFromPropertyfile(IConstantPath.PROPERTY_FILE_PATH, "browser");
	//System.out.println(browser);
	}
}