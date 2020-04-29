/* Description:- All the steps mentioned in "01_LoginPage.feature" inside "features" folder of "src/main/resources" folder are declared here.
 * 
 * Link:- "01_LoginPage.feature" inside "features" folder of "src/main/resources" folder is using this class.
 * 
 */


package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import managers.ConfigFileReader;
import pages.LoginPage;

public class LoginPageSteps {

	TestContext testContext;
	LoginPage loginPage;
	
	public LoginPageSteps(TestContext context) {
	
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {

		loginPage.user_is_on_login_page();
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
	 
		loginPage.user_enters_username_and_password(ConfigFileReader.getInstance().getUsername(), ConfigFileReader.getInstance().getPassword());
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		
		loginPage.user_clicks_on_login_button();
	}

	@Then("^verify login to admin portal$")
	public void verify_login_to_admin_portal() {
	 
		loginPage.verify_login_to_admin_portal();
	}
	
	
}
