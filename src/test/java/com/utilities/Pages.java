package com.utilities;

import com.pages.LoginPage;

public class Pages {

    private LoginPage loginPage;

    public LoginPage getLoginPage(){
        return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
    }
}
