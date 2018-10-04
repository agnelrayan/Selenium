package testng_ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGSimpleTest {
	@Test
	public void Firsttest() {
		String str = "Selenium TestNG";
		Assert.assertEquals("Selenium TestNG",str);
		
		
	}

}
