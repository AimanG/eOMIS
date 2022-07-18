Feature: Mental Health Encounters

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    Then Make sure DOC "193445" is displayed correctly

  Scenario: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Behavioral Health Transition Form
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Mental Health Type - "Behavioral Health Transition Form"
    Then Click Next encounter button
    And Select the Standard Form as "Behavioral Health Transition Form"
    Then Click on New button
    * Enter the Parole Office Destination
    * Enter the Parole Mental Health Clinician
    * Enter the Contact Information
    * Add Timestamp to Individualized strategies to promote offender success; identify resources such as supports and coping skills: what individualized strategies have been identified and used
    * Add Timestamp to Describe helpful approaches that increased offenders motivation for change and or independent living skills
    * Add Timestamp to Current identified barriers and risk factors: Include current danger to self and or others and or grave disability - specify behavior risk factors
    * Add Timestamp to Identify gaps in resources that need to be addressed to promote offender success:
    * Add Timestamp to Describe offenders attitude, motivation toward community success
    * Add Timestamp to Transition Plan: In Reach appointment completed - date and community provider
    * Select the ROI Obtained to Sex Offender
    * Unselect the ROI Obtained to Sex Offender
    * Select the ROI Obtained to Mental Health
    * Unselect the ROI Obtained to Mental Health
    * Select the ROI Obtained to Substance Use
    * Unselect the ROI Obtained to Substance Use
    * Select the ROI Obtained to Parole
    * Unselect the ROI Obtained to Parole
    And Click Save button


  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Behavioral Health Transition Form types
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Mental Health Type - "Behavioral Health Transition Form"
    Then Click Next button
    And Select the Standard Form as "<Type>"
    Then Click on New button
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Behavioral Health Treatment Plan                           |
      | Brief Psychiatric Rating Scale (BPRS)                      |
      | Mandatory Disclosure and Information for Behavioral Health |
      | Mental Status Exam                                         |
      | Resource Consumption Scale (RCS)                           |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Approved
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Subjective Notes
    And Click Save button
    * Select Approved to IBAAP APPROVAL DENIAL
    And Click Save and Close button
    Examples:
      | Type                                |
      | IBAAP - Behavioral Health           |
      | Infirmary Admission - Mental Health |

  @wip
  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Denied
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Subjective Notes
    And Click Save button
    * Select Denied to IBAAP APPROVAL DENIAL
    And Click Save and Close button
    Examples:
      | Type                                |
      | IBAAP - Behavioral Health           |
      | Infirmary Admission - Mental Health |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility3
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "Intake Facility Mandatory Disclosure"
    Then Click Next button
    And Select the Standard Form as "<Type>"
    Then Click on New button
    * Select the Not Available as a Sign
    * Select the Add as a Witness
    And Click Save button
    Examples:
      | Type                                                       |
      | Mandatory Disclosure and Information for Behavioral Health |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Mental Health Appraisal
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Subjective Notes
    Then Click Save button
    * Enter the Level of Education completed
    * Select N to 1. Are you taking psychiatric medications now?
    * Select Y to 1. Are you taking psychiatric medications now?
    * Select N to 2. Have you ever taken a psychiatric medication?
    * Select Y to 2. Have you ever taken a psychiatric medication?
    * Select N to 3. Have you ever been hospitalized for mental health problems?
    * Select Y to 3. Have you ever been hospitalized for mental health problems?
    * Select N to 4. Have you ever been treated for mental health problems?
    * Select Y to 4. Have you ever been treated for mental health problems?
    * Select N to 5. Is there a history of special placement at SCCF or admissions to CMHI-P?
    * Select Y to 5. Is there a history of special placement at SCCF or admissions to CMHI-P?
    * Select N to 6. Has anyone in your family ever been treated for mental health problems?
    * Select Y to 6. Has anyone in your family ever been treated for mental health problems?
    * Select N to 7. Have you had a recent death of someone close to you, divorce, or loss of a relationship?
    * Select Y to 7. Have you had a recent death of someone close to you, divorce, or loss of a relationship?
    * Select N to 8. Have you ever tried to kill yourself?
    * Select Y to 8. Have you ever tried to kill yourself?
    * Select N to 9. Are you thinking about killing yourself now?
    * Select Y to 9. Are you thinking about killing yourself now?
    * Select N to 10. Have you ever injured yourself on purpose by burning, cutting, or scratching yourself?
    * Select Y to 10. Have you ever injured yourself on purpose by burning, cutting, or scratching yourself?
    * Select N to 11. Are you thinking about hurting yourself now?
    * Select Y to 11. Are you thinking about hurting yourself now?
    * Select N to 12. Have you ever been treated for alcohol drug or other substance abuse problems?
    * Select Y to 12. Have you ever been treated for alcohol drug or other substance abuse problems?
    * Select N to 13. Have you ever been violent toward another person?
    * Select Y to 13. Have you ever been violent toward another person?
    * Select N to 14. Have you ever been the victim of domestic violence?
    * Select Y to 14. Have you ever been the victim of domestic violence?
    * Select N to 15. Do you have any concerns for your safety?
    * Select Y to 15. Do you have any concerns for your safety?
    * Select N to 16. Have you ever experienced prior sexual victimization or molestation?
    * Select Y to 16. Have you ever experienced prior sexual victimization or molestation?
    * Select N to 17. Have you ever perpetrated sexual assault abuse?
    * Select Y to 17. Have you ever perpetrated sexual assault abuse?
    * Select N to 18. Appears unusually emotionally upset, depressed or fearful?
    * Select Y to 18. Appears unusually emotionally upset, depressed or fearful?
    * Select N to 19. Appears agitated, restless, or is unable to sit still, sleep, or stop talking
    * Select Y to 19. Appears agitated, restless, or is unable to sit still, sleep, or stop talking
    * Select N to 20. Appears aggressive, threatening, hostile, belligerent, wont be calmed down, has a history of angry outbursts
    * Select Y to 20. Appears aggressive, threatening, hostile, belligerent, wont be calmed down, has a history of angry outbursts
    * Select N to 21. Appears to be distracted, is disoriented, and or unable to understand or follow directions
    * Select Y to 21. Appears to be distracted, is disoriented, and or unable to understand or follow directions
    * Select N to 22. Has bruises, cuts, scrapes, burns, or other physical injuries or appers to have been traumatized in some way
    * Select Y to 23. Cleared to general population. No Mental Health or Psychiatric referrals
    * Select N to 23. Cleared to general population. No Mental Health or Psychiatric referrals
    * Select Y to 24. Cleared to general population with referral: Mental Health Psychiatry
    * Select N to 24. Cleared to general population with referral: Mental Health Psychiatry
    * Select Y to 25. Referral to Mental Health for emergency evaluation and treatment planning
    * Select N to 25. Referral to Mental Health for emergency evaluation and treatment planning
    * Select Y to 26. Referral to Psychiatry for emergency evaluation and treatment planning
    * Select Y to 26. Referral to Psychiatry for emergency evaluation and treatment planning
    * Select N to 27. Referral for Diagnostic Testing and or Special Placement Referral
    * Select Y to 27. Referral for Diagnostic Testing and or Special Placement Referral
    * Select N to 28. Cleared for housing, work assignment, and program participation
    * Select Y to 28. Cleared for housing, work assignment, and program participation
    And Click Save and Close button
    Examples:
      | Type                    |
      | Mental Health Appraisal |


  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Mental Health Crisis
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Subjective Notes
    Then Click Save button
    * Select On Call MENTAL HEALTH CRISIS
    * Select On Call MENTAL HEALTH CRISIS
    * Select Regular Shift MENTAL HEALTH CRISIS
    * Select Regular Shift MENTAL HEALTH CRISIS
    * Check Threats of Self-Harm to Crisis Type
    * Uncheck Threats of Self-Harm to Crisis Type
    * Check Hanging to Crisis Type
    * Uncheck Hanging to Crisis Type
    * Check Lacerations to Crisis Type
    * Uncheck Lacerations to Crisis Type
    * Check Jumping to Crisis Type
    * Uncheck Jumping to Crisis Type
    * Check Ingestion to Crisis Type
    * Uncheck Ingestion to Crisis Type
    * Check Intentional Overdose to Crisis Type
    * Uncheck Intentional Overdose to Crisis Type
    * Check Head- Banging to Crisis Type
    * Uncheck Head- Banging to Crisis Type
    * Check Other Self- Injurious Behavior to Crisis Type
    * Uncheck Other Self- Injurious Behavior to Crisis Type
    * Check Florid Psychosis to Crisis Type
    * Uncheck Florid Psychosis to Crisis Type
    * Check Completed Suicide to Crisis Type
    * Uncheck Completed Suicide to Crisis Type
    * Select Counsel- Return to Cell
    * Select Transport for Medical
    * Select MH Watch Begins
    * Select Infirmary Admission
    And Click Save and Close button
    Examples:
      | Type                 |
      | Mental Health Crisis |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Mental Health Screening
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "080819"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Subjective Notes
    Then Click Save button
    * Select Y to 1. Have you EVER been treated for mental health problems?
    * Select N to 1. Have you EVER been treated for mental health problems?
    * Select Y to 2. Have you been treated for mental health problems in the last 6 months?
    * Select N to 2. Have you been treated for mental health problems in the last 6 months?
    * Select Y to 3. Have you ever been hospitalized for mental health problems in the Last 2 years?
    * Select N to 3. Have you ever been hospitalized for mental health problems in the Last 2 years?
    * Select Y to 4. Have you EVER been prescribed psychiatric medications?
    * Select N to 4. Have you EVER been prescribed psychiatric medications?
    * Select Y to 5. Are you taking psychiatric medication NOW?
    * Select N to 5. Are you taking psychiatric medication NOW?
    * Select Y to 6.Has anyone in your family been treated for a mental health problem or attempted committed suicide?
    * Select N to 6.Has anyone in your family been treated for a mental health problem or attempted committed suicide?
    * Select Y to 7. Do you currently have a mental health problem you need to talk to someone about?
    * Select N to 7. Do you currently have a mental health problem you need to talk to someone about?
    * Select Y to 8. Have you had a recent death of someone close to you, divorce, or loss of a relationship?
    * Select N to 8. Have you had a recent death of someone close to you, divorce, or loss of a relationship?
    * Select Y to 9. Do you have a history of of head injury or traumatic brain injury with loss of consciousness?
    * Select N to 9. Do you have a history of of head injury or traumatic brain injury with loss of consciousness?
    * Select Y to 10. Have you ever experienced prior sexual victimization?
    * Select N to 10. Have you ever experienced prior sexual victimization?
    * Select Y to 11. Have you ever perpetrated sexual assault abuse?
    * Select N to 11. Have you ever perpetrated sexual assault abuse?
    * Select Y to 12. Have you EVER tried to harm or kill yourself?
    * Select N to 12. Have you EVER tried to harm or kill yourself?
    * Select Y to In last 6 months
    * Select N to In last 6 months
    * Select Y to In last 6 months to 2 years
    * Select N to In last 6 months to 2 years
    * Select Y to Over 2 years
    * Select N to Over 2 years
    * Select Y to 13. Are you thinking of harming or killing yourself NOW?
    * Select N to 13. Are you thinking of harming or killing yourself NOW?
    * Select Y to 14. Have you ever been treated for alcohol drug other substance problems?
    * Select N to 14. Have you ever been treated for alcohol drug other substance problems?
    * Select Y to 15. Appears unusually emotional upset, anxious or fearful
    * Select N to 15. Appears unusually emotional upset, anxious or fearful
    * Select Y to 16. Is unable to sit still, sleep or stop talking
    * Select N to 16. Is unable to sit still, sleep or stop talking
    * Select Y to 17. Appears aggressive, threatening, menacing, belligerent, wont be calmed down;  has a history of angry outbursts
    * Select N to 17. Appears aggressive, threatening, menacing, belligerent, wont be calmed down;  has a history of angry outbursts
    * Select Y to 18. Is unable to understand or follow directions
    * Select N to 18. Is unable to understand or follow directions
    * Select Y to 19. Appears to be distracted, is disoriented is looking at or listening to things that others don't see or hear
    * Select N to 19. Appears to be distracted, is disoriented is looking at or listening to things that others don't see or hear
    * Select Y to 20. Has bruises, cuts, scrapes, burns on face, arms, back or other physical injuries or appears to have been traumatized in some way
    * Select N to 20. Has bruises, cuts, scrapes, burns on face, arms, back or other physical injuries or appears to have been traumatized in some way
    * Select Y to 21. Has been the victim of domestic violence or reports to having been traumatized in some way
    * Select N to 22. Cleared to general population
    * Select Y to 22. Cleared to general population
    * Select N to 23. Cleared to general population with appropriate referral to mental health care services
    * Select Y to 23. Cleared to general population with appropriate referral to mental health care services
    * Select N to 24. Referral to appropriate mental health care services for emergency treatment
    * Select Y to 24. Referral to appropriate mental health care services for emergency treatment
    And Click Save and Close button
    Examples:
      | Type                    |
      | Mental Health Screening |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Then Click Save button
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - Assessment"
    Then Click Next button
    And Select the Type - "<Type>"
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                      |
      | MH Refusal Treatment Form |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, MH - Appointment No-show"
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
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

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional, MH - Appointment Refusal
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
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

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional, MH - Involuntary Medication Report
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
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

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Behavioral Health Treatment Plan
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - PREA"
    Then Click Next button
    And Select the Type - "<Type>"
    Then Click on New button
    * Select the Tittle
    * Add Timestamp to Presenting Issue
    * Add Timestamp to Factors
    * Add Timestamp to Considerations
    * Add Timestamp to Problem Statement
    * Add Timestamp to Goal
    * Add Timestamp to Objective
    * Select the Target Date
    * Select the Complete Date
    * Select the Not Available as a Sign
    Then Click Save button
    Examples:
      | Type                             |
      | Behavioral Health Treatment Plan |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Brief Psychiatric Rating Scale (BPRS)
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - PREA"
    Then Click Next button
    And Select the Type - "<Type>"
    Then Click on New button
    * Enter the Score for SOMATIC CONCERNS
    * Enter the Score for ANXIETY
    * Enter the Score for DEPRESSION
    * Enter the Score for SUICIDALITY
    * Enter the Score for GUILT
    * Enter the Score for HOSTILITY
    * Enter the Score for ELEVATED MOOD
    * Enter the Score for GRANDIOSITY
    * Enter the Score for SUSPICIOUSNESS
    * Enter the Score for HALLUCINATIONS
    * Enter the Score for UNUSUAL THOUGHT CONTENT
    * Enter the Score for BIZARRE BEHAVIOR
    * Enter the Score for SELF-NEGLECT
    * Enter the Score for DISORIENTATION
    * Enter the Score for CONCEPTUAL DISORGANIZATION
    * Enter the Score for BLUNTED AFFECT
    * Enter the Score for EMOTIONAL WITHDRAWAL
    * Enter the Score for MOTOR RETARDATION
    * Enter the Score for TENSION
    * Enter the Score for UNCOOPERATIVENESS
    * Enter the Score for EXCITEMENT
    * Enter the Score for DISTRACTIBILITY
    * Enter the Score for MOTOR HYPERACTIVITY
    * Enter the Score for MANNERISMS & POSTURING
    * Enter the Score for
    Then Click Save button
    Examples:
      | Type                                  |
      | Brief Psychiatric Rating Scale (BPRS) |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Mandatory Disclosure and Information for Behavioral Health
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - PREA"
    Then Click Next button
    And Select the Type - "<Type>"
    Then Click on New button
    * Select the Not Available as a Sign
    * Select the Add as a Witness
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                                       |
      | Mandatory Disclosure and Information for Behavioral Health |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility,  Mental Status Exam
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - PREA"
    Then Click Next button
    And Select the Type - "<Type>"
    Then Click on New button
    * Add Timestamp to General Behavior
    * Add Timestamp to Attitude toward examiner
    * Add Timestamp to State of consciousness
    * Add Timestamp to Attention
    * Add Timestamp to Orientation
    * Add Timestamp to Psychomotor Activity
    * Add Timestamp to Mood
    * Add Timestamp to Affect
    * Add Timestamp to Speech
    * Add Timestamp to Form of thought
    * Add Timestamp to Content of thought
    * Add Timestamp to Perceptions
    * Add Timestamp to Judgment
    * Add Timestamp to Memory
    * Add Timestamp to Insight
    * Add Timestamp to Intellectual Functioning
    Then Click Save button
    Examples:
      | Type               |
      | Mental Status Exam |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Resource Consumption Scale (RCS)
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "MH - PREA"
    Then Click Next button
    And Select the Type - "<Type>"
    Then Click on New button
    * Select none in last 6 mos for Crisis frequency
    * Select 1 incident in last 6 mos for Crisis frequency
    * Select 2 incident in last 6 mos for Crisis frequency
    * Select 3 incident in last 6 mos for Crisis frequency
    * Enter the score for Crisis frequency
    * Select none in last 6 mos for Crisis recency
    * Select 1 incident in last 6 mos for Crisis recency
    * Select 2 incident in last 6 mos for Crisis recency
    * Select 3 incident in last 6 mos for Crisis recency
    * Enter the score for Crisis recency
    * Select none in last 6 mos for Self-injury episode frequency
    * Select 1 incident in last 6 mos for Self-injury episode frequency
    * Select 2 incident in last 6 mos for Self-injury episode frequency
    * Select 3 incident in last 6 mos for Self-injury episode frequency
    * Enter the score for Self-injury episode frequency
    * Select none in last 6 mos for Self-injury threat frequency
    * Select 1 incident in last 6 mos for Self-injury threat frequency
    * Select 2 incident in last 6 mos for Self-injury threat frequency
    * Select 3 incident in last 6 mos for Self-injury threat frequency
    * Enter the score for Self-injury threat frequency
    * Select none in last 6 mos for Placement in 4pt restraint frequency
    * Select 1 incident in last 6 mos for Placement in 4pt restraint frequency
    * Select 2 incident in last 6 mos for Placement in 4pt restraint frequency
    * Select 3 incident in last 6 mos for Placement in 4pt restraint frequency
    * Enter the score for Placement in 4pt restraint frequency
    * Select none in last 6 mos for Placement in 4pt restraint recency
    * Select 1 incident in last 6 mos for Placement in 4pt restraint recency
    * Select 2 incident in last 6 mos for Placement in 4pt restraint recency
    * Select 3 incident in last 6 mos for Placement in 4pt restraint recency
    * Enter the score for Placement in 4pt restraint recency
    * Select none in last 6 mos for Placement in ambulatory restraints
    * Select 1 incident in last 6 mos for Placement in ambulatory restraints
    * Select 2 incident in last 6 mos for Placement in ambulatory restraints
    * Select 3 incident in last 6 mos for Placement in ambulatory restraints
    * Enter the score for Placement in ambulatory restraints
    * Select none in last 6 mos for Placement in stripped cell
    * Select 1 incident in last 6 mos for Placement in stripped cell
    * Select 2 incident in last 6 mos for Placement in stripped cell
    * Select 3 incident in last 6 mos for Placement in stripped cell
    * Enter the score for Placement in stripped cell
    * Select none in last 6 mos for Infirmary admissions
    * Select 1 incident in last 6 mos for Infirmary admissions
    * Select 2 incident in last 6 mos for Infirmary admissions
    * Select 3 incident in last 6 mos for Infirmary admissions
    * Enter the score for Infirmary admissions
    * Select none in last 6 mos for Patient at CMHIP or housed at a CDOC SNU F
    * Select 1 incident in last 6 mos for Patient at CMHIP or housed at a CDOC SNU F
    * Select 2 incident in last 6 mos for CMHIP or housed at a CDOC SNU F
    * Select 3 incident in last 6 mos for CMHIP or housed at a CDOC SNU F
    * Enter the score for CMHIP or housed at a CDOC SNU F
    * Select the Add as a Witness
    Then Click Save button
    Examples:
      | Type                             |
      | Resource Consumption Scale (RCS) |

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility9
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
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

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility10
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "157390"
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

  Scenario Outline: Create New Mental Health Encounters - Arkansas Valley Correctional Facility, Mental Health Infirmary Note/Safety Plan Follow-up
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "193445"
    And Go to Health -> Behavioral Health -> Mental Health Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Subjective Notes
    Then Click Save button
    Examples:
      | Type                                             |
      | Mental Health Infirmary Note                     |
      | Mental Health Safety Plan Follow-up              |
      | Mental Status Exam                               |
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




