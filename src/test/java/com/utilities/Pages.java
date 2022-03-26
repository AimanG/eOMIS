package com.utilities;

import com.pages.*;

public class Pages {

    private LoginPage loginPage;
    private LandingPage landingPage;
    private LSIAssessmentsPage lsiAssessmentsPage;
    private NursingEncountersPage nursingEncountersPage;
    private MedicalEncountersPage medicalEncountersPage;
    private AlcoholAndDrugEncountersPage alcoholAndDrugEncountersPage;

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public LandingPage getLandingPage(){
        return (landingPage == null) ? landingPage = new LandingPage() : landingPage;
    }

    public LSIAssessmentsPage getLsiAssessmentsPage(){
        return (lsiAssessmentsPage == null) ? lsiAssessmentsPage = new LSIAssessmentsPage() : lsiAssessmentsPage;
    }

    public NursingEncountersPage getNursingEncountersPage(){
        return (nursingEncountersPage == null) ? nursingEncountersPage = new NursingEncountersPage() : nursingEncountersPage;
    }

    public MedicalEncountersPage getMedicalEncountersPage(){
        return (medicalEncountersPage == null) ? medicalEncountersPage = new MedicalEncountersPage() : medicalEncountersPage;
    }

    public AlcoholAndDrugEncountersPage getAlcoholAndDrugEncountersPage(){
        return (alcoholAndDrugEncountersPage == null) ? alcoholAndDrugEncountersPage = new AlcoholAndDrugEncountersPage() : alcoholAndDrugEncountersPage;
    }
}
