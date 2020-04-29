@FunctionalTest
Feature: Login Page Features

@SanityTest @RegressionTest
Scenario: Login to Admin Portal Test Scenario

Given user is on login page
Then user enters username and password
Then user clicks on login button
Then verify login to admin portal
