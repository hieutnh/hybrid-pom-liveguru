package pageOjects;

import org.openqa.selenium.WebDriver;
import commons.AbstractPage;
import pageUIs.CustomerInfoPageUI;

public class customerInfoPageObject extends AbstractPage  {
	WebDriver driver;

	public customerInfoPageObject(WebDriver driver) {
		this.driver = driver;
	}

		
	public String getFirstNameInTexBox() {
		waitToElementVisible(driver, CustomerInfoPageUI.FIRST_NAME_TEXTBOX);
		return getElementAttribute(driver, CustomerInfoPageUI.FIRST_NAME_TEXTBOX, "value");
	}

	public String getLastNameInTexBox() {
		waitToElementVisible(driver, CustomerInfoPageUI.LAST_NAME_TEXTBOX);
		return getElementAttribute(driver, CustomerInfoPageUI.LAST_NAME_TEXTBOX, "value");
	}

	public String getTextInDaytTextBox() {
		waitToElementVisible(driver, CustomerInfoPageUI.DAY_DROPDOWN);
		return getSelectedItemInDropdown(driver, CustomerInfoPageUI.DAY_DROPDOWN);
	}

	public String getTextInMonthtTextBox() {
		waitToElementVisible(driver, CustomerInfoPageUI.MONTH_DROPDOWN);
		return getSelectedItemInDropdown(driver, CustomerInfoPageUI.MONTH_DROPDOWN);
	}

	public String getTextInYearTextBox() {
		waitToElementVisible(driver, CustomerInfoPageUI.YEAR_DROPDOWN);
		return getSelectedItemInDropdown(driver, CustomerInfoPageUI.YEAR_DROPDOWN);
	}


	public boolean isSeclectedGenderMaleRadio() {
		waitToElementVisible(driver, CustomerInfoPageUI.GENDER_RADIO_BUTTON);
		return isElementDisplayed(driver, CustomerInfoPageUI.GENDER_RADIO_BUTTON);
	}

}
