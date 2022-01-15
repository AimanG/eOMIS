package com.step_definitions;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import javax.swing.*;
import java.awt.*;

public class eOMIS {
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

    @Then("Click Landing Page menu")
    public void click_landing_page_menu() {
        Driver.getDriver().manage().window().maximize();
        pages.getLoginPage().offenderDOCLookup.click();


    }

}
