package com.liveguru.users;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import pageOjects.PageGeneratorManager;
import pageOjects.loginPageObject;
import pageOjects.managerCustomersObject;

public class Level_01_Search_Data_Rest_Parameter extends AbstractTest {
	WebDriver driver;

	// run all browsers
	@Parameters("Browser")
	@BeforeClass
	public void beforeClass(String BrowserName) {
		driver = getBrowserDriver(BrowserName);

		loginPage = PageGeneratorManager.getLoginPage(driver);

		loginPage.inputUserNameTextBox("user01");

		loginPage.inputPasswordTextBox("guru99com");

		managerCustomersPage = loginPage.clickLoginButton();

		managerCustomersPage.clickToClosePopupIncoming();

	}

	
	public void TC_01_Register() {

		managerCustomersPage.inputManagerCustomerTableColumnName("Name", "taotest taotest1");
		managerCustomersPage.inputManagerCustomerTableColumnName("Email", "taotest1@gmail.com");
		managerCustomersPage.inputManagerCustomerTableColumnName("Telephone", "1234 56789");
		managerCustomersPage.inputManagerCustomerTableColumnName("ZIP", "20000");
		managerCustomersPage.clickSearchDataButton("Search");
//		managerCustomersPage.loadingDisable();
//		managerCustomersPage.clickSearchDataButton("Reset Filter");
//		managerCustomersPage.loadingDisable();



		Assert.assertTrue(managerCustomersPage.isDisplayData("Name", "taotest taotest1", "1"));
		Assert.assertTrue(managerCustomersPage.isDisplayData("Email", "taotest1@gmail.com", "1"));
		Assert.assertTrue(managerCustomersPage.isDisplayData("Telephone", "1234 56789", "1"));
		Assert.assertTrue(managerCustomersPage.isDisplayData("ZIP", "20000", "1"));
	}
	
	@Test
	public void TC_02_Count_Element() {
		managerCustomersPage.selectItemToListCountry("Country", "Vietnam");
		managerCustomersPage.clickSearchDataButton("Search");
		Assert.assertEquals(managerCustomersPage.isDisplayAllItemIsVietnam("Country", "Vietnam"), "20");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	private loginPageObject loginPage;
	private managerCustomersObject managerCustomersPage;

}