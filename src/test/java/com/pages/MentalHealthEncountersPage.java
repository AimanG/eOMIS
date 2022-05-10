package com.pages;

import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentalHealthEncountersPage {
    public MentalHealthEncountersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@name='SCRNEXTN_IBAAPstatus'])[1]")
    public WebElement approved;


}
