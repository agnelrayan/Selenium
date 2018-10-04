package testng_ex;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void testFirst() throws InterruptedException {
		for(int i=0;i<=5;i++)
		System.out.println("First Test...");
		Thread.sleep(1500);
	}
	
	@Test
	public void testSecond() {
		for(int j=0;j<=5;j++)
		System.out.println("Second Test...");
	}
	@Test
	public void testThird() {
		System.out.println("Third Test...");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method...");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method...");
	}

}
