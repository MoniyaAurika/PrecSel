package prec;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prectrycatch {
@Test
public void trycatch(){
	String expValue="google";//requirement
	String actValue="google1";//results web App
	try{
		Assert.assertEquals(actValue, expValue);
	}catch(Throwable t){
		//reason for falling
		System.err.println("didn't match"+t);
	}
}
}
