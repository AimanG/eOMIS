Feature: eOMIS

  @smoke
  Scenario:
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender
    And Go to Offender -> Offender Assessments -> LSI Assessments
 #    Then Make sure DOC "190456" is displayed correctly
    And Click on New button
#    Then Choose today's date for Assessment Date
#    And Choose Facility Name from the dropdown
    Then Choose Staff Name from the dropdown
    And  Choose Test Source from the dropdown
    Then Enter 1 for Number of adult prior convictions:
    And Enter 0 for Number of present offenses:
    Then Enter 0 for Number of times punished for institutional misconduct:
