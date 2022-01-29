package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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
        wait(3);
        pages.getLsiAssessmentsPage().staffName.sendKeys("a");
        pages.getLsiAssessmentsPage().staffName.clear();
        pages.getLsiAssessmentsPage().staffName.sendKeys("ana");
        System.out.println("unk" +        pages.getLsiAssessmentsPage().staffName.getAttribute("value"));
       // System.out.println("unk" +        pages.getLsiAssessmentsPage().staffName.getAttribute("placeholder"));

    //       pages.getLsiAssessmentsPage().staffName.getAttribute("value");
    }
    @Then("Choose Test Source from the dropdown")
    public void choose_test_source_from_the_dropdown() {


    }

    }
//Ctrl+Alt+L


