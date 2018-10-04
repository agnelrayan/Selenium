package parameterization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Clas....");
	}
	
	
	//@BeforeTest
	public void beforeMethod() {
		System.out.println("Before Method....");
	}
	
	@Test
	public void testFirst() throws InterruptedException {
		
		String id = Thread.currentThread().getName();
		System.out.println("Get Name:"+id);
		System.out.println("Test First");
		/*for(int i=0;i<=5;i++) {
		System.out.println("Test First");
		Thread.sleep(2000);
		}*/
		
	}
	
	@Test
	public void testSecond() {
		System.out.println("Test Two...");
		
	}
	
	@Test 
	
	public void testThree() {
		System.out.println("Test Three");
	}
	
	//@BeforeTest
	public void afterMethod() {
		
		System.out.println("After Method....");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class...");
		
	}
	
	

}
