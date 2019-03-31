package prec;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeAssert {
	@Test
	public void trycatch(){
		String expValue="google";//requirement
		String actValue="google1";//results web App
		Assert.assertEquals(actValue, expValue);
	}
}
