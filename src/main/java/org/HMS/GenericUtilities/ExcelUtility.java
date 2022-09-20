package org.HMS.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author PVN Creations
 *
 */

public class ExcelUtility {

	public String getDataFromExcel(String excelPath, String sheetName, int rowNumber, int cellNumber)
	{
		FileInputStream fisexcel=null;
		try {
			fisexcel = new FileInputStream(excelPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook workbook=null;
		try {
			workbook = WorkbookFactory.create(fisexcel);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetName);
		String data = new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
}
