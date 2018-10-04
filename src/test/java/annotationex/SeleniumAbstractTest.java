package annotationex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SeleniumAbstractTest {
	 @BeforeSuite
	  public void beforeSuite() {
	    System.out.println("BeforeSuite");
	    System.out.println();
	  }

	  @BeforeTest
	  public void beforeTest() {
	    System.out.println("BeforeTest");
	    System.out.println();
	  }

	  @BeforeClass
	  public void beforeClass() {
	    System.out.println("BeforeClass");
	    System.out.println();
	  }

	  @BeforeMethod
	  public void beforeMethod() {
	    System.out.println("BeforeMethod");
	    System.out.println();
	  }

	  @AfterMethod
	  public void afterMethod() {
	    System.out.println("AfterMethod");
	    System.out.println();
	  }

	  @AfterClass
	  public void afterClass() {
	    System.out.println("AfterClass");
	    System.out.println();
	  }

	  @AfterTest
	  public void afterTest() {
	    System.out.println("AfterTest");
	    System.out.println();
	  }

	  @AfterSuite
	  public void afterSuite() {
	    System.out.println("AfterSuite");
	    System.out.println();
	  }

	}


