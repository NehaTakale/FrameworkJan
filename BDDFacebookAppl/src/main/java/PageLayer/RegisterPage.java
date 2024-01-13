package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.WaitClass;

public class RegisterPage extends BaseClass {

	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy(name="reg_email__")
	private WebElement email;
	
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpersdetails(String fname1, String lname1, String email1, String pass1) {
		WaitClass.send(fname, fname1);
		WaitClass.send(lname, lname1);
		WaitClass.send(email, email1);
		WaitClass.send(pass, pass1);

	}
	
	
	@FindBy(name="birthday_day")
	private WebElement day;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBys(@FindBy(xpath="//label[@class='_58mt']"))
	private List<WebElement> gender;
	
	public void selectFunctionality(String date1, String month1, String year1, String gender1) {
		
		HandleDropDown.selectByText(day, date1);
		HandleDropDown.selectByText(month, month1);
		HandleDropDown.selectByText(year, year1);

		
		WaitClass.selectGender(gender, gender1);
	}
	
	
	
	
	
}
