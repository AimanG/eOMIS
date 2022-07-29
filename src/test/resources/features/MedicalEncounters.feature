Feature:  Medical Encounters

  Scenario: Verify selected DOC number
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    Then Make sure DOC "045632" is displayed correctly

  @1
  Scenario Outline: Verify selected Complex location - Arkansas Valley Correctional Facility
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next step encounter button
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
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
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
    Then Click Next step encounter button
    Then Click on View History

  Scenario: Create New Objective
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
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

  Scenario: Create New Assessment
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Assessment" section
    * Enter the Diagnosis Code
    * Click Next button on Assessment
    * Select the Current associated SNOMED
    * Click the Add Diagnosis
    And Verify the added Diagnosis
    Then Click Save and Close button

  Scenario: Create New Related Health Problems/Conditions/Allergies
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Related Health Problems/Conditions/Allergies" section
    And Click on New button of New Related Health Problems, Conditions, Allergies section
    * Select the Category
    * Select the Type
    * Enter the SNOMED Code
    * Select the Onset Date
    * Add Timestamp to Comments
    * Add Timestamp to Baseline History - Assessment
    * Add Timestamp to Baseline Procedures
    * Add Timestamp to Patient Education
    * Add Timestamp to Findings to be documented per Encounter
    And Click Save button
    Then Click Save and Close button

  Scenario Outline: Create New Lab Test Orders
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Lab Test Orders" section
    And Click on New button of Lab Test Orders section
    Then Verify Complex location is "Bent County Correctional Facility"
    * Select the "<Diagnosis Code>"
    * Select the Lab Test Ordered
    * Select the Priority
    * Select the Fasting
    * Select the Verbal or Telephone Order Read Back
    And Click Save button
    Then Click Save and Close button
    Examples:
      | Diagnosis Code                                              |
      | Abnormality of plasma protein, unspecified [R77.9]          |
     # | Anemia, unspecified [D64.9]                                 |
      | Cardiac arrhythmia, unspecified [I49.9]                     |
      | Cardiomyopathy, unspecified [I42.9]                         |
      | Chronic kidney disease, unspecified [N18.9]                 |
      | Decreased white blood cell count, unspecified [D72.819]     |
      | Deficiency of nutrient element, unspecified [E61.9]         |
      | Diarrhea, unspecified [R19.7]                               |
      | Dilated cardiomyopathy [I42.0]                              |
      | Dysphagia, unspecified [R13.10]                             |
      | Edema, unspecified [R60.9]                                  |
      | Enlarged prostate with lower urinary tract symptoms [N40.1] |
      | Essential (primary) hypertension [I10]                      |
      | Gastritis, unspecified, with bleeding [K29.71]              |
      | Heart failure, unspecified [I50.9]                          |
      | HELICOBACTER PYLORI [H. PYLORI] [B96.81]                    |
      | Hemorrhage, not elsewhere classified [R58]                  |
      | Hydrocele, unspecified [N43.3]                              |
      | Hypertrophy of breast [N62]                                 |
      | Impacted cerumen, unspecified ear [H61.20]                  |
      | Impaired glucose tolerance (oral) [R73.02]                  |
      | Long term (current) use of anticoagulants [Z79.01]          |
      | Nonrheumatic aortic valve disorder, unspecified [I35.9]     |
      | Nonrheumatic mitral valve disorder, unspecified [I34.9]     |
      | Other Specified Depressive Episodes [F32.89]                |
      | Pain in unspecified joint [M25.50]                          |
      | Rheumatic aortic valve disease, unspecified [I06.9]         |
      | Rheumatic heart disease, unspecified [I09.9]                |
      | Thrombocytopenia, unspecified [D69.6]                       |
      | Unspecified atrial fibrillation [I48.91]                    |
      | Unspecified lump in breast [N63]                            |

  Scenario Outline: Create New X-Ray Orders
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "X-Ray Orders" section
    And Click on New button of X-Ray Orders section
    * Select the X-Ray Ordered
    * Select the "<Diagnosis Code>"
    * Select the X-Ray Priority
    * Select the Verbal or Telephone Order Read Back
    * Select the X-Ray Taken Date
    * Select the Time
    * Enter the Stuff
    * Select the Shipped Date
    * Select the X-Ray Site
    * Add TimeStamp to X-Ray Taken Comments
    * Add TimeStamp to Results Comments
    And Click Save button
    Then Click Save and Close button
    Examples:
      | Diagnosis Code                                              |
      | Abnormality of plasma protein, unspecified [R77.9]          |
      | Anemia, unspecified [D64.9]                                 |
      | Chronic kidney disease, unspecified [N18.9]                 |
      | Decreased white blood cell count, unspecified [D72.819]     |
      | Deficiency of nutrient element, unspecified [E61.9]         |
      | Diarrhea, unspecified [R19.7]                               |
      | Dysphagia, unspecified [R13.10]                             |
      | Edema, unspecified [R60.9]                                  |
      | Enlarged prostate with lower urinary tract symptoms [N40.1] |
      | Essential (primary) hypertension [I10]                      |
      | Gastritis, unspecified, with bleeding [K29.71]              |
      | Heart failure, unspecified [I50.9]                          |
      | HELICOBACTER PYLORI [H. PYLORI] [B96.81]                    |
      | Hemorrhage, not elsewhere classified [R58]                  |
      | Hydrocele, unspecified [N43.3]                              |
      | Hypertrophy of breast [N62]                                 |
      | Impacted cerumen, unspecified ear [H61.20]                  |
      | Impaired glucose tolerance (oral) [R73.02]                  |
      | Long term (current) use of anticoagulants [Z79.01]          |
      | Nonrheumatic aortic valve disorder, unspecified [I35.9]     |
      | Nonrheumatic mitral valve disorder, unspecified [I34.9]     |
      | Other Specified Depressive Episodes [F32.89]                |
      | Pain in unspecified joint [M25.50]                          |
      | Rheumatic aortic valve disease, unspecified [I06.9]         |
      | Rheumatic heart disease, unspecified [I09.9]                |
      | Thrombocytopenia, unspecified [D69.6]                       |
      | Unspecified atrial fibrillation [I48.91]                    |
      | Unspecified lump in breast [N63]                            |

  Scenario Outline: Create New Consultation Request
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Consultation Request" section
    And Click on New button of Consultation Request section
    * Select the Request Type
    * Select the Priority
    * Select the Service Type
    * Select the "<Location>" of Consultation Request
    * Enter the Specialist
    * Enter the Procedure Requested
    * Add TimeStamp to PURPOSE OF REQUEST
    * Select N to SUPPORTING DOCUMENTATION, PROGRESS OR SPECIALISTS NOTES, DIAGNOSTIC RESULTS, ATTACHED OR FAXED
    * Add TimeStamp to PHYSICAL FUNCTIONAL EXAM PERTINENT TO REQUEST
    * Add TimeStamp to PRIOR CONSERVATIVE MANAGEMENT
    * Add TimeStamp to MRD
    * Add TimeStamp to EFFECT ON ADL'S WHEN INDICATED
    * Select Good to PATIENT CARE COMPLIANCE HISTORY WITH TREATMENT PLAN
    * Select the Working Diagnosis
    * Add TimeStamp to Subjective Notes
    * Add TimeStamp to Describe Signs and Symptoms Suggesting Diagnosis
    * Add TimeStamp to Failed Therapies
    * Add TimeStamp to Related Lab Test Orders
    * Add TimeStamp to Related XRay Orders
    And Click Save button
    Then Click Save and Close button
    Examples:
      | Location                                         |
      | ACC-General Population MIN/MINR  [ACC-GPII]      |
      | ACC-Intake Use Only  [ACC-INTK]                  |
      | ACC-Restrictive Housing  [ACC-RH]                |
      | Adams County Jail  [JB-01]                       |
      | Alamosa County Jail  [JB-02]                     |
      | Alamosa Office  [000039000]                      |
      | Any Colorado City Jail  [ANYCTYJAIL]             |
      | Arapahoe Community Treatment Center  [ARAP/ACTC] |
      | Arapahoe County Jail  [JB-03]                    |
      | Arapahoe County Residential Center  [ARAP/ACRC]  |
      | Archuleta County Jail  [JB-04]                   |
      | Aurora Office  [000039001]                       |
      | AVCF-General Population MEDIUM  [AVCF-GPIII]     |
      | AVCF-Intake Use Only  [AVCF-INTK]                |
      | AVCF-Protective Custody  [AVCF-PC]               |
      | AVCF-Restrictive Housing  [AVCF-RH]              |
      | Baca County Jail  [JB-05]                        |
      | BCCF-General Population MEDIUM  [BCCF-GPIII]     |
      | BCCF-Intake Use Only  [BCCF-INTK]                |
      | BCCF-Restrictive Housing  [BCCF-RH]              |
      | Bent County Jail  [JB-06]                        |
      | BOLDR/Bctc  [IS/BCTC]                            |
      | BOLDR/Lctc  [IS/B/LCTC]                          |
      | Boulder County Jail  [JB-07]                     |
      | Broadway Office  [000039005]                     |
      | Broomfield County Jail  [JB-80]                  |
      | BUENA VISTA TRANSITIONAL WORK CENTER  [BW-TWC]   |
      | BVCF-General Population CLOSE  [BVCF-GPIV]       |


  Scenario: Create New Patient Transfer Holds
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Patient Transfer Holds" section
    And Click on New button of Patient Transfer Holds section
    * Select the Hold Type
    * Select the Status
    * Select the As of Date
    * Add Timestamp to Comments
    And Click Save button
    Then Click Save and Close button

  Scenario: Create New Other Actions/Procedures
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Other Actions/Procedures" section
    And Click on New button of Other Actions Procedures section
    * Select the Category
    * Select the Type or Pick List
    * Select the Status
    * Select the As of Date
    * Add Timestamp to Specify Comments
    And Click Save button
    Then Click Save and Close button

  Scenario: Initiate Kite Follow-up Appointments
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button and Accept alert
    Then Scroll down to "Follow-up Appointments" section
    And Click on a Initiate Kite
    * Select the Triage Date
    * Select the Area of Service
    * Select the Acuity
    * Select the Complaint Category
    * Select the Target Complete Date
    * Add Timestamp to Inmate Health Issue
    * Add Timestamp to Reviewer Comments
    And Click Save button
    Then Click Save and Close button

#  Scenario Outline: Verify selected Complex location - Arkansas Valley Correctional Facility
#    Given Enter Provider User ID and Password at DeCORuM login screen
#    When Click Logon button
#    Then Select the Offender "045632"
#    And Go to Health -> Medical Provider -> Medical Encounters
#    And Click on a New button in Health Services Encounters
#    Then Select the Complex - "Arkansas Valley Correctional Facility"
#    And Select the Type - "<Type>"
#    Then Click Next button
#    Then Add Timestamp to Subjective Notes
#    And Click Save button
#    Then Verify Complex location is "Arkansas Valley Correctional Facility"
#    And Click Save and Close button
#    Examples:
#      | Type                                 |
#      | Administrative - Provider            |
#      | Appointment No-show - Provider       |
#      | Appointment Refusal - Provider       |
#      | Chart Review - Provider              |
#      | Chronic Care Visit                   |
#      | CTCF Infirmary Admission/Hospice     |
#      | Diet Consult Request - Provider      |
#      | DRDC Infirmary Admission OBS         |
#      | Emergency - Provider (w/ transport)  |
#      | Emergency - Provider (w/o transport) |
#      | Follow-up - Provider                 |
#      | IBAAP - Provider                     |
#      | Infectious Disease - Provider        |
#      | Infirmary Admission - Provider       |
#      | Infirmary Discharge - Provider       |
#      | Infirmary Note - Provider            |
#      | Intake Physical Exam - Provider      |
#      | Routine Physical Exam Self Referral  |
#      | Sick Call - Provider                 |

  Scenario: Verify Health Scores
    Given Enter Provider User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "045632"
    And Go to Health -> Medical Provider -> Medical Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Provider"
    Then Click Next step encounter button
    Then Add Timestamp to Subjective Notes
    And Click Save button
#    Then Verify "Medical" Health Score displayed correctly in Banner
#    And Verify "Dental" Health Score displayed correctly in Banner
#    Then Verify "Psychological" Health Score displayed correctly in Banner
#    And Verify "ID" Health Score displayed correctly in Banner
#    Then Verify "Sex Offender" Health Score displayed correctly in Banner
#    And  Verify "Substance Abuse Rating" Health Score displayed correctly in Banner