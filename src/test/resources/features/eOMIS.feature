Feature: eOMIS

  @smoke
  Scenario:
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender
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


