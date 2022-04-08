package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AlcoholAndDrugEncountersSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMISSteps.class);
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Enter BH_tester User ID and Password at DeCORuM login screen")
    public void enter_bh_tester_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter BH_tester User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("BHTESTR");
        pages.getLoginPage().password.sendKeys("pepsi123");
    }

    @Then("Go to Health -> Behavioral Health -> Alcohol and Drug Encounters")
    public void go_to_health_behavioral_health_alcohol_and_drug_encounters() {

        logger.info("Go to Health -> Behavioral Health -> Alcohol and Drug Encounters");
        Driver.getDriver().manage().window().maximize();
        wait(5);
        pages.getLandingPage().behavioralHealth.click();
        waitForClickability(pages.getLandingPage().behavioralHealth, 10);
        scrollToElement(pages.getLandingPage().alcoholAbnDrugEncounters);
        pages.getLandingPage().alcoholAbnDrugEncounters.click();

    }

    @Then("Click on a New button")
    public void click_on_a_new_button() {
        logger.info("Click on a New button");
        pages.getNursingEncountersPage().newButton.click();
    }

    @Then("Enter the Supervisor Name")
    public void enter_the_supervisor_name() {
        logger.info("Enter the Supervisor Name");
        WebElement supervisorName = pages.getAlcoholAndDrugEncountersPage().supervisorName;

        supervisorName.sendKeys("dyana");
        wait(1);
        supervisorName.sendKeys(Keys.DOWN);
        supervisorName.sendKeys(Keys.ENTER);
    }

    @Then("Select the Client has completed recommended level of treatment")
    public void select_the_client_has_completed_recommended_level_of_treatment() {
        logger.info("Select the Client has completed recommended level of treatment");
        pages.getAlcoholAndDrugEncountersPage().clientHasCompletedRecLevOfTre.click();
    }

    @Then("Select the Client has previously completed recommended level of treatment AND Request for Reassessment not warranted at this time AND Client is recommended for relapse prevention treatment")
    public void select_the_client_has_previously_completed_recommended_level_of_treatment_and_request_for_reassessment_not_warranted_at_this_time_and_client_is_recommended_for_relapse_prevention_treatment() {
        logger.info("Select the Client has previously completed recommended level of treatment AND Request for Reassessment not warranted at this time AND Client is recommended for relapse prevention treatment");
        pages.getAlcoholAndDrugEncountersPage().clientHasPreComRecLevOfTre.click();
    }

    @Then("Select the Client has completed the recommended level of treatment AND Client has been recommended for an aftercare program")
    public void select_the_client_has_completed_the_recommended_level_of_treatment_and_client_has_been_recommended_for_an_aftercare_program() {
        logger.info("Select the Client has completed the recommended level of treatment AND Client has been recommended for an aftercare program");
        scrollDown(0, 250);
        pages.getAlcoholAndDrugEncountersPage().clientHasComTheRecLevOfTre.click();
    }

    @Then("Select the Client has been expelled from or quit treatment at the recommended level")
    public void select_the_client_has_been_expelled_from_or_quit_treatment_at_the_recommended_level() {
        logger.info("Select the Client has been expelled from or quit treatment at the recommended level");
        pages.getAlcoholAndDrugEncountersPage().clientHasBeenExpFromOrQuTreAtTheRecLev.click();
    }

    @Then("Select the Client has refused treatment at the recommended level")
    public void select_the_client_has_refused_treatment_at_the_recommended_level() {
        logger.info("Select the Client has refused treatment at the recommended level");
        scrollDown(250, 500);
        pages.getAlcoholAndDrugEncountersPage().clientHasRefTreAtTheRecLev.click();
    }

    @Then("Select the Client has refused to complete the assessment process")
    public void select_the_client_has_refused_to_complete_the_assessment_process() {
        logger.info("Select the Client has refused to complete the assessment process");
        pages.getAlcoholAndDrugEncountersPage().clientHasRefToComTheAsPro.click();
    }

    @Then("Select the Client has previously completed recommended treatment level AND Client has had a positive urinalysis, technical violation, Code of Penal Discipline violation, or relapse since completion of treatment AND Clinician recommends client repeat treatment at the recommended treatment level")
    public void select_the_client_has_previously_completed_recommended_treatment_level_and_client_has_had_a_positive_urinalysis_technical_violation_code_of_penal_discipline_violation_or_relapse_since_completion_of_treatment_and_clinician_recommends_client_repeat_treatment_at_the_recommended_treatment_level() {
        logger.info("Select the Client has previously completed recommended treatment level AND Client has had a positive urinalysis, technical violation, Code of Penal Discipline violation, or relapse since completion of treatment AND Clinician recommends client repeat treatment at the recommended treatment level");
        pages.getAlcoholAndDrugEncountersPage().clientHasPreComRecTreLevAndClHasHadAPosUr.click();
    }


    @Then("Select the Client has not completed treatment at their recommended treatment level")
    public void select_the_client_has_not_completed_treatment_at_their_recommended_treatment_level() {
        logger.info("Select the Client has not completed treatment at their recommended treatment level");
        pages.getAlcoholAndDrugEncountersPage().clientHasNotComTreAtTheRecTreLev.click();
    }

    @Then("Select the Client returned during current incarceration and does not need reassessment")
    public void select_the_client_returned_during_current_incarceration_and_does_not_need_reassessment_will_reapply_the_previous_qualifier() {
        logger.info("Select the Client returned during current incarceration and does not need reassessment");
        scrollDown(500, 750);
        pages.getAlcoholAndDrugEncountersPage().clientRetDurCurIncAndPreTreLev.click();
    }

    @Then("Select the Reassessment request has been approved but not yet completed")
    public void select_the_reassessment_request_has_been_approved_but_not_yet_completed() {
        logger.info("Select the Reassessment request has been approved but not yet completed");
        pages.getAlcoholAndDrugEncountersPage().reaReqHasBeenAppButNotYetCom.click();
    }

    @Then("Select the Client returned during current incarceration and previous treatment level qualifier may need to be reconsidered")
    public void select_the_client_returned_during_current_incarceration_and_previous_treatment_level_qualifier_may_need_to_be_reconsidered() {
        logger.info("Select the Client returned during current incarceration and previous treatment level qualifier may need to be reconsidered");
        pages.getAlcoholAndDrugEncountersPage().clientRetDurCurIncAndPreTreLev.click();
    }

    @Then("Verify the Standard Forms")
    public void verify_the_standard_forms() {
        logger.info("Verify the Standard Forms");
        String standardForm = pages.getAlcoholAndDrugEncountersPage().standardForm.getText();
        System.out.println(standardForm);
    }

    @Then("Verify the Error Message")
    public void verify_the_error_message() {
        logger.info("Verify the Error Message");
    }


    @Then("Select the Standard Form as {string}")
    public void select_the_standard_form_as(String standardForm) {
        logger.info("Select the Standard Form as " + standardForm);
        Select select = new Select(pages.getAlcoholAndDrugEncountersPage().standardForms);

        switch (standardForm) {
            case "A&D Treatment Level Qualifier":
                select.selectByValue("7BW");
                break;
            case "Adult Substance Use Survey":
                select.selectByValue("4SS");
                break;
            case "Mandatory Disclosure and Information for Behavioral Health":
                select.selectByValue("7MD");
                break;
            case "Confidentiality of Alcohol and Drug Abuse Patient Records":
                select.selectByValue("7SN");
                break;
            case "Consent for Treatment and Follow-up Contact":
                select.selectByValue("7SM");
                break;
            case "Counselor Disclosure Statement":
                select.selectByValue("7SI");
                break;
            case "Notice of Directives":
                select.selectByValue("7SP");
                break;
            case "Outpatient Classroom Rules":
                select.selectByValue("7SQ");
                break;
            case "TC Treatment Consent and Agreement":
                select.selectByValue("7SJ");
                break;
            case "Client's Rights":
                select.selectByValue("7SK");
                break;
            case "Client Responsibilities":
                select.selectByValue("7SL");
                break;
        }
    }

    @Then("Click on New button for LSI Assessment")
    public void click_on_new_button_for_lsi_assessment() {
        logger.info("Click on New button for LSI Assessment");
        pages.getAlcoholAndDrugEncountersPage().newButtonLSIAssessment.click();
    }

    @Then("Select the Test Source")
    public void select_the_test_source() {
        logger.info("Select the Test Source");
        Select select = new Select(pages.getAlcoholAndDrugEncountersPage().testSource);
        select.selectByValue("C");
    }

    @Then("Add Timestamp to Specify Drug")
    public void add_timestamp_to_specify_drug() {
        logger.info("Add Timestamp to Specify Drug");
        pages.getLsiAssessmentsPage().specifyDrug.click();
    }

    @Then("Select the Start Group radio button")
    public void select_the_start_group_radio_button() {
        logger.info("Select the Start Group radio button");
        scrollDown(0, 250);
        pages.getAlcoholAndDrugEncountersPage().startGroup.click();

    }

    @Then("Select the Progress Note radio button")
    public void select_the_progress_note_radio_button() {
        logger.info("Select the Progress Note radio button");
        pages.getAlcoholAndDrugEncountersPage().progressNote.click();
    }

    @Then("Select the Progress radio button")
    public void select_the_progress_radio_button() {
        logger.info("Select the Progress radio button");
        pages.getAlcoholAndDrugEncountersPage().progress.click();
    }

    @Then("Select the No Change radio button")
    public void select_the_no_change_radio_button() {
        logger.info("Select the No Change radio button");
        pages.getAlcoholAndDrugEncountersPage().noChange.click();
    }

    @Then("Select the Regress radio button")
    public void select_the_regress_radio_button() {
        logger.info("Select the Regress radio button");
        pages.getAlcoholAndDrugEncountersPage().regress.click();
    }

    @Then("Select the End Group radio button")
    public void select_the_end_group_radio_button() {
        logger.info("Select the End Group radio button");
        pages.getAlcoholAndDrugEncountersPage().endGroup.click();
    }

    @Then("Select the Date of staffing")
    public void select_the_date_of_staffing() {
        logger.info("Select the Date of staffing");
        scrollDown(250, 500);
        pages.getAlcoholAndDrugEncountersPage().dateOfStaffing.click();
    }

    @Then("Enter the Current assigned facility")
    public void enter_the_current_assigned_facility() {
        logger.info("Enter the Current assigned facility");
        pages.getAlcoholAndDrugEncountersPage().currentAssignedFacility.sendKeys("Denver Womens Correctional Facility", Keys.ENTER);

    }

    @Then("Add Timestamp to Staff in attendance with position titles")
    public void add_timestamp_to_staff_in_attendance_with_position_titles() {
        logger.info("Add Timestamp to Staff in attendance with position titles");
        pages.getAlcoholAndDrugEncountersPage().staffInAttendanceWithPositionTittles.click();

    }

    @Then("Add Timestamp to Topic of staffing")
    public void add_timestamp_to_topic_of_staffing() {
        logger.info("Add Timestamp to Topic of staffing");
        pages.getAlcoholAndDrugEncountersPage().topicOfStaffing.click();
    }

    @Then("Add Timestamp to Decision or action")
    public void add_timestamp_to_decision_or_action() {
        logger.info("Add Timestamp to Decision or action");
        pages.getAlcoholAndDrugEncountersPage().decisionOrAction.click();
    }

    @Then("Select the Not Available as a Sign")
    public void select_the_not_available_as_a_sign() {
       logger.info("Select the Not Available as a Sign");
       pages.getAlcoholAndDrugEncountersPage().bypass.click();
        pages.getAlcoholAndDrugEncountersPage().notAvailable.click();
    }

    @Then("Select the Add as a Witness")
    public void select_the_add_as_a_witness() {
        logger.info("Select the Add as a Witness");
        pages.getAlcoholAndDrugEncountersPage().addWitness.click();
    }

}
