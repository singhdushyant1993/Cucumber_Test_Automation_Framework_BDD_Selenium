@FunctionalTest
Feature: Mobile Admin Page Features

@SanityTest @RegressionTest
Scenario: Login to Mobile Admin Test Scenario

Given user is on home page
Then user close dialog box
Then user clicks on policy lbl
Then user clicks on zapp portal lbl
Then verify login to mobile admin portal


