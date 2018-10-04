package parameterization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	/*@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class...");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AFter Class...");
	}*/
	
	/*@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test....");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AFter Test....");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method....");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("AFter Method....");
	}*/
	
	
	@Test
	public void testOne() throws InterruptedException {
		
		
		//System.out.println("Test One...");
		
	
		
		for(int i=0;i<5;i++)
		
		System.out.println("Test One..."+i);
		//Thread.sleep(2000);
	
	}
	
	@Test
	public void testTwo() throws InterruptedException {
		
		//System.out.println("TEst two....");
		for(int i=100;i<105;i++)
		System.out.println("TEst two...."+i);
		Thread.sleep(2000);
		
		
	}
	
	

}
