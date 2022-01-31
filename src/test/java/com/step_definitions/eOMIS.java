package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class eOMIS extends BrowserUtils {
    Pages pages = new Pages();

    @Given("Enter User ID and Password at DeCORuM login screen")
    public void enter_user_id_and_password_at_de_co_ru_m_login_screen() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("OFULLTSTR");
        pages.getLoginPage().password.sendKeys("Water001");

    }

    @When("Click Logon button")
    public void click_logon_button() {
        pages.getLoginPage().logon.click();
    }

    @Then("Select the Offender")
    public void select_the_offender() {
        Driver.getDriver().manage().window().maximize();
        waitForClickability(pages.getLandingPage().offenderDOCLookup, 3);
        pages.getLandingPage().offenderDOCLookup.click();
        pages.getLandingPage().offenderDOCLookupSearch.sendKeys("190456");
        pages.getLandingPage().offenderDOCLookupSearch.sendKeys(Keys.ENTER);

    }

    @Then("Go to Offender -> Offender Assessments -> LSI Assessments")
    public void go_to_offender_offender_assessments_lsi_assessments() {
        wait(2);
        hover(pages.getLandingPage().hamburgerMenu);
        wait(1);
        pages.getLandingPage().offenderFunctionalAreaButton.click();
        pages.getLandingPage().offenderAssessments.click();
        pages.getLandingPage().lsiAssessments.click();
    }

    @Then("Make sure DOC {string} is displayed correctly")
    public void make_sure_doc_is_displayed_correctly(String DOCNumber) {
        switchToIFrameByID("iframeMain");
//        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        String DOCNumberOnThePage = pages.getLsiAssessmentsPage().DOCNumber.getText();
        System.out.println(DOCNumberOnThePage);
        Assert.assertEquals(DOCNumber, DOCNumberOnThePage);
    }

    @Then("Click on New button")
    public void click_on_new_button() {
        switchToIFrameByWebElement(pages.getLsiAssessmentsPage().iframe);
        pages.getLsiAssessmentsPage().newButton.click();
    }

    @Then("Choose today's date for Assessment Date")
    public void choose_today_s_date_for_assessment_date() {

    }
    @Then("Choose Facility Name from the dropdown")
    public void choose_facility_name_from_the_dropdown() {

    }
    @Then("Choose Staff Name from the dropdown")
    public void choose_staff_name_from_the_dropdown() {

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
        WebElement testSourceDOC = pages.getLsiAssessmentsPage().testSource;
        testSourceDOC.click();
        pages.getLsiAssessmentsPage().docPrisons.click();

    }

    @Then("Enter {int} for Number of adult prior convictions:")
    public void enter_for_number_of_adult_prior_convictions(Integer int1) {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }

    @Then("Enter {int} for Number of present offenses:")
    public void enter_for_number_of_present_offenses(Integer int1) {

    }

    @Then("Enter {int} for Number of times punished for institutional misconduct:")
    public void enter_for_number_of_times_punished_for_institutional_misconduct(Integer int1) {

    }




}
//Ctrl+Alt+L


