package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//form[@name='OffenderLookupForm']/div/div[2]/div/span/span[1]/span/span[1]/span")
    public WebElement offenderDOCLookup;

    @FindBy(xpath = "//ul/li/small/a/i[@class='fa fa-bars']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//a[text()='Offender']")
    public WebElement offenderFunctionalAreaButton;

    @FindBy(xpath = "//a[text()='Support']")
    public WebElement supportFunctionalAreaButton;

    @FindBy(xpath = "//nav/ul/li[4]/a[@role='menuitem']")
    public WebElement offenderAssessments;

    @FindBy(xpath = "//*[contains(text(), 'Facility Search By Name/ID')]")
    public WebElement facilitySearchByNameID;

    @FindBy(xpath = "//*[contains(text(), 'LSI Assessments')]")
    public WebElement lsiAssessments;

    @FindBy(xpath = "//*[contains(text(), 'Correctional Facility Information')]")
    public WebElement correctionalFacilityInformation;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement offenderDOCLookupSearch;

    @FindBy(xpath = "//a[text()='Nursing']")
    public WebElement nursing;

    @FindBy(xpath = "//a[text()='Behavioral Health']")
    public WebElement behavioralHealth;

    @FindBy(xpath = "//a[text()='Reports']")
    public WebElement reports;

    @FindBy(xpath = "//a[text()='Jobs and Programs']")
    public WebElement jobAndPrograms;

    @FindBy(xpath = "//a[text()='Attendance List Search By Section']")
    public WebElement attendanceListSearchBySection;

    @FindBy(xpath = "//a[text()='Assignment Roster Search by Location']")
    public WebElement assignmentRosterSearchByLocation;

    @FindBy(xpath = "//a[text()='Assignment Roster Search by Section']")
    public WebElement assignmentRosterSearchBySection;

    @FindBy(xpath = "//a[text()='Job/Program Assignments']")
    public WebElement jobProgramAssignments;

    @FindBy(xpath = "//a[text()='Inmate Record']")
    public WebElement inMateRecords;

    @FindBy(xpath = "//a[text()='Inmate Case Notes']")
    public WebElement inmateCaseNotes;

    @FindBy(xpath = "//a[text()='Time Computation Reports']")
    public WebElement timeComputationReports;

    @FindBy(xpath = "//a[text()='Earned Time Awards For Case Manager']")
    public WebElement earnedTimeAwardsForCaseManager;

    @FindBy(xpath = "//a[text()='Alcohol and Drug Encounters']")
    public WebElement alcoholAbnDrugEncounters;

    @FindBy(xpath = "//a[text()='SOTMP Encounters']")
    public WebElement SOTMPEncounters;

    @FindBy(xpath = "//a[text()='Mental Health Encounters']")
    public WebElement mentalHealthEncounters;

    @FindBy(xpath = "//a[text()='Medical Provider']")
    public WebElement medicalProvider;

    @FindBy(xpath = "//a[text()='Nursing Encounters']")
    public WebElement nursingEncounters;

    @FindBy(xpath = "//a[text()='Medical Encounters']")
    public WebElement medicalEncounters;






}
