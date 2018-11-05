Feature: Shop online at Amazon

  Scenario: Sign into Amazon.co.uk
    Given Amazon.co.uk is open
    When I click on the sign in button
    And I enter a valid Email
    And click the continue button
    And type in my password
    And click the sign in button
    Then I am logged into my account

    