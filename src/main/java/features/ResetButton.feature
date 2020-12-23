#Author: your.email@your.domain.com
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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 
  @tag1
  Scenario Outline: Verification of reset button with dropdown list changes
    Given  User enter the home page url
    When user click Blog link in the Home Page
    And User select <allCategories> Dropdown
    And User select <alltags> Dropdown
    Then User click on reset button
    And User should be able to reset the selections
    
    
  
    Examples: reset with values
      | Education		  | certificate | 
      | Uncategorized	| salesforce	| 
      | WordPress			|	certificate	|
      
      