package pageOjects;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static loginPageObject getLoginPage(WebDriver driver) {
		return new loginPageObject(driver);
	}

	public static managerCustomersObject getmanagerCustomersPage(WebDriver driver) {
		return new managerCustomersObject(driver);
	}

}
