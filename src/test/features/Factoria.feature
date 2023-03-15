  @WebTest
Feature: As a user I want to be able to be able to get factorials

  Scenario: validate the red highlighted validation is displayed when invalid data is submitted
    Given user navigates the application
    When user clicks on calculate button
    Then user finds the red highlighted form validation


  Scenario Outline: validate the console message printed
    Given user navigates the application
    When user clicks on calculate button
    Then user finds the red highlighted form validation
    And user finds the result text and validate that result is "<expectedResultText>"

    Examples:
    | expectedResultText      |
    | Please enter an integer |

  Scenario Outline: Validate that 7 is a factorial of 5040
    Given user navigates the application
    And user enters "<factor>" in the text field
    When user clicks on calculate button
    And user finds the result text and validate that result is "<expectedResultText>"

    Examples:
      | factor | expectedResultText           |
      | 7      | The factorial of 7 is: 5040  |