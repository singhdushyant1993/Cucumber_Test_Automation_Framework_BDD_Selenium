/* Description:- All the steps mentioned in "03_AddmacOSPolicyPage.feature" inside "features" folder of "src/main/resources" folder are declared here.
 * 
 * Link:- "03_AddmacOSPolicyPage.feature" inside "features" folder of "src/main/resources" folder is using this class.
 * 
 */


package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AddmacOSPolicyPage;

public class AddmacOSPolicySteps {

	TestContext testContext;
	AddmacOSPolicyPage addmacOSPolicyPage;
	
	public AddmacOSPolicySteps(TestContext context) {
	
		testContext = context;
		addmacOSPolicyPage = testContext.getPageObjectManager().getAddmacOSPolicyPage();
	}
	
	@Given("^user is on Mobile Admin Page$")
	public void user_is_on_Mobile_Admin_Page() {
		
		addmacOSPolicyPage.navigateTo_ZappHomePage(testContext.getPageObjectManager().getMobileAdminPage(), testContext.getPageObjectManager().getLoginPage());
	}

	@Then("^user clicks on App Profiles lbl$")
	public void user_clicks_on_App_Profiles_lbl() {
	    
		addmacOSPolicyPage.user_clicks_on_App_Profiles_lbl();
	}

	@Then("^user clicks on macOS Platform Lbl$")
	public void user_clicks_on_macOS_Platform_Lbl() {
	
		addmacOSPolicyPage.user_clicks_on_macOS_Platform_Lbl();
	}

	@Then("^user clicks on Add macOS Policy button$")
	public void user_clicks_on_Add_macOS_Policy_button() {
	 
		addmacOSPolicyPage.user_clicks_on_Add_macOS_Policy_button();
	}

	@Then("^user enter details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enter_details(String name, String ruleOrder, String enable, String groups, String logoutPassword, String disablePassword, String customPACUrl, String forwardingProfile, String installCert, String logMode, String logFileSize, String reactiveInternetSecurity, String hostName, String z_tunnelConfig, String destinationInclusions, String policyDescription) throws InterruptedException {
	  
		addmacOSPolicyPage.user_enter_details(name, ruleOrder, enable, groups, logoutPassword, disablePassword, customPACUrl, forwardingProfile, installCert, logMode, logFileSize, reactiveInternetSecurity, hostName, z_tunnelConfig, destinationInclusions, policyDescription);
	}

	@Then("^user clicks on save btn$")
	public void user_clicks_on_save_btn() throws InterruptedException {
	  
		addmacOSPolicyPage.user_clicks_on_save_btn();
	}

	
}
