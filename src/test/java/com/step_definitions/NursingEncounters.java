package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class NursingEncounters extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMIS.class);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Then("Click on a New button in Health Services Encounters")
    public void click_on_a_new_button_in_health_services_encounters() {

        logger.info("Click on a New button in Health Services Encounters");
        pages.getNursingEncountersPage().newButton.click();
    }

    @Then("Select the Complex - Bent County Correctional Facility")
    public void select_the_complex() {

        logger.info("Select the Complex");
        Select select = new Select(pages.getNursingEncountersPage().complex);
        select.selectByValue("100000009");
    }

    @Then("Select the Type - Administrative - Nursing")
    public void select_the_type() {

        logger.info("Select the Type");
        Select select = new Select(pages.getNursingEncountersPage().type);
        select.selectByValue("HT04");

    }

    @Then("Click Next button")
    public void click_next_button() {

        logger.info("Click Next button");
        pages.getNursingEncountersPage().nextButton.click();

    }

    @Then("Select Related Health Service Requests")
    public void select_related_health_service_requests() {

        logger.info("Select Related Health Service Requests");
    }

    @Then("Add Timestamp to Subjective Notes")
    public void add_timestamp_to_subjective_notes() {

        logger.info("Add Timestamp to Subjective Notes");
        pages.getNursingEncountersPage().timestamp.click();
    }

    @Then("Verify Medical Health Score displayed correctly in Header")
    public void verify_medical_health_score_displayed_correctly_in_header() {

        logger.info("Verify Medical Health Score displayed correctly in Header");
        String medicalScoreHeader = pages.getNursingEncountersPage().healthScoresHeader.getText();
        System.out.println("Medical header " + medicalScoreHeader);
        js.executeScript("window.scrollBy(3750,4000)", "");
        String medical = pages.getNursingEncountersPage().medical.getText();
        System.out.println("Medical " + medical);
    }

    @Then("Verify Dental Health Score displayed correctly in Header")
    public void verify_dental_health_score_displayed_correctly_in_header() {

    }

    @Then("Verify Psychological Health Score displayed correctly in Header")
    public void verify_psychological_health_score_displayed_correctly_in_header() {
    }

    @Then("Verify ID Health Score displayed correctly in Header")
    public void verify_id_health_score_displayed_correctly_in_header() {

    }

    @Then("Verify Sex Offender Health Score displayed correctly in Header")
    public void verify_sex_offender_health_score_displayed_correctly_in_header() {

    }

    @Then("Click {string} jump button")
    public void click_jump_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify {string} section")
    public void verify_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
