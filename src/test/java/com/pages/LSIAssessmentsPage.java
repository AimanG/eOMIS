package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LSIAssessmentsPage {

    public LSIAssessmentsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement newButton;

    @FindBy(xpath = "//div[@id='divHeaderContainer']/div/div/div/h4/small/code[3]/span")
    public WebElement DOCNumber;

    @FindBy(xpath = "//iframe[@id='iframeMain']")
    public WebElement iframe;
//td
    @FindBy(xpath = "//div/table/tbody/tr/td/div/span/input[@id='lsiAssessmentStaff']")
    public WebElement staffName;

    @FindBy(xpath = "//span[@id='select2-lsiTestSource-container']")
    public WebElement testSource;

    @FindBy(xpath = "//li[text()='DOC (Prisons)']")
    public WebElement docPrisons;

    @FindBy(xpath = "//input[@id='priorConvictionAdultCount']")
    public WebElement numberOfAdultPriorConvictions;

    @FindBy(xpath = "//input[@id='presentOffenseCount']")
    public WebElement numberOfPresentOffenses;

    @FindBy(xpath = "//input[@id='instMisconductPunishedCount']")
    public WebElement numberOfTimesPunishedForInstitutionalMisconduct;

    @FindBy(xpath = "//span[@id='select2-lsiEmploymentEducationType-container']")
    public WebElement employmentEducationType;

    @FindBy(xpath = "//li[text()='Work']")
    public WebElement workEmploymentType;

    @FindBy(xpath = "//select[@id='participationPerformanceRate']")
    public WebElement participationPerformanceRate;

    @FindBy(xpath = "//select[@id='financialProblemsRate']")
    public WebElement problemsRate;

    @FindBy(xpath = "//select[@id='familyDissatisfiedRate']")
    public WebElement dissatisfactionWithMaritalOrEquivalentSituationRate;

    @FindBy(xpath = "//select[@id='familyNonrewardParentalRate']")
    public WebElement nonrewardingParentalRate;

    @FindBy(xpath = "//select[@id='familyNonrewardOtherRate']")
    public WebElement nonrewardingOtherRate;

    @FindBy(xpath = "//select[@id='accomUnsatisRate']")
    public WebElement unsatisfactoryRate;

    @FindBy(xpath = "//input[@id='accomAddressChgYearCount']")
    public WebElement numberOfAddressChanges;

    @FindBy(xpath = "//select[@id='leisureUseOfTimeRate']")
    public WebElement couldMakeBetterUseOfTimeRate;

    @FindBy(xpath = "//select[@id='alcoholProbCurrentRate']")
    public WebElement alcoholProblemCurrentlyRate;

    @FindBy(xpath = "//select[@id='drugProbCurrentRate']")
    public WebElement drugProblemCurrentlyRate;

    @FindBy(xpath = "//span[text()='41. Law violation (SY, IN-2) ']")
    public WebElement lawViolation;

    @FindBy(xpath = "//select[@id='attiSupportCrimeRate']")
    public WebElement supportiveOfCrime;

    @FindBy(xpath = "//select[@id='attiUnfavorConventionRate']")
    public WebElement unfavorableAttitudeTowardConvention;

    @FindBy(xpath = "//button[@id='btnCONTINUE']")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@id='btnSAVE']")
    public WebElement saveButton;


}
