@FunctionalTest
Feature: Add Policy Page Features

@SanityTest @RegressionTest
Scenario Outline: Add Mac OS Policy Test Scenario

Given user is on Mobile Admin Page

Then user clicks on App Profiles lbl
Then user clicks on macOS Platform Lbl
Then user clicks on Add macOS Policy button
Then user enter details "<name>" "<ruleOrder>" "<enable>" "<groups>" "<logoutPassword>" "<disablePassword>" "<customPACUrl>" "<forwardingProfile>" "<installCert>" "<logMode>" "<logFileSize>" "<reactiveInternetSecurity>" "<hostName>" "<z_tunnelConfig>" "<destinationInclusions>" "<policyDescription>"
Then user clicks on save btn

Examples: 
		| 	name	 	| 	ruleOrder	|	enable		|	groups									|	logoutPassword		|	disablePassword		|	customPACUrl		|	forwardingProfile		|	installCert		|	logMode	|	logFileSize		|	reactiveInternetSecurity		|	hostName	|	z_tunnelConfig		|		destinationInclusions		|	policyDescription	|	
		|	macPolicy1	|	Default		|	Yes		|	All									|	1234			|	1234			|	Default			|	Default				|	Yes			|	Debug	|		100		|		0				|	0.0.0.0		|	0.0.0.0			|			0.0.0.0			|	Mac Policy Description.	|	
		|	macPolicy2	|	Default		|	Yes		|	Service Admin,sync10,User Group,Executives,Managers,IT,Interns,UI,test	|	abcd			|	abcd			|	Default			|	test				|	Yes			|	Debug	|		100		|		0				|	0.0.0.0		|	0.0.0.0			|			0.0.0.0			|	Mac Policy Description.	|	
		|	macPolicy3	|	Default		|	Yes		|	None									|	Default			|	Default			|	Default			|	dj				|	Yes			|	Debug	|		100		|		0				|	0.0.0.0		|	0.0.0.0			|			0.0.0.0			|	Mac Policy Description.	|	
		