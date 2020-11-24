package com.liveguru.users;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.liveguru.data.EndUserJson;
import com.relevantcodes.extentreports.LogStatus;

import commons.AbstractTest;
import commons.GlobalConstants;
import driverFactory.DriverManager;
import pageObjects_liveguru.PageGeneratorManager;
import pageObjects_liveguru.home13PageObject;
import pageObjects_liveguru.myDashBoard13PageObject;
import pageObjects_liveguru.register13PageObject;
import reportConfig.ExtentTestManager_2_Capture;

public class Level_16_Data_Generate_3_Export_File_AddCapture extends AbstractTest {
	private WebDriver driver;
	DriverManager driverManager;
	Select select;
	public static String email, pass, confirmpass, Ten, Ho, tendem;

	// run all browsers
	@Parameters({ "Browser", "url" })
	@BeforeTest
	public void beforeClass(String BrowserName, String appUrl) {
		driver = getBrowserDriver(BrowserName, appUrl);
		
		data = EndUserJson.getEndUserData(GlobalConstants.ROOT_FOLDER + "\\testData\\com\\liveguru\\data\\DataEndUser.json");
		
		Ten = data.getFirstName();
		Ho = data.getLastName();
		tendem = "midlename";
		email = data.getEmail() + getRanDom() + "@gmail.com";
		pass = data.getPassWord();

	}
	
	@Test
	public void TC_01_Register(Method method) {
		ExtentTestManager_2_Capture.startTest(method.getName(), "TC_01_Register");
		ExtentTestManager_2_Capture.getTest().log(LogStatus.INFO, "Register - Step 1: Open home page");
		homePage = PageGeneratorManager.getHomePage13(driver);
		ExtentTestManager_2_Capture.getTest().log(LogStatus.INFO, "Register - Step 2: Click account header");
		homePage.clickAccountHeader();
		register13Page = homePage.clickRegisterHeader();

		register13Page.inputAllFielsRegister(Ten, "firstname");
		register13Page.inputAllFielsRegister(tendem, "middlename");
		register13Page.inputAllFielsRegister(Ho, "lastname");
		register13Page.inputAllFielsRegister(email, "email_address");
		register13Page.inputAllFielsRegister(pass, "password");
		register13Page.inputAllFielsRegister(pass, "confirmation");
		myDashBoard13Page = register13Page.clickRegisterButton();

		removeDriver();
	}

	private home13PageObject homePage;
	private register13PageObject register13Page;
	private myDashBoard13PageObject myDashBoard13Page;
	private EndUserJson data;
}