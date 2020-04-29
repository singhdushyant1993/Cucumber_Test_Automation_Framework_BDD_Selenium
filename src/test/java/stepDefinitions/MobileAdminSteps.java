/* Description:- All the steps mentioned in "02_MobileAdminPage.feature" inside "features" folder of "src/main/resources" folder are declared here.
 * 
 * Link:- "02_MobileAdminPage.feature" inside "features" folder of "src/main/resources" folder is using this class.
 * 
 */


package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.MobileAdminPage;

public class MobileAdminSteps {

	TestContext testContext;
	MobileAdminPage mobileAdminPage;
	
	public MobileAdminSteps(TestContext context) {
		
		testContext = context;
		mobileAdminPage = testContext.getPageObjectManager().getMobileAdminPage();
	}
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
	
		mobileAdminPage.navigateTo_HomePage(testContext.getPageObjectManager().getLoginPage());
	}

	@Then("^user close dialog box$")
	public void user_close_dialog_box() {
	   
		mobileAdminPage.user_close_dialog_box();
	}

	@Then("^user clicks on policy lbl$")
	public void user_clicks_on_policy_lbl() {
	    
		mobileAdminPage.user_clicks_on_policy_lbl();
	}

	@Then("^user clicks on zapp portal lbl$")
	public void user_clicks_on_zapp_portal_lbl() {
	  
		mobileAdminPage.user_clicks_on_zapp_portal_lbl();
	}

	@Then("^verify login to mobile admin portal$")
	public void verify_login_to_mobile_admin_portal() {
	    
		mobileAdminPage.verify_login_to_mobile_admin_portal();
	}
	
	
}
