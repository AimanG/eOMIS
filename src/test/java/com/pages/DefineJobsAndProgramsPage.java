package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefineJobsAndProgramsPage {
    public DefineJobsAndProgramsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='select2-institutionName-container']")
    public WebElement complexName;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement complexNameSearchBySectionInput;
}
