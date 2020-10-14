package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {

	public static loginDatatablePageObject getLoginDataTablePage(WebDriver driver) {
		return new loginDatatablePageObject(driver);
	}

	public static managerCustomersObject getmanagerCustomersPage(WebDriver driver) {
		return new managerCustomersObject(driver);
	}
	
	public static loginUndisplayPageObject getLoginUndisplayPage(WebDriver driver) {
		return new loginUndisplayPageObject(driver);
	}
	
	public static tvPageObject getTvPage(WebDriver driver) {
		return new tvPageObject(driver);
	}

}
