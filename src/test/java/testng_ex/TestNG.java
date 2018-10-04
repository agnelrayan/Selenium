package testng_ex;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	public void beforClass() {
		System.out.println("1. Before Class...");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("2. Before Method...");
	}
	
	
	
	@Test
	public void firstTest() {
		String actual="Selenium";
		System.out.println("3. First Test");
		Assert.assertEquals(actual, "Selenium");
	}
	
	@Test
	//@Test(dependsOnMethods= {"firstTest"})
	public void secondTest() {
		System.out.println("4. Second Test");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("5. Third Test..");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("6. After Method...");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("7. After the class...");
	}

}
