package prec;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityPrec {
	@Test(priority=2)
	public void ChangePass(){
		System.out.println("changing passs");
	}
	@Test(priority=3)
	public void LogoutTest(){
	System.out.println("log out last");	
	}
	
	@Test()
	public void loginTest(){
	System.out.println("log in first");	
	}
	@Test(priority=4)
	public void skip(){
	System.out.println("skipped this test");	
	throw new SkipException("requirement changed thats why skipping");
	}
	
	@Test(enabled=false)
	public void dontruntest(){
	System.out.println("don't run this test");	
	}
	@Test(enabled=true)
	public void dontRuntest(){
	System.out.println("don't run this test");	
	}
}
