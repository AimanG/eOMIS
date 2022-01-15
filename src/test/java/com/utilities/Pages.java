package com.utilities;

import com.pages.LSIAssessmentsPage;
import com.pages.LandingPage;
import com.pages.LoginPage;

public class Pages {

    private LoginPage loginPage;
    private LandingPage landingPage;
    private LSIAssessmentsPage lsiAssessmentsPage;

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }

    public LandingPage getLandingPage(){
        return (landingPage == null) ? landingPage = new LandingPage() : landingPage;
    }

    public LSIAssessmentsPage getLsiAssessmentsPage(){
        return (lsiAssessmentsPage == null) ? lsiAssessmentsPage = new LSIAssessmentsPage() : lsiAssessmentsPage;
    }
}
