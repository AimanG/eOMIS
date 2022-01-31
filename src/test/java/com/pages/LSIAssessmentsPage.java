package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LSIAssessmentsPage {

    public LSIAssessmentsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement newButton;

    @FindBy(xpath = "//div[@id='divHeaderContainer']/div/div/div/h4/small/code[3]/span")
    public WebElement DOCNumber;

    @FindBy(xpath = "//iframe[@id='iframeMain']")
    public WebElement iframe;

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

    @FindBy(xpath = "//span/span[@id='select2-participationPerformanceRate-container']")
    public WebElement participationPerformance2;

    @FindBy(xpath = "//select[@id='participationPerformanceRate']")
    public WebElement participationPerformance;

    @FindBy(xpath = "//select[@id='financialProblemsRate']")
    public WebElement problemsSY;

    @FindBy(xpath = "//select[@id='familyDissatisfiedRate']")
    public WebElement dissatisfactionWithMaritalOrEquivalentSituation;

    @FindBy(xpath = "//select[@id='familyNonrewardParentalRate']")
    public WebElement nonrewardingParental;

    @FindBy(xpath = "//select[@id='familyNonrewardOtherRate']")
    public WebElement nonrewardingOther;

    ///




















}
