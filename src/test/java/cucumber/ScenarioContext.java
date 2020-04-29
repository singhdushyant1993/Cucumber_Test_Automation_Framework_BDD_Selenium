/* Description:- This class is used to share data between test scenarios.
 * 
 * Link:- "TestContext.java" in "cucumber" package of "src/test/java" is using this class.
 * 
 */


package cucumber;

import java.util.HashMap;
import java.util.Map;

import enums.Context;

public class ScenarioContext {

	private Map<String,Object> scenarioContextDict;
		
	public ScenarioContext() {
	
		scenarioContextDict = new HashMap<String, Object>();
	}
	
	public void setContext(Context key,Object value) {
		
		scenarioContextDict.put(key.toString(), value);
	}
	
	public Object getContext(Context key) {
		
		return scenarioContextDict.get(key.toString());
	}
	
	public boolean isContains(Context key) {
		
		return scenarioContextDict.containsKey(key.toString());
	}
	
	
}
