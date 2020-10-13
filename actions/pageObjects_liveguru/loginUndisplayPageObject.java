package pageObjects_liveguru;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage;
import pageUIs.LoginPageUndisplayUI;

public class loginUndisplayPageObject extends AbstractPage {
	WebDriver driver;

	public loginUndisplayPageObject(WebDriver driver) {

		this.driver = driver;
	}

	public boolean isMyAccountUndisplay() {
		return isElementUndisplayed(driver, LoginPageUndisplayUI.HEADER_MYACCOUNT_LINK);
	}

	public void clickToAccount() {
		waitToElementClickAble(driver, LoginPageUndisplayUI.ACCOUNT_BUTTON);
		clickToElement(driver, LoginPageUndisplayUI.ACCOUNT_BUTTON);
	}

	public boolean isMyAccountDisplay() {
		waitToElementVisible(driver, LoginPageUndisplayUI.HEADER_MYACCOUNT_LINK);
		return isElementDisplayed(driver, LoginPageUndisplayUI.HEADER_MYACCOUNT_LINK);
	}

	public boolean isErrorMessageUndisplaySubscribe() {
		return isElementUndisplayed(driver, LoginPageUndisplayUI.ERROR_MESSAGE_TEXTBOX_SUBSCRIBE);		
	}

	public void clickSubscribe() {
		waitToElementClickAble(driver, LoginPageUndisplayUI.SUBSCRIBE_BUTTON);
		clickToElement(driver, LoginPageUndisplayUI.SUBSCRIBE_BUTTON);		
	}

	public boolean isErrorMessageDisplaySubscribe() {
		waitToElementVisible(driver, LoginPageUndisplayUI.ERROR_MESSAGE_TEXTBOX_SUBSCRIBE);
		return isElementDisplayed(driver, LoginPageUndisplayUI.ERROR_MESSAGE_TEXTBOX_SUBSCRIBE);		
	}



}
