package com.step_definitions;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;

public class Hooks {


    @BeforeStep
    public void setUp(){
        BrowserUtils.wait(1);
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}