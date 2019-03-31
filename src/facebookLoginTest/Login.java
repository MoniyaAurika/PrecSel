package facebookLoginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;

public class Login extends Config {
	@Test // test annotion - without this annotation, you can not execute any test
	public void testFacebookSignup(){

		// Locators
		String fnLoc = "//input[@name='firstname']";
		String lnLoc = "//input[@name='lastname']";
		// Values
		String fnVal = "Moniya";
		String lnVal = "Aurika";

		// Enter firstName
		driver.findElement(By.xpath(fnLoc)).sendKeys(fnVal);
		// Enter lastName
		driver.findElement(By.xpath(lnLoc)).sendKeys(lnVal);
	}
}
