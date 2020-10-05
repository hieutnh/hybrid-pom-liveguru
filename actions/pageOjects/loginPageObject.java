package pageOjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUI;

public class loginPageObject extends AbstractPage {
	WebDriver driver;

	public loginPageObject(WebDriver driver) {

		this.driver = driver;
	}

	
	public void clicktoLoginButton() {
		waitToElementClickAble(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}


	public void inputToEmailTextBox(String email) {
		waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
	}


	public void inputToPasswordTextBox(String pass) {
		waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, pass);
	}

}
