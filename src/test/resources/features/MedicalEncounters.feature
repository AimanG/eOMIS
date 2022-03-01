Feature:  Medical Encounters

  Scenario: Verify selected DOC number
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    Then Make sure DOC "045632" is displayed correctly

  Scenario: Verify Health Scores
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Click "S" jump button
    And Verify "Subjective" section
    Then Click "O" jump button
    And Verify "Objective" section
    Then Click "A" jump button
    And Verify "Assessment" section
    Then Click "P" jump button
    And Verify "Plan" section
    Then Click "E" jump button
    And Verify "Education" section
    Then Click "C" jump button
    And Verify "Health Code/Level Scores" section
    Then Click "File icon" jump button
    And Verify "Standard Forms" section
    Then Click "Photo icon" jump button
    And Verify "Scanned Documents/Photos" section