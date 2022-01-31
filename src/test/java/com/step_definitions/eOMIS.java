package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class eOMIS extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMIS.class);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Enter User ID and Password at DeCORuM login screen")
    public void enter_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("OFULLTSTR");
        pages.getLoginPage().password.sendKeys("Water001");

    }

    @When("Click Logon button")
    public void click_logon_button() {
        logger.info("Click Logon button");
        pages.getLoginPage().logon.click();
    }

    @Then("Select the Offender")
    public void select_the_offender() {

        logger.info("Select the Offender");

        Driver.getDriver().manage().window().maximize();
        waitForClickability(pages.getLandingPage().offenderDOCLookup, 10);
        pages.getLandingPage().offenderDOCLookup.click();
        pages.getLandingPage().offenderDOCLookupSearch.sendKeys("190456");
        pages.getLandingPage().offenderDOCLookupSearch.sendKeys(Keys.ENTER);

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

        logger.info("Make sure DOC {string} is displayed correctly");
//        switchToIFrameByID("iframeMain");
        wait(1);
        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        String DOCNumberOnThePage = pages.getLsiAssessmentsPage().DOCNumber.getText();
        System.out.println(DOCNumberOnThePage);
        Assert.assertEquals(DOCNumber, DOCNumberOnThePage);
    }

    @Then("Click on New button")
    public void click_on_new_button() {

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

    @Then("Choose Test Source from the dropdown")
    public void choose_test_source_from_the_dropdown() {

        logger.info("Choose Test Source from the dropdown");
        WebElement testSourceDOC = pages.getLsiAssessmentsPage().testSource;
        testSourceDOC.click();
        pages.getLsiAssessmentsPage().docPrisons.click();

    }

    @Then("Enter {string} for Number of adult prior convictions")
    public void enter_for_number_of_adult_prior_convictions(String rating) {

        logger.info("Enter " + rating + " for Number of adult prior convictions");
        js.executeScript("window.scrollBy(0,250)", "");

        pages.getLsiAssessmentsPage().numberOfAdultPriorConvictions.sendKeys(rating);
    }

    @Then("Enter {string} for Number of present offenses")
    public void enter_for_number_of_present_offenses(String rating) {

        logger.info("Enter " + rating + " for Number of present offenses");
        pages.getLsiAssessmentsPage().numberOfPresentOffenses.sendKeys(rating);

    }

    @Then("Enter {string} for Number of times punished for institutional misconduct")
    public void enter_for_number_of_times_punished_for_institutional_misconduct(String rating) {

        logger.info("Enter " + rating + " for Number of times punished for institutional misconduct");
        js.executeScript("window.scrollBy(250,500)", "");

        pages.getLsiAssessmentsPage().numberOfTimesPunishedForInstitutionalMisconduct.sendKeys(rating);

    }

    @Then("Choose Work for Employment or Education Type")
    public void choose_work_for_employment_education_type() {

        logger.info("Choose Work for Employment or Education Type");
        js.executeScript("window.scrollBy(500,700)", "");

        pages.getLsiAssessmentsPage().employmentEducationType.click();
        pages.getLsiAssessmentsPage().workEmploymentType.click();

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
        js.executeScript("window.scrollBy(700,800)", "");

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
        js.executeScript("window.scrollBy(800,850)", "");

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
        js.executeScript("window.scrollBy(1100,1350)", "");

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

    @Then("Click Continue button")
    public void click_continue_button() {

        logger.info("Click Continue button");
        pages.getLsiAssessmentsPage().continueButton.click();
    }

    @Then("Click Save button")
    public void click_save_button() {

        logger.info("Click Save button");
        pages.getLsiAssessmentsPage().saveButton.click();
        Driver.getDriver().switchTo().alert().accept();
    }


}
//Ctrl+Alt+L


