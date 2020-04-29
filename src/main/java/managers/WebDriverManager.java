/* Description:- This class is managing webDriver.Its role is to provide a webDriver instance when asked and also
 * to make sure that no two instance run at a single time.
 * 
 * Link:- "TestContext.java" in "cucumber" package of "src/test/java" is using this class.
 * 
 */


package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import enums.DriverType;

public class WebDriverManager {
	
	private WebDriver driver;
	
	private static DriverType driverType;
	
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
	
	//implement constructor
	public WebDriverManager() {
	
		driverType = ConfigFileReader.getInstance().getBrowser();
		
	}
	
	public WebDriver getDriver() {
		
		if (driver == null) driver = createDriver();
		
		return driver;
		
	}
	
	private WebDriver createDriver() {
		
		switch (driverType) {
		case FIREFOX:
			System.setProperty(FIREFOX_DRIVER_PROPERTY, ConfigFileReader.getInstance().getDriverPath());
			driver = new FirefoxDriver();
		    break;
		case CHROME:
			System.setProperty(CHROME_DRIVER_PROPERTY, ConfigFileReader.getInstance().getDriverPath());
			driver = new ChromeDriver();
			break;
		case SAFARI:
			driver = new SafariDriver();
			break;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public void tearDown() {
		
		driver.quit();
		driver = null;
	}
	
}
