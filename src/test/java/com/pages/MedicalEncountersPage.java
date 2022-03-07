package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalEncountersPage {

    public MedicalEncountersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@value='New'])[1]")
    public WebElement newButtonObjective;

    @FindBy(xpath = "(//input[@value='New'])[3]")
    public WebElement newButtonLabTestOrders;

    @FindBy(xpath = "//strong[text()='MSSS032B - Vital Signs']")
    public WebElement title;

    @FindBy(xpath = "//h3[text()='Objective']")
    public WebElement labTestOrdersSection;

    @FindBy(xpath = "//h3[text()='Objective']")
    public WebElement xRayOrdersSection;

    @FindBy(xpath = "//input[@id='Weight']")
    public WebElement weight;

    @FindBy(xpath = "//input[@id='HeightLarge']")
    public WebElement height1;

    @FindBy(xpath = "//input[@id='HeightSmall']")
    public WebElement height2;

    @FindBy(xpath = "//input[@id='VitalSignTemp']")
    public WebElement bodyTemperature;

    @FindBy(xpath = "//select[@id='TempMethod']")
    public WebElement methodBodyTemperature;

    @FindBy(xpath = "//input[@name='Pulse']")
    public WebElement pulseRate;

    @FindBy(xpath = "//select[@id='PulseMethod']")
    public WebElement methodPulseRate;

    @FindBy(xpath = "//input[@name='Systolic']")
    public WebElement bloodPressure1;

    @FindBy(xpath = "//select[@id='BldPressPosTaken']")
    public WebElement position;

    @FindBy(xpath = "//input[@name='RespirationRate']")
    public WebElement respirationRate;

    @FindBy(xpath = "//input[@name='pulseOx']")
    public WebElement pulseOx;

    @FindBy(xpath = "//input[@name='OxySatPerc']")
    public WebElement o2Saturation;

    @FindBy(xpath = "//select[@id='OxySaturation']")
    public WebElement source;

    @FindBy(xpath = "//input[@name='OxySatLtrMin']")
    public WebElement liters;

    @FindBy(xpath = "//select[@id='OxySatVia']")
    public WebElement via;

    @FindBy(xpath = "//input[@name='PeakFlow']")
    public WebElement peakFlow1;

    @FindBy(xpath = "//input[@name='PeakFlow2']")
    public WebElement peakFlow2;

    @FindBy(xpath = "//input[@name='PeakFlow3']")
    public WebElement peakFlow3;

    @FindBy(xpath = "//input[@name='GlucoseReading']")
    public WebElement bloodSugarLevel;

    @FindBy(xpath = "//select[@id='GlucoseType']")
    public WebElement bloodSugarSelect;

    @FindBy(xpath = "//input[@name='VisionREUn']")
    public WebElement uncorrectedRight20;

    @FindBy(xpath = "//input[@name='VisionLEUn']")
    public WebElement uncorrectedLeft20;

    @FindBy(xpath = "//input[@name='VisionBEUn']")
    public WebElement uncorrectedBoth20;

    @FindBy(xpath = "//input[@name='VisionRECor']")
    public WebElement correctedRight20;

    @FindBy(xpath = "//input[@name='VisionLECor']")
    public WebElement correctedLeft20;

    @FindBy(xpath = "//input[@name='VisionBECor']")
    public WebElement correctedBoth20;

    @FindBy(xpath = "(//td/label/span)[3]")
    public WebElement refer;

    @FindBy(xpath = "(//td/label/span)[7]")
    public WebElement pass;

    @FindBy(xpath = "//input[@id='Diastolic']")
    public WebElement bloodPressure2;

    @FindBy(xpath = "//button[@data-original-title='Timestamp']")
    public WebElement commentsTimestamp;

    @FindBy(xpath = "//select[@id='diagnosisCode']")
    public WebElement diagnosisCode;

    @FindBy(xpath = "//select[@id='LabTestTypeFormulary']")
    public WebElement formulary;

    @FindBy(xpath = "//select[@id='LabTestTypeFormulary']")
    public WebElement labTestOrdered;

    @FindBy(xpath = "//select[@id='LabPriority']")
    public WebElement priority;

    @FindBy(xpath = "//select[@id='LabFastingReq']")
    public WebElement fasting;

    @FindBy(xpath = "//select[@id='VerbalOrderReadBack']")
    public WebElement verbalTelephoneOrderReadBack;

//    @FindBy(xpath = "")
//    public WebElement commentsTimestamp;
//
//    @FindBy(xpath = "")
//    public WebElement commentsTimestamp;



}
