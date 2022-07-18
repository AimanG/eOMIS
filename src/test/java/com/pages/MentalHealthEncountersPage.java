package com.pages;

import com.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MentalHealthEncountersPage {
    public MentalHealthEncountersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@name='SCRNEXTN_IBAAPstatus'])[1]")
    public WebElement approved;

    @FindBy(xpath = "//input[@id='paroleDestination']")
    public WebElement paroleOfficeDestination;

    @FindBy(xpath = "//input[@id='paroleMHClinician']")
    public WebElement paroleMentalHealthDestination;

    @FindBy(xpath = "//input[@id='contactInformation']")
    public WebElement contactInformation;

    @FindBy(xpath = "//*[text()='Sex Offender - Information current as of: ']//following-sibling::td/label/span[1]")
    public WebElement sexOffenderROIObtained;

    @FindBy(xpath = "(//label[@class='custom-control custom-checkbox']/span)[3]")
    public WebElement mentalHealthROIObtained;

    @FindBy(xpath = "(//label[@class='custom-control custom-checkbox']/span[1])[3]")
    public WebElement substanceUseROIObtained;

    @FindBy(xpath = "(//label[@class='custom-control custom-checkbox']/span)[7]")
    public WebElement paroleROIObtained;

    @FindBy(xpath = "(//div[@class='note-editable panel-body'])[1]")
    public WebElement timestampField1;

    @FindBy(xpath = "(//div[@class='note-editable panel-body'])[2]")
    public WebElement timestampField2;

    @FindBy(xpath = "(//div[@class='note-editable panel-body'])[3]")
    public WebElement timestampField3;

    @FindBy(xpath = "(//div[@class='note-editable panel-body'])[4]")
    public WebElement timestampField4;

    @FindBy(xpath = "(//div[@class='note-editable panel-body'])[5]")
    public WebElement timestampField5;

    @FindBy(xpath = "(//div[@class='note-editable panel-body'])[6]")
    public WebElement timestampField6;

//    @FindBy(xpath = "")
//    public WebElement approved;

}
