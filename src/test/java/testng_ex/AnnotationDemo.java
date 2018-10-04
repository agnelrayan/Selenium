package testng_ex;


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
	public class AnnotationDemo {

		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before All the Method...(Before Method)");
		}
		
		@AfterMethod
		public void afterMethod() {
			System.out.println("After All the Method...(After Method)");
		}
		
		@Test(priority=0 ,dependsOnMethods="testCaseTwo")
		public void testCaseOne() {
			System.out.println("Test Case One...");
		}
		
		@Test(priority=-1)
		public void testCaseTwo() {
			System.out.println("Test Case Two...");
			//fail 
			Assert.assertEquals("aa", "aa");
		}
		
		@Test(priority=2)
		public void testCaseThree() {
			System.out.println("Test Case Three...");
			//Assert.assertEquals("Helo", "Hi");
		}
		

	}


