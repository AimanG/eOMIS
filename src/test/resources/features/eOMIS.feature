Feature: eOMIS


  Scenario: LSI Assessments
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Make sure DOC "190456" is displayed correctly
    And Click on New button
    Then Choose Staff Name from the dropdown
    And  Choose Test Source from the dropdown
    Then Enter "1" for Number of adult prior convictions
    And Enter "2" for Number of present offenses
    Then Enter "1" for Number of times punished for institutional misconduct
    And Choose Work for Employment or Education Type
    Then Enter "0" for 18.Participation or Performance (C) Rating
    And Enter "1" for 21.Problems (SY) Rating
    Then Enter "1" for 23. Dissatisfaction with marital or equivalent situation (C)
    And Enter "1" for 24. Nonrewarding, parental (CY)
    Then Enter "2" for 25. Nonrewarding, other (CY)
    And Enter "1" for 27. Unsatisfactory (C)
    Then Enter "1" for Number of address changes
    And Enter "0" for 31. Could make better use of time (CY)
    Then Enter "1" for 39. Alcohol problem, currently (SY, IN-2)
    And Enter "2" for 40. Drug problem, currently (SY, IN-2)
    Then Select 41. Law violation (SY, IN-2) checkbox
    And Enter "0" for 51. Supportive of crime (C)
    Then Enter "1" for 52. Unfavorable attitude toward convention (C)
    And Click Continue button
    Then Click Save button


  @smoke
  Scenario: Nursing Encounters
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    Then Make sure DOC "187437" is displayed correctly
    And Click on a New button in Health Services Encounters
    Then Select the Complex - Bent County Correctional Facility
    And Select the Type - Administrative - Nursing
    Then Click Next button
    And Select Related Health Service Requests
    Then Add Timestamp to Subjective Notes
#    And Click Save button
#    Then Verify Medical Health Score displayed correctly in Header
#    And Verify Dental Health Score displayed correctly in Header
#    Then Verify Psychological Health Score displayed correctly in Header
#    And Verify ID Health Score displayed correctly in Header
#    Then Verify Sex Offender Health Score displayed correctly in Header



