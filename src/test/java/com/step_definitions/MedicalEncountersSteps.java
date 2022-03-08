package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
            case "Assessment":
                pages.getNursingEncountersPage().assessmentSection.click();
                break;
            case "Related Health Problems/Conditions/Allergies":
                scrollDown(2250, 2750);
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

    @Then("Click on New button of X-Ray Orders section")
    public void click_on_new_button_of_x_ray_orders_section() {
        logger.info("Click on New button of X-Ray Orders section");
        pages.getMedicalEncountersPage().newButtonXRayOrders.click();
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
        scrollDown(250,500);
        pages.getMedicalEncountersPage().commentsTimestamp.click();
    }

    @Then("Click on New button of Lab Test Orders section")
    public void click_on_new_button_of_lab_test_orders_section() {
        logger.info("Click on New button of Lab Test Orders section");
        pages.getMedicalEncountersPage().newButtonLabTestOrders.click();
    }

    @Then("Select the {string}")
    public void select_the_diagnosis_code(String diagnosisCode) {
        logger.info("Select the " + diagnosisCode);
        Select select = new Select(pages.getMedicalEncountersPage().diagnosisCode);

        switch (diagnosisCode) {
            case "Abnormality of plasma protein, unspecified [R77.9]":
                select.selectByValue("R77.9");
                break;
            case "Anemia, unspecified [D64.9]":
                select.selectByValue("");
                break;
            case "Cardiac arrhythmia, unspecified [I49.9]":
                select.selectByValue("D64.9");
                break;
            case "Cardiomyopathy, unspecified [I42.9]":
                select.selectByValue("I42.9");
                break;
            case "Chronic kidney disease, unspecified [N18.9]":
                select.selectByValue("N18.9");
                break;
            case "Decreased white blood cell count, unspecified [D72.819]":
                select.selectByValue("D72.819");
                break;
            case "Deficiency of nutrient element, unspecified [E61.9]":
                select.selectByValue("E61.9");
                break;
            case "Diarrhea, unspecified [R19.7]":
                select.selectByValue("R19.7");
                break;
            case "Dilated cardiomyopathy [I42.0]":
                select.selectByValue("I42.0");
                break;
            case "Dysphagia, unspecified [R13.10]":
                select.selectByValue("R13.10");
                break;
            case "Edema, unspecified [R60.9]":
                select.selectByValue("R60.9");
                break;
            case "Enlarged prostate with lower urinary tract symptoms [N40.1]":
                select.selectByValue("N40.1");
                break;
            case "Essential (primary) hypertension [I10]":
                select.selectByValue("I10");
                break;
            case "Gastritis, unspecified, with bleeding [K29.71]":
                select.selectByValue("K29.71");
                break;
            case "Heart failure, unspecified [I50.9]":
                select.selectByValue("I50.9");
                break;
            case "HELICOBACTER PYLORI [H. PYLORI] [B96.81]":
                select.selectByValue("B96.81");
                break;
            case "Hemorrhage, not elsewhere classified [R58]":
                select.selectByValue("R58");
                break;
            case "Hydrocele, unspecified [N43.3]":
                select.selectByValue("N43.3");
                break;
            case "Hypertrophy of breast [N62]":
                select.selectByValue("N62");
                break;
            case "Impacted cerumen, unspecified ear [H61.20]":
                select.selectByValue("H61.20");
                break;
            case "Impaired glucose tolerance (oral) [R73.02]":
                select.selectByValue("R73.02");
                break;
            case "Long term (current) use of anticoagulants [Z79.01]":
                select.selectByValue("Z79.01");
                break;
            case "Nonrheumatic aortic valve disorder, unspecified [I35.9]":
                select.selectByValue("I35.9");
                break;
            case "Nonrheumatic mitral valve disorder, unspecified [I34.9]":
                select.selectByValue("I34.9");
                break;
            case "Nonspecific reaction to tuberculin skin test without active tuberculosis [R76.11]":
                select.selectByValue("R76.11");
                break;
            case "Other Specified Depressive Episodes [F32.89]":
                select.selectByValue("F32.89");
                break;
            case "Pain in unspecified joint [M25.50]":
                select.selectByValue("M25.50");
                break;
            case "Rheumatic aortic valve disease, unspecified [I06.9]":
                select.selectByValue("I06.9");
                break;
            case "Rheumatic heart disease, unspecified [I09.9]":
                select.selectByValue("I09.9");
                break;
            case "Thrombocytopenia, unspecified [D69.6]":
                select.selectByValue("D69.6");
                break;
            case "Unspecified atrial fibrillation [I48.91]":
                select.selectByValue("I48.91");
                break;
            case "Unspecified lump in breast [N63]":
                select.selectByValue("N63");
                break;
        }
    }

    @Then("Select the Lab Test Ordered")
    public void select_the_lab_test_ordered() {
        logger.info("Select the Lab Test Ordered");
        Select select = new Select(pages.getMedicalEncountersPage().labTestOrdered);
        select.selectByValue("LC-070085");
    }

    @Then("Select the Priority")
    public void select_the_priority() {
        logger.info("Select the Priority");
        Select select = new Select(pages.getMedicalEncountersPage().priority);
        select.selectByValue("1");
    }

    @Then("Select the X-Ray Priority")
    public void select_the_x_ray_priority() {
        logger.info("Select the X-Ray Priority");
        Select select = new Select(pages.getMedicalEncountersPage().xRayPriority);
        select.selectByValue("1");
    }

    @Then("Select the Fasting")
    public void select_the_fasting() {
        logger.info("Select the Fasting");
        Select select = new Select(pages.getMedicalEncountersPage().fasting);
        select.selectByValue("Y");
    }

    @Then("Select the Verbal or Telephone Order Read Back")
    public void select_the_verbal_telephone_order_read_back() {
        logger.info("Select the Verbal/Telephone Order Read Back");
        Select select = new Select(pages.getMedicalEncountersPage().verbalTelephoneOrderReadBack);
        select.selectByValue("B");
    }

    @Then("Select the X-Ray Ordered")
    public void select_the_x_ray_ordered() {
        logger.info("Select the X-Ray Ordered");
        Select select = new Select(pages.getMedicalEncountersPage().xRayOrdered);
        select.selectByValue("74010");
    }

    @Then("Select the X-Ray Taken Date")
    public void select_the_x_ray_taken_date() {
        logger.info("Select the X-Ray Taken Date");
        scrollDown(250, 500);
        pages.getMedicalEncountersPage().xRayTakenDate.click();
    }

    @Then("Select the Time")
    public void select_the_time() {
        logger.info("Select the Time");
        pages.getMedicalEncountersPage().time.click();
    }

    @Then("Enter the Stuff")
    public void enter_the_stuff() {
        logger.info("Enter the Stuff");
    }

    @Then("Select the Shipped Date")
    public void select_the_shipped_date() {
        logger.info("Select the Shipped Date");
        pages.getMedicalEncountersPage().shippedDate.click();
    }

    @Then("Select the X-Ray Site")
    public void select_the_x_ray_site() {
        logger.info("Select the X-Ray Site");
        Select select = new Select(pages.getMedicalEncountersPage().xRaySite);
        select.selectByValue("000005000");
    }

    @Then("Add TimeStamp to X-Ray Taken Comments")
    public void add_time_stamp_to_x_ray_comments() {
        logger.info("Add TimeStamp to X-Ray Comments");
        pages.getMedicalEncountersPage().xRayTakenComments.click();
    }

    @Then("Add TimeStamp to Results Comments")
    public void add_time_stamp_to_results_comments() {
        logger.info("Add TimeStamp to Results Comments");
        pages.getMedicalEncountersPage().resultsComments.click();
    }

    @Then("Enter the Diagnosis Code")
    public void enter_the_diagnosis_code() {
        logger.info("Enter the Diagnosis Code");
        WebElement diagnosisCode = pages.getMedicalEncountersPage().diagnosisCodeAssessment;
       // diagnosisCode.sendKeys("a");
       // diagnosisCode.clear();
        diagnosisCode.sendKeys("headache");
        wait(1);
        diagnosisCode.sendKeys(Keys.DOWN);
        diagnosisCode.sendKeys(Keys.ENTER);
    }

    @Then("Click Next button on Assessment")
    public void click_next_button_on_assessment() {
        logger.info("Click Next button on Assessment");
        pages.getMedicalEncountersPage().nextButton.click();
        wait(1);
        Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Select the Current associated SNOMED")
    public void select_the_current_associated_snomed_s() {
        logger.info("Select the Current associated SNOMED");
        Select select = new Select(pages.getMedicalEncountersPage().currentAssociatedSnomed);
        select.selectByValue("127295002");
    }

    @Then("Click the Add Diagnosis")
    public void click_the_add_diagnosis() {
        logger.info("Click the Add Diagnosis");
        pages.getMedicalEncountersPage().addDiagnosis.click();
    }

    @Then("Verify the added Diagnosis")
    public void verify_the_added_diagnosis() {
        logger.info("Verify the added Diagnosis");
    }

    @Then("Select the Category")
    public void select_the_category() {
        logger.info("Select the Category");
        Select select = new Select(pages.getMedicalEncountersPage().category);
        select.selectByValue("E");
    }

    @Then("Select the Type")
    public void select_the_type() {
        logger.info("Select the Type");
        Select select = new Select(pages.getMedicalEncountersPage().type);
        select.selectByValue("EP7");
    }

    @Then("Enter the SNOMED Code")
    public void enter_the_snomed_code() {
        logger.info("Enter the SNOMED Code");
        WebElement SNOMEDCode = pages.getMedicalEncountersPage().SNOMEDCode;
        SNOMEDCode.sendKeys("ana");
        wait(1);
        SNOMEDCode.sendKeys(Keys.DOWN);
        SNOMEDCode.sendKeys(Keys.ENTER);
    }

    @Then("Add Timestamp to Baseline History - Assessment")
    public void add_timestamp_to_baseline_history_assessment() {
        logger.info("Add Timestamp to Baseline History - Assessment");
        pages.getMedicalEncountersPage().baselineHistoryAssessmentTimestamp.click();
    }

    @Then("Add Timestamp to Baseline Procedures")
    public void add_timestamp_to_baseline_procedures() {
        logger.info("Add Timestamp to Baseline Procedures");
        pages.getMedicalEncountersPage().baselineProceduresTimestamp.click();
    }

    @Then("Add Timestamp to Patient Education")
    public void add_timestamp_to_patient_education() {
        logger.info("Add Timestamp to Patient Education");
        pages.getMedicalEncountersPage().patientEducationTimestamp.click();
    }

    @Then("Add Timestamp to Findings to be documented per Encounter")
    public void add_timestamp_to_findings_to_be_documented_per_encounter() {
        logger.info("Add Timestamp to Findings to be documented per Encounter");
        pages.getMedicalEncountersPage().findingsToBeDocumentedPerEncounterTimestamp.click();
    }

    @Then("Click on New button of New Related Health Problems, Conditions, Allergies section")
    public void click_on_new_button_of_new_related_health_problems_conditions_allergies_section() {
        logger.info("Click on New button of New Related Health Problems/Conditions/Allergies section");
        pages.getMedicalEncountersPage().newButtonRelatedHealthProblems.click();
    }

    @Then("Select the Onset Date")
    public void select_the_onset_date() {
        logger.info("Select the Onset Date");
        pages.getMedicalEncountersPage().onsetDate.click();
    }

}
