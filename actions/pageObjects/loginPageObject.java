package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class loginPageObject extends AbstractPage {
	WebDriver driver;

	public loginPageObject(WebDriver driver) {

		this.driver = driver;
	}

	public void inputUserNameTextBox(String username) {
		waitToElementVisible(driver, LoginPageUI.USERNAME_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.USERNAME_TEXTBOX, username);
		
	}

	public void inputPasswordTextBox(String pass) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, pass);
	}

	//có th�? mang qua AbstractPage nếu b�? lặp lại nhiều lần
	public managerCustomersObject clickLoginButton() {
		waitToElementClickAble(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return PageGeneratorManager.getmanagerCustomersPage(driver);

	}

}
