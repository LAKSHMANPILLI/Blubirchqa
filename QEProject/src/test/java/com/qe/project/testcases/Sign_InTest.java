package com.qe.project.testcases;


import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;

import com.qe.project.base.TestBase;
import com.qe.project.pages.Excel1;
import com.qe.project.pages.Sign_In;

public class Sign_InTest extends TestBase {

	Sign_In lb;
	//Excel1 e;
	@BeforeSuite
	public void setUp() throws InterruptedException {

		initialization();
		// login = new Sign_In();
	}

	@BeforeTest
	public void SignIn() {

		lb = new Sign_In();

	}
	@Test(priority = 1)
	public void loginTest() throws InterruptedException, EventException, IOException {
	//lb.loginWithValid("lakshman_central","blubirch123");
		Thread.sleep(500);
		lb.loginWithValid(lb.getExcelData("login",1,0),lb.getExcelData("login", 1, 1));
	}
	/*
	@DataProvider(name="loginWithValid")
	public Object[][] loginWithValid(){
		Object[][] data=new Object[0][1];
		data[0][0]="lakshman_central";
		data[0][1]="blubirch123";
		return data;
	}*/


	@AfterSuite
	public void tearDown() {
		// driver.quit();

	}
}
