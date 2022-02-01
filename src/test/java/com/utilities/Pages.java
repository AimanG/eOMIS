package com.utilities;

import com.pages.LSIAssessmentsPage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.NursingEncountersPage;

public class Pages {

    private LoginPage loginPage;
    private LandingPage landingPage;
    private LSIAssessmentsPage lsiAssessmentsPage;
    private NursingEncountersPage nursingEncountersPage;

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
}
