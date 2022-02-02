Feature:  Nursing Encounters

  @smoke
  Scenario: Verify Jump to buttons
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
    And Verify "Standard Forms " section
    Then Click "Photo icon" jump button
    And Verify "Scanned Documents/Photos" section


  Scenario: Verify Health Scores

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
    And Click Save button
    Then Verify Medical Health Score displayed correctly in Header
#    And Verify Dental Health Score displayed correctly in Header
#    Then Verify Psychological Health Score displayed correctly in Header
#    And Verify ID Health Score displayed correctly in Header
#    Then Verify Sex Offender Health Score displayed correctly in Header

