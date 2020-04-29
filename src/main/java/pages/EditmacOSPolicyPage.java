/* Description:- This class contains all the methods which are required to perform any operation on "EditmacOSPolicyPage".
 * 
 * Link:-1)"PageObjectManager.java" class inside "managers" package of "src/main/java" folder is using this class.
 * 		 2)"EditmacOSPolicySteps.java" class inside "stepDefinitions" package of "src/test/java" folder is using this class.
 * 
 */


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestUtil;


public class EditmacOSPolicyPage {

	private WebDriver driver;
	
	@FindBy(xpath = "//textarea[@data-form-element-name='description']")
	WebElement policyDescriptionTxtField;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(id = "add-macOS-policy")
	WebElement AddmacOSPolicyBtn;
	
	public EditmacOSPolicyPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void user_update_policy(String name, String policyDescription) {
	    
		WebElement policyNameEditBtn = driver.findElement(By.xpath("//*[text()='"+name+"']//parent::span//parent::div//child::span[@title='Configure']"));
		
		policyNameEditBtn.click();
		
		policyDescriptionTxtField.clear();
		
		policyDescriptionTxtField.sendKeys(policyDescription);
		
	}
	
	public void user_clicks_on_save_button() {
	    
		saveBtn.click();
		
		TestUtil.webDriverWait(driver, AddmacOSPolicyBtn, 90);
		
	}
	
	
}
