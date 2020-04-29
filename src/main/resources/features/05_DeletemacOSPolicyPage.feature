@FunctionalTest
Feature: Delete Mac OS Policy Page Feature

@SanityTest @RegressionTest
Scenario Outline: Delete Mac OS POlicy Test Scenario

Given user is on Mobile Admin Page

Then user clicks on App Profiles lbl
Then user clicks on macOS Platform Lbl

Then user clicks on delete policy btn "<name>"
Then user clicks ok btn

Examples:
			|	name		|
			|	macPolicy1	| 
			|	macPolicy2	| 
			|	macPolicy3	| 
		
		
		
		