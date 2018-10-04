package annotationex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before Suite...Only Once...");
		System.out.println();
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before the Class only once...");
		System.out.println();
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("AFter the Class Only once...");
		System.out.println();
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before the All the  Test oNly once....");
		System.out.println();
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("After All the Test only once...");
		System.out.println();
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before the Every Test...");
		System.out.println();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After the Every Test...");
		System.out.println();
	}
	
	@Test
	public void firstTest() {
		
		System.out.println("This is First Test...");
		System.out.println();
	}

	@Test
	public void secondTest() {
		System.out.println("This is Second Test...");
		System.out.println();
	}
	

	@AfterSuite
	void afterSuite() {
		System.out.println("After Suite...Only Once...");
		System.out.println();
	}

}
