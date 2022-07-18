Feature: Compute Monthly Payroll

  Scenario: Earned Time Awards for Case Manager, program cor
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Job Program Assignments
    Then Receive Job Program Assignments (IJPS010A) screen
    And Click Assigned Date Time hyperlink
    Then Receive Job Program Assignment (IJPS010B) screen
    And Click Edit button above Attendance browse grid
    Then Receive Job Program Assignment (IJPS010B) screen in Edit Mode


  Scenario Outline: Enter Daily Attendance for an Entire Section, ACC-General Population MIN/MINR
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "ACC-General Population MIN/MINR"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    And Receive Attendance List (IJPS065B) screen
    Then Click Save button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 005 - TC CANTEEN WAREHOUSE G  |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |


  Scenario Outline: Enter Daily Attendance for an Entire Section, ACC-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "ACC-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button

    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, AVCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "AVCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, AVCF-Protective Custody
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "AVCF-Protective Custody"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, AVCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "AVCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BCCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BCCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BCCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BCCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BUENA VISTA TRANSITIONAL WORK CENTER
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BUENA VISTA TRANSITIONAL WORK CENTER"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BVCF-General Population CLOSE
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BVCF-General Population CLOSE"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BVCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BVCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BVCF-Protective Custody
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BVCF-Protective Custody"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BVCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BVCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, BVMC-General Population MIN/MINR
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "BVMC-General Population MIN/MINR"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CCC-General Population MIN
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CCC-General Population MIN"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CCCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CCCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CCCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CCCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CCF-General Population
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CCF-General Population"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CCF-General Population CLOSE
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CCF-General Population CLOSE"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CSP-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CSP-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CSP-General Population Mgmt Status
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CSP-General Population Mgmt Status"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CSP-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CSP-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CTCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CTCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CTCF-Medical
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CTCF-Medical"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, CTCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CTCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |


  Scenario Outline: Enter Daily Attendance for an Entire Section, CTCF-Transportation Unit
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "CTCF-Transportation Unit"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DCC-General Population MIN
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DCC-General Population MIN  [DCC-GPI]"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DCC-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DCC-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DRDC-Medical
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DRDC-Medical"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DRDC-Reception
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DRDC-Reception"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DRDC-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DRDC-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DRDC-Unit 5
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DRDC-Unit 5"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DWCF-Classification Unit
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DWCF-Classification Unit"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DWCF-General Population Close
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DWCF-General Population Close"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DWCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DWCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DWCF-General Population Mgmt Status
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DWCF-General Population Mgmt Status"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DWCF-General Population MIN/MINR
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DWCF-General Population MIN/MINR"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, DWCF-Reception
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "DWCF-Reception"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, FCF-General Population CLOSE
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "FCF-General Population CLOSE"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, FCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "FCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, FCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "FCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, FMCC-General Population MIN/MINR
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "FMCC-General Population MIN/MINR"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, FMCC-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "FMCC-Restrictive Housing  [FMCC-RH]"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, LCF-General Population CLOSE
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "LCF-General Population CLOSE"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, LCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "LCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, LCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "LCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, LVCF-B Pod
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "LVCF-B Pod"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, LVCF-Classification Unit
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "LVCF-Classification Unit"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, LVCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "LVCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, Parole Facility-DRDC Parole Hold Unit
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "Parole Facility-DRDC Parole Hold Unit"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, Parole Facility-GPM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "Parole Facility-GPM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, PAROLE FACILITY-GPW
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "PAROLE FACILITY-GPW"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, RCC-General Population MIN
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "RCC-General Population MIN"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, RCC-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "RCC-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, SCCF-General Population
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "SCCF-General Population"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, SCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "SCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, SCF-General Population MEDIUM
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "SCF-General Population MEDIUM"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, SCF-General Population Mgmt Status
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "SCF-General Population Mgmt Status"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, SCF-General Population MIN/MINR
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "SCF-General Population MIN/MINR"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, SCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "SCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, TCF-General Population MIN/MINR
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "TCF-General Population MIN/MINR"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, TCF-Restrictive Housing
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "TCF-Restrictive Housing"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, YOS-CU At LVCF
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "YOS-CU At LVCF"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, YOS-General Population
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "YOS-General Population"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |


  Scenario Outline: Enter Daily Attendance for an Entire Section, YOS-General Population Female
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "YOS-General Population Female"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |

  Scenario Outline: Enter Daily Attendance for an Entire Section, YOS-General Population Male
    Given Enter CMITSTR User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click Attendance List Search by Section
    Then Select the Facility Name - "YOS-General Population Male"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    Then Click on today's date
    And Click Search button
    Then Receive Attendance List (IJPS065B) screen
    And Select the Attendance Code
    And Enter Comments
    Then Click Next button
    Examples:
      | Assignment Category        | Type    | Section                       |
      | Correctional Industries    | 08.0210 | 001 - CANTEEN - G             |
      | Drug & Alcohol             | 02.0833 | 002 - A&D ELECTIVE AFTERCARE  |
      | Education                  | 01.0615 | 010 - NINE PAID GED           |
      | Facility Work Assignment   | 07.0175 | 001 - TC - AM FOOD SERVICE    |
      | Mental Health              | 04.0774 | 016 - SAMHSA ANGER MANAGEMENT |
      | Offender Self-Help Program | 16.0851 | 005 - SEVEN HABITS            |
      | Other                      | 05.0637 | 002 - STEPPING UP PROGRAM     |
      | Pre-Release                | 14.0952 | 001 - TRP B. GARCIA           |
      | Unassigned                 | 11.0198 | 001 - UNAS/AVAILABLE          |


  Scenario: Attendance browse grid, page 14
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "051036"
    Then Click Jobs and Programs
    And Click Job Program Assignments
    Then Receive Job-Program Assignments (IJPS010A) screen
    And Select Program
    Then Receive Job-Program Assignment (IJPS010B) screen
    And Click on the Row in the Attendance browse grid
    Then Receive Assignment Attendance (IJPS010D) screen
    And Click Batch Job Processing menu choice (under Administration tab)
    Then Click Other
    And Click Nightly Database Maintenance
    Then Receive the following pop-up message, "You choose 'Nightly Database Maintenance'"
    And Click to Continue


  Scenario Outline: Evaluate Inmate Performance, which must be done monthly, page 17
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click on Assignment Roster Search by Section
    Then Select the Facility Name - "ACC-General Population MIN/MINR"
    Then Select the Assignment Category as "<Assignment Category>"
    And Select the Assignment Type "<Type>"
    And Select the Section # "<Section>"
    And Click Search button
    Then Receive Assignment Roster Search by Section (IJPS060B)
    And Click in Next Perf. Eval. Date column for first inmate on list
    Then Receive Job Performance (IJPS010F) screen in Add Mode
    And Enter Required Fields
    Then Click Save Button
    And Repeat for every inmate in the grid
    Then Click Save Button
    And Receive Assignment Roster Search by Section
#    Then Click Batch Job Processing menu choice (under Administration tab)
#    And Click Other (menu)
#    Then Click Nightly Database Maintenance menu choice
#    And Receive the following pop-up message, you choose ‘Nightly Database Maintenance’
#    Then Click to Continue
#    And Click Payroll Roster Search menu choice
#    Then Receive Payroll Roster Search (IJPS061A) screen
#    And Enter Required Search Fields
#    Then Click Search Button
#    And Receive Payroll Rosters (IJPS061B) screen with your Section listed
#    Then Click on Section
#    And Receive Payroll Roster (Pending) (IJPS061C)
    Examples:
      | Assignment Category     | Type    | Section           |
      | Correctional Industries | 08.0210 | 001 - CANTEEN - G |

  Scenario Outline: Run the night job (IJPM065) regarding missing performance evaluations
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "192152"
    Then Click Jobs and Programs
    And Click on Assignment Roster Search by Location
    Then Select the Facility Name - "<Facility Name>"
    Then Select the Section Location as "<Section Location>"
    And Click Search button
    And Click Nightly Database Maintenance menu choice
    Then Receive the following pop-up message, you choose 'Nightly Database Maintenance'
    And Click to Continue

    Examples:
      | Facility Name                   | Section Location     |
      | ACC-General Population MIN/MINR | TC - PM FOOD SERVICE |

