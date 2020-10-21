package driverFactory;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();
//	protected WebDriver driver;

	protected abstract void createDriver();

//	public WebDriver getUrl(String url) {
//		if (driver == null) {
//			createDriver();
//		}
//		driver.get(url);
//		return driver;
//	}
//	
//	public WebDriver quitDriver() {
//		if (driver != null) {
//			driver.quit();
//			driver = null;
//		}
//		return driver;
//	}
	public WebDriver getUrl(String url) {
		if (getDriver() == null) {
			createDriver();
		}
		getDriver().get(url);
		return getDriver();

	}

	public WebDriver quitDriver() {
		if (getDriver() != null) {
			removeDriver();
			setDriver(null);
		}
		return getDriver();
	}

	//1 hàm của lib threadLocalDriver. xóa các luồng sau khi chạy xong browser giải phóng dữ liệu(ram)
	public void removeDriver() {
		getDriver().quit();
		threadLocalDriver.remove();
	}

	//thay thế hàm (driver.)
	protected WebDriver getDriver() {
		return threadLocalDriver.get();
	}

	//Thay thể hàm khởi tạo của driver (driver = new...)
	protected void setDriver(WebDriver driver) {
		threadLocalDriver.set(driver);
	}
}
