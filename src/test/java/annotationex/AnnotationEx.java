package annotationex;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationEx {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite, before all the test...(BeforeSuite)");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite, After all the test(After Suite)");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before All the Method...(Before Method)");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After All the Method...(After Method)");
	}
	
	@Test(priority = 3)
	public void testCaseOne() {
		System.out.println("Test Case One...");
	}
	
	@Test(priority  =  -2)
	public void testCaseTwo() {
		System.out.println("Test Case Two...");
	}
	
	@Test(priority = 1)
	public void testCaseThree() {
		System.out.println("Test Case Three...");
		//Assert.assertEquals("Helo", "Hi");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before all the Method at Once...(BeforeClass)");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute After all the Method at Once...(AfterClass)");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This test will be executed before all the Test at Once...(Before Test)");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This test will be executed after all the Test at Once...(After Test)");
		
	}
}
