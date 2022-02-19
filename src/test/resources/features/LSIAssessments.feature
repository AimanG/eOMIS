@regression
Feature: LSI Assessments

  Scenario: Verify selected DOC number
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    And Click on New button
    Then Make sure DOC "190456" is displayed correctly

  Scenario: Verify Assessment Date
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    And Click on New button
    Then Make sure the Assessment date is the same as today

  Scenario: CRIMINAL HISTORY
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Enter "1" in the Number of adult prior convictions field
    Then Enter "2" in the Number of present offenses field
    And Verify if checkbox "5. Arrested under age 16 (L)" is unchecked by default
    Then Check the checkbox "5. Arrested under age 16 (L)"
    And Uncheck the checkbox "5. Arrested under age 16 (L)"
    Then Verify if checkbox "7. Escape history - institution (L)" is unchecked by default
    And Check the checkbox "7. Escape history - institution (L)"
    Then Uncheck the checkbox "7. Escape history - institution (L)"
    And Enter "1" in the Number of times punished for institutional misconduct field
    Then Verify if checkbox "9. Charge laid or probation/parole suspended during prior community supervision (L)" is unchecked by default
    And Check the checkbox "9. Charge laid or probation/parole suspended during prior community supervision (L)"
    Then Uncheck the checkbox "9. Charge laid or probation/parole suspended during prior community supervision (L)"
    And Verify if checkbox "10. Record of assault/violence (L)" is unchecked by default
    Then Check the checkbox "10. Record of assault/violence (L)"
    And Uncheck the checkbox "10. Record of assault/violence (L)"

  Scenario: EDUCATION/EMPLOYMENT
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Verify if checkbox "11. Currently unemployed (C)" is unchecked by default
    Then Check the checkbox "11. Currently unemployed (C)"
    And Uncheck the checkbox "11. Currently unemployed (C)"
    And Verify if checkbox "12. Frequently unemployed (SY, IN-2)" is unchecked by default
    Then Check the checkbox "12. Frequently unemployed (SY, IN-2)"
    And Uncheck the checkbox "12. Frequently unemployed (SY, IN-2)"
    And Verify if checkbox "13. Never employed for a full year (L)" is unchecked by default
    Then Check the checkbox "13. Never employed for a full year (L)"
    And Uncheck the checkbox "13. Never employed for a full year (L)"
    And Verify if checkbox "14. Ever fired (L)" is unchecked by default
    Then Check the checkbox "14. Ever fired (L)"
    And Uncheck the checkbox "14. Ever fired (L)"
    And Verify if checkbox "15. Less than regular grade 10 (L)" is unchecked by default
    Then Check the checkbox "15. Less than regular grade 10 (L)"
    And Uncheck the checkbox "15. Less than regular grade 10 (L)"
    And Verify if checkbox "16. Less than regular grade 12 (L)" is unchecked by default
    Then Check the checkbox "16. Less than regular grade 12 (L)"
    And Uncheck the checkbox "16. Less than regular grade 12 (L)"
    And Verify if checkbox "17. Suspended or expelled at least once (L)" is unchecked by default
    Then Check the checkbox "17. Suspended or expelled at least once (L)"
    And Uncheck the checkbox "17. Suspended or expelled at least once (L)"
    And Select "Homemaker" for Employment or Education Type
    Then Check if you can select a rating for question 18 only
    And Select "Pensioner" for Employment or Education Type
    Then Check if you can select a rating for question 18 only
    And Select "School" for Employment or Education Type
    Then Check if you can select a rating for questions 18, 19, and 20
    And Select "Work" for Employment or Education Type
    Then Check if you can select a rating for questions 18, 19, and 20

  Scenario: FINANCIAL
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Enter "1" for 21.Problems (SY) Rating
    And Verify if checkbox "22. Reliance upon social assistance (SY)" is unchecked by default
    Then Check the checkbox "22. Reliance upon social assistance (SY)"
    And Uncheck the checkbox "22. Reliance upon social assistance (SY)"

  Scenario: FAMILY/MARITAL
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    Then Enter "1" for 23. Dissatisfaction with marital or equivalent situation (C)
    And Enter "2" for 24. Nonrewarding, parental (CY)
    Then Enter "3" for 25. Nonrewarding, other (CY)
    And Verify if checkbox "26. Criminal family/spouse (L)" is unchecked by default
    Then Check the checkbox "26. Criminal family/spouse (L)"
    And Uncheck the checkbox "26. Criminal family/spouse (L)"

  Scenario: ACCOMMODATION
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Enter "1" for 27. Unsatisfactory (C)
    Then Enter "2" for Number of address changes
    And Verify if checkbox "29. High crime neighborhood (C)" is unchecked by default
    Then Check the checkbox "29. High crime neighborhood (C)"
    And Uncheck the checkbox "29. High crime neighborhood (C)"
#

  Scenario: LEISURE/RECREATION
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Verify if checkbox "30. No recent participation in organized activity (SY, IN-2)" is unchecked by default
    Then Check the checkbox "30. No recent participation in organized activity (SY, IN-2)"
    And Uncheck the checkbox "30. No recent participation in organized activity (SY, IN-2)"
    And Enter "0" for 31. Could make better use of time (CY)

  Scenario: COMPANIONS
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Verify if checkbox "32. A social isolate (CY)" is unchecked by default
    Then Check the checkbox "32. A social isolate (CY)"
    And Uncheck the checkbox "32. A social isolate (CY)"
    And Verify if checkbox "33. Some criminal acquaintances (CY)" is unchecked by default
    Then Check the checkbox "33. Some criminal acquaintances (CY)"
    And Uncheck the checkbox "33. Some criminal acquaintances (CY)"
    And Verify if checkbox "34. Some criminal friends (CY)" is unchecked by default
    Then Check the checkbox "34. Some criminal friends (CY)"
    And Uncheck the checkbox "34. Some criminal friends (CY)"
    And Verify if checkbox "35. Very few pro-social acquaintances (CY)" is unchecked by default
    Then Check the checkbox "35. Very few pro-social acquaintances (CY)"
    And Uncheck the checkbox "35. Very few pro-social acquaintances (CY)"
    And Verify if checkbox "36. Very few pro-social friends (CY)" is unchecked by default
    Then Check the checkbox "36. Very few pro-social friends (CY)"
    And Uncheck the checkbox "36. Very few pro-social friends (CY)"

  Scenario: ALCOHOL/DRUG PROBLEMS
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Verify if checkbox "37. Alcohol problem, ever (L)" is unchecked by default
    Then Check the checkbox "37. Alcohol problem, ever (L)"
    And Uncheck the checkbox "37. Alcohol problem, ever (L)"
    And Verify if checkbox "38. Drug problem, ever (L)" is unchecked by default
    Then Check the checkbox "38. Drug problem, ever (L)"
    And Uncheck the checkbox "38. Drug problem, ever (L)"
    Then Enter "0" for 39. Alcohol problem, currently (SY, IN-2)
    And Enter "1" for 40. Drug problem, currently (SY, IN-2)
    And Verify if checkbox "41. Law violation (SY, IN-2)" is unchecked by default
    Then Check the checkbox "41. Law violation (SY, IN-2)"
    And Uncheck the checkbox "41. Law violation (SY, IN-2)"
    And Verify if checkbox "42. Marital/family (SY, IN-2)" is unchecked by default
    Then Check the checkbox "42. Marital/family (SY, IN-2)"
    And Uncheck the checkbox "42. Marital/family (SY, IN-2)"
    And Verify if checkbox "43. School/Work (SY, IN-2)" is unchecked by default
    Then Check the checkbox "43. School/Work (SY, IN-2)"
    And Uncheck the checkbox "43. School/Work (SY, IN-2)"
    And Verify if checkbox "44. Medical (SY, IN-2)" is unchecked by default
    Then Check the checkbox "44. Medical (SY, IN-2)"
    And Uncheck the checkbox "44. Medical (SY, IN-2)"
    And Verify if checkbox "45. Other clinical indicators (SY, IN-2)" is unchecked by default
    Then Check the checkbox "45. Other clinical indicators (SY, IN-2)"
    And Uncheck the checkbox "45. Other clinical indicators (SY, IN-2)"

  Scenario: EMOTIONAL/PERSONAL
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Verify if checkbox "46. Moderate interference (CY)" is unchecked by default
    Then Check the checkbox "46. Moderate interference (CY)"
    And Uncheck the checkbox "46. Moderate interference (CY)"
    And Verify if checkbox "47. Severe interference (CY)" is unchecked by default
    Then Check the checkbox "47. Severe interference (CY)"
    And Uncheck the checkbox "47. Severe interference (CY)"
    And Verify if checkbox "48. Mental health treatment, past (L)" is unchecked by default
    Then Check the checkbox "48. Mental health treatment, past (L)"
    And Uncheck the checkbox "48. Mental health treatment, past (L)"
    And Verify if checkbox "49. Mental health treatment, current (CY)" is unchecked by default
    Then Check the checkbox "49. Mental health treatment, current (CY)"
    And Uncheck the checkbox "49. Mental health treatment, current (CY)"
    And Verify if checkbox "50. Psychological assessment indicated (C)" is unchecked by default
    Then Check the checkbox "50. Psychological assessment indicated (C)"
    And Uncheck the checkbox "50. Psychological assessment indicated (C)"

  @smoke
  Scenario: ATTITUDE/ORIENTATION
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    Then Click on New button
    And Enter "0" for 51. Supportive of crime (C)
    Then Enter "1" for 52. Unfavorable attitude toward convention (C)
    And Verify if checkbox "53. Poor attitude toward sentence/conviction (C)" is unchecked by default
    Then Check the checkbox "53. Poor attitude toward sentence/conviction (C)"
    And Uncheck the checkbox "53. Poor attitude toward sentence/conviction (C)"
    And Verify if checkbox "54. Poor attitude toward supervision (C)" is unchecked by default
    Then Check the checkbox "54. Poor attitude toward supervision (C)"
    And Uncheck the checkbox "54. Poor attitude toward supervision (C)"

  Scenario: Create LSI Assessment
    Given Enter User ID and Password at DeCORuM login screen
    When Click Logon button
    Then Select the Offender "190456"
    And Go to Offender -> Offender Assessments -> LSI Assessments
    And Click on New button
    Then Choose Staff Name from the dropdown
    And  Choose Test Source from the dropdown
    Then Enter "1" in the Number of adult prior convictions field
    And Enter "2" in the Number of present offenses field
    Then Enter "1" in the Number of times punished for institutional misconduct field
    And Select "Work" for Employment or Education Type
    Then Enter "0" for 18.Participation or Performance (C) Rating
    And Enter "1" for 21.Problems (SY) Rating
    Then Enter "1" for 23. Dissatisfaction with marital or equivalent situation (C)
    And Enter "1" for 24. Nonrewarding, parental (CY)
    Then Enter "2" for 25. Nonrewarding, other (CY)
    And Enter "1" for 27. Unsatisfactory (C)
    Then Enter "1" for Number of address changes
    And Enter "0" for 31. Could make better use of time (CY)
    Then Enter "1" for 39. Alcohol problem, currently (SY, IN-2)
    And Enter "2" for 40. Drug problem, currently (SY, IN-2)
    Then Select 41. Law violation (SY, IN-2) checkbox
    And Enter "0" for 51. Supportive of crime (C)
    Then Enter "1" for 52. Unfavorable attitude toward convention (C)
    And Click Continue button
    Then Click Save button