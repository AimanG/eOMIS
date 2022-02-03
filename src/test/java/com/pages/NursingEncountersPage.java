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

    @FindBy(xpath = "//div/input[@id='MedicalClassificationCodeReadOnly']")
    public WebElement medical;

    @FindBy(xpath = "//a[@data-title='Jump to Subjective']/span")
    public WebElement subjectiveButton;

    @FindBy(xpath = "//a[@data-title='Jump to Objective']/span']")
    public WebElement objectiveButton;

    @FindBy(xpath = "//a[@data-title='Jump to Assessment']/span")
    public WebElement assessmentButton;

    @FindBy(xpath = "//a[@data-title='Jump to Plan']/span']")
    public WebElement planButton;

    @FindBy(xpath = "//a[@data-title='Jump to Education']/span")
    public WebElement educationButton;

    @FindBy(xpath = "//a[@data-title='Jump to Health Code/Level Scores']/span']")
    public WebElement healthCodeLevelScoresButton;

    @FindBy(xpath = "//a[@data-title='Jump to Standard Forms']/span']")
    public WebElement standardFormsButton;

    @FindBy(xpath = "//a[@data-title='Jump to Scanned Documents/Photos']/span']")
    public WebElement scannedDocumentsPhotosButton;

    @FindBy(xpath = "//div[@id='divHeaderContainer']//tr[2]/td[2]/p")
    public WebElement healthScoresHeader;

    @FindBy(xpath = "//h3[text()='Subjective']")
    public WebElement subjectiveSection;

//    @FindBy(xpath = "//a[@data-title='Jump to Objective']/span']")
//    public WebElement objectiveButton;




}
