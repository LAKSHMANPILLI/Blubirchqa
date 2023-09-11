package com.qe.project.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.w3c.dom.events.EventException;

import com.qe.project.base.TestBase;

public class Excel1 {
	public String getExcelData(String Sheetname, int row, int cell) throws EventException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Blubirch\\Downloads\\QEProject\\QEProject\\src\\main\\resources\\login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

}
