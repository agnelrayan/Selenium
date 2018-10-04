package parameterization;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelEx {
	
	/*@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method...");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method...");
	}*/
	@Test
	public void testOne() throws InterruptedException {
		for(int i=0;i<=4;i++)
		{
		System.out.println("Test one..."+i);
		Thread.sleep(2000);
		}
	}
	
	@Test
	public void testTwo() throws InterruptedException {
		for(int i=100;i<=104;i++) {
		System.out.println("Test two..."+i);
		Thread.sleep(2000);
		}
	}
	/*@Test
	public void testThree() {
		System.out.println("Test three...");
	}*/

}
