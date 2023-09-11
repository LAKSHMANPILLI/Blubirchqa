package com.qe.project.pages;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qe.project.base.TestBase;

public class warehouseRTV extends TestBase{
	/*
	@FindBy(xpath = "//div[@class='pl-4 response-font col-sm-5 col-md-5 col-5']")
	private WebElement managementSystem;
	@FindBy(xpath = "(//div[@class='mt-3 text-color'])[2]")
	private WebElement disposition;
	
	/////////////\\\\\\\\\\\\\\\\\\\
	
	@FindBy(xpath = "//h4[text()='Brand Call Log']")
	
	private WebElement Brandcalllog;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement BCLcheckbox;
	@FindBy(xpath = "//span[text()='UPDATE']")
	private WebElement BCLupdate;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement BCLselectdata1;
	@FindBy(xpath = "(//span[@class='text-red-500'])[1]")
	private WebElement ParchasInvoice;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement ParchasUpdate;
	@FindBy(xpath = "(//span[@class='v-btn__content'])[3]")
	private WebElement AddDatafield;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement Selectdata2;
	@FindBy(xpath = "(//span[@class='text-red-500'])[3]")
	private WebElement DamageCertificate;
	@FindBy(xpath = "//div[@class='v-file-input__text']")
	private WebElement DamageUpload;
	@FindBy(xpath = "//span[text()='CANCEL']")
	private WebElement submitFirstScreen;
	@FindBy(xpath = "//span[text()='Disposition']")
	private WebElement disposition1;
	*/
	@FindBy(xpath = "//h4[text()='RTV']")
	private WebElement RTV;
//	@FindBy(xpath = "(//a[@class='v-tab v-tab--active']")
//	private WebElement pendingconfirmation;
	@FindBy(xpath = "(//i[@class='v-icon notranslate mdi mdi-checkbox-blank-outline theme--light'])[2]")
	private WebElement select;
	@FindBy(xpath = "//tr[contains(@class,'v-data-table__')]/child::td")
	private List<WebElement> selectOptionTexts;
	@FindBy(xpath = "//span[text()='UPDATE CONFIRMATION']")
	private WebElement updateconfirmation;
	//@FindBy(xpath ="//label[text()='Return Date']/following-sibling::input")
	@FindBy(xpath="//input[@aria-haspopup='true']")
	private WebElement returndate;
	@FindBy(xpath = "//div[@class='v-date-picker-table v-date-picker-table--date theme--light']//following-sibling::tr[2]/td")
	private WebElement selectdata;
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement cok;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement returnmethod;
	@FindBy(xpath = "//div[text()='Dispatch']")
	private WebElement dispatchscreen;
	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement documenttype;
	@FindBy(xpath = "//div[text()='Invoice']")
	private WebElement cinvoice;
	@FindBy(xpath = "//span[text()='Cancel']")
	private WebElement submitbtn;
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement submitOkbutton;
	public warehouseRTV() {
		PageFactory.initElements(driver,this);
	}
//	public WebdriverCommaLib() {
//		PageFactory.initElements(driver,this);
//	}
	/*
	public void clickOnDidposition() throws InterruptedException {
		Thread.sleep(2000);
		String managetext=managementSystem.getText();
		System.out.println("Page is verifiyed"+managetext);
		Assert.assertEquals(managetext,"Warehouse Management System");
		disposition.click();
		Thread.sleep(2000);
	}
	///////////\\\\\\\\\\\\\\\
	
	
	public void BCL() throws InterruptedException {
		Brandcalllog.click();
		Thread.sleep(2000);
	}
	public void SelectItem() throws InterruptedException {
		Thread.sleep(1000);
//		for (int i = 0; i <4; i++) {
//			Thread.sleep(2000);
			select.click();
			//Thread.sleep(1000);
			
		}
		//select.click();
	
	public void BCLUpdate() throws InterruptedException {
		Thread.sleep(2000);
		BCLupdate.click();
	}
	public void BCLSelectData1() {
		BCLselectdata1.click();
	}
	public void parchaseInvoice() {
		ParchasInvoice.click();
	}
	public void parchaseUpdate() throws InterruptedException {
		
		ParchasUpdate.click();
		Thread.sleep(1000);
		ParchasUpdate.sendKeys("test");
	}
	public void addDataField() {
		AddDatafield.click();
	}
	public void selectData2() {
		Selectdata2.click();
	}
	public void damagecertificate() {
		DamageCertificate.click();
	}
	public void damageUpload() throws InterruptedException, AWTException {
		DamageUpload.click();
		Robot r1=new Robot();
		r1.delay(1000);

    // This code is used for getting for all files
//		r1.keyPress(KeyEvent.VK_TAB);
//		r1.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r1.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r1.keyPress(KeyEvent.VK_ENTER);
//     for (int i=0;i<9;i++) {
//    	 r1.keyPress(KeyEvent.VK_TAB);
//    	 Thread.sleep(2000);
//     }
	//put the path to file in aclickbsoar
		StringSelection s=new StringSelection("stnn1122");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		//ctrl+V
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_CONTROL);//press the ctrl key
		r1.keyPress(KeyEvent.VK_V);//press ctrl v
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	public void submitFirst() {
		submitFirstScreen.click();
	}
	public void clickDispoaition2() {
		disposition1.click();
	}*/
	public void RTV() throws InterruptedException {
		Thread.sleep(1000);
		String rtvtextt=RTV.getText();
		System.out.println("Page is verifiyed"+ rtvtextt);
		Assert.assertEquals(rtvtextt,"RTV");
		RTV.click();
		Thread.sleep(1000);
	}
//	public void pendingconfirmation() {
//		pendingconfirmation.click();
//	}
	public void select() {
		select.click();
		int selectOptionTextsSize = selectOptionTexts.size();
		for(int i=1;i<selectOptionTextsSize;i++)
		{
			String selectOptionText = selectOptionTexts.get(i).getText();
			System.out.println(selectOptionText);
		}
		
		
	}
	
	public void updateconfirmation() {
		updateconfirmation.click();
	}
	public void returndate() throws InterruptedException {
		returndate.click();
		Thread.sleep(1000);
	}
	public void selectData() throws InterruptedException {
		selectdata.click();
		Thread.sleep(1000);
		
	}
	public void clickOnOK() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("//span[text()='OK' and @class='v-btn__content'].click()");
		cok.click();
		//Thread.sleep(5000);
	}
	public void Clickreturnmethod() {
		returnmethod.click();
	}
	public void clickdispatch() {
		dispatchscreen.click();
	}
	public void clickOndocument() {
		documenttype.click();
	}
	public void  clickOninvoice() throws InterruptedException {
		cinvoice.click();
		Thread.sleep(1000);
	}
	public void clickOnsubmit() {
		submitbtn.click();
	}
	public void submitOkbutton() {
		submitOkbutton.click();
		System.out.println("Return Date updated succussfully");
	}

}
