package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class home13PageObject extends AbstractPage {
	WebDriver driver;

	public home13PageObject(WebDriver driver) {

		this.driver = driver;
	}

	public register13PageObject clickRegisterHeader() {
		return PageGeneratorManager.getregisterPage13(driver);
	}

	public void clickAccountHeader() {
		
	}

}
