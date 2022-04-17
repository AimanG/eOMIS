package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div/label/input[@id='user-id']")
    public WebElement userId;

    @FindBy(xpath = "//div/label/input[@id='user-password']")
    public WebElement password;

    @FindBy(xpath = "//button[@id='buttonLogon']")
    public WebElement logon;



}
