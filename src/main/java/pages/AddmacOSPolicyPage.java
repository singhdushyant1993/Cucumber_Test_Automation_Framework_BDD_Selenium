/* Description:- This class contains all the methods which are required to perform any operation on "AddmacPolicyPage".
 * 
 * Link:-1)"PageObjectManager.java" class inside "managers" package of "src/main/java" folder is using this class.
 * 		 2)"AddmacOSPolicySteps.java" class inside "stepDefinitions" package of "src/test/java" folder is using this class.
 * 
 */


package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import util.TestUtil;


public class AddmacOSPolicyPage {

	private WebDriver driver;
	
	@FindBy(xpath = "//*[@class='nav-menu-header-label' and text()='App Profiles']")
	WebElement appProfilesLbl;
	
	@FindBy(id = "add-macOS-policy")
	WebElement addMacOSPolicyBtn;
	
	@FindBy(xpath = "//input[@data-form-element-name='name']")
	WebElement nameTextField;

	public List<WebElement> ruleOrderList;
	public List<WebElement> logModeList;
	public List<WebElement> forwardingProfileList;
	public List<WebElement> groupsList;
	
	@FindBy(xpath = "//*[@class='nav-menu-header-label' and text()='App Profiles']")
	WebElement AppProfilesLbl;
	
	@FindBy(id = "add-windows-policy")
	WebElement addWindowsPolicyBtn;
	
	@FindBy(xpath = "//*[text()='macOS' and @class='nav-menu-list-item']")
	WebElement macOSLbl;
	
	@FindBy(xpath = "//*[@class='toggle-button off' and @data-form-id='macOS-policy-edit' and @data-form-element-name='active']")
	WebElement enableBtn;
	
	@FindBy(id = "macOS-logout-password")
	WebElement logoutPasswordTxtField;
	
	@FindBy(id = "macOS-disable-password")
	WebElement disablePasswordTxtField;
	
	@FindBy(xpath = "//input[@data-form-element-name='pac_url']")
	WebElement customPACUrlTxtField;
	
	@FindBy(xpath = "//span[@data-form-element-name='install_ssl_certs']")
	WebElement installCert;
	
	@FindBy(id = "macOS-logfilesize")
	WebElement logFileSize;
	
	@FindBy(xpath = "//input[@data-form-element-name='reactivateWebSecurityMinutes']")
	WebElement reactiveInternetSecurity;
	
	@FindBy(id = "vpnGateway-builder-input-macOS")
	WebElement hostName;
	
	@FindBy(id = "exclude-builder-input-macOS")
	WebElement z_tunnelConfig;
	
	@FindBy(id = "include-builder-input-macOS")
	@CacheLookup
	WebElement destinationInclusions;
	
	@FindBy(xpath = "//textarea[@data-form-element-name='description']")
	WebElement policyDescriptionTxtField;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement saveBtn;
	
	@FindBy(id = "add-macOS-policy")
	WebElement AddmacOSPolicyBtn;
	
	@FindBy(xpath = "//span[text()='Done']")
	WebElement doneBtn;
	
	@FindBy(xpath = "//*[@class='radio-button-text' and text()='All']")
	WebElement allBtn;
	
	@FindBy(xpath = "//div[@data-form-element-name='macOS-ruleOrder']")
	WebElement ruleOrderBtn;
	
	@FindBy(xpath = "//div[@data-form-element-name='macOS-onnet-filter']")
	WebElement defaultBtn;

	@FindBy(xpath = "//*[@class='radio-button-text' and text()='Selected']")
	WebElement selectedBtn;
	
	@FindBy(xpath = "//*[@class='dropdown-button-label -js-dropdown-button-label' and text()='Select']")
	WebElement selectBtn;
	
	public AddmacOSPolicyPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateTo_ZappHomePage(MobileAdminPage mobileAdminPage,LoginPage loginPage) {
		
		mobileAdminPage.navigateTo_HomePage(loginPage);
		mobileAdminPage.user_close_dialog_box();
		mobileAdminPage.user_clicks_on_policy_lbl();
		mobileAdminPage.user_clicks_on_zapp_portal_lbl();
		mobileAdminPage.verify_login_to_mobile_admin_portal();
	}
	
	public void user_clicks_on_App_Profiles_lbl() {
		
		appProfilesLbl.click();
	}
	
	public void user_clicks_on_macOS_Platform_Lbl() {
		
		TestUtil.webDriverWait(driver, addWindowsPolicyBtn, 90);
		macOSLbl.click();
		TestUtil.webDriverWait(driver, addMacOSPolicyBtn, 90);
	}
	
	public void user_clicks_on_Add_macOS_Policy_button() {
		
		addMacOSPolicyBtn.click();
	}
	
	public void user_enter_details(String name, String ruleOrder, String enable, String groups, String logoutPassword, String disablePassword, String customPACUrl, String forwardingProfile, String installCert, String logMode, String logFileSize, String reactiveInternetSecurity, String hostName, String z_tunnelConfig, String destinationInclusions, String policyDescription) throws InterruptedException {
	 
		validateNameTextField(name);
		
		validateSetRuleOrder(ruleOrder);

		validateEnableButtonClick(enable);
		
		validateSetGroups(groups);	
		
		validateLogoutPasswordField(logoutPassword);
		
		validateDisablePasswordField(disablePassword);
		
		validateCustomPACUrlField(customPACUrl);
		
		validateSetForwardingProfile(forwardingProfile);
		
		validatePolicyDescription(policyDescription);
	
	}
	
	public void user_clicks_on_save_btn() throws InterruptedException {
	
		validateSaveButtonClick();
	}
	
	
	public void validateMacOSLblClick() {
		
		TestUtil.webDriverWait(driver, AppProfilesLbl, 60);
		AppProfilesLbl.click();
		TestUtil.webDriverWait(driver, addWindowsPolicyBtn, 90);
		macOSLbl.click();
	}
	
	public void validateAddMacOSPolicyBtnClick() {
		
		TestUtil.webDriverWait(driver, AddmacOSPolicyBtn, 90);
		AddmacOSPolicyBtn.click();
	}
	
	public void validateNameTextField(String name) {
		
		nameTextField.sendKeys(name);
	}
	
	public void validateSetRuleOrder(String ruleOrder) {
		
		if (!ruleOrder.contains("Default")) {
			
			ruleOrderBtn.click();
			
			ruleOrderList = driver.findElements(By.xpath("//div[@data-form-element-name='macOS-ruleOrder']//child::li"));

			for(int i=0;i<ruleOrderList.size();i++) {
				
				if(ruleOrderList.get(i).getText().equals(ruleOrder)) {
					
					ruleOrderList.get(i).click();
					
					break;
					
				}
				
			}
			
		}
			
	}//func
	
	public void validateEnableButtonClick(String enable) {
		
			if (enable.equals("Yes") || enable.equals("yes") || enable.equals("YES")) {
			
			enableBtn.click();
						
			//((JavascriptExecutor)driver).executeScript("arguments[0].click();", enableBtn);
	
		}	

	}//func
	
	public void validateSetGroups(String groups) {
		
		if (groups.equals("Default") || groups.equals("default") || groups.equals("") || groups.equals("None")) {
			
			
			
		}
		
		else if(groups.equals("All")) {
			
			allBtn.click();
			
		}
		
		else {
			
			selectedBtn.click();
			
			selectBtn.click();
			
			groupsList = driver.findElements(By.xpath("//div[@id='load-macOS-groups']//child::li"));
			
			if (groups.contains(",")) {
				
				String groupsArr[] = groups.split(",");
				
				for (int i=0;i<groupsArr.length;i++) {
					
					for (int k=0;k<groupsList.size();k++) {
						
						if(groupsArr[i].equals(groupsList.get(k).getText())) {	
							
							groupsList.get(k).click();
							
							break;
							
							}
						
						}//innerLoop
						
					}//loop
			
			}//if
			
			else {
				 	
					for (int k=0;k<groupsList.size();k++) {
						
						if(groups.equals(groupsList.get(k).getText())) {
							
							groupsList.get(k).click();
							
							break;
							
							}
						
						}//innerLoop	
				
			}//else
			
			driver.findElement(By.xpath("//span[@class='button -js-mobile-save' and text()='Done']")).click();
			
		}//else
				
	}//func
	
	public void validateLogoutPasswordField(String logoutPassword) {
		
		TestUtil.webDriverWait(driver, logoutPasswordTxtField, 90);
		
		if (logoutPassword.contains(".")) {
						
			String logoutPasswordArr[] = logoutPassword.split("\\.");
			
			logoutPasswordTxtField.sendKeys(logoutPasswordArr[0]);
				
			
		} else {
			
			if (logoutPassword.equals("Default")) {
				
				
				
			} else {

				logoutPasswordTxtField.sendKeys(logoutPassword);
				
			}
			
		} 
		
	}//func
	
	public void validateDisablePasswordField(String disablePassword) {
		
		if (disablePassword.contains(".")) {
						
			String disablePasswordArr[] = disablePassword.split("\\.");
			
			disablePasswordTxtField.sendKeys(disablePasswordArr[0]);
				
			
		} else {
			
			if (disablePassword.equals("Default")) {
				
				
				
			} else {
				
				disablePasswordTxtField.sendKeys(disablePassword);
				
			}
			
		}
	
	}//func
	
	public void validateCustomPACUrlField(String customPACUrl) {
		
		if (customPACUrl.equals("Default") || customPACUrl.equals("None") || customPACUrl.equals("none") || customPACUrl.equals("NONE") || customPACUrl.equals("")) {
			
			
			
		} else {
			
			customPACUrlTxtField.sendKeys(customPACUrl);
			
		}
		
		
	}
	
	public void validateSetForwardingProfile(String forwardingProfile) throws InterruptedException {
		
		if (forwardingProfile.equals("Default")) {
			
			
			
		} else {
			
			defaultBtn.click();
			
			Thread.sleep(5000);
			
			forwardingProfileList = driver.findElements(By.xpath("//div[@id='macOS-onnet-filter']//child::li"));
			
			for (int i=0;i<forwardingProfileList.size();i++) {
				
				if(forwardingProfileList.get(i).getText().equals(forwardingProfile)) {
					
					forwardingProfileList.get(i).click();
					
					break;
					
				} else {
					
					if(forwardingProfileList.get(i).getText().equals("click to load more")) {
						
						driver.findElement(By.xpath("//li[@class='forwardingProfile-page-button']")).click();
						
						validateSetForwardingProfile(forwardingProfile);
						
					}
					
				}
				
			}//for
			
			
		}//else
		
	}//func
	
	public void validatePolicyDescription(String policyDescription) {
		
		policyDescriptionTxtField.sendKeys(policyDescription);
		
		
	}
	
	public void validateSaveButtonClick() throws InterruptedException {
		
		saveBtn.click();
		
		TestUtil.webDriverWait(driver, AddmacOSPolicyBtn, 90);
				
	}

	
}
