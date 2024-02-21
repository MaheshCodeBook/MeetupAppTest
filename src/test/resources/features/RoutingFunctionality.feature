Feature: Routing Functionality
  As a user of app
  I want to able to navigate all navbars
  So that we can visible all are working properly or not

  Scenario: Test Navigation to About page
    Given I am on the app HomePage
    When I click on the about page
    Then As a result Redirected to the about page visible

  Scenario: Test Navigation to Contact page
    Given I am on the app HomePage
    When I click on the contact page
    Then As a result Redirected to the contact page visible

  Scenario: Test Navigation to Home page
    Given I am on the app HomePage
    When I click on the about page
    And I click on home page
    Then As a result Redirected to the home page visible



