/* Description:- This class contains all the methods which are required to perform any operation on "DeletemacOSPolicyPage".
 * 
 * Link:-1)"PageObjectManager.java" class inside "managers" package of "src/main/java" folder is using this class.
 * 		 2)"DeletemacOSPolicySteps.java" class inside "stepDefinitions" package of "src/test/java" folder is using this class.
 * 
 */


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.TestUtil;

public class DeletemacOSPolicyPage {

	private WebDriver driver;
	
	@FindBy(id = "add-macOS-policy")
	WebElement macOSPolicyAddBtn;
	
	public DeletemacOSPolicyPage(WebDriver driver) {
	
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void user_clicks_on_delete_policy_btn(String name) {
	    
		WebElement policyNameDeleteBtn = driver.findElement(By.xpath("//*[text()='"+name+"']//parent::span//parent::div//child::span[@title='Delete']"));
		
		TestUtil.webDriverWait(driver, policyNameDeleteBtn, 60);
		
		policyNameDeleteBtn.click();
		
	}
	
	public void user_clicks_ok_btn() {
	 	
		WebElement okBtn = driver.findElement(By.xpath("//*[text()='OK']"));
		
		TestUtil.webDriverWait(driver, okBtn, 10);
		
		okBtn.click();
		
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TestUtil.webDriverWait(driver, macOSPolicyAddBtn, 90);
		
	}
	
	
}
