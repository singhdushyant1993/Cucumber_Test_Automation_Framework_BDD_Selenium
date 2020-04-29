/* Description:- This class contains all the methods which are required to perform any operation on "LoginPage".
 * 
 * Link:-1)"PageObjectManager.java" class inside "managers" package of "src/main/java" folder is using this class.
 * 		 2)"LoginPageSteps.java" class inside "stepDefinitions" package of "src/test/java" folder is using this class.
 * 
 */


package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.ConfigFileReader;
import util.TestUtil;

public class LoginPage {

	WebDriver driver;
	
	//PageFactory or ObjectRepository
	
		@FindBy(id="login-panel-input-email")
		WebElement username;
		
		@FindBy(id="login-panel-input-password")
		WebElement password;
		
		@FindBy(id="login-panel-signin-button")
		WebElement loginBtn;
		
		@FindBy(xpath = "//img[@src='img/zscaler_login_logo.png']")
		WebElement zscalerLogo;
		
		@FindBy(xpath = "//*[@data-item='dashboard']")
		WebElement dashboardLbl;
		
		//Initialize the page objects
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
		public void user_is_on_login_page() {

			driver.get(ConfigFileReader.getInstance().getUrl());
			String title = driver.getTitle();
			Assert.assertEquals(title, "Zscaler Cloud Portal");
			//Assert.assertTrue(zscalerLogo.isDisplayed());
		}
		
		public void user_enters_username_and_password(String username,String password) {
			
			this.username.sendKeys(username);
			this.password.sendKeys(password);
		}
		
		public void user_clicks_on_login_button() {
			
			loginBtn.click();
		}
		
		public void verify_login_to_admin_portal() {

			TestUtil.webDriverWait(driver, dashboardLbl, 150);
			boolean flag = dashboardLbl.isDisplayed();
			Assert.assertTrue(flag);
		}
	
	
}//class
