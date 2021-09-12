Feature: Application login

  Scenario: Home page valid user login
    Given User should be on Target Home landing page
    When  User logs into the application with valid username and password
    Then  Home page is displayed
    And   Search tab is displayed