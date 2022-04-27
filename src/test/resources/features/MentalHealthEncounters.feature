Feature:  Mental Health Encounters

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    Then Make sure DOC "116046" is displayed correctly
