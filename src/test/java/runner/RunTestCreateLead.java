package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/test/java/feature/CreateLead.feature",glue="steps",monochrome = true,tags= {"@smoke and @sanity"})
@RunWith(Cucumber.class)
public class RunTestCreateLead {

}
