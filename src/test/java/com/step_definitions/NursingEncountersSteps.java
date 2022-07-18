package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class NursingEncountersSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(LoginSteps.class);

    @Then("Click on a New button in Health Services Encounters")
    public void click_on_a_new_button_in_health_services_encounters() {
        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        logger.info("Click on a New button in Health Services Encounters");
        pages.getNursingEncountersPage().newButton.click();
    }

    @Then("Click on View History")
    public void click_on_view_history() {
        pages.getNursingEncountersPage().viewHistory.click();
    }

    @Then("Select the Complex - {string}")
    public void select_the_complex(String complex) {

        logger.info("Select the Complex - " + complex);
        Select select = new Select(pages.getNursingEncountersPage().complex);
        select.selectByVisibleText(complex);
    }

    @Then("Select the Mental Health Type - {string}")
    public void select_the_mental_type(String type) {

        logger.info("Select the Mental Health Type");
        Select select = new Select(pages.getNursingEncountersPage().type);
        select.selectByVisibleText(type);
    }

    @Then("Select the Type - {string}")
    public void select_the_type(String type) {

        logger.info("Select the Type");
        Select select = new Select(pages.getNursingEncountersPage().type);
        select.selectByVisibleText(type);
    }

    @Then("Click Next button")
    public void click_next_button() {

        logger.info("Click Next button");
        pages.getIJPPage().next.click();
    }

    @Then("Click Next encounter button")
    public void click_next_encounter_button() {

        logger.info("Click Next button");
        pages.getNursingEncountersPage().nextButton.click();
    }

    @Then("Click Save button")
    public void click_save_button() {
        logger.info("Click Save button");
        pages.getNursingEncountersPage().saveButton.click();
        wait(1);
        try {
            Driver.getDriver().switchTo().alert().accept();
        } catch (Exception e) {}

        }

        @And("Click Save button and Accept alert")
        public void clickSaveButtonAndAcceptAlert () {
            logger.info("Click Save button");
            pages.getNursingEncountersPage().saveButton.click();
            Driver.getDriver().switchTo().alert().accept();
        }

        @Then("Click Save and Close button")
        public void click_save_and_close_button () {
            logger.info("Click Save and Close button");
            pages.getNursingEncountersPage().saveAndCloseButton.click();
        }

//    @Then("Click Save button")
//    public void click_save_and_close_button () {
//        logger.info("Click Save and Close button");
//        pages.getNursingEncountersPage().saveAndCloseButton.click();
//    }

        @Then("Add Timestamp to Subjective Notes")
        public void add_timestamp_to_subjective_notes () {

            logger.info("Add Timestamp to Subjective Notes");
            pages.getNursingEncountersPage().timestamp.click();
        }


        @Then("Click {string} jump button")
        public void click_jump_button (String buttonName){

            logger.info("Click " + buttonName + " jump button");

            switch (buttonName) {
                case "S":
                    pages.getNursingEncountersPage().subjectiveButton.click();
                    break;
                case "O":
                    pages.getNursingEncountersPage().objectiveButton.click();
                    break;
                case "A":
                    pages.getNursingEncountersPage().assessmentButton.click();
                    break;
                case "P":
                    pages.getNursingEncountersPage().planButton.click();
                    break;
                case "E":
                    pages.getNursingEncountersPage().educationButton.click();
                    break;
                case "C":
                    pages.getNursingEncountersPage().healthCodeLevelScoresButton.click();
                    break;
                case "File icon":
                    pages.getNursingEncountersPage().standardFormsButton.click();
                    break;
                case "Photo icon":
                    pages.getNursingEncountersPage().scannedDocumentsPhotosButton.click();
                    break;
            }
        }

        @Then("Verify {string} section")
        public void verify_section (String sectionName){

            logger.info("Verify " + sectionName + " section");
            String section = "";

            switch (sectionName) {
                case "Subjective":
                    section = pages.getNursingEncountersPage().subjectiveSection.getText();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
                case "Objective":
                    section = pages.getNursingEncountersPage().objectiveSection.getText();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
                case "Assessment":
                    section = pages.getNursingEncountersPage().assessmentSection.getText();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
                case "Plan":
                    section = pages.getNursingEncountersPage().planSection.getText();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
                case "Education":
                    section = pages.getNursingEncountersPage().educationSection.getText();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
                case "Health Code/Level Scores":
                    section = pages.getNursingEncountersPage().healthCodeLevelScoresSection.getText();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
                case "Standard Forms":
                    section = pages.getNursingEncountersPage().standardFormsSection.getText().trim();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
                case "Scanned Documents/Photos":
                    section = pages.getNursingEncountersPage().scannedDocumentsPhotosSection.getText().trim();
                    System.out.println("this is section " + section);
                    Assert.assertEquals(section, sectionName);
                    break;
            }
        }

        @Then("Verify Complex location is {string}")
        public void verify_complex_location (String selectedComplex){

            String complex = pages.getNursingEncountersPage().encounterHeaderComplex.getAttribute("value");
            System.out.println("C " + complex);
            Assert.assertEquals(selectedComplex, complex);
        }

        @Then("Verify {string} Health Score displayed correctly in Banner")
        public void verifyHealthScoreDisplayedCorrectlyInHeader (String header){
            logger.info("verify " + header + " in Header");
            String healthScores = pages.getNursingEncountersPage().healthScoresBanner.getText();
            String healthCode = "";

            switch (header) {
                case "Medical":
                    healthScores = healthScores.substring(0, 3).replace(":", "");
                    healthCode = pages.getNursingEncountersPage().medicalLevel.getAttribute("value");
                    Assert.assertEquals(healthScores, healthCode);
                    break;
                case "Dental":
                    healthScores = healthScores.substring(9, 10);
                    healthCode = pages.getNursingEncountersPage().dentalLevel.getAttribute("value").substring(0, 1);
                    Assert.assertEquals(healthScores, healthCode);
                    break;
                case "Psychological":
                    healthScores = healthScores.substring(13, 14);
                    healthCode = pages.getNursingEncountersPage().psychologicalLevel.getAttribute("value").substring(0, 1);
                    Assert.assertEquals(healthScores, healthCode);
                    break;
                case "ID":
                    healthScores = healthScores.substring(18, 19);
                    healthCode = pages.getNursingEncountersPage().idLevel.getAttribute("value").substring(0, 1);
                    Assert.assertEquals(healthScores, healthCode);
                    break;
                case "Sex Offender":
                    healthScores = healthScores.substring(23, 24);
                    healthCode = pages.getNursingEncountersPage().sexOffenderLevel.getAttribute("title").substring(0, 1);
                    Assert.assertEquals(healthScores, healthCode);
                    break;
                case "Substance Abuse Rating":
                    healthScores = healthScores.substring(28, 29);
                    healthCode = pages.getNursingEncountersPage().substanceAbuseRatingLevel.getAttribute("value").substring(0, 1);
                    Assert.assertEquals(healthScores, healthCode);
                    break;
//            case "SOA-R Level":
////                healthScores = healthScores.substring(36,38);
//                healthCode = pages.getNursingEncountersPage().sOARLevel.getAttribute("value");
//                System.out.println("this is health score "+ healthScores);
//                System.out.println("this is health code " + healthCode);
////                Assert.assertEquals(healthScores,healthCode);
//                break;
            }
        }


    }
