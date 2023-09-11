package com.qe.project.pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.w3c.dom.events.EventException;

import com.qe.project.base.TestBase;

public class Sign_In extends TestBase {

	@FindBy(xpath = "//input[@id='input-14']")
	WebElement email;

	@FindBy(xpath = "//input[@id='input-17']")
	WebElement pwd;
	@FindBy(xpath = "//span[text()='Sign in']")
	WebElement loginButton;

	public Sign_In() {
		PageFactory.initElements(driver, this);
	}

	//Excel1 e = new Excel1();

//	public void login() throws InterruptedException {
	// Thread.sleep(1000);
	// email.sendKeys(prop.getProperty("Email"));
//		pwd.sendKeys(prop.getProperty("Password"));
	public String getExcelData(String Sheetname, int row, int cell) throws EventException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Blubirch\\Downloads\\QEProject\\QEProject\\src\\main\\resources\\login.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}

	public void loginWithValid(String USERNAME, String password) throws InterruptedException {
		Thread.sleep(500);
		email.sendKeys(USERNAME);
		
		pwd.sendKeys(password);
		System.out.println(USERNAME);
		System.out.println(password);
		loginButton.click();
		Reporter.log("Logined succussfully");
		//System.out.println("Logined succussfully");
		// promoOverlay.click();

	}
	

}
