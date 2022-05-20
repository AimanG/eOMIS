package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;

public class LoginSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(LoginSteps.class);

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
        waitForPageToLoad(10);
        clickEsc();

        waitForClickability(pages.getLandingPage().offenderDOCLookup, 10);
        pages.getLandingPage().offenderDOCLookup.click();

        pages.getLandingPage().offenderDOCLookupSearch.sendKeys(DOCNumber);
        pages.getLandingPage().offenderDOCLookupSearch.sendKeys(Keys.ENTER);
    }

    @Then("Go to Health -> Nursing -> Nursing Encounters")
    public void go_to_health_nursing_nursing_encounters() {

        Driver.getDriver().manage().window().maximize();
        logger.info("Go to Health -> Nursing -> Nursing Encounters");
        wait(5);
        pages.getLandingPage().nursing.click();
        waitForClickability(pages.getLandingPage().nursing, 10);
        scrollToElement(pages.getLandingPage().nursingEncounters);
        pages.getLandingPage().nursingEncounters.click();

    }

    @Then("Go to Health -> Medical Provider -> Medical Encounters")
    public void go_to_health_medical_medical_nursing_encounters() {

        logger.info("Go to Health -> Medical Provider -> Medical Encounters");
        Driver.getDriver().manage().window().maximize();
        wait(5);
        pages.getLandingPage().medicalProvider.click();
        waitForClickability(pages.getLandingPage().medicalProvider, 10);
        scrollToElement(pages.getLandingPage().medicalEncounters);
        pages.getLandingPage().medicalEncounters.click();

    }


    @Then("Click Continue button")
    public void click_continue_button() {

        logger.info("Click Continue button");
        pages.getLsiAssessmentsPage().continueButton.click();
    }


    @Given("Enter Nurse User ID and Password at DeCORuM login screen")
    public void enter_nurse_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter Nurse User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("NTESTR");
        pages.getLoginPage().password.sendKeys("pepsi123");
    }

    @Given("Enter Provider User ID and Password at DeCORuM login screen")
    public void enter_provider_user_id_and_password_at_de_co_ru_m_login_screen() {

        logger.info("Enter Provider User ID and Password at DeCORuM login screen");
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("TSTPRV");
        pages.getLoginPage().password.sendKeys("pepsi123");

    }

}
//Ctrl+Alt+L