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

public class DefineJobsAndProgramsSteps extends BrowserUtils {
    Pages pages = new Pages();
    Logger logger = Logger.getLogger(LoginSteps.class);

    @Then("Click Support menu")
    public void click_support_menu() {
        logger.info("Click Support menu");
        Driver.getDriver().manage().window().maximize();
        waitForClickability(pages.getLandingPage().hamburgerMenu, 10);
        hover(pages.getLandingPage().hamburgerMenu);
        waitForClickability(pages.getLandingPage().supportFunctionalAreaButton, 10);
        pages.getLandingPage().supportFunctionalAreaButton.click();

    }

    @Then("Click Correctional Facility Information menu")
    public void click_correctional_facility_information_menu() {
        logger.info("Click Correctional Facility Information menu");
        waitForClickability(pages.getLandingPage().correctionalFacilityInformation, 10);
        pages.getLandingPage().correctionalFacilityInformation.click();
    }

    @Then("Click Next Step icon")
    public void click_next_step_icon() {
        logger.info("Click Next Step icon");
    }

    @Then("Receive the Housing Facility \\(FSRS005C) detail screen")
    public void receive_the_housing_facility_fsrs005c_detail_screen() {
        logger.info("Receive the Housing Facility \\(FSRS005C) detail screen");
    }

    @Then("Click Facility Search by Name ID menu")
    public void click_facility_search_by_name_id_menu() {
        logger.info("Click Facility Search by Name ID menu");
        waitForClickability(pages.getLandingPage().facilitySearchByNameID, 10);
        pages.getLandingPage().facilitySearchByNameID.click();
    }

    @Then("Choose Enter Complex Name as {string}")
    public void choose_enter_complex_name_as(String complexName) {
        logger.info("Choose Enter Complex Name as " + complexName);
        pages.getDefineJobsAndProgramsPage().complexName.click();
        pages.getDefineJobsAndProgramsPage().complexNameSearchBySectionInput.sendKeys(complexName);
        pages.getDefineJobsAndProgramsPage().complexNameSearchBySectionInput.sendKeys(Keys.ENTER);
        wait(1);
    }

    @Then("Receive the Facility Search by Name ID \\(FSRS005A) search screen")
    public void receive_the_facility_search_by_name_id_fsrs005a_search_screen() {
        logger.info("Receive the Facility Search by Name ID (FSRS005A) search screen");
    }

    @Then("Enter Choose Facility Name")
    public void enter_choose_facility_name() {
        logger.info("Enter Choose Facility Name");
    }
    @Then("Click Assignments menu")
    public void click_assignments_menu() {

    }
    @Then("Click Assignments Offered Search menu")
    public void click_assignments_offered_search_menu() {

    }
    @Then("Receive the Assignments Offered Search \\(FSRS041A) search screen")
    public void receive_the_assignments_offered_search_fsrs041a_search_screen() {

    }
    @Then("Choose Enter {string}")
    public void choose_enter(String string) {

    }
    @Then("Click the Search button")
    public void click_the_search_button() {

    }
    @Then("Receive the Assignments Offered \\(FSRS041B) browse screen")
    public void receive_the_assignments_offered_fsrs041b_browse_screen() {

    }
    @Then("Click the Facility Name hyperlink description")
    public void click_the_facility_name_hyperlink_description() {

    }
    @Then("Receive the Facility Job Assignment \\(FSRS040C) detail screen")
    public void receive_the_facility_job_assignment_fsrs040c_detail_screen() {

    }

    @Then("Click Assignment Profile Search menu")
    public void click_assignment_profile_search_menu() {

    }

    @Then("Receive the Assignment Profile Search \\(FSRS047A) screen")
    public void receive_the_assignment_profile_search_fsrs047a_screen() {

    }

    @Then("Then Enter Choose {string}")
    public void then_enter_choose(String string) {

    }

    @Then("Then Enter Choose Assignment Tittle")
    public void then_enter_choose_assignment_tittle() {

    }

    @Then("Receive the Assignment Profiles \\(FSRS047B) browse screen")
    public void receive_the_assignment_profiles_fsrs047b_browse_screen() {

    }

    @Then("Click the Type hyperlink description")
    public void click_the_type_hyperlink_description() {

    }

    @Then("Click the Eligibility Criteria hyperlink description")
    public void click_the_eligibility_criteria_hyperlink_description() {

    }

    @Then("Receive the Assignment Eligibility Criteria \\(FSRS047D) detail screen")
    public void receive_the_assignment_eligibility_criteria_fsrs047d_detail_screen() {

    }

    @Then("Click the Prior Page button")
    public void click_the_prior_page_button() {

    }



}
