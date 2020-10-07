package pageOjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class addressesPageObject extends AbstractPage {
	WebDriver driver;

	public addressesPageObject(WebDriver driver) {
		this.driver = driver;
	}

}