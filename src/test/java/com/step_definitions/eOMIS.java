package com.step_definitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class eOMIS {
    Pages pages = new Pages();


    @Given("Enter User ID and Password at DeCORuM login screen")
    public void enter_user_id_and_password_at_de_co_ru_m_login_screen() {
        Driver.getDriver().get(ConfigurationReader.getProperties("url"));
        pages.getLoginPage().userId.sendKeys("OFULLTSTR");
        pages.getLoginPage().password.sendKeys("Water001");
        pages.getLoginPage().logon.click();


    }
    @When("Click Logon button")
    public void click_logon_button() {

    }
    @Then("Click Landing Page menu")
    public void click_landing_page_menu() {

    }

}
