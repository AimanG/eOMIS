package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

public class NursingEncountersSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMISSteps.class);

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

        switch (complex) {

            case "Arkansas Valley Correctional Facility":
                select.selectByValue("100000007");
                break;
            case "Arrowhead Correctional Center":
                select.selectByValue("100000005");
                break;
            case "Bent County Correctional Facility":
                select.selectByValue("100000009");
                break;
            case "Buena Vista Correctional Complex":
                select.selectByValue("100000013");
                break;
            case "Centennial Correctional Facility":
                select.selectByValue("100000019");
                break;
            case "Colorado Correctional Center (Camp George West)":
                select.selectByValue("100000017");
                break;
            case "Colorado State Penitentiary":
                select.selectByValue("100000027");
                break;
            case "Colorado Territorial Correctional Facility":
                select.selectByValue("100000028");
                break;
            case "Crowley County Correctional Facility":
                select.selectByValue("100000022");
                break;
            case "Delta Correctional Center":
                select.selectByValue("100000030");
                break;
            case "Denver Reception And Diagnostic Center":
                select.selectByValue("100000033");
                break;
            case "Denver Womens Correctional Facility":
                select.selectByValue("100000034");
                break;
            case "Four Mile Correctional Center":
                select.selectByValue("100000037");
                break;
            case "Fremont Correctional Facility":
                select.selectByValue("100000038");
                break;
            case "La Vista Correctional Facility":
                select.selectByValue("100000056");
                break;
            case "Limon Correctional Facility":
                select.selectByValue("100000054");
                break;
            case "PAROLE FACILITY":
                select.selectByValue("100032435");
                break;
            case "Rifle Correctional Center":
                select.selectByValue("100000074");
                break;
            case "San Carlos Correctional Facility  ":
                select.selectByValue("100000080");
                break;
            case "Sterling Correctional Facility":
                select.selectByValue("100000082");
                break;
            case "Trinidad Correctional Facility":
                select.selectByValue("100000089");
                break;
            case "Youthful Offender System-Pueblo":
                select.selectByValue("100000106");
                break;
        }
    }

    @Then("Select the Type - {string}")
    public void select_the_type(String type) {

        logger.info("Select the Type");
        Select select = new Select(pages.getNursingEncountersPage().type);

        switch (type) {
            case "Anatomical - Nursing":
                select.selectByValue("HT04");
                break;
            case "Administrative - Nursing":
                select.selectByValue("HA10");
                break;
            case "Appointment No-show - Nursing":
                select.selectByValue("HA08");
                break;
            case "Appointment Refusal - Nursing":
                select.selectByValue("HA09");
                break;
            case "Death - Nursing":
                select.selectByValue("HF07");
                break;
            case "Diabetic Education":
                select.selectByValue("HJ02");
                break;
            case "Diabetic Foot Assessment":
                select.selectByValue("HA03");
                break;
            case "Education/Counsel":
                select.selectByValue("HF09");
                break;
            case "Emergency - Nursing (w/ transport)":
                select.selectByValue("HC12");
                break;
            case "Emergency - Nursing (w/o transport)":
                select.selectByValue("HC11");
                break;
            case "Follow Up - Nursing":
                select.selectByValue("HC07");
                break;
            case "Food Handlers Clearance - Nursing":
                select.selectByValue("HT03");
                break;
            case "HCA Issued":
                select.selectByValue("HF03");
                break;
            case "Hunger Strike - Nursing":
                select.selectByValue("HA02");
                break;
            case "Immunization":
                select.selectByValue("HX21");
                break;
            case "Immunization Reaction":
                select.selectByValue("HX22");
                break;
            case "Infectious Disease - Nursing":
                select.selectByValue("HF10");
                break;
            case "Infirmary Admission - Nursing":
                select.selectByValue("HB09");
                break;
            case "Infirmary Discharge - Nursing":
                select.selectByValue("HB07");
                break;
            case "Infirmary Note - Nursing":
                select.selectByValue("HB08");
                break;
            case "Intake Health Assessment":
                select.selectByValue("HA01");
                break;
            case "IntraSystem Transfer Screening":
                select.selectByValue("HF08");
                break;
            case "Labs - Nursing":
                select.selectByValue("HL28");
                break;
            case "Medication Education/Counsel":
                select.selectByValue("HF06");
                break;
            case "MH - Intake Screening - Nursing":
                select.selectByValue("HF05");
                break;
            case "MH Crisis - Nursing":
                select.selectByValue("HF04");
                break;
            case "PPD Administration":
                select.selectByValue("HL23");
                break;
            case "PREA":
                select.selectByValue("HF17");
                break;
            case "Restrictive Housing Visit (by Nurse)":
                select.selectByValue("HT02");
                break;
            case "Sick Call - Nursing":
                select.selectByValue("HC01");
                break;
            case "SWIFT/Trail Crew Clearance":
                select.selectByValue("HC10");
                break;
            case "TB Interview - Nursing":
                select.selectByValue("HL26");
                break;
            case "Work Related Injury":
                select.selectByValue("HF21");
                break;
            case "Administrative - Provider":
                select.selectByValue("BB01");
                break;
            case "Appointment No-show - Provider":
                select.selectByValue("BC03");
                break;
            case "Appointment Refusal - Provider":
                select.selectByValue("BC04");
                break;
            case "Chart Review - Provider":
                select.selectByValue("BB06");
                break;
            case "Chronic Care Visit":
                select.selectByValue("BJ06");
                break;
            case "CTCF Infirmary Admission/Hospice":
                select.selectByValue("BB12");
                break;
            case "Diet Consult Request - Provider":
                select.selectByValue("BD01");
                break;
            case "DRDC Infirmary Admission OBS":
                select.selectByValue("BB14");
                break;
            case "Emergency - Provider (w/ transport)":
                select.selectByValue("BI08");
                break;
            case "Emergency - Provider (w/o transport)":
                select.selectByValue("BI07");
                break;
            case "Follow-up - Provider":
                select.selectByValue("BB05");
                break;
            case "IBAAP - Provider":
                select.selectByValue("BI04");
                break;
            case "Infectious Disease - Provider":
                select.selectByValue("BB15");
                break;
            case "Infirmary Admission - Provider":
                select.selectByValue("BB09");
                break;
            case "Infirmary Discharge - Provider":
                select.selectByValue("BB07");
                break;
            case "Infirmary Note - Provider":
                select.selectByValue("BB08");
                break;
            case "Intake Physical Exam - Provider":
                select.selectByValue("BB02");
                break;
            case "Routine Physical Exam Self Referral":
                select.selectByValue("BI05");
                break;
            case "Sick Call - Provider":
                select.selectByValue("BC05");
                break;
            case "A&D - Appointment No-show":
                select.selectByValue("FA63");
                break;



            case "A&D - Appointment Refusal":
                select.selectByValue("FA64");
                break;
            case "A&D - Assessment":
                select.selectByValue("FA22");
                break;
            case "A&D - Group Counseling":
                select.selectByValue("FA59");
                break;
            case "A&D - Individual Counseling":
                select.selectByValue("FA58");
                break;
            case "A&D - Intake":
                select.selectByValue("FA57");
                break;
            case "A&D - Multi-Disciplinary Team Staffing":
                select.selectByValue("FA37");
                break;
            case "A&D - Progress Review":
                select.selectByValue("FA62");
                break;
            case "A&D - Status Review":
                select.selectByValue("FA65");
                break;
            case "A&D - Treatment Packet Documents":
                select.selectByValue("FA66");
                break;
            case "A&D - Treatment/Service Plan":
                select.selectByValue("FA43");
                break;
//            case "A&D - Appointment No-show":
//                select.selectByValue("FA63");
//                break;
//            case "A&D - Appointment No-show":
//                select.selectByValue("FA63");
//                break;
        }
    }

    @Then("Click Next button")
    public void click_next_button() {

        logger.info("Click Next button");
        pages.getNursingEncountersPage().nextButton.click();
    }

    @Then("Click Save button")
    public void click_save_button() {
        logger.info("Click Save button");
        pages.getNursingEncountersPage().saveButton.click();
        wait(1);
    }

    @And("Click Save button and Accept alert")
    public void clickSaveButtonAndAcceptAlert() {
        logger.info("Click Save button");
        pages.getNursingEncountersPage().saveButton.click();
        Driver.getDriver().switchTo().alert().accept();
    }


    @Then("Click Save and Close button")
    public void click_save_and_close_button() {
        logger.info("Click Save and Close button");
        pages.getNursingEncountersPage().saveAndCloseButton.click();
    }

    @Then("Add Timestamp to Subjective Notes")
    public void add_timestamp_to_subjective_notes() {

        logger.info("Add Timestamp to Subjective Notes");
        pages.getNursingEncountersPage().timestamp.click();
    }


    @Then("Click {string} jump button")
    public void click_jump_button(String buttonName) {

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
    public void verify_section(String sectionName) {

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
    public void verify_complex_location(String selectedComplex) {

        String complex = pages.getNursingEncountersPage().encounterHeaderComplex.getAttribute("value");
        System.out.println("C " + complex);
        Assert.assertEquals(selectedComplex, complex);
    }

    @Then("Verify {string} Health Score displayed correctly in Banner")
    public void verifyHealthScoreDisplayedCorrectlyInHeader(String header) {
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
