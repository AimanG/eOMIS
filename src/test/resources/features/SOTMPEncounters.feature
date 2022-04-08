Feature:  SOTMP Encounters

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    Then Make sure DOC "116046" is displayed correctly

  @smoke
  Scenario Outline: Create New SOTMP Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    And Click on a New button
    * Enter the Supervisor Name
    Then Add Timestamp to Comments
    And Click Save and Close button
    Examples:
      | Type                                     |
      | SOTMP - Appointment No-show              |
      | SOTMP - Appointment Refusal              |
      | SOTMP - Assessment                       |
      | SOTMP - Discharge Summary                |
      | SOTMP - Family/Support                   |
      | SOTMP - Group Counseling                 |
      | SOTMP - Individual Counseling            |
      | SOTMP - Multi-Disciplinary Team Staffing |
      | SOTMP - Parole Board Summary             |
      | SOTMP - Participation Assessment         |
      | SOTMP - PREA 14 Day Intake Aggressor     |
      | SOTMP - PREA 60 Day Referral             |
      | SOTMP - Psychological Services           |
      | SOTMP - Sexual Violence Diagnostics      |
      | SOTMP - Status Review                    |
      | SOTMP - Termination Review               |




