package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.addressBook13PageObject;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.myApplications13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.myOrders13PageObject;
import pageObjects_liveguru.myWishlist13PageObject;
import pageObjects_liveguru.register13PageObject;

public class Level_13_Share_Class_state extends AbstractTest {
	WebDriver driver;
	Select select;
	String email, pass, confirmpass, Ten, Ho, tendem;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);

		Ten = "Hoang";
		Ho = "Khoi";
		tendem = "midlename";
		email = "testthoima" + getRanDom() + "@gmail.com";
		pass = "123456";
		confirmpass = "123456";

	}

	@Test
	public void TC_01_Register() {
		homePage = PageGeneratorManager.getHomePage13(driver);
		homePage.clickAccountHeader();
		register13Page = homePage.clickRegisterHeader();

		register13Page.inputAllFielsRegister(Ten, "firstname");
		register13Page.inputAllFielsRegister(tendem, "middlename");
		register13Page.inputAllFielsRegister(Ho, "lastname");
		register13Page.inputAllFielsRegister(email, "email_address");
		register13Page.inputAllFielsRegister(pass, "password");
		register13Page.inputAllFielsRegister(confirmpass, "confirmation");

	}

	@Test
	public void TC_02_MyDashBoard() {
		myDashBoard13Page = register13Page.clickRegisterButton();

		myDashBoard13Page.clickToAllLinkMyDashBoard13(driver, "3");
		addressBook13Page = PageGeneratorManager.getAddressBook13Page(driver);

		addressBook13Page.clickToAllLinkMyDashBoard13(driver, "4");
		myOrders13Page = PageGeneratorManager.getMyOrderPage13(driver);

		myOrders13Page.clickToAllLinkMyDashBoard13(driver, "8");
		myWishlist13Page = PageGeneratorManager.getMyWishlist13Page(driver);
		
		myWishlist13Page.clickToAllLinkMyDashBoard13(driver, "9");
		myDashBoard13Page = PageGeneratorManager.getmyDashBoardPage13(driver);

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private home13PageObject homePage;
	private register13PageObject register13Page;
	private myDashBoard13PageObject myDashBoard13Page;
	private addressBook13PageObject addressBook13Page;
	private myOrders13PageObject myOrders13Page;
	private myWishlist13PageObject myWishlist13Page;
	private myApplications13PageObject myApplications13Page;

}