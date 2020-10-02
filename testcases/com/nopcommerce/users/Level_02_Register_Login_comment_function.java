package com.nopcommerce.users;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.AbstracPage;

public class Level_02_Register_Login_comment_function extends AbstracPage {
	WebDriver driver;
	Select select;
	String email, pass;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver_Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		email = "testthoima" + getRanDom() + "@gmail.com";
		pass = "123456";
	}

	@Test
	public void TC_01_HTML_Dropdown() {
		openPageUrl(driver, "https://demo.nopcommerce.com/register");
		clickToElement(driver, "//a[@class='ico-register']");
		clickToElement(driver, "//input[@id='gender-male']");
		sendkeyToElement(driver, "//input[@id='FirstName']", "test");
		sendkeyToElement(driver, "//input[@id='LastName']", "thoima");
		selectItemInDropdown(driver, "//select[@name='DateOfBirthDay']", "1");
		Assert.assertEquals(getAllElementInLocator(driver, "//select[@name='DateOfBirthDay']"), 32);
		selectItemInDropdown(driver, "//select[@name='DateOfBirthMonth']", "May");
		Assert.assertEquals(getAllElementInLocator(driver, "//select[@name='DateOfBirthMonth']"), 13);
		selectItemInDropdown(driver, "//select[@name='DateOfBirthYear']", "1980");
		Assert.assertEquals(getAllElementInLocator(driver, "//select[@name='DateOfBirthMonth']"), 112);
		sendkeyToElement(driver, "//input[@id='Email']", email);
		sendkeyToElement(driver, "//input[@id='Password']", pass);
		sendkeyToElement(driver, "//input[@id='ConfirmPassword']", pass);
		clickToElement(driver, "//input[@id='register-button']");
		getElementText(driver, "//div[@class='result']");
		Assert.assertEquals(getElementText(driver, "//div[@class='result']"), "Your registration completed");
		clickToElement(driver, "//a[@class='ico-account']");
		getSelectedItemInDropdown(driver, "//select[@name='DateOfBirthDay']");
		Assert.assertEquals(getSelectedItemInDropdown(driver, "//select[@name='DateOfBirthDay']"), "1");
		getSelectedItemInDropdown(driver, "//select[@name='DateOfBirthMonth']");
		Assert.assertEquals(getSelectedItemInDropdown(driver, "//select[@name='DateOfBirthMonth']"), "May");
		getSelectedItemInDropdown(driver, "//select[@name='DateOfBirthYear']");
		Assert.assertEquals(getSelectedItemInDropdown(driver, "//select[@name='DateOfBirthYear']"), "1980");
	}

	public int getRanDom() {
		Random rand = new Random();
		return rand.nextInt(999999);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}