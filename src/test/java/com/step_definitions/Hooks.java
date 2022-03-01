package com.step_definitions;
import com.utilities.Driver;
import org.junit.After;
public class Hooks {


//    @Before
//    public void setUp(){
//        System.out.println("I am setting up the test from the Hooks class!!!");
//        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        // you can also add maximize screen here
//        Driver.getDriver().manage().window().maximize();
//    }


    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}