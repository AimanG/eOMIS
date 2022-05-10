Feature: Alcohol and Drug Encounters

  Scenario: Verify selected DOC number
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    Then Make sure DOC "191445" is displayed correctly

  @smoke
  Scenario Outline: Create New Alcohol and Drug Encounters for Complex - Arkansas Valley Correctional Facility
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

  Scenario Outline: Negative Scenario - Create New Alcohol and Drug Encounters for Complex - Arkansas Valley Correctional Facility without filling out mandatory fields 2
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "<Type>"
    Then Click Next button
    And Click on a New button
    Then Add Timestamp to Comments
    And Click Save and Close button
    Then Verify the Error Message

    Examples:
      | Type                      |
      | A&D - Appointment No-show |
      | A&D - Appointment Refusal |


  Scenario: Create New Alcohol and Drug Encounters with Type - A&D - Assessment
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Assessment"
    Then Click Next button
    And Add Timestamp to Subjective Notes
    Then Click Save button and Accept alert
    And Click on New button for LSI Assessment
    Then Select the Test Source
    * Enter "1" in the Number of adult prior convictions field
    * Enter "2" in the Number of present offenses field
    * Verify if checkbox "5. Arrested under age 16 (L)" is unchecked by default
    * Check the checkbox "5. Arrested under age 16 (L)"
    * Uncheck the checkbox "5. Arrested under age 16 (L)"
    * Verify if checkbox "7. Escape history - institution (L)" is unchecked by default
    * Check the checkbox "7. Escape history - institution (L)"
    * Uncheck the checkbox "7. Escape history - institution (L)"
    * Enter "1" in the Number of times punished for institutional misconduct field
    * Verify if checkbox "9. Charge laid or probation/parole suspended during prior community supervision (L)" is unchecked by default
    * Check the checkbox "9. Charge laid or probation/parole suspended during prior community supervision (L)"
    * Uncheck the checkbox "9. Charge laid or probation/parole suspended during prior community supervision (L)"
    * Verify if checkbox "10. Record of assault/violence (L)" is unchecked by default
    * Check the checkbox "10. Record of assault/violence (L)"
    * Uncheck the checkbox "10. Record of assault/violence (L)"
    * Verify if checkbox "11. Currently unemployed (C)" is unchecked by default
    * Verify if checkbox "12. Frequently unemployed (SY, IN-2)" is unchecked by default
    * Verify if checkbox "13. Never employed for a full year (L)" is unchecked by default
    * Verify if checkbox "14. Ever fired (L)" is unchecked by default
    * Verify if checkbox "15. Less than regular grade 10 (L)" is unchecked by default
    * Verify if checkbox "16. Less than regular grade 12 (L)" is unchecked by default
    * Verify if checkbox "17. Suspended or expelled at least once (L)" is unchecked by default
    * Select "Homemaker" for Employment or Education Type
    * Check if you can select a rating for question 18 only
    * Select "Pensioner" for Employment or Education Type
    * Check if you can select a rating for question 18 only
    * Select "School" for Employment or Education Type
    * Check if you can select a rating for questions 18, 19, and 20
    * Select "Work" for Employment or Education Type
    * Check if you can select a rating for questions 18, 19, and 20
    * Enter "1" for 21.Problems (SY) Rating
    * Verify if checkbox "22. Reliance upon social assistance (SY)" is unchecked by default
    * Check the checkbox "22. Reliance upon social assistance (SY)"
    * Uncheck the checkbox "22. Reliance upon social assistance (SY)"
    * Enter "1" for 23. Dissatisfaction with marital or equivalent situation (C)
    * Enter "2" for 24. Nonrewarding, parental (CY)
    * Enter "3" for 25. Nonrewarding, other (CY)
    * Verify if checkbox "26. Criminal family/spouse (L)" is unchecked by default
    * Check the checkbox "26. Criminal family/spouse (L)"
    * Uncheck the checkbox "26. Criminal family/spouse (L)"
    * Enter "1" for 27. Unsatisfactory (C)
    * Enter "2" for Number of address changes
    * Verify if checkbox "29. High crime neighborhood (C)" is unchecked by default
    * Check the checkbox "29. High crime neighborhood (C)"
    * Uncheck the checkbox "29. High crime neighborhood (C)"
    * Verify if checkbox "30. No recent participation in organized activity (SY, IN-2)" is unchecked by default
    * Check the checkbox "30. No recent participation in organized activity (SY, IN-2)"
    * Uncheck the checkbox "30. No recent participation in organized activity (SY, IN-2)"
    * Enter "0" for 31. Could make better use of time (CY)
    * Verify if checkbox "32. A social isolate (CY)" is unchecked by default
    * Verify if checkbox "33. Some criminal acquaintances (CY)" is unchecked by default
    * Verify if checkbox "34. Some criminal friends (CY)" is unchecked by default
    * Verify if checkbox "35. Very few pro-social acquaintances (CY)" is unchecked by default
    * Verify if checkbox "36. Very few pro-social friends (CY)" is unchecked by default
    * Verify if checkbox "37. Alcohol problem, ever (L)" is unchecked by default
    * Check the checkbox "37. Alcohol problem, ever (L)"
    * Uncheck the checkbox "37. Alcohol problem, ever (L)"
    * Verify if checkbox "38. Drug problem, ever (L)" is unchecked by default
    * Check the checkbox "38. Drug problem, ever (L)"
    * Uncheck the checkbox "38. Drug problem, ever (L)"
    * Enter "0" for 39. Alcohol problem, currently (SY, IN-2)
    * Enter "1" for 40. Drug problem, currently (SY, IN-2)
    * Add Timestamp to Specify Drug
    * Verify if checkbox "41. Law violation (SY, IN-2)" is unchecked by default
    * Check the checkbox "41. Law violation (SY, IN-2)"
    * Verify if checkbox "42. Marital/family (SY, IN-2)" is unchecked by default
    * Check the checkbox "42. Marital/family (SY, IN-2)"
    * Verify if checkbox "43. School/Work (SY, IN-2)" is unchecked by default
    * Check the checkbox "43. School/Work (SY, IN-2)"
    * Uncheck the checkbox "43. School/Work (SY, IN-2)"
    * Verify if checkbox "44. Medical (SY, IN-2)" is unchecked by default
    * Check the checkbox "44. Medical (SY, IN-2)"
    * Uncheck the checkbox "44. Medical (SY, IN-2)"
    * Verify if checkbox "45. Other clinical indicators (SY, IN-2)" is unchecked by default
    * Check the checkbox "45. Other clinical indicators (SY, IN-2)"
    * Uncheck the checkbox "45. Other clinical indicators (SY, IN-2)"
    * Verify if checkbox "46. Moderate interference (CY)" is unchecked by default
    * Check the checkbox "46. Moderate interference (CY)"
    * Uncheck the checkbox "46. Moderate interference (CY)"
    * Verify if checkbox "47. Severe interference (CY)" is unchecked by default
    * Check the checkbox "47. Severe interference (CY)"
    * Uncheck the checkbox "47. Severe interference (CY)"
    * Verify if checkbox "48. Mental health treatment, past (L)" is unchecked by default
    * Check the checkbox "48. Mental health treatment, past (L)"
    * Uncheck the checkbox "48. Mental health treatment, past (L)"
    * Verify if checkbox "49. Mental health treatment, current (CY)" is unchecked by default
    * Check the checkbox "49. Mental health treatment, current (CY)"
    * Uncheck the checkbox "49. Mental health treatment, current (CY)"
    * Verify if checkbox "50. Psychological assessment indicated (C)" is unchecked by default
    * Check the checkbox "50. Psychological assessment indicated (C)"
    * Uncheck the checkbox "50. Psychological assessment indicated (C)"
    * Enter "0" for 51. Supportive of crime (C)
    * Enter "1" for 52. Unfavorable attitude toward convention (C)
    * Verify if checkbox "53. Poor attitude toward sentence/conviction (C)" is unchecked by default
    * Check the checkbox "53. Poor attitude toward sentence/conviction (C)"
    * Uncheck the checkbox "53. Poor attitude toward sentence/conviction (C)"
    * Verify if checkbox "54. Poor attitude toward supervision (C)" is unchecked by default
    * Check the checkbox "54. Poor attitude toward supervision (C)"
    * Uncheck the checkbox "54. Poor attitude toward supervision (C)"
    And Click Continue button
    Then Click Save button and Accept alert
    And Click Save and Close button

  Scenario: Create New Alcohol and Drug Encounters with Type - A&D - Group Counseling
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Group Counseling"
    Then Click Next button
    And Add Timestamp to Subjective Notes
    Then Click Save button
    * Select the Start Group radio button
    * Select the Progress Note radio button
    * Select the Progress radio button
    * Select the No Change radio button
    * Select the Regress radio button
    * Select the End Group radio button
    And Click Save and Close button


  Scenario: Create New Alcohol and Drug Encounters with Type - A&D - Individual Counseling
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Individual Counseling"
    Then Click Next button
    And Add Timestamp to Subjective Notes
    Then Click Save button
    And Click Save and Close button


  Scenario: Create New Alcohol and Drug Encounters with Type - A&D - Intake
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Intake"
    Then Click Next button
    And Add Timestamp to Subjective Notes
    Then Click Save button
    And Click Save and Close button


  Scenario: Create New Alcohol and Drug Encounters with Type - A&D - Multi-Disciplinary Team Staffing
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Multi-Disciplinary Team Staffing"
    Then Click Next button
    * Select the Date of staffing
    * Enter the Current assigned facility
    * Add Timestamp to Staff in attendance with position titles
    * Add Timestamp to Topic of staffing
    * Add Timestamp to Decision or action
    And Click Save and Close button

#
  Scenario: Create New Alcohol and Drug Encounters with Type - A&D - Status Review
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Status Review"
    Then Click Next button
    And Add Timestamp to Subjective Notes
    Then Click Save button
    And Click Save and Close button

  Scenario Outline: Create New Alcohol and Drug Encounters for Complex - Arkansas Valley Correctional Facility3
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Progress Review"
    Then Click Next button
    And Select the Standard Form as "<Standard Forms>"
    And Click on a New button
    * Enter the Supervisor Name
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
      | Standard Forms                                             |
      | A&D Treatment Level Qualifier                              |
      | Adult Substance Use Survey                                 |
      | Mandatory Disclosure and Information for Behavioral Health |


  Scenario Outline: Create New Alcohol and Drug Encounters for Complex - Arkansas Valley Correctional Facility4
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Treatment Packet Documents"
    Then Click Next button
    And Select the Standard Form as "<Standard Forms>"
    And Click on a New button
    * Select the Not Available as a Sign
    * Select the Add as a Witness
    And Click Save and Close button
    Examples:
      | Standard Forms                                            |
      | Client Responsibilities                                   |
      | Client's Rights                                           |
      | Confidentiality of Alcohol and Drug Abuse Patient Records |
      | Consent for Treatment and Follow-up Contact               |
      | Counselor Disclosure Statement                            |
      | Notice of Directives                                      |
      | TC Treatment Consent and Agreement                        |


  Scenario Outline: Create New Alcohol and Drug Encounters for Complex - Arkansas Valley Correctional Facility41
    Given Enter BH_tester User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "191445"
    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
    And Click on a New button in Health Services Encounters
    Then Select the Complex - "Arkansas Valley Correctional Facility"
    And Select the Type - "A&D - Treatment Packet Documents"
    Then Click Next button
    And Select the Standard Form as "<Standard Forms>"
    And Click on a New button
    * Select the Not Available as a Sign
    And Click Save and Close button
    Examples:
      | Standard Forms                                            |
      | Outpatient Classroom Rules                                |


#  Scenario: Create New Alcohol and Drug Encounters with Type - A&D - Treatment/Service Plan
#    Given Enter BH_tester User ID and Password at DeCORuM login screen
#    When Click Logon button
#    Then Select the Offender "191445"
#    And Go to Health -> Behavioral Health -> Alcohol and Drug Encounters
#    And Click on a New button in Health Services Encounters
#    Then Select the Complex - "Arkansas Valley Correctional Facility"
#    And Select the Type - "A&D - Treatment/Service Plan"
#    Then Click Next button
#    And Add Timestamp to Subjective Notes
#    Then Click Save button
#    And Click Save and Close button


