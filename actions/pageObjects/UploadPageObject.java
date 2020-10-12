package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;

public class UploadPageObject extends AbstractPage {
	WebDriver driver;

	public UploadPageObject(WebDriver driver) {
		this.driver = driver;
	}

}