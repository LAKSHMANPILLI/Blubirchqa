package com.qe.project.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qe.project.base.TestBase;

public class ReaddataExcel {
	//public String getExcelData(String Sheetname,int row,int cell) throws EventException, IOException {
   public static void main(String[] args) throws IOException {
	//public void excelData() throws IOException  {
		FileInputStream fiis=new FileInputStream("C:\\Users\\Blubirch\\Downloads\\QEProject\\QEProject\\src\\main\\resources\\login.xlsx");		
		//Workbook wb=WorkbookFactory.create(fis);
		XSSFWorkbook Workbook = new XSSFWorkbook(fiis);
		XSSFSheet sheet = Workbook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		short cells = sheet.getRow(1).getLastCellNum();
		System.out.println(rows);
		System.out.println(cells);
		for(int r=1;r<=rows;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cells;c++) 
			{
				XSSFCell ce = row.getCell(c);
				String value = ce.getStringCellValue();
				System.out.println(value);
			}
			//System.out.println();
			
		}
//	System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
//	System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		String excelUserName = sheet.getRow(1).getCell(0).getStringCellValue();
		String excelPassword = sheet.getRow(2).getCell(1).getStringCellValue();
	
	}

}
