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



}
