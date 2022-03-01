package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//form[@name='OffenderLookupForm']/div/div[2]/div/span/span[1]/span/span[1]")
    public WebElement offenderDOCLookup;

    @FindBy(xpath = "//ul/li/small/a/i[@class='fa fa-bars']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//a[text()='Offender']")
    public WebElement offenderFunctionalAreaButton;

    @FindBy(xpath = "//nav/ul/li[4]/a[@role='menuitem']")
    public WebElement offenderAssessments;

    @FindBy(xpath = "//*[contains(text(), 'LSI Assessments')]")
    public WebElement lsiAssessments;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement offenderDOCLookupSearch;

    @FindBy(xpath = "//a[text()='Nursing']")
    public WebElement nursing;

    @FindBy(xpath = "//a[text()='Medical Provider']")
    public WebElement medicalProvider;

    @FindBy(xpath = "//a[text()='Nursing Encounters']")
    public WebElement nursingEncounters;

    @FindBy(xpath = "//a[text()='Medical Encounters']")
    public WebElement medicalEncounters;

}
