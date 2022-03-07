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

  Scenario: View History
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next button
    Then Click on View History

  Scenario: Create New Objective
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Objective" section
    And Click on New button of Objective section
    Then Make sure the page tittle is "MSSS032B - Vital Signs"
    * Enter the Weight
    * Enter the Body Temperature
    * Select the Method of Body Temperature
    * Enter the Pulse Rate
    * Select the Method of Pulse Rate
    * Enter the Blood Pressure
    * Select the Position
    * Enter the Respiration Rate
    * Enter the Pulse Ox.
    * Enter the O2 Saturation
    * Select the Source
    * Enter the Liters
    * Select the Via
    * Enter the Peak Flow
    * Enter the Blood Sugar Level
    * Enter the Uncorrected - Right: 20
    * Enter the Uncorrected Left: 20
    * Enter the Uncorrected Both: 20
    * Enter the Corrected - Right: 20
    * Enter the Corrected Left: 20
    * Enter the Corrected Both: 20
    * Select the OAE Result: Right Ear
    * Select the OAE Result: Left Ear
    * Add Timestamp to Comments
    And Click Save button
    Then Click Save and Close button

  Scenario: Create New Lab Test Orders
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
    Then Scroll down to "Lab Test Orders" section
    And Click on New button of Lab Test Orders section
    Then Verify Complex location is "Bent County Correctional Facility"
    * Enter the Diagnosis Code
    * Select the Formulary
    * Select the Lab Test Ordered
    * Select the Priority
    * Select the today's date for Lab Schedule Date
    * Select the Fasting
    * Select the Verbal/Telephone Order Read Back
#    And Click Save button
#    Then Click Save and Close button

  Scenario: Create X-Ray Orders
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
    Then Scroll down to "X-Ray Orders" section
    And Click on New button of Lab Test Orders section
    Then Verify Complex location is "Bent County Correctional Facility"
    * Select the X-Ray Ordered
    * Select the Diagnosis Code
    * Select the Priority
    * Select the today's date for X-Ray Schedule Date
    * Select the Verbal/Telephone Order Read Back
    And Click Save button
    #Then Click Save and Close button

  Scenario Outline: Verify selected Complex location - Arkansas Valley Correctional Facility
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Arkansas Valley Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Administrative - Provider            |
      | Appointment No-show - Provider       |
      | Appointment Refusal - Provider       |
      | Chart Review - Provider              |
      | Chronic Care Visit                   |
      | CTCF Infirmary Admission/Hospice     |
      | Diet Consult Request - Provider      |
      | DRDC Infirmary Admission OBS         |
      | Emergency - Provider (w/ transport)  |
      | Emergency - Provider (w/o transport) |
      | Follow-up - Provider                 |
      | IBAAP - Provider                     |
      | Infectious Disease - Provider        |
      | Infirmary Admission - Provider       |
      | Infirmary Discharge - Provider       |
      | Infirmary Note - Provider            |
      | Intake Physical Exam - Provider      |
      | Routine Physical Exam Self Referral  |
      | Sick Call - Provider                 |

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
#    Then Verify "Medical" Health Score displayed correctly in Banner
#    And Verify "Dental" Health Score displayed correctly in Banner
#    Then Verify "Psychological" Health Score displayed correctly in Banner
#    And Verify "ID" Health Score displayed correctly in Banner
#    Then Verify "Sex Offender" Health Score displayed correctly in Banner
#    And  Verify "Substance Abuse Rating" Health Score displayed correctly in Banner


