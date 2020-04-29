@FunctionalTest
Feature: Edit Mac OS Policy Page Features

@SanityTest @RegressionTest
Scenario Outline: Edit Mac OS Policy Description Test Scenario

Given user is on Mobile Admin Page

Then user clicks on App Profiles lbl
Then user clicks on macOS Platform Lbl

Then user update policy "<name>" "<policyDescription>"
Then user clicks on save button

Examples:
			|	name 			|	policyDescription 				|
			|	macPolicy1		|	Mac Policy Description Edited.	|
			|	macPolicy2		|	Mac Policy Description Edited.	|
			|	macPolicy3		|	Mac Policy Description Edited.	|






