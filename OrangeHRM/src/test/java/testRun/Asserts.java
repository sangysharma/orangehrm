package testRun;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asserts {

	//Asserts help us to determine the result of the test. There are two types of asserts- hard and soft
	//If we have multiple asserts and the first assert fails, it fails the entire test, it doesn´t continue.
	//Soft assert however will continue through out the entire test run before it fails the test.
	
	@Test
	public void hardAssert() {
		Assert.assertEquals(1, 1);
		
		Assert.assertEquals("Sangy", "Sangy");
		
		Assert.assertEquals(12, "HELLO");
	}
	
	@Test
	public void softAssert() {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 1);
		sa.assertEquals("Sangy", "Sangy");
		sa.assertEquals(12, "hello");
		sa.assertAll();
	}
}
