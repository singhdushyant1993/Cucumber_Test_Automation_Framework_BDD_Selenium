/* Description:- This class contains all the methods which are required to perform any operation on "MobileAdminPage".
 * 
 * Link:-1)"PageObjectManager.java" class inside "managers" package of "src/main/java" folder is using this class.
 * 		 2)"MobileAdminSteps.java" class inside "stepDefinitions" package of "src/test/java" folder is using this class.
 * 
 */


package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.ConfigFileReader;
import util.TestUtil;

public class MobileAdminPage {

	WebDriver driver;
	LoginPage loginPage;
	
	@FindBy(xpath = "//*[@data-item='dashboard']")
	WebElement dashboardLbl;
	
	@FindBy(xpath = "//*[@class='nav-menu' and @data-item='policy']")
	WebElement policyLabel;
	
	@FindBy(xpath = "//*[@class='button big primary -js-cancel-button']")
	WebElement closeBtn;
	
	@FindBy(xpath = "//*[@class='nav-menu-list-item mobile-portal']")
	WebElement zappLabel;
	
	@FindBy(xpath = "//*[@class='nav-menu-header-label' and text()='App Profiles']")
	WebElement AppProfilesLbl;
	
	public MobileAdminPage(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions	
	
	public void navigateTo_HomePage(LoginPage loginPage) {
		
		loginPage.user_is_on_login_page();
		loginPage.user_enters_username_and_password(ConfigFileReader.getInstance().getUsername(), ConfigFileReader.getInstance().getPassword());
		loginPage.user_clicks_on_login_button();
		loginPage.verify_login_to_admin_portal();
	}
	
	public void user_close_dialog_box() {
		
		TestUtil.webDriverWait(driver, closeBtn, 150);
		if (closeBtn.isEnabled()) {
			closeBtn.click();
		}
	}
	
	public void user_clicks_on_policy_lbl() {
		
		Actions action = new Actions(driver);
		action.moveToElement(policyLabel).build().perform();
	}
	
	public void user_clicks_on_zapp_portal_lbl() {
		
		TestUtil.webDriverWait(driver, zappLabel, 10);
		zappLabel.click();
	}
	
	public void verify_login_to_mobile_admin_portal() {
		
		TestUtil.webDriverWait(driver, AppProfilesLbl, 120);
		Assert.assertTrue(AppProfilesLbl.isDisplayed());
	}
	
	
}//class
