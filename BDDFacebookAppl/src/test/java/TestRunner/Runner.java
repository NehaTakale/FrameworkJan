package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeatureFile\\fb.feature"},
		glue = {"Steps"},
		dryRun= false,
		monochrome=true,
		tags="@Register",
		plugin={"html:Reports/abc1.html",
				"com.avenstack.extentreports.cucmber.adapter.ExtentCucumberAdapter"})
 
 
public class Runner extends AbstractTestNGCucumberTests{

}
