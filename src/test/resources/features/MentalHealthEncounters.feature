Feature: Mental Health Encounters

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    Then Make sure DOC "193445" is displayed correctly

  @smoke
  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "Behavioral Health Transition Form"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Behavioral Health Transition Form                          |
      | Behavioral Health Treatment Plan                           |
      | Brief Psychiatric Rating Scale (BPRS)                      |
      | Mandatory Disclosure and Information for Behavioral Health |
      | Mental Status Exam                                         |
      | Resource Consumption Scale (RCS)                           |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                |
      | IBAAP - Behavioral Health           |
      | Infirmary Admission - Mental Health |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "Intake Facility Mandatory Disclosure"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Mandatory Disclosure and Information for Behavioral Health |


  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                             |
      | Mental Health Appraisal                          |
      | Mental Health Crisis                             |
      | Mental Health Infirmary Note                     |
      | Mental Health Safety Plan Follow-up              |
      | Mental Health Screening                          |
      | Mental Status Exam                               |
      | MH - Assessment                                  |
      | MH - Group Counseling                            |
      | MH - Individual Counseling                       |
      | MH - Involuntary Medication Disposition          |
      | MH - JCAP Individual Counseling                  |
      | MH - Management Control Comprehensive Evaluation |
      | MH - Multi-Disciplinary Team Staffing            |
      | MH - Pre-Restrictive Housing Assessment          |
      | MH - Psychosocial Assessment                     |
      | MH - RTP Discharge Summary                       |
      | MH - Self Referral                               |
      | MH - Status Review                               |
      | MH - Watch/Rounds                                |
      | Parole Mental Health                             |
      | RTP Referral                                     |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - Appointment No-show"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                      |
      | MH Refusal Treatment Form |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - Appointment Refusal"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                      |
      | MH Refusal Treatment Form |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - Involuntary Medication Report"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Behavioral Health Treatment Plan                           |
      | Brief Psychiatric Rating Scale (BPRS)                      |
      | Mandatory Disclosure and Information for Behavioral Health |
      | Mental Status Exam                                         |
      | Resource Consumption Scale (RCS)                           |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - PREA"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Behavioral Health Treatment Plan                           |
      | Brief Psychiatric Rating Scale (BPRS)                      |
      | Mandatory Disclosure and Information for Behavioral Health |
      | Mental Status Exam                                         |
      | Resource Consumption Scale (RCS)                           |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - Psychological Services"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Behavioral Health Treatment Plan                           |
      | Brief Psychiatric Rating Scale (BPRS)                      |
      | Intellectual and Developmental Needs                       |
      | Mandatory Disclosure and Information for Behavioral Health |
      | Mental Status Exam                                         |
      | Referral to Psychological Services                         |
      | Resource Consumption Scale (RCS)                           |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - Restrictive Housing Individual Counseling"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Behavioral Health Treatment Plan                           |
      | Brief Psychiatric Rating Scale (BPRS)                      |
      | Mandatory Disclosure and Information for Behavioral Health |
      | Mental Status Exam                                         |
      | Resource Consumption Scale (RCS)                           |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193444"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type |




