Feature:  SOTMP Encounters

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    Then Make sure DOC "116046" is displayed correctly

  @smoke @wip
  Scenario Outline: Create New SOTMP Encounters - Arkansas Valley Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Arrowhead Correctional Center
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arrowhead Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Bent County Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Bent County Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Buena Vista Correctional Complex
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Buena Vista Correctional Complex"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Centennial Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Centennial Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Colorado Correctional Center (Camp George West)
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Colorado Correctional Center (Camp George West)"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Colorado State Penitentiary
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Colorado State Penitentiary"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Colorado Territorial Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Colorado Territorial Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Colorado Territorial Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Colorado Territorial Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Crowley County Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Crowley County Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Delta Correctional Center
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Delta Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Denver Reception And Diagnostic Center
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Denver Reception And Diagnostic Center"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Denver Womens Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Denver Womens Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Four Mile Correctional Center
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Four Mile Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Fremont Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Fremont Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - La Vista Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "La Vista Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Limon Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Limon Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - PAROLE FACILITY
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "PAROLE FACILITY"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Rifle Correctional Center
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Rifle Correctional Center"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - San Carlos Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "San Carlos Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Sterling Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Sterling Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Trinidad Correctional Facility
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Trinidad Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |

  Scenario Outline: Create New SOTMP Encounters - Youthful Offender System-Pueblo
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Youthful Offender System-Pueblo"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    Then Click Save button and Accept alert
    And Click Save and Close button
    Examples:
      | Type                                 |
      | SOTMP - Appointment No-show          |
      | SOTMP - Appointment Refusal          |
      | SOTMP - Assessment                   |
      | SOTMP - Discharge Summary            |
      | SOTMP - Family/Support               |
      | SOTMP - Group Counseling             |
      | SOTMP - Individual Counseling        |
      | SOTMP - Parole Board Summary         |
      | SOTMP - Participation Assessment     |
      | SOTMP - PREA 14 Day Intake Aggressor |
      | SOTMP - PREA 60 Day Referral         |
      | SOTMP - Psychological Services       |


  @smoke
  Scenario Outline: Create New SOTMP Encounters - Arkansas Valley Correctional Facility, Type - SOTMP - Multi-Disciplinary Team Staffing
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    * Add Timestamp to Incidental Comments
    * Select the Date of staffing
    * Enter the Current assigned facility
    * Add Timestamp to Staff in attendance with position titles
    * Add Timestamp to Topic of staffing
    * Add Timestamp to Decision or action
    And Click Save and Close button
    Examples:
      | Type                                     |
      | SOTMP - Multi-Disciplinary Team Staffing |


  Scenario Outline: Create New SOTMP Encounters - Arkansas Valley Correctional Facility, Type - SOTMP - Sexual Violence Diagnostics
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    And Click on a New button
    * Click Yes to ADS Information
    * Enter the Jurisdiction
    * Enter the Case Number
    * Enter the Conviction
    * Enter the Source
    * Select the Sexual Victimization
    * Select the Notes
    * Select the S101 None
    * Unselect the S101 None
    * Select the S230 Not recommended for treatment after sex offender classification review, or acquittal
    * Unselect the S230 Not recommended for treatment after sex offender classification review, or acquittal
    * Select the S235 Not recommended for treatment based upon Judicial finding of no sexual factual basis
    * Unselect the S235 Not recommended for treatment based upon Judicial finding of no sexual factual basis
    * Select the S240 Arrested or charged for sexual nature crime, and dismissed or dropped
    * Unselect the S240 Arrested or charged for sexual nature crime, and dismissed or dropped
    * Select the S245 Other sexual nature crime allegations
    * Unselect the S245 Other sexual nature crime allegations
    * Select the S250 Rape allegation in prison, institution or CJ Supervision
    * Unselect the S250 Rape allegation in prison, institution or CJ Supervision
    * Select the S255 All other sexual allegations in prison, institution or CJ supervision
    * Unselect the S255 All other sexual allegations in prison, institution or CJ supervision
    * Select the S260 Charged with sexual nature crime, case pending
    * Unselect the S260 Charged with sexual nature crime, case pending
    * Select the S335 Convicted of sexual abuse or rape under Code of Penal Discipline
    * Unselect the S335 Convicted of sexual abuse or rape under Code of Penal Discipline
    * Select the S340 DOC COPD I09 Rape or non-DOC equivalent before 712008 or with classification review on or after 712008
    * Unselect the S340 DOC COPD I09 Rape or non-DOC equivalent before 712008 or with classification review on or after 712008
    * Select the S345 1,2 Institutional violation convictions for masturbation or exposing of genitals to a victim with either before 712008 or victim with classification review on or after 712008
    * Unselect the S345 1,2 Institutional violation convictions for masturbation or exposing of genitals to a victim with either before 712008 or victim with classification review on or after 712008
    * Select the S350 3 Institutional violation convictions for masturbation or exposing of genitals to a victim before 712008 or with classification review on or after 712008
    * Unselect the S350 3 Institutional violation convictions for masturbation or exposing of genitals to a victim before 712008 or with classification review on or after 712008
    * Select the S353 Institutional violation convictions for sexual abuse before 712008 or with classification review after 712008
    * Unselect the S353 Institutional violation convictions for sexual abuse before 712008 or with classification review after 712008
    * Select the S354 Institutional violation convictions sexual misconduct before 712008 or with classification review on or after 712008
    * Unselect the S354 Institutional violation convictions sexual misconduct before 712008 or with classification review on or after 712008
    * Select the S355 Institutional violation convictions sexual harassment that does not include masturbation or exposing with any before 712008 or with classification review on or after 712008
    * Unselect the S355 Institutional violation convictions sexual harassment that does not include masturbation or exposing with any before 712008 or with classification review on or after 712008
    * Select the S450 Arrested or charged for a sexual nature crime, and was dismissed or dropped and is recommended for sexual violence behavioral health treatment after classification review was upheld
    * Unselect the S450 Arrested or charged for a sexual nature crime, and was dismissed or dropped and is recommended for sexual violence behavioral health treatment after classification review was upheld
    * Select the S455 Other sexual allegations and was classified as a sex offender after classification review
    * Unselect the S455 Other sexual allegations and was classified as a sex offender after classification review
    * Select the S560 Past adult felony sex conviction
    * Unselect the S560 Past adult felony sex conviction
    * Select the S565 Active adult felony sex offender
    * Unselect the S565 Active adult felony sex offender
    * Select the S570 Past or active juvenile sex adjudication
    * Unselect the S570 Past or active juvenile sex adjudication
    * Select the S575 Past or active Deferred Judgement and Sentence on sex crime
    * Unselect the S575 Past or active Deferred Judgement and Sentence on sex crime
    * Select the S580 Past or active adult misdemeanor sex conviction
    * Unselect the S580 Past or active adult misdemeanor sex conviction
    * Select the S585 Past or active mittimus with established sexual factual basis
    * Unselect the S585 Past or active mittimus with established sexual factual basis
    * Select the S590 Past or active felony or misdemeanor conviction for any institutional sexual assault
    * Unselect the S590 Past or active felony or misdemeanor conviction for any institutional sexual assault
    * Select the Static-99R Status
    * Select the SOTIPS Eligible
    * Select the Qualifier
    * Add Timestamp to Notes
    And Click Save button
    Examples:
      | Type                                |
      | SOTMP - Sexual Violence Diagnostics |

  Scenario Outline: Create New SOTMP Encounters - Arkansas Valley Correctional Facility, Type - SOTMP - Status Review
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Examples:
      | Type                  |
      | SOTMP - Status Review |

  Scenario Outline: Create New SOTMP Encounters - Arkansas Valley Correctional Facility, Type - SOTMP - Termination Review
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "116046"
    And Go to Health -> Behavioral Health -> SOTMP Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    Examples:
      | Type                       |
      | SOTMP - Termination Review |

