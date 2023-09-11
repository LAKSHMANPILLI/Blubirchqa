package com.qe.project.testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;
import com.qe.project.pages.warehouseBCL;
import com.qe.project.pages.warehouseRTV;

public class warehouseBCL_Test extends TestBase {
	warehouseBCL object1;
	@BeforeTest
	public void dispositonBCL() {
		object1=new warehouseBCL();
	}
//	public void disposition1() {
//		object = new warehousepage();
//	}

	@Test(priority = 1)
	public void clickOnDispositionlinkTest() throws InterruptedException {
		object1.clickOnDidposition();
	}

	////////// @@@@@@@@@@@\\\\\\\\\\\\\\
	@Test(priority = 2)
	public void clickBCL() throws InterruptedException {
		object1.BCL();
	}
	@Test(priority = 3)
	public void brandCallLogFilter() throws InterruptedException {
		object1.brandCallLogFilter();
	}
	@Test(priority = 4)
	public void brandFieldFilter() throws InterruptedException, AWTException {
		object1.brandFieldFilter();
	}
//	@Test(priority = 5)
//	public void selectBrandFilter() throws InterruptedException {
//		object1.selectFilterBrand();
//	}
	@Test(priority = 5)
	public void brandApplyFilter() throws InterruptedException {
		object1.brandApplyFilter();
	}

	@Test(priority = 6)
	public void selectBCLItem() throws InterruptedException {
		object1.SelectItem();
		;
	}

	@Test(priority = 7)
	public void clickBCLUpdate() throws InterruptedException {
		object1.BCLUpdate();
	}

	@Test(priority = 8)
	public void BCLSelcetData1() {
		object1.BCLSelectData1();
	}

	@Test(priority = 9)
	public void parchaseInvoice() throws InterruptedException {
		object1.parchaseInvoice();
	}

	@Test(priority = 10)
	public void parchaseUpdate() throws InterruptedException {
		object1.parchaseUpdate();
	}

	@Test(priority = 11)
	public void addDataField() {
		object1.addDataField();
	}

	@Test(priority = 12)
	public void selectData2() {
		object1.selectData2();
	}

	@Test(priority = 13)
	public void damageCertificate() {
		object1.damagecertificate();
	}

	@Test(priority = 14)
	public void damageUpload1() throws InterruptedException, AWTException {
		object1.damageUpload();
	}

	@Test(priority = 16)
	public void submitFirst() throws InterruptedException {
		object1.submitFirst();
		Thread.sleep(2000);
	}
	@Test(priority = 17)
	public void pendingInformationOK() throws InterruptedException {
		object1.pendingInformationOkbutton();
	}
	@Test(priority = 18)
	public void pendingBclTickets() {
		object1.pendingBclTickets();
	}
	@Test(priority = 19)
	public void selectBclTickets() {
		object1.selectBclTickets();
	}
	@Test(priority = 20)
	public void updateBclTickets() {
		object1.updateBclTikctes();
	}
	@Test(priority = 21)
	public void ticketNoBclTickets() throws InterruptedException {
		object1.ticketNoBclTickets();
	}
	@Test(priority = 22)
	public void ticketDateBclTickets() throws InterruptedException {
		object1.ticketDateBclTickets();
		Thread.sleep(1000);
	}
	@Test(priority = 23)
	public void selectCalendorBclTickets() throws InterruptedException {
		object1.selectCalendorDateBclTickets();
	}
	@Test(priority = 24)
	public void calendorOkBclTickets() throws InterruptedException {
		object1.calendorOkBclTickets();
	}
	@Test(priority = 25)
	public void submitBclTickets() {
		object1.submitBclTickets();
	}
	@Test(priority = 26)
	public void submitBCLTicketsOkbutton() throws InterruptedException {
		object1.submitBclTicketsOk();
	}
	@Test(priority = 27)
	public void pendingInspection1() throws InterruptedException {
		object1.pendingInspection();
		Thread.sleep(1000);
	}
	@Test(priority = 28)
	public void selectInspection() {
		object1.selectInspection();
	}
	@Test(priority = 29)
	public void updateInspection() throws InterruptedException {
		object1.updateInspection();
	}
	@Test(priority = 30)
	public void brandInspectionDate1() throws InterruptedException {
		object1.brandInspectionDate();
	}
	@Test(priority = 31)
	public void brandDatecalendorInpsection() throws InterruptedException {
		object1.brandDatecalendorInpsection();
	}
	@Test(priority = 32)
	public void brandDateOkInspection() throws InterruptedException {
		object1.clickBrandDateOkInspection();;
	}
	@Test(priority = 33)
	public void brandInspectionReport() throws AWTException, InterruptedException {
		object1.brandInspectionReport();
	}
	@Test(priority = 34)
	public void submitBrandInspection() throws InterruptedException {
		object1.submitBrandInspection();
	}
	@Test(priority = 35)
	public void brandInspectionOkbutton() throws InterruptedException {
		object1.brandInspectionOKbutton();
	}
	@Test(priority = 36)
	public void pendingDecision() throws InterruptedException {
		object1.pendingDecisionScreen();
		Thread.sleep(1000);
	}
	@Test(priority = 37)
	public void selectPendingDecision() {
		object1.selectPendingDecision();
	}
	@Test(priority = 38)
	public void updatePendingDecision() throws InterruptedException {
		object1.updatePendingDecision();
	}
	@Test(priority = 39)
	public void brandDecision() throws InterruptedException {
		object1.brandDecision();
	}
	@Test(priority = 40)
	public void brandDecisionRTV() {
		object1.brandDecisionRTV();
	}
	@Test(priority = 41)
	public void brandApprovalReferanceNo() throws InterruptedException {
		object1.brandApprovalReferanceNo();
	}
	@Test(priority = 42)
	public void brandDecisionCreditNo() throws InterruptedException {
		object1.brandDecisionCreditNo();
	}
	@Test(priority = 43)
	public void decisionCreditNoteAmount() throws InterruptedException {
		object1.decisionCreditAmount();
	}
	@Test(priority = 44)
	public void brandDecisionSubsmit() {
		object1.brandDecisionSubmit();
	}
	@Test(priority = 45)
	public void brandDecisionOkbutton() throws InterruptedException {
		object1.brandDecisionOkbutton();
	}

	@Test(priority = 46)
	public void clickOnDispositionlinkTest1() throws InterruptedException {
		object1.clickDispoaition2();
	}


}
