package com.qe.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;
import com.qe.project.pages.warehouseBCL;
import com.qe.project.pages.warehouseRTV;

public class warehouseRTV_Test extends TestBase {
	warehouseRTV object;
	@BeforeTest
	public void disposition1() {
		object = new warehouseRTV();
	}
	/*

	@Test(priority = 1)
	public void clickOnDispositionlinkTest() throws InterruptedException {
		object.clickOnDidposition();
	}

	////////// @@@@@@@@@@@\\\\\\\\\\\\\\
	@Test(priority = 2)
	public void clickBCL() throws InterruptedException {
		object.BCL();
	}

	@Test(priority = 3)
	public void selectBCLItem() throws InterruptedException {
		object.SelectItem();
		;
	}

	@Test(priority = 4)
	public void clickBCLUpdate() throws InterruptedException {
		object.BCLUpdate();
	}

	@Test(priority = 5)
	public void BCLSelcetData1() {
		object.BCLSelectData1();
	}

	@Test(priority = 6)
	public void parchaseInvoice() {
		object.parchaseInvoice();
	}

	@Test(priority = 7)
	public void parchaseUpdate() throws InterruptedException {
		object.parchaseUpdate();
	}

	@Test(priority = 8)
	public void addDataField() {
		object.addDataField();
	}

	@Test(priority = 9)
	public void selectData2() {
		object.selectData2();
	}

	@Test(priority = 10)
	public void damageCertificate() {
		object.damagecertificate();
	}

	@Test(priority = 11)
	public void damageUpload1() throws InterruptedException, AWTException {
		object.damageUpload();
	}

	@Test(priority = 12)
	public void submitFirst() {
		object.submitFirst();
	}

	@Test(priority = 13)
	public void clickOnDispositionlinkTest1() throws InterruptedException {
		object.clickDispoaition2();
	}
	*/

	// testcase 2
	@Test(priority = 47)
	public void clickOnRTV() throws InterruptedException {
		object.RTV();
	}

	//@Test(priority = 15)
//	public void clickOnpendinconfirmation() {
//		object.pendingconfirmation();
//	}

	@Test(priority = 48)
	public void clickOnselect() {
		object.select();
	}

	@Test(priority = 49)
	public void clickOnupdate() {
		object.updateconfirmation();
	}

	@Test(priority = 50)
	public void clickOnreturndate() throws InterruptedException {
		object.returndate();
	}

	@Test(priority = 51)
	public void clickOnselectdata() throws InterruptedException {
		object.selectData();
	}

	@Test(priority = 52)
	public void clickOnOK() throws InterruptedException {
		object.clickOnOK();
	}

	@Test(priority = 53)
	public void clickreturnmethod() {
		object.Clickreturnmethod();
	}

	@Test(priority = 54)
	public void clickOndispatch() {
		object.clickdispatch();
	}

	@Test(priority = 55)
	public void clickdocumenttype() {
		object.clickOndocument();
	}

	@Test(priority = 56)
	public void clickInvoice() throws InterruptedException {
		object.clickOninvoice();
	}

	@Test(priority = 57)
	public void clicksubmit() {
		object.clickOnsubmit();
	}
	@Test(priority = 58)
	public void clickSubmitOK() {
		object.submitOkbutton();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
