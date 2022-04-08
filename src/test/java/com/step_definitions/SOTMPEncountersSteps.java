package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.Pages;
import com.utilities.Driver;
import com.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

public class SOTMPEncountersSteps extends BrowserUtils {

    Pages pages = new Pages();
    Logger logger = Logger.getLogger(eOMISSteps.class);

    @Then("Go to Health -> Behavioral Health -> SOTMP Encounters")
    public void go_to_health_behavioral_health_sotmp_encounters() {

    }
}
