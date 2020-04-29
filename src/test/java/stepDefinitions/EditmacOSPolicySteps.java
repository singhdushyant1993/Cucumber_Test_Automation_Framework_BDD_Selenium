/* Description:- All the steps mentioned in "04_EditmacOSPolicyPage.feature" inside "features" folder of "src/main/resources" folder are declared here.
 * 
 * Link:- "04_EditmacOSPolicyPage.feature" inside "features" folder of "src/main/resources" folder is using this class.
 * 
 */


package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pages.EditmacOSPolicyPage;

public class EditmacOSPolicySteps {
	
	TestContext testContext;
	EditmacOSPolicyPage editmacOSPolicyPage;
	
	public EditmacOSPolicySteps(TestContext context) {
	
		testContext = context;
		editmacOSPolicyPage = testContext.getPageObjectManager().getEditmacOSPolicyPage();
	}
	
	@Then("^user update policy \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_update_policy(String name, String policyDescription) {
	   
		editmacOSPolicyPage.user_update_policy(name, policyDescription);
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() {
	
		editmacOSPolicyPage.user_clicks_on_save_button();
	}
	
}
