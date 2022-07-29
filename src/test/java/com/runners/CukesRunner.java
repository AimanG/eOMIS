package com.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith ( Cucumber.class )
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json" ,
                "html:target/cucumber/" ,
                "rerun:target/rerun.txt"},

        features = "src/test/resources/features",
        glue = "com/step_definitions",
        dryRun = false,
        tags = "@1"
        // ,monochrome=true
)
public class CukesRunner {

}