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

    @FindBy(xpath = "//a[@data-title='Jump to Subjective']/span")
    public WebElement subjectiveButton;

    @FindBy(xpath = "//a[@data-title='Jump to Objective']/span")
    public WebElement objectiveButton;

    @FindBy(xpath = "//a[@data-title='Jump to Assessment']/span")
    public WebElement assessmentButton;

    @FindBy(xpath = "//a[@data-title='Jump to Plan']/span")
    public WebElement planButton;

    @FindBy(xpath = "//a[@data-title='Jump to Education']/span")
    public WebElement educationButton;

    @FindBy(xpath = "//a[@data-title='Jump to Health Code/Level Scores']/span")
    public WebElement healthCodeLevelScoresButton;

    @FindBy(xpath = "//a[@data-title='Jump to Standard Forms']/span")
    public WebElement standardFormsButton;

    @FindBy(xpath = "//a[@data-title='Jump to Scanned Documents/Photos']/span")
    public WebElement scannedDocumentsPhotosButton;

    @FindBy(xpath = "//div[@id='divHeaderContainer']//tr[2]/td[2]/p")
    public WebElement healthScoresHeader;

    @FindBy(xpath = "//tr/td/div/input[@id='EncOccurredUnitReadOnly']")
    public WebElement encounterHeaderComplex;

    @FindBy(xpath = "//h3[text()='Subjective']")
    public WebElement subjectiveSection;

    @FindBy(xpath = "//h3[text()='Objective']")
    public WebElement objectiveSection;

    @FindBy(xpath = "//h3[text()='Assessment']")
    public WebElement assessmentSection;

    @FindBy(xpath = "//h3[text()='Plan']")
    public WebElement planSection;

    @FindBy(xpath = "//h3[text()='Education']")
    public WebElement educationSection;

    @FindBy(xpath = "//h3[text()='Health Code/Level Scores']")
    public WebElement healthCodeLevelScoresSection;

    @FindBy(xpath = "//div[@id='stdForm']//span")
    public WebElement standardFormsSection;

    @FindBy(xpath = "//div[@id='scannedDocs']//span")
    public WebElement scannedDocumentsPhotosSection;

    @FindBy(xpath = "//div/input[@id='MedicalClassificationCodeReadOnly']")
    public WebElement medicalLevel;

    @FindBy(xpath = "//div/input[@id='DentalCareNeedsReadOnly']")
    public WebElement dentalLevel;

    @FindBy(xpath = "//div/input[@value='2 - Low clinical need for mental health treatment']")
    public WebElement psychologicalLevel;

    @FindBy(xpath = "//div/input[@id='IntellectDevelopDisabledRatingReadOnly']")
    public WebElement idLevel;

    @FindBy(xpath = "//div[@id='SexOffenderRatingReadOnly']")
    public WebElement sexOffenderLevel;

    @FindBy(xpath = "//div/input[@id='SubstanceAbuseRatingReadOnly']")
    public WebElement substanceAbuseRatingLevel;

    @FindBy(xpath = "//div/input[@id='soarLevelReadOnly']")
    public WebElement sOARLevel;


//    @FindBy(xpath = "//a[@data-title='Jump to Objective']/span']")
//    public WebElement objectiveButton;


}
