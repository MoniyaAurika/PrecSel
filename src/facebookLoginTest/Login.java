package facebookLoginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Config;
import locators.FacebookLoc;
import values.FbValues;

public class Login extends Config {
	@Test // test annotion - without this annotation, you can not execute any test
	public void testFacebookSignup(){


		FacebookLoc	fbl = new FacebookLoc();

		FbValues			fbv = new 	FbValues();
		//@Test (groups = { "smoke" })

	
		// Enter firstName
//		driver.findElement(By.xpath(fbl.fnLoc)).sendKeys(fbv.fnVal);
//		//Enter last name
//		driver.findElement(By.xpath(fbl.lnLoc)).sendKeys(fbv.lnVal);
	}
}
