package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class WaitClass extends BaseClass {

	public static void send(WebElement wb,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
	}
	
	public static void selectGender(List<WebElement> ls,String value)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		List<WebElement> wb1 = wait.until(ExpectedConditions.visibilityOfAllElements(ls));
		
		for(WebElement wb:wb1)
		{
			String a =wb.getText();
			if(a.equalsIgnoreCase(value))
			{
				wb.click();
			}
		}
	}
}
