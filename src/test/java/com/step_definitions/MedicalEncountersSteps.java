package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class MedicalEncountersSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMISSteps.class);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Then("Scroll down to {string} section")
    public void scroll_down_to_section(String sectionName) {
        logger.info("Scroll down to " + sectionName + "section");


        switch (sectionName) {
            case "Lab Test Orders":

                break;
            case "Objective":
                pages.getNursingEncountersPage().objectiveSection.click();
                break;
            case "X-Ray Orders":

                break;
            case "Consultation Request":

                break;
            case "Patient Transfer Holds":

                break;
            case "Other Actions/Procedures":

                break;

        }
    }

    @Then("Click on New button of Objective section")
    public void click_on_new_button_of_objective_section() {
        logger.info("Click on New button of Objective section");
        pages.getMedicalEncountersPage().newButtonObjective.click();

    }

    @Then("Make sure the page tittle is {string}")
    public void make_sure_the_page_tittle_is(String title) {
        logger.info("Make sure the page tittle is " + title);
        String titleOnPage = pages.getMedicalEncountersPage().title.getText();
        System.out.println(titleOnPage);
    }

    @Then("Enter the Weight")
    public void enter_the_weight() {
        logger.info("Enter the Weight");
        pages.getMedicalEncountersPage().weight.sendKeys("200");
    }

    @Then("Enter the Height")
    public void enter_the_height() {
        logger.info("Enter the Height");
        pages.getMedicalEncountersPage().height1.sendKeys("6");
        // pages.getMedicalEncountersPage().height2.sendKeys("0");

    }

    @Then("Enter the Body Temperature")
    public void enter_the_body_temperature() {
        logger.info("Enter the Body Temperature");
        pages.getMedicalEncountersPage().bodyTemperature.sendKeys("70");

    }

    @Then("Select the Method of Body Temperature")
    public void select_the_method_of_body_temperature() {
        logger.info("Select the Method of Body Temperature");
        Select select = new Select(pages.getMedicalEncountersPage().methodBodyTemperature);
        select.selectByValue("2");
    }

    @Then("Enter the Pulse Rate")
    public void enter_the_pulse_rate() {
        logger.info("Enter the Pulse Rate");
        pages.getMedicalEncountersPage().pulseRate.sendKeys("12");

    }

    @Then("Select the Method of Pulse Rate")
    public void select_the_method_of_pulse_rate() {
        logger.info("Select the Method of Pulse Rate");
        Select select = new Select(pages.getMedicalEncountersPage().methodPulseRate);
        select.selectByValue("A");
    }

    @Then("Enter the Blood Pressure")
    public void enter_the_blood_pressure() {
        logger.info("Enter the Blood Pressure");
        scrollDown(0, 250);
        pages.getMedicalEncountersPage().bloodPressure1.sendKeys("30");
        pages.getMedicalEncountersPage().bloodPressure2.sendKeys("31");
    }

    @Then("Select the Position")
    public void select_the_position() {
        logger.info("Select the Position");
        Select select = new Select(pages.getMedicalEncountersPage().position);
        select.selectByValue("2");
    }

    @Then("Enter the Respiration Rate")
    public void enter_the_respiration_rate() {
        logger.info("Enter the Respiration Rate");
        pages.getMedicalEncountersPage().respirationRate.sendKeys("1");
    }

    @Then("Enter the Pulse Ox.")
    public void enter_the_pulse_ox() {
        logger.info("Enter the Pulse Ox.");
        pages.getMedicalEncountersPage().pulseOx.sendKeys("1");
    }

    @Then("Enter the O2 Saturation")
    public void enter_the_o2_saturation() {
        logger.info("Enter the O2 Saturation");
        pages.getMedicalEncountersPage().o2Saturation.sendKeys("1");
    }

    @Then("Select the Source")
    public void select_the_source() {
        logger.info("Select the Source");
        Select select = new Select(pages.getMedicalEncountersPage().source);
        select.selectByValue("2");
    }

    @Then("Enter the Liters")
    public void enter_the_liters() {
        logger.info("Enter the Liters");
        pages.getMedicalEncountersPage().liters.sendKeys("1");
    }

    @Then("Select the Via")
    public void select_the_via() {
        logger.info("Select the Via");
        Select select = new Select(pages.getMedicalEncountersPage().via);
        select.selectByValue("2");
    }

    @Then("Enter the Peak Flow")
    public void enter_the_peak_flow() {
        logger.info("Enter the Peak Flow");
        pages.getMedicalEncountersPage().peakFlow1.sendKeys("1");
        pages.getMedicalEncountersPage().peakFlow2.sendKeys("2");
        pages.getMedicalEncountersPage().peakFlow3.sendKeys("3");
    }

    @Then("Enter the Blood Sugar Level")
    public void enter_the_blood_sugar_level() {
        logger.info("Enter the Blood Sugar Level");
        pages.getMedicalEncountersPage().bloodSugarLevel.sendKeys("1");
        Select select = new Select(pages.getMedicalEncountersPage().bloodSugarSelect);
        select.selectByValue("2");
    }

    @Then("Enter the Uncorrected - Right: 20")
    public void enter_the_uncorrected_right() {
        logger.info("Enter the Uncorrected - Right: 20");
        pages.getMedicalEncountersPage().uncorrectedRight20.sendKeys("1");
    }

    @Then("Enter the Uncorrected Left: 20")
    public void enter_the_uncorrected_left() {
        logger.info("Enter the Uncorrected Left: 20");
        pages.getMedicalEncountersPage().uncorrectedLeft20.sendKeys("2");
    }

    @Then("Enter the Uncorrected Both: 20")
    public void enter_the_uncorrected_both() {
        logger.info("Enter the Uncorrected Both: 20");
        pages.getMedicalEncountersPage().uncorrectedBoth20.sendKeys("3");
    }

    @Then("Enter the Corrected Left: 20")
    public void enter_the_corrected_left() {
        logger.info("Enter the Corrected Left: 20");
        pages.getMedicalEncountersPage().correctedLeft20.sendKeys("2");
    }

    @Then("Enter the Corrected Both: 20")
    public void enter_the_corrected_both() {
        logger.info("Enter the Corrected Both: 20");
        pages.getMedicalEncountersPage().correctedBoth20.sendKeys("3");
    }

    @Then("Enter the Corrected - Right: 20")
    public void enter_the_corrected_right() {
        logger.info("Enter the Corrected - Right: 20");
        pages.getMedicalEncountersPage().correctedRight20.sendKeys("1");
    }

    @Then("Select the OAE Result: Right Ear")
    public void select_the_oae_result_right_ear() {
        logger.info("Select the OAE Result: Right Ear");
        scrollDown(250, 500);
        pages.getMedicalEncountersPage().pass.click();
    }

    @Then("Select the OAE Result: Left Ear")
    public void select_the_oae_result_left_ear() {
        logger.info("Select the OAE Result: Left Ear");
        pages.getMedicalEncountersPage().refer.click();
    }

    @Then("Add Timestamp to Comments")
    public void add_timestamp_to_comments() {
        logger.info("Add Timestamp to Comments");
        pages.getMedicalEncountersPage().commentsTimestamp.click();
    }

    @Then("Click on New button of Lab Test Orders section")
    public void click_on_new_button_of_lab_test_orders_section() {
        logger.info("Click on New button of Lab Test Orders section");
        pages.getMedicalEncountersPage().newButtonLabTestOrders.click();
    }

    @Then("Enter the Diagnosis Code")
    public void enter_the_diagnosis_code() {
        logger.info("Enter the Diagnosis Code");

    }

    @Then("Select the Formulary")
    public void select_the_formulary() {
        logger.info("Select the Formulary");
    }

    @Then("Select the Lab Test Ordered")
    public void select_the_lab_test_ordered() {
        logger.info("Select the Lab Test Ordered");
    }

    @Then("Select the Priority")
    public void select_the_priority() {
        logger.info("Select the Priority");

    }

    @Then("Select the today's date for Lab Schedule Date")
    public void select_the_today_s_date_for_lab_schedule_date() {
        logger.info("Select the today's date for Lab Schedule Date");
    }

    @Then("Select the Fasting")
    public void select_the_fasting() {
        logger.info("Select the Fasting");
    }

    @Then("Select the Verbal\\/Telephone Order Read Back")
    public void select_the_verbal_telephone_order_read_back() {
        logger.info("Select the Verbal/Telephone Order Read Back");
    }

    @Then("Select the X-Ray Ordered")
    public void select_the_x_ray_ordered() {
        logger.info("");
    }

    @Then("Select the Diagnosis Code")
    public void select_the_diagnosis_code() {
        logger.info("Select the X-Ray Ordered");
    }

    @Then("Select the today's date for X-Ray Schedule Date")
    public void select_the_today_s_date_for_x_ray_schedule_date() {
        logger.info("Select the today's date for X-Ray Schedule Date");
    }


}
