/* Description:- This is an enum class.This enum holds the hard coded values against the type of web browser driver that 
 * user specifies inside "config.properties" file.
 * 
 * Link:- 1)"Config.properties" inside "config" package of "src/main/java" folder.
 * 2) "WebDriverManager.java" inside "managers" package of "src/main/java" folder is using this enum.
*/


package enums;

public enum DriverType {

	FIREFOX,
	CHROME,
	SAFARI;
}

