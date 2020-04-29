/* Description:- This is a config file reader class.Its a singleton class so that user can access its methods 
 * any where in the project directly.
*/


package managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import enums.DriverType;

public class ConfigFileReader {

	private static ConfigFileReader configFileReader;
	
	private Properties prop;
	
	private final String configFilePath = System.getProperty("user.dir")+"/src/main/java/config//config.properties";
	
	private ConfigFileReader() {
		
		try {
			
			FileInputStream ip = new FileInputStream(configFilePath);
			
			prop = new Properties();
			
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static ConfigFileReader getInstance() {
		
		if (configFileReader == null) configFileReader = new ConfigFileReader();
		
		return configFileReader;
		
	}
	
	public String getDriverPath() {
				
		return prop.getProperty("webDriverPath");
		
	}
	
	public DriverType getBrowser() {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals(null) || browserName.equalsIgnoreCase("chrome")) return DriverType.CHROME;
		else if (browserName.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if (browserName.equalsIgnoreCase("safari")) return DriverType.SAFARI;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}

	public String getUrl() {
		
		return prop.getProperty("url");
		
	}
	
	public String getUsername() {
		
		return prop.getProperty("username");
		
	}
	
	public String getPassword() {

		return prop.getProperty("password");
		
	}
	
}
