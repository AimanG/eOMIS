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

    @FindBy(xpath = "//ul/li[@class='select2-results__option'][1]")
    public WebElement DOC177618;

    @FindBy(xpath = "//ul/li/small/a/i[@class='fa fa-bars']")
    public WebElement hamburger;

    @FindBy(xpath = "//nav/ul/li[4]/a[@role='menuitem']")
    public WebElement offenderAssessments;

    @FindBy(xpath = "//li/a[@id='link-8474']")
    public WebElement lsiAssessments;




}
