package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LSIAssessmentsPage {

    public LSIAssessmentsPage() {
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

    @FindBy(xpath = "//span[@id='select2-lsiTestSource-container']")
    public WebElement testSource;

    @FindBy(xpath = "//li[text()='DOC (Prisons)']")
    public WebElement docPrisons;

    @FindBy(xpath = "//input[@id='priorConvictionAdultCount']")
    public WebElement numberOfAdultPriorConvictions;

    @FindBy(xpath = "//input[@id='presentOffenseCount']")
    public WebElement numberOfPresentOffenses;

    @FindBy(xpath = "//input[@id='instMisconductPunishedCount']")
    public WebElement numberOfTimesPunishedForInstitutionalMisconduct;

    @FindBy(xpath = "//span[@id='select2-lsiEmploymentEducationType-container']")
    public WebElement employmentEducationType;

    @FindBy(xpath = "//li[text()='Work']")
    public WebElement workEmploymentType;

    @FindBy(xpath = "//li[text()='Homemaker']")
    public WebElement homemakerEmploymentType;

    @FindBy(xpath = "//li[text()='Pensioner']")
    public WebElement pensionerEmploymentType;

    @FindBy(xpath = "//li[text()='School']")
    public WebElement schoolEmploymentType;

    @FindBy(xpath = "//select[@id='participationPerformanceRate']")
    public WebElement participationPerformanceRate;

    @FindBy(xpath = "//select[@id='peerInteractionRate']")
    public WebElement peerInteractionsRate;

    @FindBy(xpath = "//select[@id='authorityInteractionRate']")
    public WebElement authorityInteractionsRate;

    @FindBy(xpath = "//select[@id='financialProblemsRate']")
    public WebElement problemsRate;

    @FindBy(xpath = "//select[@id='familyDissatisfiedRate']")
    public WebElement dissatisfactionWithMaritalOrEquivalentSituationRate;

    @FindBy(xpath = "//select[@id='familyNonrewardParentalRate']")
    public WebElement nonrewardingParentalRate;

    @FindBy(xpath = "//select[@id='familyNonrewardOtherRate']")
    public WebElement nonrewardingOtherRate;

    @FindBy(xpath = "//select[@id='accomUnsatisRate']")
    public WebElement unsatisfactoryRate;

    @FindBy(xpath = "//input[@id='accomAddressChgYearCount']")
    public WebElement numberOfAddressChanges;

    @FindBy(xpath = "//select[@id='leisureUseOfTimeRate']")
    public WebElement couldMakeBetterUseOfTimeRate;

    @FindBy(xpath = "//select[@id='alcoholProbCurrentRate']")
    public WebElement alcoholProblemCurrentlyRate;

    @FindBy(xpath = "//select[@id='drugProbCurrentRate']")
    public WebElement drugProblemCurrentlyRate;

    @FindBy(xpath = "//span[text()='41. Law violation (SY, IN-2) ']")
    public WebElement lawViolation;

    @FindBy(xpath = "//select[@id='attiSupportCrimeRate']")
    public WebElement supportiveOfCrime;

    @FindBy(xpath = "//select[@id='attiUnfavorConventionRate']")
    public WebElement unfavorableAttitudeTowardConvention;

    @FindBy(xpath = "//button[@id='btnCONTINUE']")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@id='btnSAVE']")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@id='lsiAssessmentDate']")
    public WebElement assessmentDate;

    @FindBy(xpath = "//div[@id='criminalHistory']//tbody/tr[7]/td/label")
    public WebElement arrestedUnderAge16Checkbox;

    @FindBy(xpath = "//div[@id='criminalHistory']//tbody/tr[9]/td/label")
    public WebElement escapeHistoryInstitutionCheckbox;

    @FindBy(xpath = "//div[@id='criminalHistory']//tbody/tr[12]/td/label")
    public WebElement chargeLaidOrProbationParoleCheckbox;

    @FindBy(xpath = "//div[@id='criminalHistory']//tbody/tr[13]/td/label")
    public WebElement recordOfAssaultViolenceCheckbox;

    @FindBy(xpath = "//div[@id='educationEmployment']//tbody/tr[2]/td/label")
    public WebElement currentlyUnemployedCheckbox;

    @FindBy(xpath = "//div[@id='educationEmployment']//tbody/tr[3]/td/label")
    public WebElement frequentlyUnemployedCheckbox;

    @FindBy(xpath = "//div[@id='educationEmployment']//tbody/tr[4]/td/label")
    public WebElement neverEmployedForAFullYearCheckbox;

    @FindBy(xpath = "//div[@id='educationEmployment']//tbody/tr[5]/td/label")
    public WebElement everFiredCheckbox;

    @FindBy(xpath = "//div[@id='educationEmployment']//tbody/tr[7]/td/label")
    public WebElement lessThanRegularGrade10Checkbox;

    @FindBy(xpath = "//div[@id='educationEmployment']//tbody/tr[8]/td/label")
    public WebElement lessThanRegularGrade12Checkbox;

    @FindBy(xpath = "//div[@id='educationEmployment']//tbody/tr[9]/td/label")
    public WebElement suspendedOrExpelledAtLeastOnceCheckbox;

    @FindBy(xpath = "//div[@id='financial']//tbody/tr[2]/td/label")
    public WebElement relianceUponSocialAssistanceCheckbox;

    @FindBy(xpath = "//div[@id='familyMarital']//tbody/tr[4]/td/label")
    public WebElement criminalFamilySpouseCheckbox;

    @FindBy(xpath = "//div[@id='accommodation']//tbody/tr[4]/td/label")
    public WebElement highCrimeNeighborhoodCheckbox;

    @FindBy(xpath = "//div[@id='leisureRecreation']//tbody/tr[1]/td/label")
    public WebElement noRecentParticipationInOrganizedActivityCheckbox;

    @FindBy(xpath = "//div[@id='companions']//tbody/tr[1]/td/label")
    public WebElement aSocialIsolateCheckbox;

    @FindBy(xpath = "//div[@id='companions']//tbody/tr[2]/td/label")
    public WebElement someCriminalAcquaintancesCheckbox;

    @FindBy(xpath = "//div[@id='companions']//tbody/tr[3]/td/label")
    public WebElement someCriminalFriendsCheckbox;

    @FindBy(xpath = "//div[@id='companions']//tbody/tr[4]/td/label")
    public WebElement veryFewPreSchoolAcquaintancesCheckbox;

    @FindBy(xpath = "//div[@id='companions']//tbody/tr[5]/td/label")
    public WebElement veryFewProSocialFriendsCheckbox;

    @FindBy(xpath = "//div[@id='alcoholDrugs']//tbody/tr[1]/td/label")
    public WebElement alcoholProblemEverCheckbox;

    @FindBy(xpath = "//div[@id='alcoholDrugs']//tbody/tr[2]/td/label")
    public WebElement drugProblemEverCheckbox;

    @FindBy(xpath = "//div[@id='alcoholDrugs']//tbody/tr[7]/td/label")
    public WebElement lawViolationCheckbox;

    @FindBy(xpath = "//div[@id='alcoholDrugs']//tbody/tr[8]/td/label")
    public WebElement maritalFamilyCheckbox;

    @FindBy(xpath = "//div[@id='alcoholDrugs']//tbody/tr[9]/td/label")
    public WebElement schoolWorkCheckbox;

    @FindBy(xpath = "//div[@id='alcoholDrugs']//tbody/tr[10]/td/label")
    public WebElement medicalCheckbox;

    @FindBy(xpath = "//div[@id='alcoholDrugs']//tbody/tr[11]/td/label")
    public WebElement otherClinicalIndicatorsCheckbox;

    @FindBy(xpath = "//div[@id='emotionalPersonal']//tbody/tr[1]/td/label")
    public WebElement moderateInterferenceCheckbox;

    @FindBy(xpath = "//div[@id='emotionalPersonal']//tbody/tr[2]/td/label")
    public WebElement severeInterferenceCheckbox;

    @FindBy(xpath = "//div[@id='emotionalPersonal']//tbody/tr[3]/td/label")
    public WebElement mentalHealthTreatmentPastCheckbox;

    @FindBy(xpath = "//div[@id='emotionalPersonal']//tbody/tr[4]/td/label")
    public WebElement mentalHealthTreatmentCurrentCheckbox;

    @FindBy(xpath = "//div[@id='emotionalPersonal']//tbody/tr[5]/td/label")
    public WebElement psychologicalAssessmentIndicatedCheckbox;

    @FindBy(xpath = "//div[@id='attitudeOrienation']//tbody/tr[3]/td/label")
    public WebElement poorAttitudeTowardSentenceConvictionCheckbox;

    @FindBy(xpath = "//div[@id='attitudeOrienation']//tbody/tr[4]/td/label")
    public WebElement poorAttitudeTowardSupervisionCheckbox;

    @FindBy(xpath = "//input[@name='priorArrestUnder16']")
    public WebElement arrestedUnderAge16CheckboxValue;

    @FindBy(xpath = "//input[@name='instEscape']")
    public WebElement escapeHistoryInstitutionCheckboxValue;

    @FindBy(xpath = "//input[@name='priorSupervisionSuspended']")
    public WebElement chargeLaidOrProbationParoleCheckboxValue;

    @FindBy(xpath = "//input[@name='recordOfAssaultViolence']")
    public WebElement recordOfAssaultViolenceCheckboxValue;

    @FindBy(xpath = "//input[@name='unemployedCurrent']")
    public WebElement currentlyUnemployedCheckboxValue;

    @FindBy(xpath = "//input[@name='unemployedFrequent']")
    public WebElement frequentlyUnemployedCheckboxValue;

    @FindBy(xpath = "//input[@name='employedFullYearNever']")
    public WebElement neverEmployedForAFullYearCheckboxValue;

    @FindBy(xpath = "//input[@name='employedFiredEver']")
    public WebElement everFiredCheckboxValue;

    @FindBy(xpath = "//input[@name='educUnderGrade10']")
    public WebElement lessThanRegularGrade10CheckboxValue;

    @FindBy(xpath = "//input[@name='educUnderGrade12']")
    public WebElement lessThanRegularGrade12CheckboxValue;

    @FindBy(xpath = "//input[@name='educSuspendExpelEver']")
    public WebElement suspendedOrExpelledAtLeastOnceCheckboxValue;

    @FindBy(xpath = "//input[@name='financialSocialAssist']")
    public WebElement relianceUponSocialAssistanceCheckboxValue;

    @FindBy(xpath = "//input[@name='familyCriminal']")
    public WebElement criminalFamilySpouseCheckboxValue;

    @FindBy(xpath = "//input[@name='accomHighCrime']")
    public WebElement highCrimeNeighborhoodCheckboxValue;

    @FindBy(xpath = "//input[@name='leisureNoOrganizedActivity']")
    public WebElement noRecentParticipationInOrganizedActivityCheckboxValue;

    @FindBy(xpath = "//input[@name='companionIsolate']")
    public WebElement aSocialIsolateCheckboxValue;

    @FindBy(xpath = "//input[@name='companionCrimAcquaintSome']")
    public WebElement someCriminalAcquaintancesCheckboxValue;

    @FindBy(xpath = "//input[@name='companionCrimFriendSome']")
    public WebElement someCriminalFriendsCheckboxValue;

    @FindBy(xpath = "//input[@name='companionAntiCrimAcquaintFew']")
    public WebElement veryFewPreSchoolAcquaintancesCheckboxValue;

    @FindBy(xpath = "//input[@name='companionAntiCrimFriendFew']")
    public WebElement veryFewProSocialFriendsCheckboxValue;

    @FindBy(xpath = "//input[@name='alcoholProbEver']")
    public WebElement alcoholProblemEverCheckboxValue;

    @FindBy(xpath = "//input[@name='drugProbEver']")
    public WebElement drugProblemEverCheckboxValue;

    @FindBy(xpath = "//input[@name='alcoholDrugViolation']")
    public WebElement lawViolationCheckboxValue;

    @FindBy(xpath = "//input[@name='alcoholDrugFamily']")
    public WebElement maritalFamilyCheckboxValue;

    @FindBy(xpath = "//input[@name='alcoholDrugOccupation']")
    public WebElement schoolWorkCheckboxValue;

    @FindBy(xpath = "//input[@name='alcoholDrugMedical']")
    public WebElement medicalCheckboxValue;

    @FindBy(xpath = "//input[@name='alcoholDrugIndicator']")
    public WebElement otherClinicalIndicatorsCheckboxValue;

    @FindBy(xpath = "//input[@name='emotionalInterfereModerate']")
    public WebElement moderateInterferenceCheckboxValue;

    @FindBy(xpath = "//input[@name='emotionalInterfereSevere']")
    public WebElement severeInterferenceCheckboxValue;

    @FindBy(xpath = "//input[@name='psychiatricTrmtPast']")
    public WebElement mentalHealthTreatmentPastCheckboxValue;

    @FindBy(xpath = "//input[@name='psychiatricTrmtCurrent']")
    public WebElement mentalHealthTreatmentCurrentCheckboxValue;

    @FindBy(xpath = "//input[@name='psychiatricAsmtInd']")
    public WebElement psychologicalAssessmentIndicatedCheckboxValue;

    @FindBy(xpath = "//input[@name='attiPoorConviction']")
    public WebElement poorAttitudeTowardSentenceConvictionCheckboxValue;

    @FindBy(xpath = "//input[@name='attiPoorSupervision']")
    public WebElement poorAttitudeTowardSupervisionCheckboxValue;

}
