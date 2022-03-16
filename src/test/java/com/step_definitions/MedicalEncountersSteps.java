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
            case "Consultation Request":
                scrollDown(3000, 3250);
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
                scrollDown(2250, 2750);
                break;
            case "Other Actions/Procedures":
                scrollDown(2500, 2750);
                break;
            case "Follow-up Appointments":
                scrollDown(2500, 2750);
                break;
            case "Scanned Document/Photo":
                scrollDown(2700, 3000);
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
        select.selectByValue("A");
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
        scrollDown(250, 500);
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
        scrollDown(0, 250);
        Select select = new Select(pages.getMedicalEncountersPage().priority);
        select.selectByValue("4");
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
        pages.getMedicalEncountersPage().timestamp2.click();
    }

    @Then("Add TimeStamp to Results Comments")
    public void add_time_stamp_to_results_comments() {
        logger.info("Add TimeStamp to Results Comments");
        pages.getMedicalEncountersPage().timestamp3.click();
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
        select.selectByValue("BA10");
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
        pages.getMedicalEncountersPage().timestamp2.click();
    }

    @Then("Add Timestamp to Baseline Procedures")
    public void add_timestamp_to_baseline_procedures() {
        logger.info("Add Timestamp to Baseline Procedures");
        pages.getMedicalEncountersPage().timestamp3.click();
    }

    @Then("Add Timestamp to Patient Education")
    public void add_timestamp_to_patient_education() {
        logger.info("Add Timestamp to Patient Education");
        pages.getMedicalEncountersPage().timestamp4.click();
    }

    @Then("Add Timestamp to Findings to be documented per Encounter")
    public void add_timestamp_to_findings_to_be_documented_per_encounter() {
        logger.info("Add Timestamp to Findings to be documented per Encounter");
        pages.getMedicalEncountersPage().timestamp5.click();
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

    @Then("Click on New button of Consultation Request section")
    public void click_on_new_button_of_consultation_request_section() {
        logger.info("Click on New button of Consultation Request section");
        pages.getMedicalEncountersPage().newConsultationRequest.click();
    }

    @Then("Select the Request Type")
    public void select_the_request_type() {
        logger.info("Select the Request Type");
        Select select = new Select(pages.getMedicalEncountersPage().requestType);
        select.selectByValue("1");
    }

    @Then("Select the Service Type")
    public void select_the_service_type() {
        logger.info("Select the Service Type");
        Select select = new Select(pages.getMedicalEncountersPage().serviceType);
        select.selectByValue("114");
    }

    @Then("Select the {string} of Consultation Request")
    public void select_the_location(String location) {
        logger.info("Select the " + location + " of Consultation Request");
        Select select = new Select(pages.getMedicalEncountersPage().location);

        switch (location) {
            case "ACC-General Population MIN/MINR  [ACC-GPII]":
                select.selectByValue("000005000");
                break;
            case "ACC-Intake Use Only  [ACC-INTK]":
                select.selectByValue("000005001");
                break;
            case "ACC-Restrictive Housing  [ACC-RH]":
                select.selectByValue("000005002");
                break;
            case "Adams County Jail  [JB-01]":
                select.selectByValue("000007000");
                break;
            case "Alamosa County Jail  [JB-02]":
                select.selectByValue("000007001");
                break;
            case "Alamosa Office  [000039000]":
                select.selectByValue("000039000");
                break;
            case "Any Colorado City Jail  [ANYCTYJAIL]":
                select.selectByValue("000002070");
                break;
            case "Arapahoe Community Treatment Center  [ARAP/ACTC]":
                select.selectByValue("000006504");
                break;
            case "Arapahoe County Jail  [JB-03]":
                select.selectByValue("000007002");
                break;
            case "Arapahoe County Residential Center  [ARAP/ACRC]":
                select.selectByValue("000006506");
                break;
            case "Archuleta County Jail  [JB-04]":
                select.selectByValue("000007003");
                break;
            case "Aurora Office  [000039001]":
                select.selectByValue("000039001");
                break;
            case "AVCF-General Population MEDIUM  [AVCF-GPIII]":
                select.selectByValue("000005003");
                break;
            case "AVCF-Intake Use Only  [AVCF-INTK]":
                select.selectByValue("000005004");
                break;
            case "AVCF-Protective Custody  [AVCF-PC]":
                select.selectByValue("000005005");
                break;
            case "AVCF-Restrictive Housing  [AVCF-RH]":
                select.selectByValue("000005006");
                break;
            case "Baca County Jail  [JB-05]":
                select.selectByValue("000007004");
                break;
            case "BCCF-General Population MEDIUM  [BCCF-GPIII]":
                select.selectByValue("000005007");
                break;
            case "BCCF-Intake Use Only  [BCCF-INTK]":
                select.selectByValue("000005008");
                break;
            case "BCCF-Restrictive Housing  [BCCF-RH]":
                select.selectByValue("000005009");
                break;
            case "Bent County Jail  [JB-06]":
                select.selectByValue("000007005");
                break;
            case "BOLDR/Bctc  [IS/BCTC]":
                select.selectByValue("000007507");
                break;
            case "BOLDR/Lctc  [IS/B/LCTC]":
                select.selectByValue("000007508");
                break;
            case "Boulder County Jail  [JB-07]":
                select.selectByValue("000007006");
                break;
            case "Broadway Office  [000039005]":
                select.selectByValue("000039005");
                break;
            case "Broomfield County Jail  [JB-80]":
                select.selectByValue("000007007");
                break;
            case "BUENA VISTA TRANSITIONAL WORK CENTER  [BW-TWC]":
                select.selectByValue("100032549");
                break;
            case "BVCF-General Population CLOSE  [BVCF-GPIV]":
                select.selectByValue("000005010");
                break;
//            case "":
//                select.selectByValue("000005000");
//                break;

        }
    }

    @Then("Enter the Specialist")
    public void enter_the_specialist() {
        logger.info("Enter the Specialist");
        pages.getMedicalEncountersPage().specialist.sendKeys("Dr");
    }

    @Then("Enter the Procedure Requested")
    public void enter_the_procedure_requested() {
        logger.info("Enter the Procedure Requested");

        WebElement procedureRequested = pages.getMedicalEncountersPage().procedureRequested;
        procedureRequested.sendKeys("ana");
        wait(1);
        procedureRequested.sendKeys(Keys.DOWN);
        procedureRequested.sendKeys(Keys.ENTER);

    }

    @Then("Add TimeStamp to PURPOSE OF REQUEST")
    public void add_time_stamp_to_purpose_of_request() {
        logger.info("Add TimeStamp to PURPOSE OF REQUEST");
        scrollDown(0, 250);
        pages.getMedicalEncountersPage().timestamp1.click();
    }

    @Then("Select N to SUPPORTING DOCUMENTATION, PROGRESS OR SPECIALISTS NOTES, DIAGNOSTIC RESULTS, ATTACHED OR FAXED")
    public void select_n_to_supporting_documentation_progress_or_specialists_notes_diagnostic_results_attached_or_faxed() {
        logger.info("Select N to SUPPORTING DOCUMENTATION, PROGRESS OR SPECIALISTS NOTES, DIAGNOSTIC RESULTS, ATTACHED OR FAXED");
        pages.getMedicalEncountersPage().supportingN.click();
    }

    @Then("Add TimeStamp to PHYSICAL FUNCTIONAL EXAM PERTINENT TO REQUEST")
    public void add_time_stamp_to_physical_functional_exam_pertinent_to_request() {
        logger.info("Add TimeStamp to PHYSICAL FUNCTIONAL EXAM PERTINENT TO REQUEST");
        scrollDown(250, 500);
        pages.getMedicalEncountersPage().timestamp2.click();
    }

    @Then("Add TimeStamp to PRIOR CONSERVATIVE MANAGEMENT")
    public void add_time_stamp_to_prior_conservative_management() {
        logger.info("Add TimeStamp to PRIOR CONSERVATIVE MANAGEMENT");
        pages.getMedicalEncountersPage().timestamp3.click();
    }

    @Then("Add TimeStamp to MRD")
    public void add_time_stamp_to_mrd() {
        logger.info("Add TimeStamp to MRD");
        pages.getMedicalEncountersPage().timestamp4.click();
    }

    @Then("Add TimeStamp to EFFECT ON ADL'S WHEN INDICATED")
    public void add_time_stamp_to_effect_on_adl_s_when_indicated() {
        logger.info("Add TimeStamp to EFFECT ON ADL'S WHEN INDICATED");
        pages.getMedicalEncountersPage().timestamp5.click();
    }

    @Then("Select Good to PATIENT CARE COMPLIANCE HISTORY WITH TREATMENT PLAN")
    public void select_good_to_patient_care_compliance_history_with_treatment_plan() {
        logger.info("Select Good to PATIENT CARE COMPLIANCE HISTORY WITH TREATMENT PLAN");
        scrollDown(450, 700);
        pages.getMedicalEncountersPage().complianceGood.click();
    }

    @Then("Select the Working Diagnosis")
    public void select_the_working_diagnosis() {
        logger.info("Select the Working Diagnosis");
        Select select = new Select(pages.getMedicalEncountersPage().workingDiagnosis);
        select.selectByValue("R77.9");
    }

    @Then("Add TimeStamp to Subjective Notes")
    public void add_time_stamp_to_subjective_notes() {
        logger.info("Add TimeStamp to Subjective Notes");
        pages.getMedicalEncountersPage().timestamp6.click();
    }

    @Then("Add TimeStamp to Describe Signs and Symptoms Suggesting Diagnosis")
    public void add_time_stamp_to_describe_signs_and_symptoms_suggesting_diagnosis() {
        logger.info("Add TimeStamp to Describe Signs and Symptoms Suggesting Diagnosis");
        pages.getMedicalEncountersPage().timestamp7.click();
    }

    @Then("Add TimeStamp to Failed Therapies")
    public void add_time_stamp_to_failed_therapies() {
        logger.info("Add TimeStamp to Failed Therapies");
        scrollDown(7500, 1000);
        pages.getMedicalEncountersPage().timestamp8.click();
    }

    @Then("Add TimeStamp to Related Lab Test Orders")
    public void add_time_stamp_to_related_lab_test_orders() {
        logger.info("Add TimeStamp to Related Lab Test Orders");
        pages.getMedicalEncountersPage().relatedLabTestOrders.click();
    }

    @Then("Add TimeStamp to Related XRay Orders")
    public void add_time_stamp_to_related_x_ray_orders() {
        logger.info("Add TimeStamp to Related XRay Orders");
        pages.getMedicalEncountersPage().relatedXRayOrders.click();
    }

    @Then("Click on New button of Patient Transfer Holds section")
    public void click_on_new_button_of_patient_transfer_holds_section() {
        logger.info("Click on New button of Patient Transfer Holds section");
        pages.getMedicalEncountersPage().newPatientTransferHolds.click();
    }

    @Then("Select the Hold Type")
    public void select_the_hold_type() {
        logger.info("Select the Hold Type");
        Select select = new Select(pages.getMedicalEncountersPage().holdType);
        select.selectByValue("A-00");
    }

    @Then("Select the Status")
    public void select_the_status() {
        logger.info("Select the Status");
        Select select = new Select(pages.getMedicalEncountersPage().status);
        select.selectByValue("1");
    }

    @Then("Select the As of Date")
    public void select_the_as_of_date() {
        logger.info("Select the As of Date");
        pages.getMedicalEncountersPage().asOfDate.click();
    }

    @Then("Click on New button of Other Actions Procedures section")
    public void click_on_new_button_of_other_actions_procedures_section() {
        logger.info("Click on New button of Other Actions/Procedures section");
        pages.getMedicalEncountersPage().newOtherActionsProcedures.click();
    }

    @Then("Add Timestamp to Specify Comments")
    public void add_timestamp_to_specify_comments() {
        logger.info("Add Timestamp to Specify Comments");
         pages.getMedicalEncountersPage().timestamp1.click();
    }

    @Then("Select the Type or Pick List")
    public void select_the_type_or_pick_list() {
        logger.info("Select the Type or Pick List");
        Select select = new Select(pages.getMedicalEncountersPage().typeActionsProcedures);
        select.selectByValue("BA1005");
    }

    @Then("Click on a Initiate Kite")
    public void click_on_a_initiate_kite() {
        logger.info("Click on a Initiate Kite");
        pages.getMedicalEncountersPage().initiateKite.click();
    }

    @Then("Select the Triage Date")
    public void select_the_triage_date() {
        logger.info("Select the Triage Date");
        pages.getMedicalEncountersPage().triageDate.click();
    }

    @Then("Select the Area of Service")
    public void select_the_area_of_service() {
        logger.info("Select the Area of Service");
        Select select = new Select(pages.getMedicalEncountersPage().areaOfService);
        select.selectByValue("A");
    }

    @Then("Select the Acuity")
    public void select_the_acuity() {
        logger.info("Select the Acuity");
        Select select = new Select(pages.getMedicalEncountersPage().acuity);
        select.selectByValue("F");
    }

    @Then("Select the Complaint Category")
    public void select_the_complaint_category() {
        logger.info("Select the Complaint Category");
        Select select = new Select(pages.getMedicalEncountersPage().complaintCategory);
        select.selectByValue("079");
    }

    @Then("Select the Target Complete Date")
    public void select_the_target_complete_date() {
        logger.info("Select the Target Complete Date");
        pages.getMedicalEncountersPage().targetCompleteDate.click();
    }

    @Then("Add Timestamp to Inmate Health Issue")
    public void add_timestamp_to_inmate_health_issue() {
        logger.info("Add Timestamp to Inmate Health Issue");
        pages.getMedicalEncountersPage().timestamp1.click();
    }

    @Then("Add Timestamp to Reviewer Comments")
    public void add_timestamp_to_reviewer_comments() {
        logger.info("Add Timestamp to Reviewer Comments");
        pages.getMedicalEncountersPage().timestamp2.click();
    }

    @Then("Click on New button of Scanned Document Photo")
    public void click_on_new_button_of_scanned_document_photo() {
      logger.info("Click on New button of Scanned Document Photo");
        pages.getMedicalEncountersPage().newScannedDocumentsPhotos.click();
    }

    @Then("Enter the Document Photo Title")
    public void enter_the_document_photo_title() {
        logger.info("Enter the Document Photo Title");
        pages.getMedicalEncountersPage().documentPhotoTitle.sendKeys("DP-1");
    }

    @Then("Select the Judgment Order Prefix")
    public void select_the_judgment_order_prefix() {
        logger.info("Select the Judgment Order Prefix");
        Select select = new Select(pages.getMedicalEncountersPage().judgmentOrderPrefix);
        select.selectByValue("AA");
    }

    @Then("Select the Privacy Level")
    public void select_the_privacy_level() {
        logger.info("Select the Privacy Level");
        Select select = new Select(pages.getMedicalEncountersPage().privacyLevel);
        select.selectByValue("N");
    }

    @Then("Enter the Dup Check for Keyword")
    public void enter_the_dup_check_in_title_for_keyword() {
        logger.info("Enter the Dup Check for Keyword");
        pages.getMedicalEncountersPage().dupCheckForKeyword.sendKeys("DP-01");
    }
}
