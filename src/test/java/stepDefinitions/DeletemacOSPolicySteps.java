/* Description:- All the steps mentioned in "05_DeletemacOSPolicyPage.feature" inside "features" folder of "src/main/resources" folder are declared here.
 * 
 * Link:- "05_DeletemacOSPolicyPage.feature" inside "features" folder of "src/main/resources" folder is using this class.
 * 
 */


package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import pages.DeletemacOSPolicyPage;

public class DeletemacOSPolicySteps {

	TestContext testContext;
	DeletemacOSPolicyPage deletemacOSPolicyPage;
	
	public DeletemacOSPolicySteps(TestContext context) {
	
		testContext = context;
		deletemacOSPolicyPage = testContext.getPageObjectManager().getDeletemacOSPolicyPage();
	}
	
	@Then("^user clicks on delete policy btn \"([^\"]*)\"$")
	public void user_clicks_on_delete_policy_btn(String name) {
	   
		deletemacOSPolicyPage.user_clicks_on_delete_policy_btn(name);
	}

	@Then("^user clicks ok btn$")
	public void user_clicks_ok_btn() {
	 
		deletemacOSPolicyPage.user_clicks_ok_btn();
	}
	
}
