package com.qe.project.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qe.project.base.TestBase;
import com.qe.project.pages.Logout_In;
import com.qe.project.pages.Sign_In;

public class Logout_InTest extends TestBase{
	Logout_In kl;
	@BeforeMethod
	public void Logout() {
	   kl = new Logout_In();
	}
	@Test(priority = 14)
	public void logout() {
		kl.logout();
	}
     @Test(priority = 15)
	public void Logout_Test() {
		kl.logout1();
	}

}
