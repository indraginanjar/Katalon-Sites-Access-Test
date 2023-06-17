#Author: indraginanjar@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@KatalonSites
Feature: Katalon sites
  I want to verify katalon sites is accessible from current local machine

  @KatalonWebsite
  Scenario: I want to verify katalon website is accessible from current local machine
    Given I have opened web browser
    When I open katalon website
    Then I verify the website is opened succesfully

  @KatalonAdminSite
  Scenario: I want to verify katalon admin site is accessible from current local machine
    Given I have opened web browser
    When I open katalon admin site
    Then I verify the admin site is opened succesfully

  @KatalonTestopsSite
  Scenario: I want to verify katalon testops site is accessible from current local machine
    Given I have opened web browser
    When I open katalon testops site
    Then I verify the testops site is opened succesfully

  @KatalonStoreSite
  Scenario: I want to verify katalon store site is accessible from current local machine
    Given I have opened web browser
    When I open katalon store site
    Then I verify the store site is opened succesfully
