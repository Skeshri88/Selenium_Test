package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.qa.base.TestBase;


public class TestUtil extends TestBase
{
	public static long PAGE_LOAD_TIMEOUT = 65;
	public static long IMPLICIT_WAIT = 40;
	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Admin\\SeleniumTest\\src\\main\\java\\com\\qa\\testdata\\TestDataDetails.xlsx";
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try
		{
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			book = WorkbookFactory.create(file);
		} 
		catch (InvalidFormatException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println(sheet.getLastRowNum() + "--------");
		System.out.println(sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			
			}
		}
		return data;

		
}
}



