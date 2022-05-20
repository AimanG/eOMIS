package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IJPPage {

    public IJPPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span/input[@type='text'][2]")
    public WebElement currentCaseManager;

    @FindBy(xpath = "//*[text()= ' [099029775]']/strong")
    public WebElement confirmCurrentCaseManager;

    @FindBy(xpath = "//select[@id='parmMONTHPRINT']")
    public WebElement calendarMonth;

    @FindBy(xpath = "//select[@id='parmCYEAR']")
    public WebElement calendarYear;

    @FindBy(xpath = "//select[@id='parmTRIALRUN']")
    public WebElement trialRun;

    @FindBy(xpath = "//select[@id='parmSORTSEQOTCR125']")
    public WebElement sortSequence;

    @FindBy(xpath = "//input[@id='emailAddress']")
    public WebElement address;

    @FindBy(xpath = "//button[@id='btnSUBMIT']")
    public WebElement submitButton;

    @FindBy(xpath = "//select[@id='CaseNoteCategory']")
    public WebElement category;

    @FindBy(xpath = "//select[@id='CaseNoteType']")
    public WebElement type;

    @FindBy(xpath = "(//i[@class='fa fa-chevron-right'])[1]")
    public WebElement nextButton;

    @FindBy(xpath = "//button[@id='offenderAlertsContinue']")
    public WebElement continueWarning;

}
