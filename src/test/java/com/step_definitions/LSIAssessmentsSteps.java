package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LSIAssessmentsSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMISSteps.class);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Then("Click on New button")
    public void click_on_new_button() {
        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        logger.info("Click on New button");
        pages.getLsiAssessmentsPage().newButton.click();
    }

    @Then("Choose Staff Name from the dropdown")
    public void choose_staff_name_from_the_dropdown() {

        logger.info("Choose Staff Name from the dropdown");
        WebElement staffNameAnaya = pages.getLsiAssessmentsPage().staffName;

        staffNameAnaya.sendKeys("a");
        staffNameAnaya.clear();
        staffNameAnaya.sendKeys("anaya");
        wait(1);
        staffNameAnaya.sendKeys(Keys.DOWN);
        staffNameAnaya.sendKeys(Keys.ENTER);

    }

    @Then("Go to Offender -> Offender Assessments -> LSI Assessments")
    public void go_to_offender_offender_assessments_lsi_assessments() {

        logger.info("Go to Offender -> Offender Assessments -> LSI Assessments");
        waitForClickability(pages.getLandingPage().hamburgerMenu, 10);
        hover(pages.getLandingPage().hamburgerMenu);
        waitForClickability(pages.getLandingPage().offenderFunctionalAreaButton, 10);
        pages.getLandingPage().offenderFunctionalAreaButton.click();
        waitForClickability(pages.getLandingPage().offenderAssessments, 10);
        pages.getLandingPage().offenderAssessments.click();
        waitForClickability(pages.getLandingPage().lsiAssessments, 10);
        pages.getLandingPage().lsiAssessments.click();

    }

    @Then("Make sure DOC {string} is displayed correctly")
    public void make_sure_doc_is_displayed_correctly(String DOCNumber) {

        logger.info("Make sure DOC " + DOCNumber + " is displayed correctly");
        wait(2);
//        switchToIFrameByID("iframeSearch");
        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        wait(2);
        String DOCNumberOnThePage = pages.getLsiAssessmentsPage().DOCNumber.getText();
        System.out.println(DOCNumberOnThePage);

        switch (DOCNumber) {
            case "190456":
                Assert.assertEquals("190456", DOCNumberOnThePage);
                System.out.println(DOCNumberOnThePage);
                break;

            case "187437":
                Assert.assertEquals("187437", DOCNumberOnThePage);
                System.out.println(DOCNumberOnThePage);
                break;
        }
    }

    @Then("Choose Test Source from the dropdown")
    public void choose_test_source_from_the_dropdown() {

        logger.info("Choose Test Source from the dropdown");
        WebElement testSourceDOC = pages.getLsiAssessmentsPage().testSource;
        testSourceDOC.click();
        pages.getLsiAssessmentsPage().docPrisons.click();

    }

    @Then("Enter {string} in the Number of adult prior convictions field")
    public void enter_for_number_of_adult_prior_convictions_field(String rating) {

        logger.info("Enter " + rating + " for Number of adult prior convictions");
        scrollDown(0, 250);

        pages.getLsiAssessmentsPage().numberOfAdultPriorConvictions.sendKeys(rating);
    }

    @Then("Enter {string} in the Number of present offenses field")
    public void enter_for_number_of_present_offenses(String rating) {

        logger.info("Enter " + rating + " for Number of present offenses");
        pages.getLsiAssessmentsPage().numberOfPresentOffenses.sendKeys(rating);

    }

    @Then("Enter {string} in the Number of times punished for institutional misconduct field")
    public void enter_for_number_of_times_punished_for_institutional_misconduct(String rating) {

        logger.info("Enter " + rating + " for Number of times punished for institutional misconduct");
        pages.getLsiAssessmentsPage().numberOfTimesPunishedForInstitutionalMisconduct.sendKeys(rating);

    }


    @Then("Enter {string} for 18.Participation or Performance \\(C) Rating")
    public void enter_for_participation_performance_c_rating(String rating) {

        logger.info("Enter " + rating + " for 18.Participation or Performance (C) Rating");

        Select select = new Select(pages.getLsiAssessmentsPage().participationPerformanceRate);
        select.selectByValue(rating);

    }

    @Then("Enter {string} for 21.Problems \\(SY) Rating")
    public void enter_for_problems_sy_rating(String rating) {

        logger.info("Enter " + rating + " for 21.Problems (SY) Rating");
        scrollDown(700, 800);

        Select select = new Select(pages.getLsiAssessmentsPage().problemsRate);
        select.selectByValue(rating);
    }

    @Then("Enter {string} for 23. Dissatisfaction with marital or equivalent situation \\(C)")
    public void enter_for_dissatisfaction_with_marital_or_equivalent_situation_c(String rating) {

        logger.info("Enter " + rating + " for 23. Dissatisfaction with marital or equivalent situation (C)");

        Select select = new Select(pages.getLsiAssessmentsPage().dissatisfactionWithMaritalOrEquivalentSituationRate);
        select.selectByValue(rating);

    }

    @Then("Enter {string} for 24. Nonrewarding, parental \\(CY)")
    public void enter_for_nonrewarding_parental_cy(String rating) {

        logger.info("Enter " + rating + " for 24. Nonrewarding, parental (CY)");

        Select select = new Select(pages.getLsiAssessmentsPage().nonrewardingParentalRate);
        select.selectByValue(rating);
    }

    @Then("Enter {string} for 25. Nonrewarding, other \\(CY)")
    public void enter_for_nonrewarding_other_cy(String rating) {

        logger.info("Enter " + rating + " for 25. Nonrewarding, other (CY)");

        Select select = new Select(pages.getLsiAssessmentsPage().nonrewardingOtherRate);
        select.selectByValue(rating);
    }

    @Then("Enter {string} for 27. Unsatisfactory \\(C)")
    public void enter_for_unsatisfactory_c(String rating) {

        logger.info("Enter " + rating + " for 27. Unsatisfactory \\(C)");
        scrollDown(800, 850);

        Select select = new Select(pages.getLsiAssessmentsPage().unsatisfactoryRate);
        select.selectByValue(rating);

    }

    @Then("Enter {string} for Number of address changes")
    public void enter_for_number_of_address_changes(String rating) {

        logger.info("Enter " + rating + " for Number of address changes");
        pages.getLsiAssessmentsPage().numberOfAddressChanges.sendKeys(rating);
    }

    @Then("Enter {string} for 31. Could make better use of time \\(CY)")
    public void enter_for_could_make_better_use_of_time_cy(String rating) {

        logger.info("Enter " + rating + " for 31. Could make better use of time (CY)");
        Select select = new Select(pages.getLsiAssessmentsPage().couldMakeBetterUseOfTimeRate);
        select.selectByValue(rating);
    }

    @Then("Enter {string} for 39. Alcohol problem, currently \\(SY, IN-2)")
    public void enter_for_alcohol_problem_currently_sy_in(String rating) {

        logger.info("Enter " + rating + " for 39. Alcohol problem, currently (SY, IN-2)");
        scrollDown(1100, 1350);

        Select select = new Select(pages.getLsiAssessmentsPage().alcoholProblemCurrentlyRate);
        select.selectByValue(rating);

    }

    @Then("Enter {string} for 40. Drug problem, currently \\(SY, IN-2)")
    public void enter_for_drug_problem_currently_sy_in(String rating) {

        logger.info("Enter " + rating + " for 40. Drug problem, currently (SY, IN-2)");
        Select select = new Select(pages.getLsiAssessmentsPage().drugProblemCurrentlyRate);
        select.selectByValue(rating);

    }

    @Then("Select 41. Law violation \\(SY, IN-2) checkbox")
    public void select_law_violation_sy_in_checkbox() {

        logger.info("Select 41. Law violation (SY, IN-2)");
        pages.getLsiAssessmentsPage().lawViolation.click();
    }

    @Then("Enter {string} for 51. Supportive of crime \\(C)")
    public void enter_for_supportive_of_crime_c(String rating) {

        logger.info("Enter " + rating + " for 51. Supportive of crime (C)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Select select = new Select(pages.getLsiAssessmentsPage().supportiveOfCrime);
        select.selectByValue(rating);

    }

    @Then("Enter {string} for 52. Unfavorable attitude toward convention \\(C)")
    public void enter_for_unfavorable_attitude_toward_convention_c(String rating) {

        logger.info("Enter " + rating + " for 52. Unfavorable attitude toward convention (C)");
        Select select = new Select(pages.getLsiAssessmentsPage().unfavorableAttitudeTowardConvention);
        select.selectByValue(rating);
    }

    @Then("Make sure the Assessment date is the same as today")
    public void make_sure_the_assessment_date_is_the_same_as_today() {
        logger.info("Make sure the Assessment date is the same as today");
        Assert.assertEquals(pages.getLsiAssessmentsPage().assessmentDate.getAttribute("value"), getTodaysDate());
    }

    @Then("Verify if checkbox {string} is unchecked by default")
    public void verify_if_checkbox_is_unchecked_by_default(String checkbox) {

        logger.info("Verify if checkbox " + checkbox + " is unchecked by default");

        switch (checkbox) {
            case "5. Arrested under age 16 (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().arrestedUnderAge16CheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().arrestedUnderAge16CheckboxValue));
                break;

            case "7. Escape history - institution (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckboxValue));
                break;

            case "9. Charge laid or probation/parole suspended during prior community supervision (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckboxValue));
                break;

            case "10. Record of assault/violence (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckboxValue));
                break;

            case "11. Currently unemployed (C)":
                scrollDown(800, 1100);
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().currentlyUnemployedCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().currentlyUnemployedCheckboxValue));
                break;

            case "12. Frequently unemployed (SY, IN-2)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().frequentlyUnemployedCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().frequentlyUnemployedCheckboxValue));
                break;

            case "13. Never employed for a full year (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckboxValue));
                break;

            case "14. Ever fired (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().everFiredCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().everFiredCheckboxValue));
                break;

            case "15. Less than regular grade 10 (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade10CheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade10CheckboxValue));
                break;

            case "16. Less than regular grade 12 (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade12CheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade12CheckboxValue));
                break;

            case "17. Suspended or expelled at least once (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckboxValue));
                break;

            case "22. Reliance upon social assistance (SY)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckboxValue));
                break;

            case "26. Criminal family/spouse (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().criminalFamilySpouseCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().criminalFamilySpouseCheckboxValue));
                break;

            case "29. High crime neighborhood (C)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckboxValue));
                break;

            case "30. No recent participation in organized activity (SY, IN-2)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckboxValue));
                break;

            case "32. A social isolate (CY)":
                scrollDown(1000, 1250);
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().aSocialIsolateCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().aSocialIsolateCheckboxValue));
                break;

            case "33. Some criminal acquaintances (CY)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                break;

            case "34. Some criminal friends (CY)" :
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                break;

            case "35. Very few pro-social acquaintances (CY)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckboxValue));
                break;

            case "36. Very few pro-social friends (CY)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckboxValue));
                break;

            case "37. Alcohol problem, ever (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().alcoholProblemEverCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().alcoholProblemEverCheckboxValue));
                break;

            case "38. Drug problem, ever (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().drugProblemEverCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().drugProblemEverCheckboxValue));
                break;

            case "41. Law violation (SY, IN-2)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lawViolationCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().lawViolationCheckboxValue));
                break;

            case "42. Marital/family (SY, IN-2)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().maritalFamilyCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().maritalFamilyCheckboxValue));
                break;

            case "43. School/Work (SY, IN-2)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().schoolWorkCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().schoolWorkCheckboxValue));
                break;

            case "44. Medical (SY, IN-2)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().medicalCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().medicalCheckboxValue));
                break;

            case "45. Other clinical indicators (SY, IN-2)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckboxValue));
                break;

            case "46. Moderate interference (CY)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().moderateInterferenceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().moderateInterferenceCheckboxValue));
                break;

            case "47. Severe interference (CY)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().severeInterferenceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().severeInterferenceCheckboxValue));
                break;

            case "48. Mental health treatment, past (L)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));
                break;

            case "49. Mental health treatment, current (CY)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));
                break;

            case "50. Psychological assessment indicated (C)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckboxValue));
                break;

            case "53. Poor attitude toward sentence/conviction (C)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckboxValue));
                break;

            case "54. Poor attitude toward supervision (C)":
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckboxValue));

                break;

        }
    }

    @Then("Check the checkbox {string}")
    public void check_the_checkbox(String checkbox) {
        logger.info("Check the checkbox " + checkbox);

        switch (checkbox) {
            case "5. Arrested under age 16 (L)":
                pages.getLsiAssessmentsPage().arrestedUnderAge16Checkbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().arrestedUnderAge16CheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().arrestedUnderAge16CheckboxValue));
                break;

            case "7. Escape history - institution (L)":
                pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckboxValue));
                break;

            case "9. Charge laid or probation/parole suspended during prior community supervision (L)":
                pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckboxValue));
                break;

            case "10. Record of assault/violence (L)":
                pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckboxValue));
                break;

            case "11. Currently unemployed (C)":
                pages.getLsiAssessmentsPage().currentlyUnemployedCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().currentlyUnemployedCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().currentlyUnemployedCheckboxValue));
                break;

            case "12. Frequently unemployed (SY, IN-2)":
                pages.getLsiAssessmentsPage().frequentlyUnemployedCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().frequentlyUnemployedCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().frequentlyUnemployedCheckboxValue));
                break;

            case "13. Never employed for a full year (L)":
                pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckboxValue));
                break;

            case "14. Ever fired (L)":
                pages.getLsiAssessmentsPage().everFiredCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().everFiredCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().everFiredCheckboxValue));
                break;

            case "15. Less than regular grade 10 (L)":
                pages.getLsiAssessmentsPage().lessThanRegularGrade10Checkbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade10CheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade10CheckboxValue));
                break;

            case "16. Less than regular grade 12 (L)":
                pages.getLsiAssessmentsPage().lessThanRegularGrade12Checkbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade12CheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade12CheckboxValue));
                break;

            case "17. Suspended or expelled at least once (L)":
                pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckboxValue));
                break;

            case "22. Reliance upon social assistance (SY)":
                pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckboxValue));
                break;

            case "26. Criminal family/spouse (L)":
                pages.getLsiAssessmentsPage().criminalFamilySpouseCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().criminalFamilySpouseCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().criminalFamilySpouseCheckboxValue));
                break;

            case "29. High crime neighborhood (C)":
                pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckboxValue));
                break;

            case "30. No recent participation in organized activity (SY, IN-2)":
                pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckboxValue));
                break;

            case "32. A social isolate (CY)":
                pages.getLsiAssessmentsPage().aSocialIsolateCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().aSocialIsolateCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().aSocialIsolateCheckboxValue));
                break;

            case "33. Some criminal acquaintances (CY)":
                pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                break;

            case "34. Some criminal friends (CY)" :
                pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                break;

            case "35. Very few pro-social acquaintances (CY)":
                pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckboxValue));
                break;

            case "36. Very few pro-social friends (CY)":
                pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckboxValue));
                break;

            case "37. Alcohol problem, ever (L)":
                pages.getLsiAssessmentsPage().alcoholProblemEverCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().alcoholProblemEverCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().alcoholProblemEverCheckboxValue));
                break;

            case "38. Drug problem, ever (L)":
                pages.getLsiAssessmentsPage().drugProblemEverCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().drugProblemEverCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().drugProblemEverCheckboxValue));
                break;

            case "41. Law violation (SY, IN-2)":
                pages.getLsiAssessmentsPage().lawViolationCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lawViolationCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().lawViolationCheckboxValue));
                break;

            case "42. Marital/family (SY, IN-2)":
                pages.getLsiAssessmentsPage().maritalFamilyCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().maritalFamilyCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().maritalFamilyCheckboxValue));
                break;

            case "43. School/Work (SY, IN-2)":
                pages.getLsiAssessmentsPage().schoolWorkCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().schoolWorkCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().schoolWorkCheckboxValue));
                break;

            case "44. Medical (SY, IN-2)":
                pages.getLsiAssessmentsPage().medicalCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().medicalCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().medicalCheckboxValue));
                break;

            case "45. Other clinical indicators (SY, IN-2)":
                pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckboxValue));
                break;

            case "46. Moderate interference (CY)":
                pages.getLsiAssessmentsPage().moderateInterferenceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().moderateInterferenceCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().moderateInterferenceCheckboxValue));

                break;

            case "47. Severe interference (CY)":
                pages.getLsiAssessmentsPage().severeInterferenceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().severeInterferenceCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().severeInterferenceCheckboxValue));
                break;

            case "48. Mental health treatment, past (L)":
                pages.getLsiAssessmentsPage().mentalHealthTreatmentPastCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentPastCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentPastCheckboxValue));

                break;

            case "49. Mental health treatment, current (CY)":
                pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));

                break;
            case "50. Psychological assessment indicated (C)":
                pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckboxValue));
                break;

            case "53. Poor attitude toward sentence/conviction (C)":
                pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckboxValue));
                break;

            case "54. Poor attitude toward supervision (C)":
                pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckboxValue));
                Assert.assertTrue(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckboxValue));
                break;
        }
    }

    @Then("Uncheck the checkbox {string}")
    public void uncheck_the_checkbox(String checkbox) {
        logger.info("Uncheck the checkbox " + checkbox);
        switch (checkbox) {
            case "5. Arrested under age 16 (L)":
                pages.getLsiAssessmentsPage().arrestedUnderAge16Checkbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().arrestedUnderAge16CheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().arrestedUnderAge16CheckboxValue));
                break;

            case "7. Escape history - institution (L)":
                pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().escapeHistoryInstitutionCheckboxValue));
                break;

            case "9. Charge laid or probation/parole suspended during prior community supervision (L)":
                pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().chargeLaidOrProbationParoleCheckboxValue));
                break;

            case "10. Record of assault/violence (L)":
                pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().recordOfAssaultViolenceCheckboxValue));
                break;

            case "11. Currently unemployed (C)":
                pages.getLsiAssessmentsPage().currentlyUnemployedCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().currentlyUnemployedCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().currentlyUnemployedCheckboxValue));
                break;

            case "12. Frequently unemployed (SY, IN-2)":
                pages.getLsiAssessmentsPage().frequentlyUnemployedCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().frequentlyUnemployedCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().frequentlyUnemployedCheckboxValue));
                break;

            case "13. Never employed for a full year (L)":
                pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().neverEmployedForAFullYearCheckboxValue));
                break;

            case "14. Ever fired (L)":
                pages.getLsiAssessmentsPage().everFiredCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().everFiredCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().everFiredCheckboxValue));
                break;

            case "15. Less than regular grade 10 (L)":
                pages.getLsiAssessmentsPage().lessThanRegularGrade10Checkbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade10CheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade10CheckboxValue));
                break;

            case "16. Less than regular grade 12 (L)":
                pages.getLsiAssessmentsPage().lessThanRegularGrade12Checkbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade12CheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().lessThanRegularGrade12CheckboxValue));
                break;

            case "17. Suspended or expelled at least once (L)":
                pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().suspendedOrExpelledAtLeastOnceCheckboxValue));
                break;

            case "22. Reliance upon social assistance (SY)":
                pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().relianceUponSocialAssistanceCheckboxValue));
                break;

            case "26. Criminal family/spouse (L)":
                pages.getLsiAssessmentsPage().criminalFamilySpouseCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().criminalFamilySpouseCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().criminalFamilySpouseCheckboxValue));
                break;

            case "29. High crime neighborhood (C)":
                pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().highCrimeNeighborhoodCheckboxValue));
                break;

            case "30. No recent participation in organized activity (SY, IN-2)":
                pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().noRecentParticipationInOrganizedActivityCheckboxValue));
                break;

            case "32. A social isolate (CY)":
                pages.getLsiAssessmentsPage().aSocialIsolateCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().aSocialIsolateCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().aSocialIsolateCheckboxValue));
                break;

            case "33. Some criminal acquaintances (CY)":
                pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                break;

            case "34. Some criminal friends (CY)" :
                pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().someCriminalAcquaintancesCheckboxValue));
                break;

            case "35. Very few pro-social acquaintances (CY)":
                pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().veryFewPreSchoolAcquaintancesCheckboxValue));
                break;

            case "36. Very few pro-social friends (CY)":
                pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().veryFewProSocialFriendsCheckboxValue));
                break;

            case "37. Alcohol problem, ever (L)":
                pages.getLsiAssessmentsPage().alcoholProblemEverCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().alcoholProblemEverCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().alcoholProblemEverCheckboxValue));
                break;

            case "38. Drug problem, ever (L)":
                pages.getLsiAssessmentsPage().drugProblemEverCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().drugProblemEverCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().drugProblemEverCheckboxValue));
                break;

            case "41. Law violation (SY, IN-2)":
                pages.getLsiAssessmentsPage().lawViolationCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().lawViolationCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().lawViolationCheckboxValue));
                break;

            case "42. Marital/family (SY, IN-2)":
                pages.getLsiAssessmentsPage().maritalFamilyCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().maritalFamilyCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().maritalFamilyCheckboxValue));
                break;

            case "43. School/Work (SY, IN-2)":
                pages.getLsiAssessmentsPage().schoolWorkCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().schoolWorkCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().schoolWorkCheckboxValue));
                break;

            case "44. Medical (SY, IN-2)":
                pages.getLsiAssessmentsPage().medicalCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().medicalCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().medicalCheckboxValue));
                break;

            case "45. Other clinical indicators (SY, IN-2)":
                pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().otherClinicalIndicatorsCheckboxValue));
                break;

            case "46. Moderate interference (CY)":
                pages.getLsiAssessmentsPage().moderateInterferenceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().moderateInterferenceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().moderateInterferenceCheckboxValue));

                break;

            case "47. Severe interference (CY)":
                pages.getLsiAssessmentsPage().severeInterferenceCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().severeInterferenceCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().severeInterferenceCheckboxValue));
                break;

            case "48. Mental health treatment, past (L)":
                pages.getLsiAssessmentsPage().mentalHealthTreatmentPastCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentPastCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentPastCheckboxValue));

                break;

            case "49. Mental health treatment, current (CY)":
                pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().mentalHealthTreatmentCurrentCheckboxValue));

                break;
            case "50. Psychological assessment indicated (C)":
                pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().psychologicalAssessmentIndicatedCheckboxValue));
                break;

            case "53. Poor attitude toward sentence/conviction (C)":
                pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSentenceConvictionCheckboxValue));
                break;

            case "54. Poor attitude toward supervision (C)":
                pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckbox.click();
                System.out.println(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckboxValue));
                Assert.assertFalse(validateCheckBox(pages.getLsiAssessmentsPage().poorAttitudeTowardSupervisionCheckboxValue));
                break;
        }

    }

    @Then("Select {string} for Employment or Education Type")
    public void select_for(String employmentEducationType) {
        logger.info("Select " + employmentEducationType + " for Employment or Education Type");


        switch (employmentEducationType) {
            case "Homemaker":
                pages.getLsiAssessmentsPage().employmentEducationType.click();
                pages.getLsiAssessmentsPage().homemakerEmploymentType.click();
                break;
            case "Pensioner":
                pages.getLsiAssessmentsPage().employmentEducationType.click();
                pages.getLsiAssessmentsPage().pensionerEmploymentType.click();
                break;
            case "School":
                pages.getLsiAssessmentsPage().employmentEducationType.click();
                pages.getLsiAssessmentsPage().schoolEmploymentType.click();
                break;
            case "Work":
                pages.getLsiAssessmentsPage().employmentEducationType.click();
                pages.getLsiAssessmentsPage().workEmploymentType.click();
                break;
        }
    }

    @Then("Check if you can select a rating for question 18 only")
    public void check_if_you_can_select_a_rating_for_question_only() {
        logger.info("Check if you can select a rating for question 18 only");
        Select participationPerformanceRate = new Select(pages.getLsiAssessmentsPage().participationPerformanceRate);
        participationPerformanceRate.selectByValue("1");
    }

    @Then("Check if you can select a rating for questions 18, 19, and 20")
    public void check_if_you_can_select_a_rating_for_questions_and() {
        logger.info("Check if you can select a rating for questions 18, 19, and 20");

        Select participationPerformanceRate = new Select(pages.getLsiAssessmentsPage().participationPerformanceRate);
        participationPerformanceRate.selectByValue("1");

        Select peerInteractionsRate = new Select(pages.getLsiAssessmentsPage().peerInteractionsRate);
        peerInteractionsRate.selectByValue("2");

        Select authorityInteractionsRate = new Select(pages.getLsiAssessmentsPage().authorityInteractionsRate);
        authorityInteractionsRate.selectByValue("3");

    }



}
