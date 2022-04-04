package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlcoholAndDrugEncountersPage {

    public AlcoholAndDrugEncountersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@value='New'])[1]")
    public WebElement newButtonObjective;

    @FindBy(xpath = "//input[@id='supervisor']")
    public WebElement supervisorName;

    @FindBy(xpath = "(//div/p)[4]/label")
    public WebElement clientHasCompletedRecLevOfTre;

    @FindBy(xpath = "(//div/p)[6]/label")
    public WebElement clientHasPreComRecLevOfTre;

    @FindBy(xpath = "(//div/p)[8]/label")
    public WebElement clientHasComTheRecLevOfTre;

    @FindBy(xpath = "(//div/p)[10]/label")
    public WebElement clientHasBeenExpFromOrQuTreAtTheRecLev;

    @FindBy(xpath = "(//div/p)[12]/label")
    public WebElement clientHasRefTreAtTheRecLev;

    @FindBy(xpath = "(//div/p)[14]/label")
    public WebElement clientHasRefToComTheAsPro;

    @FindBy(xpath = "(//div/p)[16]/label")
    public WebElement clientHasPreComRecTreLevAndClHasHadAPosUr;

    @FindBy(xpath = "(//div/p)[20]/label")
    public WebElement clientHasNotComTreAtTheRecTreLev;

    @FindBy(xpath = "(//div/p)[24]/label")
    public WebElement reaReqHasBeenAppButNotYetCom;

    @FindBy(xpath = "(//div/p)[26]/label")
    public WebElement clientRetDurCurIncAndPreTreLev;

    @FindBy(xpath = "//span[@id='select2-stdFormType-container']")
    public WebElement standardForm;

    @FindBy(xpath = "//select[@id='stdFormType']")
    public WebElement standardForms;

    @FindBy(xpath = "(//input[@type='button'])[2]")
    public WebElement newButtonLSIAssessment;

    @FindBy(xpath = "//select[@id='lsiTestSource']")
    public WebElement testSource;




}
