package com.pages;

import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class MentalHealthEncountersPage {
    public MentalHealthEncountersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
