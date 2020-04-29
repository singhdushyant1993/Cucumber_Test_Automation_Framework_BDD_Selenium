/* Description:- This class is used to share data between different "stepsDefinitions" files of "src/test/java" folder.
 * This class acts as a common container among all "stepDefinitions" classes.For this we are using "picoContainer"
 * dependency.
 * 
 * Link:- "stepDefinitions" package inside "src/test/java" is using this class.
 * 
 */


package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {

	private WebDriverManager webDriverManager;
	
	private PageObjectManager pageObjectManager;
	
	public ScenarioContext scenarioContext;
	
	public TestContext() {
	
		webDriverManager = new WebDriverManager();
		
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		
		scenarioContext = new ScenarioContext();
	}
	
	public WebDriverManager getWebDriverManager() {
		
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		
		return pageObjectManager;
	}
	
}
