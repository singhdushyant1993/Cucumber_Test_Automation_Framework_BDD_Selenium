/* Description:- This class is managing page objects.It returns an object when asked,if present else it creates a new
 * one and returns it.It also makes sure that no two objects of a particular page class exists at a single time.
 * 
 * Link:- "TestContext.java" in "cucumber" package of "src/test/java" is using this class.
 */


package managers;

import org.openqa.selenium.WebDriver;

import pages.AddmacOSPolicyPage;
import pages.DeletemacOSPolicyPage;
import pages.EditmacOSPolicyPage;
import pages.LoginPage;
import pages.MobileAdminPage;

public class PageObjectManager {
	
	private WebDriver driver;
	
	private LoginPage loginPage;
	
	private MobileAdminPage mobileAdminPage;
	
	private AddmacOSPolicyPage addmacOSPolicyPage;
	
	private EditmacOSPolicyPage editmacOSPolicyPage;
	
	private DeletemacOSPolicyPage deletemacOSPolicyPage;
	
	
	public PageObjectManager(WebDriver driver) {
	
		this.driver = driver;
		
	}
	
	public LoginPage getLoginPage() {
		
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
		
	}
	
	public MobileAdminPage getMobileAdminPage() {
		
		return (mobileAdminPage == null) ? mobileAdminPage = new MobileAdminPage(driver) : mobileAdminPage;
		
	}
	
	public AddmacOSPolicyPage getAddmacOSPolicyPage() {
		
		return (addmacOSPolicyPage == null) ? addmacOSPolicyPage = new AddmacOSPolicyPage(driver) : addmacOSPolicyPage;  
		
	}

	public EditmacOSPolicyPage getEditmacOSPolicyPage() {
		
		return (editmacOSPolicyPage == null) ? editmacOSPolicyPage = new EditmacOSPolicyPage(driver) : editmacOSPolicyPage;  
		
	}
	
	public DeletemacOSPolicyPage getDeletemacOSPolicyPage() {
		
		return (deletemacOSPolicyPage == null) ? deletemacOSPolicyPage = new DeletemacOSPolicyPage(driver) : deletemacOSPolicyPage;
		
	}
	
}
