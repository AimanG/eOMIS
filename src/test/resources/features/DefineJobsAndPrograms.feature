Feature: Define Jobs and Programs

  Scenario Outline: View the Section Locations at the Correctional Facility
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Click Support menu
    And Click Correctional Facility Information menu
    Then Click Facility Search by Name ID menu
    And Choose Enter Complex Name as "<Complex Name>"
    Then Receive the Facility Search by Name ID (FSRS005A) search screen
    And Click Next Step icon
    Then Enter Choose Facility Name
    And Click Search button
    Then Receive the Housing Facility (FSRS005C) detail screen
    Examples:
      | Complex Name                                       |
      | Addiction Resrch & Trtmnt Srvcs (ARTS)-Univ of CO  |
      | Adult Females Housed At YOS                        |
      | Adult Males Housed At YOS                          |
      | Advantage Treatment Center                         |
      | All CO City Jails                                  |
      | All CO County Jails                                |
      | All Inactive Community Correction Centers          |
      | Arkansas Valley Correctional Facility              |
      | Arrowhead Correctional Center                      |
      | Bent County Correctional Facility                  |
      | Brush Correctional Facility                        |
      | Buena Vista Correctional Complex                   |
      | Buena Vista Minimum Center                         |
      | Centennial Ad Seg Holds                            |
      | Centennial Correctional Facility                   |
      | Cheyenne Mountain Re-Entry Center                  |
      | Colo Corrections Alternative Prog (BVCF Boot Camp) |
      | Colorado Correctional Center (Camp George West)    |
      | Colorado State Penitentiary                        |
      | Colorado State Penitentiary II                     |
      | Colorado Territorial Correctional Facility         |
      | Colorado Womens Correctional Facility              |
      | Columbine                                          |
      | COMCOR, Inc.                                       |
      | Community YOS Program - Phase 2                    |
      | Community YOS Program Phase 3                      |
      | CoreCivic                                          |
      | Crowley County Correctional Facility               |
      | Delta Correctional Center                          |
      | Denver County CBT Program                          |
      | Denver Reception And Diagnostic Center             |
      | Denver Womens Ad Seg                               |
      | Denver Womens Correctional Facility                |
      | Fort Lyon Correctional Facility                    |
      | Four Mile Correctional Center                      |
      | Fremont Correctional Facility                      |
      | GARFIELD COUNTY COMMUNITY CORRECTIONS              |
      | GEO Reentry Services                               |
      | High Plains Correctional Facility                  |
      | HILLTOP HOUSE                                      |
      | History                                            |
      | Huerfano Correctional Center                       |
      | Intensive Supervision - Inmate                     |
      | Interstate Correction Compact Transfer             |
      | Intervention, Inc.                                 |
      | Jail Contract Jail                                 |
      | Kit Carson Correctional Facility                   |
      | La Vista Correctional Facility                     |
      | La Vista Correctional Facility For Males           |
      | Larimer County Community Corrections               |
      | Limon Correctional Facility                        |
      | MESA COUNTY COMMUNITY CORRECTIONS                  |
      | Other Community Centers                            |
      | Out Of State Contract Facility                     |
      | PAROLE FACILITY                                    |
      | Pre-Release Center                                 |
      | Project Elevate/Denver County                      |
      | Pueblo Minimum Center                              |
      | Rifle Correctional Center                          |
      | RRK Enterprises dba Independence House             |
      | San Carlos Correctional Facility                   |
      | Shadow Mountain Correctional Facility              |
      | Skyline Correctional Center                        |
      | Sterling Correctional Facility                     |
      | Trinidad Correctional Facility                     |
      | Youth Offender Services-DRDC                       |
      | Youth Offender Services/CWCF                       |
      | Youth Offender System - Contract Facility          |
      | Youthful Offender System-Pueblo                    |
      | Youthful Offender System-Transfer                  |


  Scenario Outline: View the Section Locations at the Correctional Facility2
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Click Support menu
    And Click Correctional Facility Information menu
    Then Click Assignments menu
    And Click Assignments Offered Search menu
    Then Receive the Assignments Offered Search (FSRS041A) search screen
    And Choose Enter "<Complex Name>"
    Then Click Next Step icon
    And Click the Search button
    Then Receive the Assignments Offered (FSRS041B) browse screen
    And Click the Facility Name hyperlink description
    Then Enter Choose Facility Name
    And Receive the Facility Job Assignment (FSRS040C) detail screen
    Examples:
      | Complex Name |
      | Addiction Resrch & Trtmnt Srvcs (ARTS)-Univ of CO  |
      | Adult Females Housed At YOS                        |
      | Adult Males Housed At YOS                          |
      | Advantage Treatment Center                         |
      | All CO City Jails                                  |
      | All CO County Jails                                |
      | All Inactive Community Correction Centers          |
      | Arkansas Valley Correctional Facility              |
      | Arrowhead Correctional Center                      |
      | Bent County Correctional Facility                  |
      | Brush Correctional Facility                        |
      | Buena Vista Correctional Complex                   |
      | Buena Vista Minimum Center                         |
      | Centennial Ad Seg Holds                            |
      | Centennial Correctional Facility                   |
      | Cheyenne Mountain Re-Entry Center                  |
      | Colo Corrections Alternative Prog (BVCF Boot Camp) |
      | Colorado Correctional Center (Camp George West)    |
      | Colorado State Penitentiary                        |
      | Colorado State Penitentiary II                     |
      | Colorado Territorial Correctional Facility         |
      | Colorado Womens Correctional Facility              |
      | Columbine                                          |
      | COMCOR, Inc.                                       |
      | Community YOS Program - Phase 2                    |
      | Community YOS Program Phase 3                      |
      | CoreCivic                                          |
      | Crowley County Correctional Facility               |
      | Delta Correctional Center                          |
      | Denver County CBT Program                          |
      | Denver Reception And Diagnostic Center             |
      | Denver Womens Ad Seg                               |
      | Denver Womens Correctional Facility                |
      | Fort Lyon Correctional Facility                    |
      | Four Mile Correctional Center                      |
      | Fremont Correctional Facility                      |
      | GARFIELD COUNTY COMMUNITY CORRECTIONS              |
      | GEO Reentry Services                               |
      | High Plains Correctional Facility                  |
      | HILLTOP HOUSE                                      |
      | History                                            |
      | Huerfano Correctional Center                       |
      | Intensive Supervision - Inmate                     |
      | Interstate Correction Compact Transfer             |
      | Intervention, Inc.                                 |
      | Jail Contract Jail                                 |
      | Kit Carson Correctional Facility                   |
      | La Vista Correctional Facility                     |
      | La Vista Correctional Facility For Males           |
      | Larimer County Community Corrections               |
      | Limon Correctional Facility                        |
      | MESA COUNTY COMMUNITY CORRECTIONS                  |
      | Other Community Centers                            |
      | Out Of State Contract Facility                     |
      | PAROLE FACILITY                                    |
      | Pre-Release Center                                 |
      | Project Elevate/Denver County                      |
      | Pueblo Minimum Center                              |
      | Rifle Correctional Center                          |
      | RRK Enterprises dba Independence House             |
      | San Carlos Correctional Facility                   |
      | Shadow Mountain Correctional Facility              |
      | Skyline Correctional Center                        |
      | Sterling Correctional Facility                     |
      | Trinidad Correctional Facility                     |
      | Youth Offender Services-DRDC                       |
      | Youth Offender Services/CWCF                       |
      | Youth Offender System - Contract Facility          |
      | Youthful Offender System-Pueblo                    |
      | Youthful Offender System-Transfer                  |

  Scenario Outline: View the Section Locations at the Correctional Facility3
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Click Support menu
    And Click Correctional Facility Information menu
    Then Click Assignments menu
    And Click Assignment Profile Search menu
    Then Receive the Assignment Profile Search (FSRS047A) screen
    And Then Enter Choose "<Assignment Category>"
    Then Click Next Step icon
    And Then Enter Choose Assignment Tittle
    Then Click the Search button
    And Receive the Assignment Profiles (FSRS047B) browse screen
    Then Click the Type hyperlink description
    And Click the Eligibility Criteria hyperlink description
    Then Receive the Assignment Eligibility Criteria (FSRS047D) detail screen
    And Click the Prior Page button
    Examples:
      | Assignment Category |
      |                     |

  Scenario Outline: Add a Work Squad to a Facility
    Given Enter OMSAII User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Click Support menu
    And Click Correctional Facility Information menu
    Then Click Assignments menu
    And Facility Job Assignments Search menu
    Then Receive the Facility Job Assignments Search (FSRS040A) screen
    And Enter/Choose "<Facility Name>"
    Then Click the Checkbox for Show Discontinued Sections
    And Click the Search button
    Then Receive the Facility Job Assignments (FSRS040B) browse screen
    And Click the New button
    Then Receive the Facility Job Assignment (FSRS040C) detail screen
    * Choose/Enter Assignment Type
    * Choose/Enter Title
    * Choose/Enter Enter the Section
    * Choose/Enter Max Custody
    * Choose/Enter Daily Bonus Pay Eligible
    * Choose/Enter Capacity
    * Choose/Enter Common Area ID
    * Choose/Enter Inside/Outside Fence
    * Choose/Enter Status
    * Choose/Enter As of Date
    And Click the New button
    Then Receive the Job Assignment Position (FSRS040D) detail screen
    * Choose/Enter Position Title
    * Choose/Enter Type of Time
    * Choose/Enter Security Clearance
    * Choose/Enter Medical Clearance
    * Choose/Enter Food Handling Clearance
    * Choose/Enter Access to Computer Clearance
    * Choose/Enter Sex Offender Allowed
    * Choose/Enter Heavy Equipment Operator
    * Choose/Enter Works on Holiday
    * Choose/Enter Status
    * Choose/Enter As of Date
    * Choose/Enter Days of Week
    * Choose/Enter Period#
    * Choose/Enter Start Time
    * Choose/Enter End Time
    Then Click Next Step icon
    And Choose/Enter Comments
    Then Click the Save button
    And Receive the Facility Job Assignment (FSRS040C) screen
    Then Click the Position# hyperlink description
    And Receive the Job Assignment Position (FSRS040D) screen in update mode
    Then Click the Copy button
    And Receive the Job Assignment Position (FSRS040D) with Position # incremented by 1
    Then Click the Save button
    And Receive the Facility Job Assignment (FSRS040C) screen
    Then Click the Save button
    Examples:
      | Facility Name |
      |               |

    #page 13