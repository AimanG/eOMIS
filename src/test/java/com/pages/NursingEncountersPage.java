package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NursingEncountersPage {

    public NursingEncountersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@value='New']")
    public WebElement newButton;

    @FindBy(xpath = "//select[@id='EncOccurredUnit']")
    public WebElement complex;

    @FindBy(xpath = "//select[@id='EncounterType']")
    public WebElement type;

    @FindBy(xpath = "//button[@id='nextstep_encounter']")
    public WebElement nextButton;

    @FindBy(xpath = "//div/button[@data-original-title='Timestamp']")
    public WebElement timestamp;

//    @FindBy(xpath = "//select[@id='EncOccurredUnit']")
//    public WebElement complex;



}
