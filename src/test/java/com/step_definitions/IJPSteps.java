package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IJPSteps extends BrowserUtils {
    Pages pages = new Pages();
    Logger logger = Logger.getLogger(LoginSteps.class);

    @Given("Enter CMITSTR User ID and Password at DeCORuM login screen")
    public void enter_bh_tester_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter BH_tester User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("CMITSTR");
        pages.getLoginPage().password.sendKeys("pepsi123");
    }

    @Then("Click on Prison Tab")
    public void click_on_prison_tab() {
        logger.info("Click on Prison Tab");
    }

    @Then("Click on Reports")
    public void click_on_reports() {
        logger.info("Click on Reports");
        Driver.getDriver().manage().window().maximize();
        hover(pages.getLandingPage().reports);
        pages.getLandingPage().reports.click();
        //waitForClickability(pages.getLandingPage().reports, 10);

    }

    @Then("Click Inmate Record")
    public void click_inmate_record() {
        logger.info("Click Inmate Record");
        Driver.getDriver().manage().window().maximize();
        hover(pages.getLandingPage().inMateRecords);
        pages.getLandingPage().inMateRecords.click();
    }

    @Then("Click Inmate Case Notes")
    public void click_inmate_case_notes() {
        logger.info("Click Inmate Case Notes");
        hover(pages.getLandingPage().inmateCaseNotes);
        pages.getLandingPage().inmateCaseNotes.click();
    }


    @Then("Click Time Computation Reports")
    public void click_time_computation_reports() {
        logger.info("Click Time Computation Reports");
        // hover(pages.getLandingPage().timeComputationReports);
        //scrollToElement(pages.getLandingPage().timeComputationReports);
        pages.getLandingPage().timeComputationReports.click();
    }

    @Then("Click Earned Time Awards for Case Manager")
    public void click_earned_time_awards_for_case_manager() {
        logger.info("Click Earned Time Awards for Case Manager");
        pages.getLandingPage().earnedTimeAwardsForCaseManager.click();
    }

    @Then("Receive Job Submitter screen for this report")
    public void receive_job_submitter_screen_for_this_report() {
        logger.info("Receive Job Submitter screen for this report");
    }

    @Then("Click Submit Button")
    public void click_submit_button() {
        logger.info("Click Submit Button");
        pages.getIJPPage().submitButton.click();
    }

    @Then("Receive Job Submitter OMSS080 screen for this report")
    public void receive_job_submitter_omss080_screen_for_this_report() {
        logger.info("Receive Job Submitter OMSS080 screen for this report");
    }

    @Then("Enter the Current Case Manager")
    public void enter_the_current_case_manager() {
        logger.info("Enter the Current Case Manager");
        switchToIFrameByID("iframeMain");
        WebElement caseManager = pages.getIJPPage().currentCaseManager;
        pages.getIJPPage().currentCaseManager.click();
        caseManager.sendKeys("tester, cmi");
        waitForClickability(pages.getIJPPage().confirmCurrentCaseManager, 10);
        pages.getIJPPage().confirmCurrentCaseManager.click();

    }

    @Then("Select the Calendar Month")
    public void select_the_calendar_month() {
        logger.info("Select the Calendar Month");
        Select select = new Select(pages.getIJPPage().calendarMonth);
        select.selectByVisibleText("01-January");
    }

    @Then("Select the Calendar Year")
    public void select_the_calendar_year() {
        logger.info("Select the Calendar Year");
        Select select = new Select(pages.getIJPPage().calendarYear);
        select.selectByVisibleText("2001 [2001]");
    }

    @Then("Select the Trial Run")
    public void select_the_trial_run() {
        logger.info("Select the Trial Run");
        Select select = new Select(pages.getIJPPage().trialRun);
        select.selectByVisibleText("No [N]");
    }

    @Then("Select the Sort Sequence")
    public void select_the_sort_sequence() {
        logger.info("Select the Sort Sequence");
        Select select = new Select(pages.getIJPPage().sortSequence);
        select.selectByVisibleText("Case Manager, Inmate Name [3]");
    }

    @Then("Enter the Address")
    public void enter_the_address() {
        logger.info("Enter the Address");
    }

    @Then("Select the Calendar Month - {string}")
    public void select_the_calendar_month(String calendarMonth) {
        logger.info("Select the Calendar Month - " + calendarMonth);
        Select select = new Select(pages.getIJPPage().calendarMonth);
        select.selectByVisibleText(calendarMonth);
    }

    @Then("Select the Calendar Year as {string}")
    public void select_the_calendar_year_as(String calendarYear) {
        logger.info("Select the Calendar Year as " + calendarYear);
        Select select = new Select(pages.getIJPPage().calendarYear);
        select.selectByVisibleText(calendarYear);
    }

    @Then("Receive Inmate Case Notes ICCS020A screen")
    public void receive_inmate_case_notes_iccs020a_screen() {
        logger.info("Receive Inmate Case Notes ICCS020A screen");
    }

    @Then("Click New button above Inmate Case Notes browse grid")
    public void click_new_button_above_inmate_case_notes_browse_grid() {
        logger.info("Click New button above Inmate Case Notes browse grid");
        switchToIFrameByID("iframeMain");
        pages.getNursingEncountersPage().newButton.click();
    }

    @Then("Receive Inmate Case Note \\(ICCS020B) screen in Add Mode")
    public void receive_inmate_case_note_iccs020b_screen_in_add_mode() {
        logger.info("Receive Inmate Case Note (ICCS020B) screen in Add Mode");
    }

    @Then("Select the Category - {string}")
    public void select_the_category(String category) {
        logger.info("Select the Category - " + category);
        Select select = new Select(pages.getIJPPage().category);
        select.selectByVisibleText(category);
    }

    @Then("Select the Type as {string}")
    public void select_the_type_as(String type) {
        logger.info("Select the Type as " + type);
        Select select = new Select(pages.getIJPPage().type);
        select.selectByVisibleText(type);
    }

    @Then("Click Next Step Button")
    public void click_next_step_button() {
        logger.info("Click Next Step Button");
        pages.getIJPPage().nextButton.click();
    }

    @Then("Click Save and Continue button")
    public void click_save_and_continue_button() {
        logger.info("Click Save and Continue button");
        pages.getNursingEncountersPage().saveAndCloseButton.click();
    }

    @Then("Receive Inmate Case Notes browse screen with another row added")
    public void receive_inmate_case_notes_browse_screen_with_another_row_added() {
        logger.info("Receive Inmate Case Notes browse screen with another row added");
    }

    @Then("Click Time Computation")
    public void click_time_computation() {
        logger.info("Click Time Computation");
    }

    @Then("Click Sentence Credits Debits")
    public void click_sentence_credits_debits() {
        logger.info("Click Sentence Credits Debits");
    }

    @Then("Receive Sentence Credits Debits OTCS049A screen")
    public void receive_sentence_credits_debits_otcs049a_screen() {
        logger.info("Receive Sentence Credits Debits OTCS049A screen");
    }

    @Then("Click New button above Sentence Credits Debits browse grid")
    public void click_new_button_above_sentence_credits_debits_browse_grid() {
        logger.info("Click New button above Sentence Credits Debits browse grid");
    }

    @Then("Receive Sentence Credit Debit OTCS049B screen in Add Mode")
    public void receive_sentence_credit_debit_otcs049b_screen_in_add_mode() {
        logger.info("Receive Sentence Credit Debit OTCS049B screen in Add Mode");
    }

    @Then("Select the Credit Debit Type")
    public void select_the_credit_debit_type() {
        logger.info("Select the Credit Debit Type");
    }

    @Then("Click Missing CM Earned Time Awards")
    public void click_missing_cm_earned_time_awards() {
        logger.info("Click Missing CM Earned Time Awards");
    }

    @Then("Select the Location")
    public void select_the_location() {
        logger.info("Select the Location");
    }

    @Then("Receive Missing CM Earned Time Awards OTCR140")
    public void receive_missing_cm_earned_time_awards_otcr140() {
        logger.info("Receive Missing CM Earned Time Awards OTCR140");
    }

    @Then("Click the Next Step button")
    public void click_the_next_step_button() {
        logger.info("Click the Next Step button");
    }

    @Then("Enter the Days")
    public void enter_the_days() {
        logger.info("Enter the Days");
    }

    @Then("Add a Timestamp on Comments")
    public void add_a_timestamp_on_comments() {
        logger.info("Add a Timestamp on Comments");
    }

    @Then("Receive Sentence Credits Debits browse screen with another row added")
    public void receive_sentence_credits_debits_browse_screen_with_another_row_added() {
        logger.info("Receive Sentence Credits Debits browse screen with another row added");
    }


}
