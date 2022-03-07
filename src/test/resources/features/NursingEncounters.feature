Feature:  Nursing Encounters

  Scenario: Verify selected DOC number
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    Then Make sure DOC "187437" is displayed correctly

  Scenario: Verify Health Scores
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Nursing"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify "Medical" Health Score displayed correctly in Banner
    And Verify "Dental" Health Score displayed correctly in Banner
    Then Verify "Psychological" Health Score displayed correctly in Banner
    And Verify "ID" Health Score displayed correctly in Banner
    Then Verify "Sex Offender" Health Score displayed correctly in Banner
    And  Verify "Substance Abuse Rating" Health Score displayed correctly in Banner

  @smoke
  Scenario: Verify Jump to buttons
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Nursing"
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
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "Administrative - Nursing"
    And Click Next button
    Then Click on View History

  Scenario Outline: Verify selected Complex location - Arkansas Valley Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
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
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Arrowhead Correctional Center
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arrowhead Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    And Select Related Health Service Requests
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Arrowhead Correctional Center"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Bent County Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Bent County Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Buena Vista Correctional Complex
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Buena Vista Correctional Complex"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Buena Vista Correctional Complex"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Centennial Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Centennial Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Centennial Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Colorado Correctional Center (Camp George West)
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Colorado Correctional Center (Camp George West)"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Colorado Correctional Center (Camp George West)"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Colorado State Penitentiary
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Colorado State Penitentiary"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Colorado State Penitentiary"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Colorado Territorial Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Colorado Territorial Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Colorado Territorial Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Crowley County Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Crowley County Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Crowley County Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Delta Correctional Center
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Delta Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Delta Correctional Center"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Denver Reception And Diagnostic Center
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Denver Reception And Diagnostic Center"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Denver Reception And Diagnostic Center"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Denver Womens Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Denver Womens Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Denver Womens Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Four Mile Correctional Center
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Four Mile Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Four Mile Correctional Center"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location -  Fremont Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Fremont Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Fremont Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - La Vista Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "La Vista Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "La Vista Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Limon Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Limon Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Limon Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - PAROLE FACILITY
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "PAROLE FACILITY"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "PAROLE FACILITY"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Rifle Correctional Center
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Rifle Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Rifle Correctional Center"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - San Carlos Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "San Carlos Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "San Carlos Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Sterling Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Sterling Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Sterling Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Trinidad Correctional Facility
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Trinidad Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Trinidad Correctional Facility"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |

  Scenario Outline: Verify selected Complex location - Youthful Offender System-Pueblo
    Given Enter Nurse User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "187437"
    And Go to Health -> Nursing -> Nursing Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Youthful Offender System-Pueblo"
    And Select the Type - "<Type>"
    Then Click Next button
    Then Add Timestamp to Subjective Notes
    And Click Save button
    Then Verify Complex location is "Youthful Offender System-Pueblo"
    And Click Save and Close button
    Examples:
      | Type                                 |
      | Anatomical - Nursing                 |
      | Administrative - Nursing             |
      | Appointment No-show - Nursing        |
      | Appointment Refusal - Nursing        |
      | Death - Nursing                      |
      | Diabetic Education                   |
      | Diabetic Foot Assessment             |
      | Education/Counsel                    |
      | Emergency - Nursing (w/ transport)   |
      | Emergency - Nursing (w/o transport)  |
      | Follow Up - Nursing                  |
      | Food Handlers Clearance - Nursing    |
      | HCA Issued                           |
      | Hunger Strike - Nursing              |
      | Immunization                         |
      | Immunization Reaction                |
      | Infectious Disease - Nursing         |
      | Infirmary Admission - Nursing        |
      | Infirmary Discharge - Nursing        |
      | Infirmary Note - Nursing             |
      | Intake Health Assessment             |
      | IntraSystem Transfer Screening       |
      | Labs - Nursing                       |
      | Medication Education/Counsel         |
      | MH - Intake Screening - Nursing      |
      | MH Crisis - Nursing                  |
      | PPD Administration                   |
      | PREA                                 |
      | Restrictive Housing Visit (by Nurse) |
      | Sick Call - Nursing                  |
      | SWIFT/Trail Crew Clearance           |
      | TB Interview - Nursing               |
      | Work Related Injury                  |
