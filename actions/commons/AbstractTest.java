package commons;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AbstractTest {
	private WebDriver driver;
	String sourceFolder = System.getProperty("user.dir");

	protected WebDriver getBrowserDriver(String BrowserName) {

		if (BrowserName.equalsIgnoreCase("firefox_ui")) {
			System.setProperty("webdriver.gecko.driver", sourceFolder + "\\Driver_Browser\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (BrowserName.equalsIgnoreCase("chrome_ui")) {
			System.setProperty("webdriver.chrome.driver", sourceFolder + "\\Driver_Browser\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			// dissable infobars chrome
			options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
		} else if (BrowserName.equalsIgnoreCase("firefox_headless")) {
			System.setProperty("webdriver.gecko.driver", sourceFolder + "\\Driver_Browser\\geckodriver.exe");
			// chạy firefox headless
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);
			driver = new FirefoxDriver(options);
		} else if (BrowserName.equalsIgnoreCase("chrome_headless")) {
			System.setProperty("webdriver.chrome.driver", sourceFolder + "\\Driver_Browser\\chromedriver.exe");
			// chạy chrome headless
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("window-size=1366x768");
			driver = new ChromeDriver(options);
		} else {
			throw new RuntimeException("Please input valid browser name");
		}
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	protected int getRanDom() {
		Random rand = new Random();
		return rand.nextInt(999999);
	}
}
