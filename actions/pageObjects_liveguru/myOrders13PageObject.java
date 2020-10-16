package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class myOrders13PageObject extends AbstractPage {
	WebDriver driver;

	public myOrders13PageObject(WebDriver driver) {

		this.driver = driver;
	}

	public register13PageObject clickRegisterHeader() {
		return PageGeneratorManager.getregisterPage13(driver);
	}

	public void clickAccountHeader() {
		
	}

}
