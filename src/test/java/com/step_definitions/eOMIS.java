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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


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

    @Then("Select the Offender")
    public void select_the_offender() {

        logger.info("Select the Offender");

        Driver.getDriver().manage().window().maximize();
        waitForClickability(pages.getLandingPage().offenderDOCLookup, 3);
        pages.getLandingPage().offenderDOCLookup.click();
        pages.getLandingPage().offenderDOCLookupSearch.sendKeys("190456");
        pages.getLandingPage().offenderDOCLookupSearch.sendKeys(Keys.ENTER);

    }

    @Then("Go to Offender -> Offender Assessments -> LSI Assessments")
    public void go_to_offender_offender_assessments_lsi_assessments() {

        logger.info("Go to Offender -> Offender Assessments -> LSI Assessments");
        wait(2);
        hover(pages.getLandingPage().hamburgerMenu);
        wait(1);
        pages.getLandingPage().offenderFunctionalAreaButton.click();
        pages.getLandingPage().offenderAssessments.click();
        pages.getLandingPage().lsiAssessments.click();

    }

    @Then("Make sure DOC {string} is displayed correctly")
    public void make_sure_doc_is_displayed_correctly(String DOCNumber) {

        logger.info("Make sure DOC {string} is displayed correctly");
        switchToIFrameByID("iframeMain");
//        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        String DOCNumberOnThePage = pages.getLsiAssessmentsPage().DOCNumber.getText();
        System.out.println(DOCNumberOnThePage);
        Assert.assertEquals(DOCNumber, DOCNumberOnThePage);
    }

    @Then("Click on New button")
    public void click_on_new_button() {

        logger.info("Click on New button");
        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        pages.getLsiAssessmentsPage().newButton.click();
    }

    @Then("Choose Staff Name from the dropdown")
    public void choose_staff_name_from_the_dropdown() {

        logger.info("Choose Staff Name from the dropdown");
        WebElement staffNameAnaya = pages.getLsiAssessmentsPage().staffName;

        staffNameAnaya.sendKeys("a");
        staffNameAnaya.clear();
        staffNameAnaya.sendKeys("anaya");
        wait(1);
        staffNameAnaya.sendKeys(Keys.DOWN);
        staffNameAnaya.sendKeys(Keys.ENTER);

    }

    @Then("Choose Test Source from the dropdown")
    public void choose_test_source_from_the_dropdown() {

        logger.info("Choose Test Source from the dropdown");
        WebElement testSourceDOC = pages.getLsiAssessmentsPage().testSource;
        testSourceDOC.click();
        pages.getLsiAssessmentsPage().docPrisons.click();

    }

    @Then("Enter {string} for Number of adult prior convictions")
    public void enter_for_number_of_adult_prior_convictions(String number) {

        logger.info("Enter " + number + "for Number of adult prior convictions");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");

        pages.getLsiAssessmentsPage().numberOfAdultPriorConvictions.sendKeys(number);
    }

    @Then("Enter {string} for Number of present offenses")
    public void enter_for_number_of_present_offenses(String number) {

        logger.info("Enter " + number + " for Number of present offenses");
        pages.getLsiAssessmentsPage().numberOfPresentOffenses.sendKeys(number);

    }

    @Then("Enter {string} for Number of times punished for institutional misconduct")
    public void enter_for_number_of_times_punished_for_institutional_misconduct(String number) {

        logger.info("Enter " + number + " for Number of times punished for institutional misconduct");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(250,500)", "");

        pages.getLsiAssessmentsPage().numberOfTimesPunishedForInstitutionalMisconduct.sendKeys(number);

    }

    @Then("Choose Work for Employment or Education Type")
    public void choose_work_for_employment_education_type() {

        logger.info("Choose Work for Employment or Education Type");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(500,700)", "");

        pages.getLsiAssessmentsPage().employmentEducationType.click();
        pages.getLsiAssessmentsPage().workEmploymentType.click();

    }

    @Then("Enter {string} for {int}.Participation or Performance \\(C) Rating")
    public void enter_for_participation_performance_c_rating(String number, Integer int1) {

        logger.info("Enter " + number + " for 18.Participation or Performance (C) Rating");

        Select select = new Select(pages.getLsiAssessmentsPage().participationPerformance);
        select.selectByValue(number);

    }

    @Then("Enter {string} for {int}.Problems \\(SY) Rating")
    public void enter_for_problems_sy_rating(String number, Integer int1) {

        logger.info("Enter " + number + " for 21.Problems (SY) Rating");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(700,800)", "");

        Select select = new Select(pages.getLsiAssessmentsPage().problemsSY);
        select.selectByValue(number);
    }

    @Then("Enter {string} for {int}. Dissatisfaction with marital or equivalent situation \\(C)")
    public void enter_for_dissatisfaction_with_marital_or_equivalent_situation_c(String number, Integer int1) {

        logger.info("Enter " + number + " for 23. Dissatisfaction with marital or equivalent situation (C)");

        Select select = new Select(pages.getLsiAssessmentsPage().dissatisfactionWithMaritalOrEquivalentSituation);
        select.selectByValue(number);

    }

    @Then("Enter {string} for {int}. Nonrewarding, parental \\(CY)")
    public void enter_for_nonrewarding_parental_cy(String number, Integer int1) {

        logger.info("Enter " + number + " for 24. Nonrewarding, parental (CY)");

        Select select = new Select(pages.getLsiAssessmentsPage().nonrewardingParental);
        select.selectByValue(number);
    }

    @Then("Enter {string} for {int}. Nonrewarding, other \\(CY)")
    public void enter_for_nonrewarding_other_cy(String number, Integer int1) {

        logger.info("Enter " + number + " for 25. Nonrewarding, other (CY)");

        Select select = new Select(pages.getLsiAssessmentsPage().nonrewardingOther);
        select.selectByValue(number);
    }

    @Then("Enter {string} for {int}. Unsatisfactory \\(C)")
    public void enter_for_unsatisfactory_c(String number, Integer int1) {

        logger.info("Enter " + number + "for 27. Unsatisfactory \\(C)");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(800,850)", "");
    }

    @Then("Enter {string} for Number of address changes")
    public void enter_for_number_of_address_changes(String number) {

        logger.info("Enter " + number + " for Number of address changes");

    }
}
//Ctrl+Alt+L


