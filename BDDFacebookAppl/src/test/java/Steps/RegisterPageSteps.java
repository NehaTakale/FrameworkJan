package Steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass{

	 RegisterPage registerpage;

@Given("user open {string} browser")
public void user_open_browser(String browsername) {
   BaseClass.initialization(browsername);
  
}


@When("user is on register page")
public void user_is_on_register_page() {
	String u =prop.getProperty("url");
	 driver.get(u);
}

@When("user enter valid {string},{string},{string} and {string}")
public void user_enter_valid_and(String fname2, String lname2, String email2, String pass2) {
  registerpage = new RegisterPage();
  registerpage.enterpersdetails(fname2, lname2, email2, pass2);
}

@When("user select DOB as {string},{string},{string} and select gender as {string}")
public void user_select_dob_as_and_select_gender_as(String date2, String month2, String year2, String gender2) {
	registerpage.selectFunctionality(date2, month2, year2, gender2);
	   


}

@AfterStep
public void teardown(Scenario scenario)
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	byte[] p = ts.getScreenshotAs(OutputType.BYTES);

	scenario.attach(p, "image/png", scenario.getName());
	}
}
