package com.liveguru.users;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.liveguru.data.DataEndUser;
import com.relevantcodes.extentreports.LogStatus;

import commons.AbstractTest;
import driverFactory.DriverManager;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.register13PageObject;
import reportConfig.ExtentTestManager_2_Capture;

public class Level_16_Data_Generate_2_Creat_method extends AbstractTest {
	private WebDriver driver;
	DriverManager driverManager;
	Select select;
	public static String email, pass, tendem;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeTest
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);

		tendem = "midlename";
		email = "testthoima" + getRanDom() + "@gmail.com";
		pass = DataEndUser.Register.passWord;

	}

	@Test
	public void TC_01_Register(Method method) {
		homePage = PageGeneratorManager.getHomePage13(driver);
		homePage.clickAccountHeader();
		register13Page = homePage.clickRegisterHeader();

		register13Page.inputAllFielsRegister(DataEndUser.Register.firstName, "firstname");
		register13Page.inputAllFielsRegister(tendem, "middlename");
		register13Page.inputAllFielsRegister(DataEndUser.Register.lastName, "lastname");
		register13Page.inputAllFielsRegister(DataEndUser.Register.email, "email_address");
		register13Page.inputAllFielsRegister(pass, "password");
		register13Page.inputAllFielsRegister(pass, "confirmation");
		myDashBoard13Page = register13Page.clickRegisterButton();

		removeDriver();
	}


	private home13PageObject homePage;
	private register13PageObject register13Page;
	private myDashBoard13PageObject myDashBoard13Page;
}