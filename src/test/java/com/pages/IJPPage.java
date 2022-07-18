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

    @FindBy(xpath = "//td[@data-value='2022/04/01/07/00/00']")
    public WebElement assignedDateTime;

    @FindBy(xpath = "//span[@id='select2-facilityPartyID-container']")
    public WebElement facilityName;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement attendanceListSearchBySectionInput;

    @FindBy(xpath = "//span[@id='select2-facilityActivityTypeCode-container']")
    public WebElement assignmentCategory;

    @FindBy(xpath = "//span[@id='select2-workPgmAssignmentCode-container']")
    public WebElement assignmentType;

    @FindBy(xpath = "//span[@id='select2-workPgmSection-container']")
    public WebElement sectionNo;

    @FindBy(xpath = "//span[@class='fa fa-crosshairs']")
    public WebElement attendanceDate;

    @FindBy(xpath = "//*[text()='IJPS065B - Attendance List']")
    public WebElement attendanceListHeader;

    @FindBy(xpath = "//button[@id='btnSEARCH']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[text()='Facility ID:']")
    public WebElement attendanceCodeHeader;

    @FindBy(xpath = "//span[@id='select2-attendanceTypeOfTime-container']")
    public WebElement attendanceCode;

//    @FindBy(xpath = "//select[@id='attendanceTypeOfTime']")
//    public WebElement attendanceCode;

    @FindBy(xpath = "//select[@id='activityAttendanceException']")
    public WebElement reason;

    @FindBy(xpath = "//input[@id='attendanceCommentsForPeriod']")
    public WebElement comments;

    @FindBy(xpath = "//button[@id='nextStepButton']")
    public WebElement next;

    @FindBy(xpath = "//*[@action='/eomis/servlet/com.marquis.eomis.EomisControllerServlet' and @onsubmit]/div[1]//tbody/tr[1]/td[1]/a")
    public WebElement assignedDateTimeFirstValue;

    @FindBy(xpath = "//table[@id='IJPS010A_G000']/tbody/tr[1]/td[1]/a")
    public WebElement programAssignedDateTime;

    @FindBy(xpath = "//table[@id='IJPS010B_G000']/tbody/tr[1]/td[1]/a")
    public WebElement attendanceYear;

    @FindBy(xpath = "//button[@id='btnSAVE']")
    public WebElement saveButton;

}
