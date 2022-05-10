Feature: IJP

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Click on Prison Tab
    Then Click on Reports
    And Click Time Computation Reports
    Then Click Earned Time Awards for Case Manager


  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Receive Job Submitter screen for this report
    Then Enter Required Fields
    And Click Submit Button