package testng_ex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestParallelOne {
	@BeforeClass
void beforeClass() {
		
		System.out.println("TestCase BeforeClass:"+Thread.currentThread().getId());
	}
	
	@BeforeClass
	void beforeClass2() {
			
			System.out.println("TestCase BeforeClass2:"+Thread.currentThread().getId());
		}
	
	@BeforeMethod
	void beforeMethod() {
		
		System.out.println("TestCase BeforeMethod:"+Thread.currentThread().getId());
	}
	
	@BeforeTest
	void beforeTest() {
		
		System.out.println("TestCase BeforeTest:"+Thread.currentThread().getId());
	}
	
	
	@Test
	void testOne() {
		
		System.out.println("TestCase ONe:"+Thread.currentThread().getId());
	}
	
	@Test
	void testTwo() {
		System.out.println("TestCase Two:"+Thread.currentThread().getId());
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("AFer TEst:"+Thread.currentThread().getId());
	}
	
	@AfterMethod
	void afterMethod() {
		
		System.out.println("TestCase AFterMethod:"+Thread.currentThread().getId());
	}
	
	@AfterClass
void aferClass() {
		
		System.out.println("TestCase AFter Class:"+Thread.currentThread().getId());
	}
	
	@AfterClass
	void aferClass2() {
			
			System.out.println("TestCase AFter Class2:"+Thread.currentThread().getId());
		}

}
