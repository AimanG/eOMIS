package com.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class )
@CucumberOptions (
        plugin = {
                "html:target/cucumber-default-Report",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
        },
        features = "src/test/resources/features",
        glue = "com.step_definitions",
        dryRun = false,
        tags = "@smoke",
        monochrome = true
)

public class SmokeTestRunner {
}