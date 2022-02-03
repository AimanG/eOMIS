package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class eOMIS extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMIS.class);

    @Given("Enter User ID and Password at DeCORuM login screen")
    public void enter_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("OFULLTSTR");
        pages.getLoginPage().password.sendKeys("Water001");

    }

    @When("Click Logon button")
    public void click_logon_button() {
        logger.info("Click Logon button");
        pages.getLoginPage().logon.click();
    }

    @Then("Select the Offender {string}")
    public void select_the_offender(String DOCNumber) {

        logger.info("Select the Offender " + DOCNumber);

        Driver.getDriver().manage().window().maximize();
        waitForClickability(pages.getLandingPage().offenderDOCLookup, 10);
        pages.getLandingPage().offenderDOCLookup.click();

        switch (DOCNumber) {

            case "190456":
                pages.getLandingPage().offenderDOCLookupSearch.sendKeys("190456");
                pages.getLandingPage().offenderDOCLookupSearch.sendKeys(Keys.ENTER);
                break;
            case "187437":
                pages.getLandingPage().offenderDOCLookupSearch.sendKeys("187437");
                pages.getLandingPage().offenderDOCLookupSearch.sendKeys(Keys.ENTER);
                break;
        }
    }

    @Then("Go to Offender -> Offender Assessments -> LSI Assessments")
    public void go_to_offender_offender_assessments_lsi_assessments() {

        logger.info("Go to Offender -> Offender Assessments -> LSI Assessments");
        waitForClickability(pages.getLandingPage().hamburgerMenu, 10);
        hover(pages.getLandingPage().hamburgerMenu);
        waitForClickability(pages.getLandingPage().offenderFunctionalAreaButton, 10);
        pages.getLandingPage().offenderFunctionalAreaButton.click();
        waitForClickability(pages.getLandingPage().offenderAssessments, 10);
        pages.getLandingPage().offenderAssessments.click();
        waitForClickability(pages.getLandingPage().lsiAssessments, 10);
        pages.getLandingPage().lsiAssessments.click();

    }

    @Then("Go to Health -> Nursing -> Nursing Encounters")
    public void go_to_health_nursing_nursing_encounters() {
        logger.info("Go to Health -> Nursing -> Nursing Encounters");
        Driver.getDriver().manage().window().maximize();

        pages.getLandingPage().nursing.click();
        pages.getLandingPage().nursingEncounters.click();

    }


    @Then("Click Continue button")
    public void click_continue_button() {

        logger.info("Click Continue button");
        pages.getLsiAssessmentsPage().continueButton.click();
    }

    @Then("Click Save button")
    public void click_save_button() {

        logger.info("Click Save button");
        pages.getLsiAssessmentsPage().saveButton.click();
        Driver.getDriver().switchTo().alert().accept();
    }


    @Given("Enter Nurse User ID and Password at DeCORuM login screen")
    public void enter_nurse_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter Nurse User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("NTESTR");
        pages.getLoginPage().password.sendKeys("pepsi123");
    }

}
//Ctrl+Alt+L