Feature:  Medical Encounters

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    Then Make sure DOC "191445" is displayed correctly


  Scenario Outline: Create New Alcohol and Drug Encounters
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    And Click on a New button
    * Enter the Supervisor Name
   # * Select the Client has completed recommended level of treatment
    * Select the Client has previously completed recommended level of treatment AND Request for Reassessment not warranted at this time AND Client is recommended for relapse prevention treatment
    * Select the Client has completed the recommended level of treatment AND Client has been recommended for an aftercare program
    * Select the Client has been expelled from or quit treatment at the recommended level
    * Select the Client has refused treatment at the recommended level
    * Select the Client has refused to complete the assessment process
    * Select the Client has previously completed recommended treatment level AND Client has had a positive urinalysis, technical violation, Code of Penal Discipline violation, or relapse since completion of treatment AND Clinician recommends client repeat treatment at the recommended treatment level
    * Select the Client has not completed treatment at their recommended treatment level
    * Select the Client returned during current incarceration and does not need reassessment
    * Select the Reassessment request has been approved but not yet completed
    * Select the Client returned during current incarceration and previous treatment level qualifier may need to be reconsidered
    Then Add Timestamp to Comments
    And Click Save and Close button
    Examples:
      | Type                      |
      | A&D - Appointment No-show |
      | A&D - Appointment Refusal |

  Scenario Outline: Create New Alcohol and Drug Encounters
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    And Add Timestamp to Subjective Notes
    Then Click Save button
    And Click Save and Close button

    Examples:
      | Type                         |
      | A&D - Assessment             |
      | A&D - Group Counseling       |
      | A&D - Individual Counseling  |
      | A&D - Intake                 |
      | A&D - Treatment/Service Plan |

  @smoke
  Scenario Outline: Create New Alcohol and Drug Encounters
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Click Save button
    And Click Save and Close button

    Examples:
      | Type                                   |
      | A&D - Multi-Disciplinary Team Staffing |
      | A&D - Progress Review                  |
      | A&D - Status Review                    |
      | A&D - Treatment Packet Documents       |