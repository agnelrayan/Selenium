package testng_ex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTest2 {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method...");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AFter the class...");
	}
	
	@Test
	public void firstTest() {
		System.out.println("In Firt Test.....");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Second Test....");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("Third Test....");
	}

}
