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
        scrollDown(500,750);
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


}
