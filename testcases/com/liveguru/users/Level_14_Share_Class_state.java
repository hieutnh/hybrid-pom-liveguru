package com.liveguru.users;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import driverFactory.DriverManager;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.addressBook13PageObject;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.myApplications13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.myOrders13PageObject;
import pageObjects_liveguru.myWishlist13PageObject;
import pageObjects_liveguru.register13PageObject;

public class Level_14_Share_Class_state extends AbstractTest {
	private WebDriver driver;
	DriverManager driverManager;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeClass
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);

	}

	public void TC_01_Login() {

	}

	@Test
	public void TC_02_MyDashBoard() {

		log.info("MyDashBoard - Step 01: Click Address Book button");
		myDashBoard13Page.clickToAllLinkMyDashBoard13(driver, "Address Book");
		addressBook13Page = PageGeneratorManager.getAddressBook13Page(driver);

		log.info("MyDashBoard - Step 02: Click My Orders button");
		addressBook13Page.clickToAllLinkMyDashBoard13(driver, "My Orders");
		myOrders13Page = PageGeneratorManager.getMyOrderPage13(driver);

		log.info("MyDashBoard - Step 03: Click My Wishlist button");
		myOrders13Page.clickToAllLinkMyDashBoard13(driver, "My Wishlist");
		myWishlist13Page = PageGeneratorManager.getMyWishlist13Page(driver);

		log.info("MyDashBoard - Step 04: Click My Applications button");
		myWishlist13Page.clickToAllLinkMyDashBoard13(driver, "My Applications");
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