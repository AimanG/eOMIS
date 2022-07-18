package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class IJPSteps extends BrowserUtils {
    Pages pages = new Pages();
    Logger logger = Logger.getLogger(LoginSteps.class);

    @Given("Enter CMITSTR User ID and Password at DeCORuM login screen")
    public void enter_bh_tester_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter CMITSTR User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("CMITSTR");
        pages.getLoginPage().password.sendKeys("pepsi123");
    }

    @Given("Enter OMSAII User ID and Password at DeCORuM login screen")
    public void enter_omsaii_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter OMSAII User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("OFULLTSTR");
        pages.getLoginPage().password.sendKeys("Water001");
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

    @Then("Click Jobs and Programs")
    public void click_jobs_programs() {

        logger.info("Click Jobs and Programs");
        Driver.getDriver().manage().window().maximize();
        hover(pages.getLandingPage().jobAndPrograms);
        pages.getLandingPage().jobAndPrograms.click();
    }

    @Then("Click Job Program Assignments")
    public void click_job_program_assignments() {

        logger.info("Click Jobs and Programs");
        hover(pages.getLandingPage().jobProgramAssignments);
        pages.getLandingPage().jobProgramAssignments.click();
    }

    @Then("Receive Job Program Assignments \\(IJPS010A) screen")
    public void receive_job_program_assignments_ijps010a_screen() {
        logger.info("Receive Job Program Assignments (IJPS010A) screen");
    }

    @Then("Click Assigned Date Time hyperlink")
    public void click_assigned_date_time_hyperlink() {
        logger.info("Click Assigned Date Time hyperlink");
        pages.getIJPPage().assignedDateTime.click();

    }

    @Then("Receive Job Program Assignment \\(IJPS010B) screen")
    public void receive_job_program_assignment_ijps010b_screen() {
        logger.info("Receive Job Program Assignment (IJPS010B) screen");
    }

    @Then("Click Edit button above Attendance browse grid")
    public void click_edit_button_above_attendance_browse_grid() {
        logger.info("Click Edit button above Attendance browse grid");
    }

    @Then("Receive Job Program Assignment \\(IJPS010B) screen in Edit Mode")
    public void receive_job_program_assignment_ijps010b_screen_in_edit_mode() {
        logger.info("Receive Job Program Assignment (IJPS010B) screen in Edit Mode");
    }

    @Then("Click New in the Attendance grid")
    public void click_new_in_the_attendance_grid() {
        logger.info("Click New in the Attendance grid");
    }

    @Then("Receive Assignment Attendance \\(IJPS010D) screen in Add Mode")
    public void receive_assignment_attendance_ijps010d_screen_in_add_mode() {
        logger.info("Receive Assignment Attendance (IJPS010D) screen in Add Mode");
    }

    @Then("Enter Required Fields")
    public void enter_required_fields() {
        logger.info("Enter Required Fields");
    }

    @Then("Click Attendance List Search by Section")
    public void click_attendance_list_search_by_section() {
        logger.info("Click Attendance List Search by Section");
        hover(pages.getLandingPage().attendanceListSearchBySection);
        pages.getLandingPage().attendanceListSearchBySection.click();
    }

    @Then("Select the Facility Name - {string}")
    public void select_the_facility_name(String facilityName) {
        logger.info("Select the Facility Name - " + facilityName);

        switchToIFrameByID("iframeSearch");

        pages.getIJPPage().facilityName.click();
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(facilityName);
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(Keys.ENTER);

    }

    @Then("Select the Assignment Category as {string}")
    public void select_the_assignment_category_as(String assignmentCategory) {
        logger.info("Select the Assignment Category as " + assignmentCategory);
        pages.getIJPPage().assignmentCategory.click();
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(assignmentCategory);
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(Keys.ENTER);
        wait(1);
    }

    @Then("Select the Assignment Type {string}")
    public void select_the_assignment_type(String type) {
        logger.info("Select the Assignment Type");
        pages.getIJPPage().assignmentType.click();
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(type);
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(Keys.ENTER);
        wait(1);
    }

    @Then("Select the Section # {string}")
    public void select_the_section(String section) {
        logger.info("Select the Section #");
        pages.getIJPPage().sectionNo.click();

        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(section);
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(Keys.ENTER);

    }

    @Then("Click on today's date")
    public void click_on_today_s_date() {
        logger.info("Click on today's date");
        pages.getIJPPage().attendanceDate.click();
    }

    @Then("Click Search button")
    public void click_search_button() {
        logger.info("Click Search button");
        pages.getIJPPage().searchButton.click();
    }

    @Then("Receive Attendance List \\(IJPS065B) screen")
    public void receive_attendance_list_ijps065b_screen() {
        switchToDefailt();
        switchToIFrameByID("iframeMain");
        logger.info("Receive Attendance List (IJPS065B) screen");
    }


    @Then("Click Save Button")
    public void click_save_button() {
        logger.info("Click Save Button");
        pages.getIJPPage().saveButton.click();
    }

    @Then("Scroll to bottom of page and Click Produce Attendance Roster button")
    public void scroll_to_bottom_of_page_and_click_produce_attendance_roster_button() {
        logger.info("Scroll to bottom of page and Click Produce Attendance Roster button");
    }

    @Then("Receive Section Attendance Roster \\(IJPS065G) that includes these Inmates")
    public void receive_section_attendance_roster_ijps065g_that_includes_these_inmates() {
        logger.info("Receive Section Attendance Roster(IJPS065G) that includes these Inmates");
    }

    @Then("Click Printer Icon to Print Attendance List")
    public void click_printer_icon_to_print_attendance_list() {
        logger.info("Click Printer Icon to Print Attendance List");
    }

    @Then("Click Prior Page Button")
    public void click_prior_page_button() {
        logger.info("Click Prior Page Button");
    }

    @Then("Click Produce Absentee List button")
    public void click_produce_absentee_list_button() {
        logger.info("Click Produce Absentee List button");
    }

    @Then("Receive Section Absentee List \\(IJPS065E) that includes the inmate\\(s) marked as absentee")
    public void receive_section_absentee_list_ijps065e_that_includes_the_inmate_s_marked_as_absentee() {
        logger.info("Receive Section Absentee List (IJPS065E) that includes the inmate(s) marked as absentee");
    }

    @Then("Click the Printer Icon to Print Absentee List")
    public void click_the_printer_icon_to_print_absentee_list() {
        logger.info("Click the Printer Icon to Print Absentee List");
    }

    @Then("Select the Attendance Code")
    public void select_the_attendance_code() {
        logger.info("Select the Attendance Code");
        pages.getIJPPage().attendanceCode.click();
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys("A-Full Day Unexcused (No Pay)");
        pages.getIJPPage().attendanceListSearchBySectionInput.sendKeys(Keys.ENTER);

    }

    @Then("Enter Comments")
    public void enter_comments() {
        logger.info("Enter Comments");
        pages.getIJPPage().comments.sendKeys("OMSAII Tester");
    }


    @Then("Receive Job-Program Assignments \\(IJPS{int}A) screen")
    public void receiveJobProgramAssignmentsIJPSAScreen(int arg0) {
    }

    @And("Select Program")
    public void selectProgram() {
        switchToIFrameByID("iframeMain");
        pages.getIJPPage().assignedDateTimeFirstValue.click();
        wait(5);
    }

    @Then("Receive Job-Program Assignment \\(IJPS{int}B) screen")
    public void receiveJobProgramAssignmentIJPSBScreen(int arg0) {
    }

    @And("Click on the Row in the Attendance browse grid")
    public void clickOnTheRowInTheAttendanceBrowseGrid() {
        switchToIFrameByID("iframeMain");
        scrollDown(0, 250);
        wait(5);
        //pages.getIJPPage().attendanceYear.click();
    }

    @Then("Receive Assignment Attendance \\(IJPS{int}D) screen")
    public void receiveAssignmentAttendanceIJPSDScreen(int arg0) {
    }

    @And("Click Batch Job Processing menu choice \\(under Administration tab)")
    public void clickBatchJobProcessingMenuChoiceUnderAdministrationTab() {
    }

    @Then("Click Other")
    public void clickOther() {
    }

    @And("Click Nightly Database Maintenance")
    public void clickNightlyDatabaseMaintenance() {
    }

    @Then("Receive the following pop-up message, {string}")
    public void receiveTheFollowingPopUpMessage(String arg0) {
    }

    @And("Click to Continue")
    public void clickToContinue() {
    }

    @Then("Click on Assignment Roster Search by Location")
    public void click_on_assignment_roster_search_by_location() {
        logger.info("Click on Assignment Roster Search by Location");
        hover(pages.getLandingPage().assignmentRosterSearchByLocation);
        pages.getLandingPage().assignmentRosterSearchByLocation.click();
    }

    @Then("Click on Assignment Roster Search by Section")
    public void click_on_assignment_roster_search_by_section() {
        logger.info("Click Attendance List Search by Section");
        hover(pages.getLandingPage().assignmentRosterSearchBySection);
        pages.getLandingPage().assignmentRosterSearchBySection.click();
    }

    @Then("Receive Assignment Roster Search by Section \\(IJPS060B)")
    public void receive_assignment_roster_search_by_section_ijps060b() {

    }

    @Then("Click in Next Perf. Eval. Date column for first inmate on list")
    public void click_in_next_perf_eval_date_column_for_first_inmate_on_list() {

    }

    @Then("Receive Job Performance \\(IJPS010F) screen in Add Mode")
    public void receive_job_performance_ijps010f_screen_in_add_mode() {

    }

    @Then("Repeat for every inmate in the grid")
    public void repeat_for_every_inmate_in_the_grid() {

    }

    @Then("Receive Assignment Roster Search by Section")
    public void receive_assignment_roster_search_by_section() {

    }

    @Then("Select the Section Location as {string}")
    public void select_the_section_location_as(String string) {
    }

    @Then("Click Nightly Database Maintenance menu choice")
    public void click_nightly_database_maintenance_menu_choice() {

    }

    @Then("Receive the following pop-up message, you choose {string}")
    public void receive_the_following_pop_up_message_you_choose(String string) {
    }
}

