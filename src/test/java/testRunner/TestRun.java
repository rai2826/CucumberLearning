package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {".//FeatureFiles/Login.feature"},glue = {"StepDefinitions"},
                 plugin = {"pretty","html:reports/myreport.html"},


                dryRun = false,
                monochrome = true,
                publish = true


)

public class TestRun {

}
