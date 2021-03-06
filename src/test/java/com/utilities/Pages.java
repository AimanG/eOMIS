package com.utilities;

import com.pages.*;

public class Pages {

    private LoginPage loginPage;
    private LandingPage landingPage;
    private LSIAssessmentsPage lsiAssessmentsPage;
    private NursingEncountersPage nursingEncountersPage;
    private MedicalEncountersPage medicalEncountersPage;
    private AlcoholAndDrugEncountersPage alcoholAndDrugEncountersPage;
    private SOTMPEncountersPage sotmpEncountersPage;
    private MentalHealthEncountersPage mentalHealthEncountersPage;
    private IJPPage ijpPage;
    private DefineJobsAndProgramsPage defineJobsAndProgramsPage;

    public LoginPage getLoginPage() {
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public LandingPage getLandingPage() {
        return (landingPage == null) ? landingPage = new LandingPage() : landingPage;
    }

    public LSIAssessmentsPage getLsiAssessmentsPage() {
        return (lsiAssessmentsPage == null) ? lsiAssessmentsPage = new LSIAssessmentsPage() : lsiAssessmentsPage;
    }

    public NursingEncountersPage getNursingEncountersPage() {
        return (nursingEncountersPage == null) ? nursingEncountersPage = new NursingEncountersPage() : nursingEncountersPage;
    }

    public MedicalEncountersPage getMedicalEncountersPage() {
        return (medicalEncountersPage == null) ? medicalEncountersPage = new MedicalEncountersPage() : medicalEncountersPage;
    }

    public AlcoholAndDrugEncountersPage getAlcoholAndDrugEncountersPage() {
        return (alcoholAndDrugEncountersPage == null) ? alcoholAndDrugEncountersPage = new AlcoholAndDrugEncountersPage() : alcoholAndDrugEncountersPage;
    }

    public SOTMPEncountersPage getSOTMPEncountersPage() {
        return (sotmpEncountersPage == null) ? sotmpEncountersPage = new SOTMPEncountersPage() : sotmpEncountersPage;
    }

    public MentalHealthEncountersPage getMentalHealthEncountersPage() {
        return (mentalHealthEncountersPage == null) ? mentalHealthEncountersPage = new MentalHealthEncountersPage() : mentalHealthEncountersPage;
    }

    public IJPPage getIJPPage() {
        return (ijpPage == null) ? ijpPage = new IJPPage() : ijpPage;
    }

    public DefineJobsAndProgramsPage getDefineJobsAndProgramsPage() {
        return (defineJobsAndProgramsPage == null) ? defineJobsAndProgramsPage = new DefineJobsAndProgramsPage() : defineJobsAndProgramsPage;
    }
}
