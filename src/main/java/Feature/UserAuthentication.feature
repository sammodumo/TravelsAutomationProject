Feature: User Authentication

  Scenario: User registers successfully
    Given I am on the registration page
    When I fill in "First Name" with "John"
    And I fill in "Last Name" with "Doe"
    And I fill in "Email" with "john.doe@example.com"
    And I fill in "Password" with "SecurePassword123"
    And I click on "Register"
#    Then I should see "Registration successful"

#  Scenario: User logs in successfully
#    Given I am on the login page
#    When I fill in "Email" with "john.doe@example.com"
#    And I fill in "Password" with "SecurePassword123"
#    And I click on "Login"
#    Then I should be redirected to the dashboard
#    And I should see "Welcome, John"